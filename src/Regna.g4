grammar Regna;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment SYMBOL: [-_@$\\.];
fragment ArrayOp: [[\]_];

// Simple Tokens
MODULE_DEC: 'module';
LBRC: '{';
RBRC: '}';
LPRM: '(';
RPRM: ')';
PARAM_SEPERATOR: ',';
PARAM_TYPE_DEF: ':';
VAR_DEC: 'let' | 'LET';
EQUALS: '=';
PKGID: 'pkg';
EOS: ';';
CMTCH: '##';
MCOMO: '#[';
MCOMC: ']#';
L_VOID: 'void';
FUNC_DEF: 'def';
CONSTRUCT_DEF: 'construct';
PRINT: 'print' | 'PRINT';
REQUIRE: 'require' | 'REQUIRE';
STATICFUNC: 'stfc';
MEMBER_CT: '->';
MEMBER_T: '=>';
CONSTRUCTOR: 'init';
ATTRIBUTE_DEF: 'val' | 'VAL';
Const: 'const' | 'CONST';
TRANSIENT: 'trns' | 'transient' | 'TRANSIENT';
STATICATTRIBUTE: 'stval';
STRUCT_DEF: 'structdef';
STRUCT_T: 'struct';
CHAR_ID: 'char';
INT_ID: 'int';
STR_ID: 'String';
DBL_id: 'double';
FLT_ID: 'float';
BYTE: 'byte';
SERIALIZABLE: 'serializable';

// Some lexer tokens
INTEGER: DIGIT+;
SIMP_CHAR: LETTER | '_';
SIMP_CHARS: LETTER(SIMP_CHAR|DIGIT)+;
BASE_CHARACTER: SIMP_CHAR | SYMBOL;
BASE_CHARACTERS: LETTER(BASE_CHARACTER)+;
AR_CHARS: (SIMP_CHAR | ArrayOp)+;
CHRCT: '\'' .? '\'';
BlankLiteral: '"''"';
StringLiteral: ('"' .+? '"') | BlankLiteral;

id: SIMP_CHARS;
mid: BASE_CHARACTERS|SIMP_CHARS;
call_mid: mid call_params;
arid: (SIMP_CHARS | AR_CHARS | type_id);

type_id
    : CHAR_ID
    | INT_ID
    | STR_ID
    | DBL_id
    | FLT_ID
    | BYTE
    ;

ret_type: type_id | id | L_VOID;

add: '+' | '-';
mult: '*' | '/';

expr: add value
    | expr mult expr
    | expr add expr
    | value
    ;

value: id
     | INTEGER
     | LPRM expr RPRM
     ;

field_param: Const | TRANSIENT;

box_types: StringLiteral | id | mid | call_mid;
type: CHRCT | INTEGER | StringLiteral| BlankLiteral | id | expr | member_rule | internal_call | mid | call_mid| struct_val;

/**
    Functions go something like this..
    def main(args : String[]){
        let x = args.get(1);
    }
*/

vartype: type_id | id | mid;
vardef_stmt: VAR_DEC id EQUALS type EOS;
localvar_stmt: ATTRIBUTE_DEF Const? vartype id attrvaldef? EOS;
print_stmt: PRINT type EOS;
construct_stmt: box_types MEMBER_CT CONSTRUCTOR call_params EOS;
attrvaldef: (EQUALS type);
attrdef_stmt: ATTRIBUTE_DEF field_param? field_param? vartype id attrvaldef? EOS;
static_attrdef: STATICATTRIBUTE field_param? field_param? vartype id attrvaldef? EOS;
require: REQUIRE mid EOS;

call_params: LPRM (type)? (PARAM_SEPERATOR (type))*? RPRM;
membercall_stmt: type MEMBER_CT id call_params EOS;
internal_call: box_types MEMBER_CT id call_params;
member_rule: mid MEMBER_T id;

struct_body: type_id id (PARAM_SEPERATOR type_id id)+;
struct_stmt: STRUCT_DEF id LBRC struct_body? RBRC EOS;
struct_param: id type;
struct_init_stmt: STRUCT_T mid 'init' id LBRC (struct_param (PARAM_SEPERATOR struct_param)*)* RBRC EOS;
struct_val: STRUCT_T mid MEMBER_T id;
struct_set_stmt: STRUCT_T VAR_DEC mid id EQUALS type;

stmt
    :vardef_stmt
    |print_stmt
    |localvar_stmt
    |membercall_stmt
    |construct_stmt
    |struct_init_stmt
    |struct_stmt
    |struct_set_stmt
    ;

requireList: require+;
stmtList: stmt+;

formalParam: id PARAM_TYPE_DEF arid;
formalParamList: LPRM formalParam(PARAM_SEPERATOR formalParam)* RPRM;
staticformalFunction: STATICFUNC ret_type id formalParamList? LBRC stmtList? RBRC;
func: FUNC_DEF ret_type id formalParamList? LBRC stmtList? RBRC;
constructor: CONSTRUCT_DEF formalParamList? LBRC stmtList? RBRC;
functionList: (func | staticformalFunction)+;
attributes: (attrdef_stmt|static_attrdef)*?;
moduleBody: attributes constructor functionList?;
module: MODULE_DEC id PKGID mid SERIALIZABLE? LBRC moduleBody RBRC;
program: requireList? module+;

LINE_COMMENT
    : CMTCH ~[\r\n]* -> channel(HIDDEN);

MULTI_COMMENT
    : MCOMO .*? MCOMC -> channel(HIDDEN);

WS: [\r\n \tab] -> skip;
