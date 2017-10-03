grammar Regna;

fragment LETTER: [a-zA-Z];
fragment SYMBOL: [-_@$\\.];
fragment ArrayOp: [[\]_];
fragment DIGIT: [0-9];

INTEGER: DIGIT+;

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
LSQB:'[';
RSQB:']';
ARRDEF:'[]';
DIMENJOIN: '][';
L_VOID: 'void';
FUNC_DEF: 'def';
CONSTRUCT_DEF: 'construct';
PRINT: 'print' | 'PRINT';
REQUIRE: 'require' | 'REQUIRE';
STATICFUNC: 'stfc';
MEMBER_CT: '->';
MEMBER_T: '=>';
CONSTRUCTOR: 'inst' | 'new';
ATTRIBUTE_DEF: 'val' | 'VAL';
Const: 'const' | 'CONST';
TRANSIENT: 'trns' | 'transient' | 'TRANSIENT';
STATICATTRIBUTE: 'stval';
STRUCT_DEF: 'structdef';
STRUCT_T: 'struct';
CHAR_ID: 'char';
INT_ID: 'int';
//STR_ID: 'String';
DBL_id: 'double';
FLT_ID: 'float';
BYTE: 'byte';
SERIALIZABLE: 'serializable';
COMPILER_INSTR: '#';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
WHILE: 'while' | 'WHILE';
FOR: 'for' | 'FOR';
RETURN: 'return';
Compiler_Compile_CMD: COMPILER_INSTR 'compile';
Compiler_cpextend_CMD: COMPILER_INSTR 'include';

ArrayLiteral: SIMP_CHARS(ARRDEF)+;

GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
EQ: '==';
AND: 'and' | 'AND' | '&&';
OR: 'or' | 'OR' | '||';
NOT: 'not' | 'NOT' | '!';

// Some lexer tokens
SIMP_CHAR: LETTER | '_';
SIMP_CHARS: LETTER(SIMP_CHAR|DIGIT)+;
BASE_CHARACTER: SIMP_CHAR | SYMBOL;
BASE_CHARACTERS: LETTER(BASE_CHARACTER|DIGIT)+;
AR_CHARS: (SIMP_CHAR | ArrayOp)+;
CHRCT: '\'' .? '\'';
BlankLiteral: '"''"';
StringLiteral: ('"' .+? '"') | BlankLiteral;
MIDARRAYLITERAL: (BASE_CHARACTERS|SIMP_CHARS)ARRDEF+;
//EVERY_THING: .*? EOS;

id:SIMP_CHARS;
mid:BASE_CHARACTERS|SIMP_CHARS;
call_mid:mid call_params;
arid:(SIMP_CHARS | AR_CHARS | type_id | ArrayLiteral);

type_id
    : CHAR_ID
    | INT_ID
//  | STR_ID
    | DBL_id
    | FLT_ID
    | BYTE
    | type_id ARRDEF
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
     | mid
     | INTEGER
     | LPRM expr RPRM
     ;

// INCREMENTALS
varaddinc_stmt: id '+=' type EOS;
varsubinc_stmt: id '-=' type EOS;
varmulinc_stmt: id '*=' type EOS;
vardivinc_stmt: id '/=' type EOS;

// BOOL EXPR

greaterthan: type GT type;
lesserthan: type LT type;
greaterthanE: type GTE type;
lesserthanE: type LTE type;
notequalto: type '!'EQUALS type;
equalto: type EQ type;
false_con: 'FALSE' | 'False' | 'false';
true_con: 'TRUE' | 'True' | 'true';

boolval:
    type
    |greaterthan
    |lesserthan
    |greaterthanE
    |lesserthanE
    |equalto
    |notequalto
    |false_con
    |true_con
    ;

notboolval: NOT LPRM boolval RPRM;

logicexpr:  (boolval|notboolval|andboolexpr|orboolexpr);

enclosed_boolval: LPRM boolval RPRM;

andboolexpr: LPRM logicexpr RPRM AND LPRM logicexpr RPRM;
orboolexpr: LPRM logicexpr RPRM OR LPRM logicexpr RPRM;

boolexpr:
    boolval
    |andboolexpr
    |orboolexpr
    |enclosed_boolval
    ;

boolparseexpr: boolexpr | NOT boolexpr;

// Arrays
array_reference:mid'['(type(']'|']['))+;    // Not implemented yet!
new_reference:mid'$'LPRM type(PARAM_SEPERATOR type)* RPRM;
array_set_stmt: VAR_DEC (array_reference|new_reference) EQUALS type EOS;
array_def_stmt: ATTRIBUTE_DEF Const? vartype ArrayLiteral attrvaldef? EOS;
array_inst: (box_types|type_id) MEMBER_CT CONSTRUCTOR type;

// BOOL EXPR END

field_param: Const | TRANSIENT;
box_types: StringLiteral | id | mid | call_mid | ArrayLiteral | MIDARRAYLITERAL;
type: CHRCT | INTEGER | StringLiteral| BlankLiteral|id|expr|member_rule|internal_call|mid|call_mid|struct_val|cast_type|construct_call|new_reference|array_inst;
/**
    Functions go something like this..
    def void main(args : String[]){
        let x = args.get(1);
    }
*/

vartype: type_id | id | mid;
vardef_stmt: VAR_DEC id EQUALS type EOS;
localvar_stmt: ATTRIBUTE_DEF Const? vartype id attrvaldef? EOS;
print_stmt: PRINT type EOS;
construct_stmt: box_types MEMBER_CT CONSTRUCTOR call_params EOS;
construct_call:box_types MEMBER_CT CONSTRUCTOR call_params;
attrvaldef: (EQUALS type);
attrdef_stmt: ATTRIBUTE_DEF field_param? field_param? vartype id attrvaldef? EOS;
static_attrdef: STATICATTRIBUTE field_param? field_param? vartype id attrvaldef? EOS;
require: REQUIRE mid EOS;

call_params:LPRM (type)? (PARAM_SEPERATOR (type))*? RPRM;
membercall_stmt:type MEMBER_CT id call_params EOS;
internal_call:box_types MEMBER_CT id call_params;
member_rule:mid MEMBER_T id;
cast_type:LPRM extract_type RPRM type;

struct_body: type_id id (PARAM_SEPERATOR type_id id)+;
struct_stmt: STRUCT_DEF id LBRC struct_body? RBRC EOS;
struct_param: id type;
struct_init_stmt: STRUCT_T mid 'init' id LBRC (struct_param (PARAM_SEPERATOR struct_param)*)* RBRC EOS;
extract_type: (mid|type_id);
struct_val:STRUCT_T mid MEMBER_T extract_type? id;
struct_set_stmt: STRUCT_T VAR_DEC mid id EQUALS type;

return_stmt:RETURN type? EOS;
//if_stmt: IF expression RPRM LBRC stmtList? RBRC (ELSE LBRC stmtList? RBRC)?;

elseif_block: ELIF boolparseexpr LBRC stmtList? RBRC;
else_block: ELSE LBRC stmtList RBRC;
if_block: IF boolparseexpr LBRC stmtList? RBRC (elseif_block)*? else_block?;


// Blocks
while_block: WHILE boolparseexpr LBRC stmtList? RBRC;
block
    :if_block
    |while_block
    ;

stmt
    :vardef_stmt
    |print_stmt
    |localvar_stmt
    |membercall_stmt
    |construct_stmt
    |struct_init_stmt
    |struct_stmt
    |struct_set_stmt
    |return_stmt
    //|if_stmt
    |varaddinc_stmt
    |varsubinc_stmt
    |varmulinc_stmt
    |vardivinc_stmt
    |array_set_stmt
    |array_def_stmt
    ;

compiler_compile_instruction: Compiler_Compile_CMD StringLiteral EOS;
compiler_cp_instruction: Compiler_cpextend_CMD StringLiteral EOS;
compiler_instruction
    :compiler_compile_instruction
    |compiler_cp_instruction
    ;

requireList: (require|compiler_instruction)+;
stmtList: (stmt|block)+;

formalParam: id PARAM_TYPE_DEF arid;
formalParamList: LPRM formalParam(PARAM_SEPERATOR formalParam)* RPRM;
staticformalFunction: STATICFUNC ret_type id formalParamList? LBRC stmtList? RBRC;
func: FUNC_DEF ret_type id formalParamList? LBRC stmtList? RBRC;
constructor: CONSTRUCT_DEF formalParamList? LBRC stmtList? RBRC;
functionList: (func | staticformalFunction)+;
attributes: (attrdef_stmt|static_attrdef)*?;
moduleBody: attributes constructor? functionList?;
module: MODULE_DEC id PKGID mid SERIALIZABLE? LBRC moduleBody RBRC;
program: requireList? module+;

LINE_COMMENT
    : CMTCH ~[\r\n]* -> channel(HIDDEN);

MULTI_COMMENT
    : MCOMO .*? MCOMC -> channel(HIDDEN);

WS: [\r\n\tab ] -> skip;
