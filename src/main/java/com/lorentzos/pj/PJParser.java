// Generated from /Users/Dionysis_Lorentzos/Projects/untitled1/PJ Grammar/PJ.g4 by ANTLR 4.4.1-dev

package com.lorentzos.pj;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, LPAREN=51, RPAREN=52, LBRACE=53, RBRACE=54, LBRACK=55, RBRACK=56, 
		SEMI=57, COMMA=58, DOT=59, ASSIGN=60, GT=61, LT=62, BANG=63, TILDE=64, 
		QUESTION=65, COLON=66, EQUAL=67, LE=68, GE=69, NOTEQUAL=70, AND=71, OR=72, 
		INC=73, DEC=74, ADD=75, SUB=76, MUL=77, DIV=78, BITAND=79, BITOR=80, CARET=81, 
		MOD=82, ADD_ASSIGN=83, SUB_ASSIGN=84, MUL_ASSIGN=85, DIV_ASSIGN=86, AND_ASSIGN=87, 
		OR_ASSIGN=88, XOR_ASSIGN=89, MOD_ASSIGN=90, LSHIFT_ASSIGN=91, RSHIFT_ASSIGN=92, 
		URSHIFT_ASSIGN=93, AT=94, ELLIPSIS=95, NullLiteral=96, BooleanLiteral=97, 
		CharacterLiteral=98, StringLiteral=99, IntegerLiteral=100, FloatingPointLiteral=101, 
		Identifier=102, NEWLINE=103, SKIP=104, INDENT=105, DEDENT=106;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='", "'>>>='", "'@'", "'...'", "'null'", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "IntegerLiteral", "FloatingPointLiteral", "Identifier", 
		"NEWLINE", "SKIP", "INDENT", "DEDENT"
	};
	public static final int
		RULE_pj = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_testingRule = 4, RULE_elementValue = 5, 
		RULE_elementValueArrayInitializer = 6, RULE_formalParameters = 7, RULE_formalParameterList = 8, 
		RULE_formalParameter = 9, RULE_lastFormalParameter = 10, RULE_constDeclaration = 11, 
		RULE_constantDeclarator = 12, RULE_qualifiedNameList = 13, RULE_qualifiedName = 14, 
		RULE_identifierRule = 15, RULE_classDeclaration = 16, RULE_classBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_modifier = 19, RULE_classOrInterfaceModifier = 20, 
		RULE_memberDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_methodDeclaration = 23, 
		RULE_methodBody = 24, RULE_fieldDeclaration = 25, RULE_genericConstructorDeclaration = 26, 
		RULE_constructorDeclaration = 27, RULE_constructorBody = 28, RULE_genericInterfaceMethodDeclaration = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_interfaceDeclaration = 31, 
		RULE_interfaceBody = 32, RULE_interfaceBodyDeclaration = 33, RULE_interfaceMemberDeclaration = 34, 
		RULE_annotationTypeDeclaration = 35, RULE_annotationTypeBody = 36, RULE_annotationTypeElementDeclaration = 37, 
		RULE_annotationTypeElementRest = 38, RULE_annotationMethodOrConstantRest = 39, 
		RULE_annotationMethodRest = 40, RULE_annotationConstantRest = 41, RULE_defaultValue = 42, 
		RULE_annotation = 43, RULE_annotationName = 44, RULE_elementValuePairs = 45, 
		RULE_elementValuePair = 46, RULE_enumDeclaration = 47, RULE_enumConstants = 48, 
		RULE_enumConstant = 49, RULE_enumBodyDeclarations = 50, RULE_block = 51, 
		RULE_blockStatement = 52, RULE_localVariableDeclaration = 53, RULE_statement = 54, 
		RULE_statementsCommaless = 55, RULE_parExpression = 56, RULE_catchClause = 57, 
		RULE_catchDeclaration = 58, RULE_catchType = 59, RULE_finallyBlock = 60, 
		RULE_resourceSpecification = 61, RULE_resources = 62, RULE_resource = 63, 
		RULE_switchBlockStatementGroup = 64, RULE_switchLabel = 65, RULE_constantExpression = 66, 
		RULE_enumConstantName = 67, RULE_forControl = 68, RULE_forInit = 69, RULE_enhancedForControl = 70, 
		RULE_forUpdate = 71, RULE_variableDeclarators = 72, RULE_variableDeclarator = 73, 
		RULE_variableDeclaratorId = 74, RULE_variableInitializer = 75, RULE_arrayInitializer = 76, 
		RULE_variableModifier = 77, RULE_typeParameters = 78, RULE_typeParameter = 79, 
		RULE_typeBound = 80, RULE_typeList = 81, RULE_type = 82, RULE_classOrInterfaceType = 83, 
		RULE_typeArguments = 84, RULE_typeArgument = 85, RULE_typeArgumentsOrDiamond = 86, 
		RULE_primitiveType = 87, RULE_expressionList = 88, RULE_expression = 89, 
		RULE_primary = 90, RULE_literal = 91, RULE_nonWildcardTypeArgumentsOrDiamond = 92, 
		RULE_nonWildcardTypeArguments = 93, RULE_explicitGenericInvocation = 94, 
		RULE_explicitGenericInvocationSuffix = 95, RULE_superSuffix = 96, RULE_arguments = 97, 
		RULE_creator = 98, RULE_createdName = 99, RULE_classCreatorRest = 100, 
		RULE_arrayCreatorRest = 101, RULE_innerCreator = 102, RULE_abstractRule = 103, 
		RULE_assertRule = 104, RULE_booleanRule = 105, RULE_breakRule = 106, RULE_byteRule = 107, 
		RULE_caseRule = 108, RULE_catchRule = 109, RULE_charRule = 110, RULE_classRule = 111, 
		RULE_constRule = 112, RULE_continueRule = 113, RULE_defaultRule = 114, 
		RULE_doRule = 115, RULE_doubleRule = 116, RULE_elseRule = 117, RULE_enumRule = 118, 
		RULE_extendsRule = 119, RULE_finalRule = 120, RULE_finallyRule = 121, 
		RULE_floatRule = 122, RULE_forRule = 123, RULE_ifRule = 124, RULE_gotoRule = 125, 
		RULE_implementsRule = 126, RULE_importRule = 127, RULE_instanceofRule = 128, 
		RULE_intRule = 129, RULE_interfaceRule = 130, RULE_longRule = 131, RULE_nativeRule = 132, 
		RULE_newRule = 133, RULE_packageRule = 134, RULE_privateRule = 135, RULE_protectedRule = 136, 
		RULE_publicRule = 137, RULE_returnRule = 138, RULE_shortRule = 139, RULE_staticRule = 140, 
		RULE_strictfpRule = 141, RULE_superRule = 142, RULE_switchRule = 143, 
		RULE_synchronizedRule = 144, RULE_thisRule = 145, RULE_throwRule = 146, 
		RULE_throwsRule = 147, RULE_transientRule = 148, RULE_tryRule = 149, RULE_voidRule = 150, 
		RULE_volatileRule = 151, RULE_whileRule = 152, RULE_lparenRule = 153, 
		RULE_rparenRule = 154, RULE_lbraceRule = 155, RULE_rbraceRule = 156, RULE_lbrackRule = 157, 
		RULE_rbrackRule = 158, RULE_semiRule = 159, RULE_commaRule = 160, RULE_dotRule = 161, 
		RULE_assignRule = 162, RULE_gtRule = 163, RULE_ltRule = 164, RULE_bangRule = 165, 
		RULE_tildeRule = 166, RULE_questionRule = 167, RULE_colonRule = 168, RULE_equalRule = 169, 
		RULE_leRule = 170, RULE_geRule = 171, RULE_notEqualRule = 172, RULE_andRule = 173, 
		RULE_orRule = 174, RULE_incRule = 175, RULE_decRule = 176, RULE_addRule = 177, 
		RULE_subRule = 178, RULE_mulRule = 179, RULE_divRule = 180, RULE_bitandRule = 181, 
		RULE_bitorRule = 182, RULE_caretRule = 183, RULE_modRule = 184, RULE_add_assignRule = 185, 
		RULE_sub_assignRule = 186, RULE_mul_assignRule = 187, RULE_div_assignRule = 188, 
		RULE_and_assignRule = 189, RULE_or_assignRule = 190, RULE_xor_assignRule = 191, 
		RULE_mod_assignRule = 192, RULE_lshift_assignRule = 193, RULE_rshift_assignRule = 194, 
		RULE_urshift_assignRule = 195, RULE_atRule = 196, RULE_ellipsisRule = 197;
	public static final String[] ruleNames = {
		"pj", "packageDeclaration", "importDeclaration", "typeDeclaration", "testingRule", 
		"elementValue", "elementValueArrayInitializer", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "constDeclaration", "constantDeclarator", 
		"qualifiedNameList", "qualifiedName", "identifierRule", "classDeclaration", 
		"classBody", "classBodyDeclaration", "modifier", "classOrInterfaceModifier", 
		"memberDeclaration", "genericMethodDeclaration", "methodDeclaration", 
		"methodBody", "fieldDeclaration", "genericConstructorDeclaration", "constructorDeclaration", 
		"constructorBody", "genericInterfaceMethodDeclaration", "interfaceMethodDeclaration", 
		"interfaceDeclaration", "interfaceBody", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "block", "blockStatement", "localVariableDeclaration", 
		"statement", "statementsCommaless", "parExpression", "catchClause", "catchDeclaration", 
		"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
		"switchBlockStatementGroup", "switchLabel", "constantExpression", "enumConstantName", 
		"forControl", "forInit", "enhancedForControl", "forUpdate", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"variableModifier", "typeParameters", "typeParameter", "typeBound", "typeList", 
		"type", "classOrInterfaceType", "typeArguments", "typeArgument", "typeArgumentsOrDiamond", 
		"primitiveType", "expressionList", "expression", "primary", "literal", 
		"nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "explicitGenericInvocation", 
		"explicitGenericInvocationSuffix", "superSuffix", "arguments", "creator", 
		"createdName", "classCreatorRest", "arrayCreatorRest", "innerCreator", 
		"abstractRule", "assertRule", "booleanRule", "breakRule", "byteRule", 
		"caseRule", "catchRule", "charRule", "classRule", "constRule", "continueRule", 
		"defaultRule", "doRule", "doubleRule", "elseRule", "enumRule", "extendsRule", 
		"finalRule", "finallyRule", "floatRule", "forRule", "ifRule", "gotoRule", 
		"implementsRule", "importRule", "instanceofRule", "intRule", "interfaceRule", 
		"longRule", "nativeRule", "newRule", "packageRule", "privateRule", "protectedRule", 
		"publicRule", "returnRule", "shortRule", "staticRule", "strictfpRule", 
		"superRule", "switchRule", "synchronizedRule", "thisRule", "throwRule", 
		"throwsRule", "transientRule", "tryRule", "voidRule", "volatileRule", 
		"whileRule", "lparenRule", "rparenRule", "lbraceRule", "rbraceRule", "lbrackRule", 
		"rbrackRule", "semiRule", "commaRule", "dotRule", "assignRule", "gtRule", 
		"ltRule", "bangRule", "tildeRule", "questionRule", "colonRule", "equalRule", 
		"leRule", "geRule", "notEqualRule", "andRule", "orRule", "incRule", "decRule", 
		"addRule", "subRule", "mulRule", "divRule", "bitandRule", "bitorRule", 
		"caretRule", "modRule", "add_assignRule", "sub_assignRule", "mul_assignRule", 
		"div_assignRule", "and_assignRule", "or_assignRule", "xor_assignRule", 
		"mod_assignRule", "lshift_assignRule", "rshift_assignRule", "urshift_assignRule", 
		"atRule", "ellipsisRule"
	};

	@Override
	public String getGrammarFileName() { return "PJ.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PjContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(PJParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public PjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PjContext pj() throws RecognitionException {
		PjContext _localctx = new PjContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(396); packageDeclaration();
				}
				break;
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(399); importDeclaration();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(405); typeDeclaration();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageRuleContext packageRule() {
			return getRuleContext(PackageRuleContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(413); annotation();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419); packageRule();
			setState(420); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public DotRuleContext dotRule() {
			return getRuleContext(DotRuleContext.class,0);
		}
		public ImportRuleContext importRule() {
			return getRuleContext(ImportRuleContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MulRuleContext mulRule() {
			return getRuleContext(MulRuleContext.class,0);
		}
		public StaticRuleContext staticRule() {
			return getRuleContext(StaticRuleContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); importRule();
			setState(424);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(423); staticRule();
				}
			}

			setState(426); qualifiedName();
			setState(430);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(427); dotRule();
				setState(428); mulRule();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(432); classOrInterfaceModifier();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(439); classOrInterfaceModifier();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445); interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(446); classOrInterfaceModifier();
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(452); annotationTypeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(453); classOrInterfaceModifier();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestingRuleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TestingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTestingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTestingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTestingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestingRuleContext testingRule() throws RecognitionException {
		TestingRuleContext _localctx = new TestingRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_testingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementValue);
		try {
			setState(467);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(464); elementValueArrayInitializer();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(465); annotation();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case NullLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(466); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(LBRACE);
			setState(479);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(470); elementValue();
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471); commaRule();
						setState(472); elementValue();
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
			}

			setState(482);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(481); commaRule();
				}
			}

			setState(484); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); lparenRule();
			setState(488);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==Identifier) {
				{
				setState(487); formalParameterList();
				}
			}

			setState(490); rparenRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); formalParameter();
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(493); commaRule();
						setState(494); formalParameter();
						}
						} 
					}
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(504);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(501); commaRule();
					setState(502); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(509); variableModifier();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515); type();
			setState(516); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(518); variableModifier();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524); type();
			setState(525); match(ELLIPSIS);
			setState(526); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); type();
			setState(529); constantDeclarator();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(530); commaRule();
				setState(531); constantDeclarator();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(Identifier);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(541); match(LBRACK);
				setState(542); match(RBRACK);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548); match(ASSIGN);
			setState(549); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); qualifiedName();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(552); commaRule();
				setState(553); qualifiedName();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(PJParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(PJParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(Identifier);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(561); match(DOT);
					setState(562); match(Identifier);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierRuleContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public IdentifierRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIdentifierRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIdentifierRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIdentifierRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierRuleContext identifierRule() throws RecognitionException {
		IdentifierRuleContext _localctx = new IdentifierRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifierRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ImplementsRuleContext implementsRule() {
			return getRuleContext(ImplementsRuleContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassRuleContext classRule() {
			return getRuleContext(ClassRuleContext.class,0);
		}
		public ExtendsRuleContext extendsRule() {
			return getRuleContext(ExtendsRuleContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); classRule();
			setState(571); identifierRule();
			setState(573);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(572); typeParameters();
				}
			}

			setState(578);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(575); extendsRule();
				setState(576); type();
				}
			}

			setState(583);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(580); implementsRule();
				setState(581); typeList();
				}
			}

			setState(585); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(PJParser.INDENT, 0); }
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(PJParser.DEDENT, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(587); match(COLON);
				}
			}

			setState(590); match(INDENT);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COLON - 66)) | (1L << (AT - 66)) | (1L << (Identifier - 66)) | (1L << (INDENT - 66)))) != 0)) {
				{
				{
				setState(591); classBodyDeclaration();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597); match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public StaticRuleContext staticRule() {
			return getRuleContext(StaticRuleContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(599); staticRule();
					}
				}

				setState(602); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603); modifier();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(609); memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public NativeRuleContext nativeRule() {
			return getRuleContext(NativeRuleContext.class,0);
		}
		public SynchronizedRuleContext synchronizedRule() {
			return getRuleContext(SynchronizedRuleContext.class,0);
		}
		public VolatileRuleContext volatileRule() {
			return getRuleContext(VolatileRuleContext.class,0);
		}
		public TransientRuleContext transientRule() {
			return getRuleContext(TransientRuleContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifier);
		try {
			setState(619);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(612); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				switch (_input.LA(1)) {
				case NATIVE:
					{
					setState(613); nativeRule();
					}
					break;
				case SYNCHRONIZED:
					{
					setState(614); synchronizedRule();
					}
					break;
				case TRANSIENT:
					{
					setState(615); transientRule();
					}
					break;
				case VOLATILE:
					{
					setState(616); volatileRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public StrictfpRuleContext strictfpRule() {
			return getRuleContext(StrictfpRuleContext.class,0);
		}
		public PrivateRuleContext privateRule() {
			return getRuleContext(PrivateRuleContext.class,0);
		}
		public PublicRuleContext publicRule() {
			return getRuleContext(PublicRuleContext.class,0);
		}
		public ProtectedRuleContext protectedRule() {
			return getRuleContext(ProtectedRuleContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AbstractRuleContext abstractRule() {
			return getRuleContext(AbstractRuleContext.class,0);
		}
		public FinalRuleContext finalRule() {
			return getRuleContext(FinalRuleContext.class,0);
		}
		public StaticRuleContext staticRule() {
			return getRuleContext(StaticRuleContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classOrInterfaceModifier);
		try {
			setState(631);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(621); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(622); publicRule();
					}
					break;
				case PROTECTED:
					{
					setState(623); protectedRule();
					}
					break;
				case PRIVATE:
					{
					setState(624); privateRule();
					}
					break;
				case STATIC:
					{
					setState(625); staticRule();
					}
					break;
				case ABSTRACT:
					{
					setState(626); abstractRule();
					}
					break;
				case FINAL:
					{
					setState(627); finalRule();
					}
					break;
				case STRICTFP:
					{
					setState(628); strictfpRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	 
		public MemberDeclarationContext() { }
		public void copyFrom(MemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberDeclarationNLContext extends MemberDeclarationContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationNLContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMemberDeclarationNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMemberDeclarationNL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMemberDeclarationNL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationNoNLContext extends MemberDeclarationContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationNoNLContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMemberDeclarationNoNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMemberDeclarationNoNL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMemberDeclarationNoNL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_memberDeclaration);
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(633); classDeclaration();
				}
				break;
			case 2:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(634); genericMethodDeclaration();
				}
				break;
			case 3:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(635); methodDeclaration();
				}
				break;
			case 4:
				_localctx = new MemberDeclarationNoNLContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(636); fieldDeclaration();
				}
				break;
			case 5:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(637); genericConstructorDeclaration();
				}
				break;
			case 6:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(638); constructorDeclaration();
				}
				break;
			case 7:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(639); interfaceDeclaration();
				}
				break;
			case 8:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(640); annotationTypeDeclaration();
				}
				break;
			case 9:
				_localctx = new MemberDeclarationNLContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(641); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); typeParameters();
			setState(645); methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public VoidRuleContext voidRule() {
			return getRuleContext(VoidRuleContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(647); type();
				}
				break;
			case VOID:
				{
				setState(648); voidRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(651); identifierRule();
			setState(652); formalParameters();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(653); match(LBRACK);
				setState(654); match(RBRACK);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(660); throwsRule();
				setState(661); qualifiedNameList();
				}
			}

			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(665); methodBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); type();
			setState(671); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); typeParameters();
			setState(674); constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); match(Identifier);
			setState(677); formalParameters();
			setState(680);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(678); match(THROWS);
				setState(679); qualifiedNameList();
				}
			}

			setState(682); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); typeParameters();
			setState(687); interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(689); type();
				}
				break;
			case VOID:
				{
				setState(690); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(693); match(Identifier);
			setState(694); formalParameters();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(695); match(LBRACK);
				setState(696); match(RBRACK);
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(702); match(THROWS);
				setState(703); qualifiedNameList();
				}
			}

			setState(706); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708); match(INTERFACE);
			setState(709); match(Identifier);
			setState(711);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(710); typeParameters();
				}
			}

			setState(715);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(713); match(EXTENDS);
				setState(714); typeList();
				}
			}

			setState(717); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); match(LBRACE);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI) | (1L << LT))) != 0) || _la==AT || _la==Identifier) {
				{
				{
				setState(720); interfaceBodyDeclaration();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(736);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(728); modifier();
						}
						} 
					}
					setState(733);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(734); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(735); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceMemberDeclaration);
		try {
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738); constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740); genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(742); annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(743); classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(744); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public InterfaceRuleContext interfaceRule() {
			return getRuleContext(InterfaceRuleContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); atRule();
			setState(748); interfaceRule();
			setState(749); identifierRule();
			setState(750); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); match(LBRACE);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==AT || _la==Identifier) {
				{
				{
				setState(753); annotationTypeElementDeclaration();
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(759); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(769);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(761); modifier();
						}
						} 
					}
					setState(766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(767); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(768); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_annotationTypeElementRest);
		try {
			setState(791);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); annotationTypeDeclaration();
				setState(773);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(772); match(SEMI);
					}
					break;
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(775); type();
				setState(776); annotationMethodOrConstantRest();
				setState(777); match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(779); classDeclaration();
				setState(781);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(780); match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(783); interfaceDeclaration();
				setState(785);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(784); match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(787); enumDeclaration();
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(788); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_annotationMethodOrConstantRest);
		try {
			setState(795);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793); annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794); annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(Identifier);
			setState(798); lparenRule();
			setState(799); rparenRule();
			setState(801);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(800); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); match(DEFAULT);
			setState(806); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); atRule();
			setState(809); annotationName();
			setState(817);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(810); lparenRule();
				setState(813);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(811); elementValuePairs();
					}
					break;
				case 2:
					{
					setState(812); elementValue();
					}
					break;
				}
				setState(815); rparenRule();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821); elementValuePair();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(822); match(COMMA);
				setState(823); elementValuePair();
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); match(Identifier);
			setState(830); match(ASSIGN);
			setState(831); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PJParser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); match(ENUM);
			setState(834); match(Identifier);
			setState(837);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(835); match(IMPLEMENTS);
				setState(836); typeList();
				}
			}

			setState(839); match(LBRACE);
			setState(841);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(840); enumConstants();
				}
			}

			setState(844);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(843); match(COMMA);
				}
			}

			setState(847);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(846); enumBodyDeclarations();
				}
			}

			setState(849); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851); enumConstant();
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(852); match(COMMA);
					setState(853); enumConstant();
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(859); annotation();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865); match(Identifier);
			setState(867);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(866); arguments();
				}
			}

			setState(870);
			_la = _input.LA(1);
			if (_la==COLON || _la==INDENT) {
				{
				setState(869); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872); match(SEMI);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COLON - 66)) | (1L << (AT - 66)) | (1L << (Identifier - 66)) | (1L << (INDENT - 66)))) != 0)) {
				{
				{
				setState(873); classBodyDeclaration();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode INDENT() { return getToken(PJParser.INDENT, 0); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(PJParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(879); match(COLON);
				}
			}

			setState(882); match(INDENT);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (COLON - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (INDENT - 64)))) != 0)) {
				{
				{
				setState(883); blockStatement();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889); match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blockStatement);
		try {
			setState(894);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893); typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(896); variableModifier();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902); type();
			setState(903); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommalessStatementContext extends StatementContext {
		public StatementsCommalessContext statementsCommaless() {
			return getRuleContext(StatementsCommalessContext.class,0);
		}
		public CommalessStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCommalessStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCommalessStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCommalessStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierStamentContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public IdentifierStamentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIdentifierStament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIdentifierStament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIdentifierStament(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryStatementContext extends StatementContext {
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TryRuleContext tryRule() {
			return getRuleContext(TryRuleContext.class,0);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ForRuleContext forRule() {
			return getRuleContext(ForRuleContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SynchronizedStatementContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SynchronizedRuleContext synchronizedRule() {
			return getRuleContext(SynchronizedRuleContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleBlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleBlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSimpleBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSimpleBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSimpleBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfRuleContext ifRule() {
			return getRuleContext(IfRuleContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ElseRuleContext elseRule() {
			return getRuleContext(ElseRuleContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(973);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new SimpleBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(905); block();
				}
				break;
			case 2:
				_localctx = new CommalessStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(906); statementsCommaless();
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(907); ifRule();
				setState(908); parExpression();
				setState(909); statement();
				setState(913);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(910); elseRule();
					setState(911); statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(915); forRule();
				setState(916); forControl();
				setState(917); statement();
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(919); match(WHILE);
				setState(920); parExpression();
				setState(921); statement();
				}
				break;
			case 6:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(923); tryRule();
				setState(924); block();
				setState(934);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(926); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(925); catchClause();
						}
						}
						setState(928); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(931);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(930); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(933); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(936); tryRule();
				setState(937); resourceSpecification();
				setState(938); block();
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(939); catchClause();
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(946);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(945); finallyBlock();
					}
				}

				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(948); match(SWITCH);
				setState(949); parExpression();
				setState(950); match(LBRACE);
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(951); switchBlockStatementGroup();
						}
						} 
					}
					setState(956);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(957); switchLabel();
					}
					}
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(963); match(RBRACE);
				}
				break;
			case 9:
				_localctx = new SynchronizedStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(965); synchronizedRule();
				setState(966); parExpression();
				setState(967); block();
				}
				break;
			case 10:
				_localctx = new IdentifierStamentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(969); identifierRule();
				setState(970); match(COLON);
				setState(971); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsCommalessContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnRuleContext returnRule() {
			return getRuleContext(ReturnRuleContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public ThrowRuleContext throwRule() {
			return getRuleContext(ThrowRuleContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public AssertRuleContext assertRule() {
			return getRuleContext(AssertRuleContext.class,0);
		}
		public BreakRuleContext breakRule() {
			return getRuleContext(BreakRuleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhileRuleContext whileRule() {
			return getRuleContext(WhileRuleContext.class,0);
		}
		public ContinueRuleContext continueRule() {
			return getRuleContext(ContinueRuleContext.class,0);
		}
		public DoRuleContext doRule() {
			return getRuleContext(DoRuleContext.class,0);
		}
		public StatementsCommalessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementsCommaless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterStatementsCommaless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitStatementsCommaless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitStatementsCommaless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsCommalessContext statementsCommaless() throws RecognitionException {
		StatementsCommalessContext _localctx = new StatementsCommalessContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statementsCommaless);
		try {
			setState(1002);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case NullLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(975); expression(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); returnRule();
				setState(978);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(977); expression(0);
					}
					break;
				}
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(980); throwRule();
				setState(981); expression(0);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(983); breakRule();
				setState(985);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(984); identifierRule();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(987); continueRule();
				setState(989);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(988); identifierRule();
					}
					break;
				}
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 6);
				{
				setState(991); assertRule();
				setState(992); expression(0);
				setState(995);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(993); match(COLON);
					setState(994); expression(0);
					}
					break;
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 7);
				{
				setState(997); doRule();
				setState(998); statement();
				setState(999); whileRule();
				setState(1000); parExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchDeclarationContext catchDeclaration() {
			return getRuleContext(CatchDeclarationContext.class,0);
		}
		public CatchRuleContext catchRule() {
			return getRuleContext(CatchRuleContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); catchRule();
			setState(1007); catchDeclaration();
			setState(1008); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchDeclarationContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCatchDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCatchDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCatchDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchDeclarationContext catchDeclaration() throws RecognitionException {
		CatchDeclarationContext _localctx = new CatchDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_catchDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1010); variableModifier();
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016); catchType();
			setState(1017); identifierRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); qualifiedName();
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1020); match(BITOR);
				setState(1021); qualifiedName();
				}
				}
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyRuleContext finallyRule() {
			return getRuleContext(FinallyRuleContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); finallyRule();
			setState(1028); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030); match(LPAREN);
			setState(1031); resources();
			setState(1033);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1032); match(SEMI);
				}
			}

			setState(1035); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); resource();
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1038); match(SEMI);
					setState(1039); resource();
					}
					} 
				}
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1045); variableModifier();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051); classOrInterfaceType();
			setState(1052); variableDeclaratorId();
			setState(1053); match(ASSIGN);
			setState(1054); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1056); switchLabel();
				}
				}
				setState(1059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1062); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1061); blockStatement();
				}
				}
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (COLON - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (INDENT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_switchLabel);
		try {
			setState(1076);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066); match(CASE);
				setState(1067); constantExpression();
				setState(1068); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070); match(CASE);
				setState(1071); enumConstantName();
				setState(1072); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074); match(DEFAULT);
				setState(1075); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_forControl);
		int _la;
		try {
			setState(1094);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1083); forInit();
					}
				}

				setState(1086); match(SEMI);
				setState(1088);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1087); expression(0);
					}
				}

				setState(1090); match(SEMI);
				setState(1092);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1091); forUpdate();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_forInit);
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ColonRuleContext colonRule() {
			return getRuleContext(ColonRuleContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1100); variableModifier();
				}
				}
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1106); type();
			setState(1107); variableDeclaratorId();
			setState(1108); colonRule();
			setState(1109); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); variableDeclarator();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1114); match(COMMA);
				setState(1115); variableDeclarator();
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public AssignRuleContext assignRule() {
			return getRuleContext(AssignRuleContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121); variableDeclaratorId();
			setState(1125);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1122); assignRule();
				setState(1123); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public RbraceRuleContext rbraceRule(int i) {
			return getRuleContext(RbraceRuleContext.class,i);
		}
		public List<RbraceRuleContext> rbraceRule() {
			return getRuleContexts(RbraceRuleContext.class);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public LbraceRuleContext lbraceRule(int i) {
			return getRuleContext(LbraceRuleContext.class,i);
		}
		public List<LbraceRuleContext> lbraceRule() {
			return getRuleContexts(LbraceRuleContext.class);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); identifierRule();
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(1128); lbraceRule();
				setState(1129); rbraceRule();
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variableInitializer);
		try {
			setState(1138);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case NullLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); match(LBRACE);
			setState(1152);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1141); variableInitializer();
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1142); match(COMMA);
						setState(1143); variableInitializer();
						}
						} 
					}
					setState(1148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(1150);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1149); match(COMMA);
					}
				}

				}
			}

			setState(1154); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FinalRuleContext finalRule() {
			return getRuleContext(FinalRuleContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variableModifier);
		try {
			setState(1158);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156); finalRule();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); match(LT);
			setState(1161); typeParameter();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1162); match(COMMA);
				setState(1163); typeParameter();
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); match(Identifier);
			setState(1174);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1172); match(EXTENDS);
				setState(1173); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176); type();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1177); match(BITAND);
				setState(1178); type();
				}
				}
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); type();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1185); match(COMMA);
				setState(1186); type();
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public List<RbrackRuleContext> rbrackRule() {
			return getRuleContexts(RbrackRuleContext.class);
		}
		public List<LbrackRuleContext> lbrackRule() {
			return getRuleContexts(LbrackRuleContext.class);
		}
		public RbrackRuleContext rbrackRule(int i) {
			return getRuleContext(RbrackRuleContext.class,i);
		}
		public LbrackRuleContext lbrackRule(int i) {
			return getRuleContext(LbrackRuleContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_type);
		try {
			int _alt;
			setState(1210);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192); classOrInterfaceType();
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1193); lbrackRule();
						setState(1194); rbrackRule();
						}
						} 
					}
					setState(1200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201); primitiveType();
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1202); lbrackRule();
						setState(1203); rbrackRule();
						}
						} 
					}
					setState(1209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<DotRuleContext> dotRule() {
			return getRuleContexts(DotRuleContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<IdentifierRuleContext> identifierRule() {
			return getRuleContexts(IdentifierRuleContext.class);
		}
		public IdentifierRuleContext identifierRule(int i) {
			return getRuleContext(IdentifierRuleContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public DotRuleContext dotRule(int i) {
			return getRuleContext(DotRuleContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212); identifierRule();
			setState(1214);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1213); typeArguments();
				}
				break;
			}
			setState(1223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1216); dotRule();
					setState(1217); identifierRule();
					setState(1219);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1218); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(1225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public LtRuleContext ltRule() {
			return getRuleContext(LtRuleContext.class,0);
		}
		public GtRuleContext gtRule() {
			return getRuleContext(GtRuleContext.class,0);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226); ltRule();
			setState(1227); typeArgument();
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1228); commaRule();
				setState(1229); typeArgument();
				}
				}
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1236); gtRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeArgument);
		int _la;
		try {
			setState(1244);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239); match(QUESTION);
				setState(1242);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(1240);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1241); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public LtRuleContext ltRule() {
			return getRuleContext(LtRuleContext.class,0);
		}
		public GtRuleContext gtRule() {
			return getRuleContext(GtRuleContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeArgumentsOrDiamond);
		try {
			setState(1250);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246); ltRule();
				setState(1247); gtRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249); typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<CommaRuleContext> commaRule() {
			return getRuleContexts(CommaRuleContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CommaRuleContext commaRule(int i) {
			return getRuleContext(CommaRuleContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254); expression(0);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1255); commaRule();
				setState(1256); expression(0);
				}
				}
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RbrackRuleContext rbrackRule() {
			return getRuleContext(RbrackRuleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GtRuleContext gtRule(int i) {
			return getRuleContext(GtRuleContext.class,i);
		}
		public EqualRuleContext equalRule() {
			return getRuleContext(EqualRuleContext.class,0);
		}
		public NotEqualRuleContext notEqualRule() {
			return getRuleContext(NotEqualRuleContext.class,0);
		}
		public AddRuleContext addRule() {
			return getRuleContext(AddRuleContext.class,0);
		}
		public GeRuleContext geRule() {
			return getRuleContext(GeRuleContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignRuleContext assignRule() {
			return getRuleContext(AssignRuleContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ColonRuleContext colonRule() {
			return getRuleContext(ColonRuleContext.class,0);
		}
		public LeRuleContext leRule() {
			return getRuleContext(LeRuleContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public List<GtRuleContext> gtRule() {
			return getRuleContexts(GtRuleContext.class);
		}
		public NewRuleContext newRule() {
			return getRuleContext(NewRuleContext.class,0);
		}
		public DecRuleContext decRule() {
			return getRuleContext(DecRuleContext.class,0);
		}
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public List<LtRuleContext> ltRule() {
			return getRuleContexts(LtRuleContext.class);
		}
		public LtRuleContext ltRule(int i) {
			return getRuleContext(LtRuleContext.class,i);
		}
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public LbrackRuleContext lbrackRule() {
			return getRuleContext(LbrackRuleContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public DotRuleContext dotRule() {
			return getRuleContext(DotRuleContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public IncRuleContext incRule() {
			return getRuleContext(IncRuleContext.class,0);
		}
		public QuestionRuleContext questionRule() {
			return getRuleContext(QuestionRuleContext.class,0);
		}
		public SubRuleContext subRule() {
			return getRuleContext(SubRuleContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1264); lparenRule();
				setState(1265); type();
				setState(1266); rparenRule();
				setState(1267); expression(17);
				}
				break;
			case 2:
				{
				setState(1273);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(1269); addRule();
					}
					break;
				case SUB:
					{
					setState(1270); subRule();
					}
					break;
				case INC:
					{
					setState(1271); incRule();
					}
					break;
				case DEC:
					{
					setState(1272); decRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1275); expression(15);
				}
				break;
			case 3:
				{
				setState(1277);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1278); expression(14);
				}
				break;
			case 4:
				{
				setState(1279); primary();
				}
				break;
			case 5:
				{
				setState(1280); newRule();
				setState(1281); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1408);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1286);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MUL - 77)) | (1L << (DIV - 77)) | (1L << (MOD - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1287); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1288);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1291);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(1289); addRule();
							}
							break;
						case SUB:
							{
							setState(1290); subRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1293); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1295);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1306);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(1296); ltRule();
							setState(1297); ltRule();
							}
							break;
						case 2:
							{
							setState(1299); gtRule();
							setState(1300); gtRule();
							setState(1301); gtRule();
							}
							break;
						case 3:
							{
							setState(1303); gtRule();
							setState(1304); gtRule();
							}
							break;
						}
						setState(1308); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1315);
						switch (_input.LA(1)) {
						case LE:
							{
							setState(1311); leRule();
							}
							break;
						case GE:
							{
							setState(1312); geRule();
							}
							break;
						case GT:
							{
							setState(1313); gtRule();
							}
							break;
						case LT:
							{
							setState(1314); ltRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1317); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1319);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1322);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(1320); equalRule();
							}
							break;
						case NOTEQUAL:
							{
							setState(1321); notEqualRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1324); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1326);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1327); match(BITAND);
						setState(1328); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1329);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1330); match(CARET);
						setState(1331); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1333); match(BITOR);
						setState(1334); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1335);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1336); match(AND);
						setState(1337); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1338);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1339); match(OR);
						setState(1340); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1341);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1342); questionRule();
						setState(1343); expression(0);
						setState(1344); colonRule();
						setState(1345); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1347);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1360);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(1348); assignRule();
							}
							break;
						case ADD_ASSIGN:
							{
							setState(1349); match(ADD_ASSIGN);
							}
							break;
						case SUB_ASSIGN:
							{
							setState(1350); match(SUB_ASSIGN);
							}
							break;
						case MUL_ASSIGN:
							{
							setState(1351); match(MUL_ASSIGN);
							}
							break;
						case DIV_ASSIGN:
							{
							setState(1352); match(DIV_ASSIGN);
							}
							break;
						case AND_ASSIGN:
							{
							setState(1353); match(AND_ASSIGN);
							}
							break;
						case OR_ASSIGN:
							{
							setState(1354); match(OR_ASSIGN);
							}
							break;
						case XOR_ASSIGN:
							{
							setState(1355); match(XOR_ASSIGN);
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(1356); match(RSHIFT_ASSIGN);
							}
							break;
						case URSHIFT_ASSIGN:
							{
							setState(1357); match(URSHIFT_ASSIGN);
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(1358); match(LSHIFT_ASSIGN);
							}
							break;
						case MOD_ASSIGN:
							{
							setState(1359); match(MOD_ASSIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1362); expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1363);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1364); dotRule();
						setState(1365); identifierRule();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1367);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1368); dotRule();
						setState(1369); match(THIS);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1371);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1372); dotRule();
						setState(1373); newRule();
						setState(1375);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1374); nonWildcardTypeArguments();
							}
						}

						setState(1377); innerCreator();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1379);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1380); dotRule();
						setState(1381); match(SUPER);
						setState(1382); superSuffix();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1384);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1385); dotRule();
						setState(1386); explicitGenericInvocation();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1388);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1389); lbrackRule();
						setState(1390); expression(0);
						setState(1391); rbrackRule();
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1393);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1394); lparenRule();
						setState(1396);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(1395); expressionList();
							}
						}

						setState(1398); rparenRule();
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1400);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1403);
						switch (_input.LA(1)) {
						case INC:
							{
							setState(1401); incRule();
							}
							break;
						case DEC:
							{
							setState(1402); decRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1405);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1406); match(INSTANCEOF);
						setState(1407); type();
						}
						break;
					}
					} 
				}
				setState(1412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public DotRuleContext dotRule() {
			return getRuleContext(DotRuleContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SuperRuleContext superRule() {
			return getRuleContext(SuperRuleContext.class,0);
		}
		public ThisRuleContext thisRule() {
			return getRuleContext(ThisRuleContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_primary);
		try {
			setState(1435);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413); lparenRule();
				setState(1414); expression(0);
				setState(1415); rparenRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417); thisRule();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1418); superRule();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1419); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1420); identifierRule();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1421); type();
				setState(1422); dotRule();
				setState(1423); match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1425); match(VOID);
				setState(1426); dotRule();
				setState(1427); match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1429); nonWildcardTypeArguments();
				setState(1433);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1430); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1431); match(THIS);
					setState(1432); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(PJParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(PJParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PJParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(PJParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PJParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NullLiteral - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (CharacterLiteral - 96)) | (1L << (StringLiteral - 96)) | (1L << (IntegerLiteral - 96)) | (1L << (FloatingPointLiteral - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public LtRuleContext ltRule() {
			return getRuleContext(LtRuleContext.class,0);
		}
		public GtRuleContext gtRule() {
			return getRuleContext(GtRuleContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1443);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439); ltRule();
				setState(1440); gtRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442); nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public LtRuleContext ltRule() {
			return getRuleContext(LtRuleContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public GtRuleContext gtRule() {
			return getRuleContext(GtRuleContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445); ltRule();
			setState(1446); typeList();
			setState(1447); gtRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449); nonWildcardTypeArguments();
			setState(1450); explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1456);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452); match(SUPER);
				setState(1453); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454); match(Identifier);
				setState(1455); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public DotRuleContext dotRule() {
			return getRuleContext(DotRuleContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_superSuffix);
		try {
			setState(1464);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459); dotRule();
				setState(1460); match(Identifier);
				setState(1462);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1461); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LparenRuleContext lparenRule() {
			return getRuleContext(LparenRuleContext.class,0);
		}
		public RparenRuleContext rparenRule() {
			return getRuleContext(RparenRuleContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466); lparenRule();
			setState(1468);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LT) | (1L << BANG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (NullLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1467); expressionList();
				}
			}

			setState(1470); rparenRule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_creator);
		try {
			setState(1481);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472); nonWildcardTypeArguments();
				setState(1473); createdName();
				setState(1474); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476); createdName();
				setState(1479);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1477); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1478); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<DotRuleContext> dotRule() {
			return getRuleContexts(DotRuleContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public IdentifierRuleContext identifierRule() {
			return getRuleContext(IdentifierRuleContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(PJParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(PJParser.Identifier); }
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DotRuleContext dotRule(int i) {
			return getRuleContext(DotRuleContext.class,i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_createdName);
		int _la;
		try {
			setState(1498);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483); identifierRule();
				setState(1485);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1484); typeArgumentsOrDiamond();
					}
				}

				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1487); dotRule();
					setState(1488); match(Identifier);
					setState(1490);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1489); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); arguments();
			setState(1502);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1501); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<RbrackRuleContext> rbrackRule() {
			return getRuleContexts(RbrackRuleContext.class);
		}
		public List<LbrackRuleContext> lbrackRule() {
			return getRuleContexts(LbrackRuleContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RbrackRuleContext rbrackRule(int i) {
			return getRuleContext(RbrackRuleContext.class,i);
		}
		public LbrackRuleContext lbrackRule(int i) {
			return getRuleContext(LbrackRuleContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1504); lbrackRule();
			setState(1535);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1505); rbrackRule();
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1506); lbrackRule();
					setState(1507); rbrackRule();
					}
					}
					setState(1513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1514); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case NullLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case Identifier:
				{
				setState(1516); expression(0);
				setState(1517); rbrackRule();
				setState(1524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1518); lbrackRule();
						setState(1519); expression(0);
						setState(1520); rbrackRule();
						}
						} 
					}
					setState(1526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1527); lbrackRule();
						setState(1528); rbrackRule();
						}
						} 
					}
					setState(1534);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PJParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537); match(Identifier);
			setState(1539);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1538); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1541); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractRuleContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(PJParser.ABSTRACT, 0); }
		public AbstractRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAbstractRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAbstractRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAbstractRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractRuleContext abstractRule() throws RecognitionException {
		AbstractRuleContext _localctx = new AbstractRuleContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_abstractRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543); match(ABSTRACT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertRuleContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PJParser.ASSERT, 0); }
		public AssertRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAssertRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAssertRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAssertRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertRuleContext assertRule() throws RecognitionException {
		AssertRuleContext _localctx = new AssertRuleContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assertRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545); match(ASSERT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanRuleContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PJParser.BOOLEAN, 0); }
		public BooleanRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBooleanRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBooleanRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBooleanRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanRuleContext booleanRule() throws RecognitionException {
		BooleanRuleContext _localctx = new BooleanRuleContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_booleanRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547); match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakRuleContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PJParser.BREAK, 0); }
		public BreakRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBreakRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBreakRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBreakRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakRuleContext breakRule() throws RecognitionException {
		BreakRuleContext _localctx = new BreakRuleContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_breakRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549); match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByteRuleContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(PJParser.BYTE, 0); }
		public ByteRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterByteRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitByteRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitByteRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteRuleContext byteRule() throws RecognitionException {
		ByteRuleContext _localctx = new ByteRuleContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_byteRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551); match(BYTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PJParser.CASE, 0); }
		public CaseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCaseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCaseRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseRuleContext caseRule() throws RecognitionException {
		CaseRuleContext _localctx = new CaseRuleContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_caseRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553); match(CASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchRuleContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(PJParser.CATCH, 0); }
		public CatchRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCatchRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCatchRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCatchRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchRuleContext catchRule() throws RecognitionException {
		CatchRuleContext _localctx = new CatchRuleContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_catchRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555); match(CATCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharRuleContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PJParser.CHAR, 0); }
		public CharRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCharRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCharRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCharRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharRuleContext charRule() throws RecognitionException {
		CharRuleContext _localctx = new CharRuleContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_charRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557); match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRuleContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PJParser.CLASS, 0); }
		public ClassRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterClassRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitClassRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitClassRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassRuleContext classRule() throws RecognitionException {
		ClassRuleContext _localctx = new ClassRuleContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_classRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559); match(CLASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstRuleContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PJParser.CONST, 0); }
		public ConstRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterConstRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitConstRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitConstRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstRuleContext constRule() throws RecognitionException {
		ConstRuleContext _localctx = new ConstRuleContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_constRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561); match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueRuleContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PJParser.CONTINUE, 0); }
		public ContinueRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterContinueRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitContinueRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitContinueRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueRuleContext continueRule() throws RecognitionException {
		ContinueRuleContext _localctx = new ContinueRuleContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_continueRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563); match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultRuleContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PJParser.DEFAULT, 0); }
		public DefaultRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDefaultRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDefaultRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDefaultRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultRuleContext defaultRule() throws RecognitionException {
		DefaultRuleContext _localctx = new DefaultRuleContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565); match(DEFAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoRuleContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(PJParser.DO, 0); }
		public DoRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDoRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDoRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDoRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoRuleContext doRule() throws RecognitionException {
		DoRuleContext _localctx = new DoRuleContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_doRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567); match(DO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleRuleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(PJParser.DOUBLE, 0); }
		public DoubleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDoubleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDoubleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDoubleRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleRuleContext doubleRule() throws RecognitionException {
		DoubleRuleContext _localctx = new DoubleRuleContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_doubleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569); match(DOUBLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseRuleContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PJParser.ELSE, 0); }
		public ElseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterElseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitElseRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitElseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseRuleContext elseRule() throws RecognitionException {
		ElseRuleContext _localctx = new ElseRuleContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elseRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571); match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumRuleContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PJParser.ENUM, 0); }
		public EnumRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEnumRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEnumRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEnumRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumRuleContext enumRule() throws RecognitionException {
		EnumRuleContext _localctx = new EnumRuleContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enumRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573); match(ENUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsRuleContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(PJParser.EXTENDS, 0); }
		public ExtendsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterExtendsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitExtendsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitExtendsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsRuleContext extendsRule() throws RecognitionException {
		ExtendsRuleContext _localctx = new ExtendsRuleContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_extendsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); match(EXTENDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalRuleContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(PJParser.FINAL, 0); }
		public FinalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFinalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFinalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFinalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalRuleContext finalRule() throws RecognitionException {
		FinalRuleContext _localctx = new FinalRuleContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_finalRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577); match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyRuleContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PJParser.FINALLY, 0); }
		public FinallyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFinallyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFinallyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFinallyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyRuleContext finallyRule() throws RecognitionException {
		FinallyRuleContext _localctx = new FinallyRuleContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_finallyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579); match(FINALLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatRuleContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PJParser.FLOAT, 0); }
		public FloatRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterFloatRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitFloatRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitFloatRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatRuleContext floatRule() throws RecognitionException {
		FloatRuleContext _localctx = new FloatRuleContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_floatRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581); match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForRuleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PJParser.FOR, 0); }
		public ForRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterForRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitForRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitForRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRuleContext forRule() throws RecognitionException {
		ForRuleContext _localctx = new ForRuleContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_forRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583); match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfRuleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PJParser.IF, 0); }
		public IfRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRuleContext ifRule() throws RecognitionException {
		IfRuleContext _localctx = new IfRuleContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ifRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585); match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoRuleContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PJParser.GOTO, 0); }
		public GotoRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGotoRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGotoRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGotoRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoRuleContext gotoRule() throws RecognitionException {
		GotoRuleContext _localctx = new GotoRuleContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_gotoRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587); match(GOTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsRuleContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(PJParser.IMPLEMENTS, 0); }
		public ImplementsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterImplementsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitImplementsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitImplementsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsRuleContext implementsRule() throws RecognitionException {
		ImplementsRuleContext _localctx = new ImplementsRuleContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_implementsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589); match(IMPLEMENTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportRuleContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PJParser.IMPORT, 0); }
		public ImportRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRuleContext importRule() throws RecognitionException {
		ImportRuleContext _localctx = new ImportRuleContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_importRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591); match(IMPORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceofRuleContext extends ParserRuleContext {
		public TerminalNode INSTANCEOF() { return getToken(PJParser.INSTANCEOF, 0); }
		public InstanceofRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceofRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInstanceofRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInstanceofRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInstanceofRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceofRuleContext instanceofRule() throws RecognitionException {
		InstanceofRuleContext _localctx = new InstanceofRuleContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_instanceofRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593); match(INSTANCEOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntRuleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PJParser.INT, 0); }
		public IntRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIntRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIntRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIntRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntRuleContext intRule() throws RecognitionException {
		IntRuleContext _localctx = new IntRuleContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_intRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceRuleContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(PJParser.INTERFACE, 0); }
		public InterfaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterInterfaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitInterfaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitInterfaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceRuleContext interfaceRule() throws RecognitionException {
		InterfaceRuleContext _localctx = new InterfaceRuleContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_interfaceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597); match(INTERFACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongRuleContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(PJParser.LONG, 0); }
		public LongRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLongRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLongRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLongRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongRuleContext longRule() throws RecognitionException {
		LongRuleContext _localctx = new LongRuleContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_longRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599); match(LONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeRuleContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(PJParser.NATIVE, 0); }
		public NativeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterNativeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitNativeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitNativeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeRuleContext nativeRule() throws RecognitionException {
		NativeRuleContext _localctx = new NativeRuleContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_nativeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); match(NATIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewRuleContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(PJParser.NEW, 0); }
		public NewRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterNewRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitNewRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitNewRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewRuleContext newRule() throws RecognitionException {
		NewRuleContext _localctx = new NewRuleContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_newRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603); match(NEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageRuleContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(PJParser.PACKAGE, 0); }
		public PackageRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPackageRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPackageRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPackageRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageRuleContext packageRule() throws RecognitionException {
		PackageRuleContext _localctx = new PackageRuleContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_packageRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605); match(PACKAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateRuleContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(PJParser.PRIVATE, 0); }
		public PrivateRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPrivateRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPrivateRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPrivateRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateRuleContext privateRule() throws RecognitionException {
		PrivateRuleContext _localctx = new PrivateRuleContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_privateRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607); match(PRIVATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtectedRuleContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(PJParser.PROTECTED, 0); }
		public ProtectedRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protectedRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterProtectedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitProtectedRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitProtectedRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtectedRuleContext protectedRule() throws RecognitionException {
		ProtectedRuleContext _localctx = new ProtectedRuleContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protectedRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609); match(PROTECTED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicRuleContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(PJParser.PUBLIC, 0); }
		public PublicRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterPublicRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitPublicRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitPublicRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicRuleContext publicRule() throws RecognitionException {
		PublicRuleContext _localctx = new PublicRuleContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_publicRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611); match(PUBLIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnRuleContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PJParser.RETURN, 0); }
		public ReturnRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterReturnRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitReturnRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitReturnRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnRuleContext returnRule() throws RecognitionException {
		ReturnRuleContext _localctx = new ReturnRuleContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_returnRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613); match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortRuleContext extends ParserRuleContext {
		public TerminalNode SHORT() { return getToken(PJParser.SHORT, 0); }
		public ShortRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterShortRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitShortRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitShortRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortRuleContext shortRule() throws RecognitionException {
		ShortRuleContext _localctx = new ShortRuleContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_shortRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615); match(SHORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticRuleContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(PJParser.STATIC, 0); }
		public StaticRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterStaticRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitStaticRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitStaticRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticRuleContext staticRule() throws RecognitionException {
		StaticRuleContext _localctx = new StaticRuleContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_staticRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617); match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictfpRuleContext extends ParserRuleContext {
		public TerminalNode STRICTFP() { return getToken(PJParser.STRICTFP, 0); }
		public StrictfpRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictfpRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterStrictfpRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitStrictfpRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitStrictfpRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictfpRuleContext strictfpRule() throws RecognitionException {
		StrictfpRuleContext _localctx = new StrictfpRuleContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_strictfpRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619); match(STRICTFP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperRuleContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(PJParser.SUPER, 0); }
		public SuperRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSuperRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSuperRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSuperRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperRuleContext superRule() throws RecognitionException {
		SuperRuleContext _localctx = new SuperRuleContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_superRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621); match(SUPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchRuleContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(PJParser.SWITCH, 0); }
		public SwitchRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSwitchRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSwitchRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSwitchRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchRuleContext switchRule() throws RecognitionException {
		SwitchRuleContext _localctx = new SwitchRuleContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623); match(SWITCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedRuleContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(PJParser.SYNCHRONIZED, 0); }
		public SynchronizedRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSynchronizedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSynchronizedRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSynchronizedRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedRuleContext synchronizedRule() throws RecognitionException {
		SynchronizedRuleContext _localctx = new SynchronizedRuleContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_synchronizedRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); match(SYNCHRONIZED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisRuleContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(PJParser.THIS, 0); }
		public ThisRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterThisRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitThisRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitThisRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisRuleContext thisRule() throws RecognitionException {
		ThisRuleContext _localctx = new ThisRuleContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_thisRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627); match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowRuleContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(PJParser.THROW, 0); }
		public ThrowRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterThrowRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitThrowRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitThrowRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowRuleContext throwRule() throws RecognitionException {
		ThrowRuleContext _localctx = new ThrowRuleContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_throwRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629); match(THROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsRuleContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(PJParser.THROWS, 0); }
		public ThrowsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterThrowsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitThrowsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitThrowsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsRuleContext throwsRule() throws RecognitionException {
		ThrowsRuleContext _localctx = new ThrowsRuleContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_throwsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631); match(THROWS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransientRuleContext extends ParserRuleContext {
		public TerminalNode TRANSIENT() { return getToken(PJParser.TRANSIENT, 0); }
		public TransientRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transientRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTransientRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTransientRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTransientRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransientRuleContext transientRule() throws RecognitionException {
		TransientRuleContext _localctx = new TransientRuleContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_transientRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633); match(TRANSIENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryRuleContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PJParser.TRY, 0); }
		public TryRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTryRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTryRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTryRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryRuleContext tryRule() throws RecognitionException {
		TryRuleContext _localctx = new TryRuleContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tryRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635); match(TRY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidRuleContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PJParser.VOID, 0); }
		public VoidRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVoidRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVoidRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVoidRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidRuleContext voidRule() throws RecognitionException {
		VoidRuleContext _localctx = new VoidRuleContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_voidRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637); match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VolatileRuleContext extends ParserRuleContext {
		public TerminalNode VOLATILE() { return getToken(PJParser.VOLATILE, 0); }
		public VolatileRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volatileRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterVolatileRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitVolatileRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitVolatileRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolatileRuleContext volatileRule() throws RecognitionException {
		VolatileRuleContext _localctx = new VolatileRuleContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_volatileRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639); match(VOLATILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileRuleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PJParser.WHILE, 0); }
		public WhileRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterWhileRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitWhileRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitWhileRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileRuleContext whileRule() throws RecognitionException {
		WhileRuleContext _localctx = new WhileRuleContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_whileRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641); match(WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LparenRuleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PJParser.LPAREN, 0); }
		public LparenRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lparenRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLparenRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLparenRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLparenRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LparenRuleContext lparenRule() throws RecognitionException {
		LparenRuleContext _localctx = new LparenRuleContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_lparenRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643); match(LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RparenRuleContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(PJParser.RPAREN, 0); }
		public RparenRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparenRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterRparenRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitRparenRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitRparenRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenRuleContext rparenRule() throws RecognitionException {
		RparenRuleContext _localctx = new RparenRuleContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_rparenRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LbraceRuleContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PJParser.LBRACE, 0); }
		public LbraceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbraceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLbraceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLbraceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLbraceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbraceRuleContext lbraceRule() throws RecognitionException {
		LbraceRuleContext _localctx = new LbraceRuleContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_lbraceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647); match(LBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbraceRuleContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(PJParser.RBRACE, 0); }
		public RbraceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbraceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterRbraceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitRbraceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitRbraceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbraceRuleContext rbraceRule() throws RecognitionException {
		RbraceRuleContext _localctx = new RbraceRuleContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_rbraceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LbrackRuleContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PJParser.LBRACK, 0); }
		public LbrackRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbrackRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLbrackRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLbrackRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLbrackRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbrackRuleContext lbrackRule() throws RecognitionException {
		LbrackRuleContext _localctx = new LbrackRuleContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_lbrackRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651); match(LBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbrackRuleContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(PJParser.RBRACK, 0); }
		public RbrackRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbrackRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterRbrackRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitRbrackRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitRbrackRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbrackRuleContext rbrackRule() throws RecognitionException {
		RbrackRuleContext _localctx = new RbrackRuleContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_rbrackRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemiRuleContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PJParser.SEMI, 0); }
		public SemiRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semiRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSemiRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSemiRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSemiRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiRuleContext semiRule() throws RecognitionException {
		SemiRuleContext _localctx = new SemiRuleContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_semiRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaRuleContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PJParser.COMMA, 0); }
		public CommaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCommaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCommaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCommaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaRuleContext commaRule() throws RecognitionException {
		CommaRuleContext _localctx = new CommaRuleContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_commaRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotRuleContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PJParser.DOT, 0); }
		public DotRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDotRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDotRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDotRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotRuleContext dotRule() throws RecognitionException {
		DotRuleContext _localctx = new DotRuleContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_dotRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignRuleContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PJParser.ASSIGN, 0); }
		public AssignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAssignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAssignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAssignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignRuleContext assignRule() throws RecognitionException {
		AssignRuleContext _localctx = new AssignRuleContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtRuleContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(PJParser.GT, 0); }
		public GtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtRuleContext gtRule() throws RecognitionException {
		GtRuleContext _localctx = new GtRuleContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_gtRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtRuleContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PJParser.LT, 0); }
		public LtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtRuleContext ltRule() throws RecognitionException {
		LtRuleContext _localctx = new LtRuleContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_ltRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665); match(LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BangRuleContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(PJParser.BANG, 0); }
		public BangRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bangRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBangRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBangRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBangRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BangRuleContext bangRule() throws RecognitionException {
		BangRuleContext _localctx = new BangRuleContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_bangRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667); match(BANG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TildeRuleContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(PJParser.TILDE, 0); }
		public TildeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tildeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterTildeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitTildeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitTildeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildeRuleContext tildeRule() throws RecognitionException {
		TildeRuleContext _localctx = new TildeRuleContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tildeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669); match(TILDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuestionRuleContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(PJParser.QUESTION, 0); }
		public QuestionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterQuestionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitQuestionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitQuestionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionRuleContext questionRule() throws RecognitionException {
		QuestionRuleContext _localctx = new QuestionRuleContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_questionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671); match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColonRuleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PJParser.COLON, 0); }
		public ColonRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterColonRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitColonRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitColonRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonRuleContext colonRule() throws RecognitionException {
		ColonRuleContext _localctx = new ColonRuleContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_colonRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673); match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualRuleContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PJParser.EQUAL, 0); }
		public EqualRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEqualRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEqualRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEqualRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualRuleContext equalRule() throws RecognitionException {
		EqualRuleContext _localctx = new EqualRuleContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_equalRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675); match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeRuleContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(PJParser.LE, 0); }
		public LeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeRuleContext leRule() throws RecognitionException {
		LeRuleContext _localctx = new LeRuleContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_leRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677); match(LE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeRuleContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(PJParser.GE, 0); }
		public GeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterGeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitGeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitGeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeRuleContext geRule() throws RecognitionException {
		GeRuleContext _localctx = new GeRuleContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_geRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679); match(GE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotEqualRuleContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(PJParser.NOTEQUAL, 0); }
		public NotEqualRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterNotEqualRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitNotEqualRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitNotEqualRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualRuleContext notEqualRule() throws RecognitionException {
		NotEqualRuleContext _localctx = new NotEqualRuleContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_notEqualRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681); match(NOTEQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndRuleContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PJParser.AND, 0); }
		public AndRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAndRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAndRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAndRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndRuleContext andRule() throws RecognitionException {
		AndRuleContext _localctx = new AndRuleContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_andRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683); match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrRuleContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PJParser.OR, 0); }
		public OrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitOrRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitOrRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrRuleContext orRule() throws RecognitionException {
		OrRuleContext _localctx = new OrRuleContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_orRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685); match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncRuleContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(PJParser.INC, 0); }
		public IncRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterIncRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitIncRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitIncRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncRuleContext incRule() throws RecognitionException {
		IncRuleContext _localctx = new IncRuleContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_incRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecRuleContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(PJParser.DEC, 0); }
		public DecRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDecRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDecRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDecRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecRuleContext decRule() throws RecognitionException {
		DecRuleContext _localctx = new DecRuleContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_decRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddRuleContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PJParser.ADD, 0); }
		public AddRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAddRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAddRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAddRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddRuleContext addRule() throws RecognitionException {
		AddRuleContext _localctx = new AddRuleContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_addRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691); match(ADD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubRuleContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(PJParser.SUB, 0); }
		public SubRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSubRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSubRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSubRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubRuleContext subRule() throws RecognitionException {
		SubRuleContext _localctx = new SubRuleContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_subRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693); match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulRuleContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(PJParser.MUL, 0); }
		public MulRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMulRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMulRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMulRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulRuleContext mulRule() throws RecognitionException {
		MulRuleContext _localctx = new MulRuleContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_mulRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695); match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivRuleContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(PJParser.DIV, 0); }
		public DivRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDivRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDivRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDivRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivRuleContext divRule() throws RecognitionException {
		DivRuleContext _localctx = new DivRuleContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_divRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697); match(DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitandRuleContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(PJParser.BITAND, 0); }
		public BitandRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitandRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBitandRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBitandRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBitandRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitandRuleContext bitandRule() throws RecognitionException {
		BitandRuleContext _localctx = new BitandRuleContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_bitandRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699); match(BITAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitorRuleContext extends ParserRuleContext {
		public TerminalNode BITOR() { return getToken(PJParser.BITOR, 0); }
		public BitorRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitorRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterBitorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitBitorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitBitorRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitorRuleContext bitorRule() throws RecognitionException {
		BitorRuleContext _localctx = new BitorRuleContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_bitorRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); match(BITOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaretRuleContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(PJParser.CARET, 0); }
		public CaretRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caretRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterCaretRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitCaretRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitCaretRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaretRuleContext caretRule() throws RecognitionException {
		CaretRuleContext _localctx = new CaretRuleContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_caretRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703); match(CARET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModRuleContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(PJParser.MOD, 0); }
		public ModRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterModRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitModRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitModRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModRuleContext modRule() throws RecognitionException {
		ModRuleContext _localctx = new ModRuleContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_modRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705); match(MOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_assignRuleContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(PJParser.ADD_ASSIGN, 0); }
		public Add_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAdd_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAdd_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAdd_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_assignRuleContext add_assignRule() throws RecognitionException {
		Add_assignRuleContext _localctx = new Add_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_add_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707); match(ADD_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_assignRuleContext extends ParserRuleContext {
		public TerminalNode SUB_ASSIGN() { return getToken(PJParser.SUB_ASSIGN, 0); }
		public Sub_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterSub_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitSub_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitSub_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_assignRuleContext sub_assignRule() throws RecognitionException {
		Sub_assignRuleContext _localctx = new Sub_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_sub_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709); match(SUB_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_assignRuleContext extends ParserRuleContext {
		public TerminalNode MUL_ASSIGN() { return getToken(PJParser.MUL_ASSIGN, 0); }
		public Mul_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMul_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMul_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMul_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_assignRuleContext mul_assignRule() throws RecognitionException {
		Mul_assignRuleContext _localctx = new Mul_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_mul_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711); match(MUL_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_assignRuleContext extends ParserRuleContext {
		public TerminalNode DIV_ASSIGN() { return getToken(PJParser.DIV_ASSIGN, 0); }
		public Div_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterDiv_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitDiv_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitDiv_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_assignRuleContext div_assignRule() throws RecognitionException {
		Div_assignRuleContext _localctx = new Div_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_div_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713); match(DIV_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_assignRuleContext extends ParserRuleContext {
		public TerminalNode AND_ASSIGN() { return getToken(PJParser.AND_ASSIGN, 0); }
		public And_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAnd_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAnd_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAnd_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_assignRuleContext and_assignRule() throws RecognitionException {
		And_assignRuleContext _localctx = new And_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_and_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715); match(AND_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_assignRuleContext extends ParserRuleContext {
		public TerminalNode OR_ASSIGN() { return getToken(PJParser.OR_ASSIGN, 0); }
		public Or_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterOr_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitOr_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitOr_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_assignRuleContext or_assignRule() throws RecognitionException {
		Or_assignRuleContext _localctx = new Or_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_or_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717); match(OR_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_assignRuleContext extends ParserRuleContext {
		public TerminalNode XOR_ASSIGN() { return getToken(PJParser.XOR_ASSIGN, 0); }
		public Xor_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterXor_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitXor_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitXor_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_assignRuleContext xor_assignRule() throws RecognitionException {
		Xor_assignRuleContext _localctx = new Xor_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_xor_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719); match(XOR_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_assignRuleContext extends ParserRuleContext {
		public TerminalNode MOD_ASSIGN() { return getToken(PJParser.MOD_ASSIGN, 0); }
		public Mod_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterMod_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitMod_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitMod_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_assignRuleContext mod_assignRule() throws RecognitionException {
		Mod_assignRuleContext _localctx = new Mod_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_mod_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721); match(MOD_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lshift_assignRuleContext extends ParserRuleContext {
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PJParser.LSHIFT_ASSIGN, 0); }
		public Lshift_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lshift_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterLshift_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitLshift_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitLshift_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lshift_assignRuleContext lshift_assignRule() throws RecognitionException {
		Lshift_assignRuleContext _localctx = new Lshift_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_lshift_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723); match(LSHIFT_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rshift_assignRuleContext extends ParserRuleContext {
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PJParser.RSHIFT_ASSIGN, 0); }
		public Rshift_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rshift_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterRshift_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitRshift_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitRshift_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rshift_assignRuleContext rshift_assignRule() throws RecognitionException {
		Rshift_assignRuleContext _localctx = new Rshift_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_rshift_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725); match(RSHIFT_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Urshift_assignRuleContext extends ParserRuleContext {
		public TerminalNode URSHIFT_ASSIGN() { return getToken(PJParser.URSHIFT_ASSIGN, 0); }
		public Urshift_assignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urshift_assignRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterUrshift_assignRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitUrshift_assignRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitUrshift_assignRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Urshift_assignRuleContext urshift_assignRule() throws RecognitionException {
		Urshift_assignRuleContext _localctx = new Urshift_assignRuleContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_urshift_assignRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727); match(URSHIFT_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PJParser.AT, 0); }
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_atRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729); match(AT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EllipsisRuleContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(PJParser.ELLIPSIS, 0); }
		public EllipsisRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsisRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).enterEllipsisRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PJListener ) ((PJListener)listener).exitEllipsisRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PJVisitor ) return ((PJVisitor<? extends T>)visitor).visitEllipsisRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipsisRuleContext ellipsisRule() throws RecognitionException {
		EllipsisRuleContext _localctx = new EllipsisRuleContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_ellipsisRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731); match(ELLIPSIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 89: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 4);
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		case 11: return precpred(_ctx, 1);
		case 12: return precpred(_ctx, 25);
		case 13: return precpred(_ctx, 24);
		case 14: return precpred(_ctx, 23);
		case 15: return precpred(_ctx, 22);
		case 17: return precpred(_ctx, 20);
		case 16: return precpred(_ctx, 21);
		case 19: return precpred(_ctx, 16);
		case 18: return precpred(_ctx, 19);
		case 20: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3l\u06c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\3\2\5\2\u0190"+
		"\n\2\3\2\7\2\u0193\n\2\f\2\16\2\u0196\13\2\3\2\7\2\u0199\n\2\f\2\16\2"+
		"\u019c\13\2\3\2\3\2\3\3\7\3\u01a1\n\3\f\3\16\3\u01a4\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\5\4\u01ab\n\4\3\4\3\4\3\4\3\4\5\4\u01b1\n\4\3\5\7\5\u01b4\n\5"+
		"\f\5\16\5\u01b7\13\5\3\5\3\5\7\5\u01bb\n\5\f\5\16\5\u01be\13\5\3\5\3\5"+
		"\7\5\u01c2\n\5\f\5\16\5\u01c5\13\5\3\5\3\5\7\5\u01c9\n\5\f\5\16\5\u01cc"+
		"\13\5\3\5\5\5\u01cf\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u01d6\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u01dd\n\b\f\b\16\b\u01e0\13\b\5\b\u01e2\n\b\3\b\5\b\u01e5"+
		"\n\b\3\b\3\b\3\t\3\t\5\t\u01eb\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u01f3\n"+
		"\n\f\n\16\n\u01f6\13\n\3\n\3\n\3\n\5\n\u01fb\n\n\3\n\5\n\u01fe\n\n\3\13"+
		"\7\13\u0201\n\13\f\13\16\13\u0204\13\13\3\13\3\13\3\13\3\f\7\f\u020a\n"+
		"\f\f\f\16\f\u020d\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0218\n"+
		"\r\f\r\16\r\u021b\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u0222\n\16\f\16\16"+
		"\16\u0225\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u022e\n\17\f\17"+
		"\16\17\u0231\13\17\3\20\3\20\3\20\7\20\u0236\n\20\f\20\16\20\u0239\13"+
		"\20\3\21\3\21\3\22\3\22\3\22\5\22\u0240\n\22\3\22\3\22\3\22\5\22\u0245"+
		"\n\22\3\22\3\22\3\22\5\22\u024a\n\22\3\22\3\22\3\23\5\23\u024f\n\23\3"+
		"\23\3\23\7\23\u0253\n\23\f\23\16\23\u0256\13\23\3\23\3\23\3\24\5\24\u025b"+
		"\n\24\3\24\3\24\7\24\u025f\n\24\f\24\16\24\u0262\13\24\3\24\5\24\u0265"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u026c\n\25\5\25\u026e\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0278\n\26\5\26\u027a\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0285\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\5\31\u028c\n\31\3\31\3\31\3\31\3\31\7\31\u0292\n\31\f\31\16"+
		"\31\u0295\13\31\3\31\3\31\3\31\5\31\u029a\n\31\3\31\5\31\u029d\n\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u02ab"+
		"\n\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \5 \u02b6\n \3 \3 \3 \3"+
		" \7 \u02bc\n \f \16 \u02bf\13 \3 \3 \5 \u02c3\n \3 \3 \3!\3!\3!\5!\u02ca"+
		"\n!\3!\3!\5!\u02ce\n!\3!\3!\3\"\3\"\7\"\u02d4\n\"\f\"\16\"\u02d7\13\""+
		"\3\"\3\"\3#\7#\u02dc\n#\f#\16#\u02df\13#\3#\3#\5#\u02e3\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u02ec\n$\3%\3%\3%\3%\3%\3&\3&\7&\u02f5\n&\f&\16&\u02f8\13"+
		"&\3&\3&\3\'\7\'\u02fd\n\'\f\'\16\'\u0300\13\'\3\'\3\'\5\'\u0304\n\'\3"+
		"(\3(\5(\u0308\n(\3(\3(\3(\3(\3(\3(\5(\u0310\n(\3(\3(\5(\u0314\n(\3(\3"+
		"(\5(\u0318\n(\5(\u031a\n(\3)\3)\5)\u031e\n)\3*\3*\3*\3*\5*\u0324\n*\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3-\3-\5-\u0330\n-\3-\3-\5-\u0334\n-\3.\3.\3/\3"+
		"/\3/\7/\u033b\n/\f/\16/\u033e\13/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\5\61\u0348\n\61\3\61\3\61\5\61\u034c\n\61\3\61\5\61\u034f\n\61\3\61"+
		"\5\61\u0352\n\61\3\61\3\61\3\62\3\62\3\62\7\62\u0359\n\62\f\62\16\62\u035c"+
		"\13\62\3\63\7\63\u035f\n\63\f\63\16\63\u0362\13\63\3\63\3\63\5\63\u0366"+
		"\n\63\3\63\5\63\u0369\n\63\3\64\3\64\7\64\u036d\n\64\f\64\16\64\u0370"+
		"\13\64\3\65\5\65\u0373\n\65\3\65\3\65\7\65\u0377\n\65\f\65\16\65\u037a"+
		"\13\65\3\65\3\65\3\66\3\66\3\66\5\66\u0381\n\66\3\67\7\67\u0384\n\67\f"+
		"\67\16\67\u0387\13\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\58\u0394"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\68\u03a1\n8\r8\168\u03a2\38\58\u03a6"+
		"\n8\38\58\u03a9\n8\38\38\38\38\78\u03af\n8\f8\168\u03b2\138\38\58\u03b5"+
		"\n8\38\38\38\38\78\u03bb\n8\f8\168\u03be\138\38\78\u03c1\n8\f8\168\u03c4"+
		"\138\38\38\38\38\38\38\38\38\38\38\58\u03d0\n8\39\39\39\59\u03d5\n9\3"+
		"9\39\39\39\39\59\u03dc\n9\39\39\59\u03e0\n9\39\39\39\39\59\u03e6\n9\3"+
		"9\39\39\39\39\59\u03ed\n9\3:\3:\3;\3;\3;\3;\3<\7<\u03f6\n<\f<\16<\u03f9"+
		"\13<\3<\3<\3<\3=\3=\3=\7=\u0401\n=\f=\16=\u0404\13=\3>\3>\3>\3?\3?\3?"+
		"\5?\u040c\n?\3?\3?\3@\3@\3@\7@\u0413\n@\f@\16@\u0416\13@\3A\7A\u0419\n"+
		"A\fA\16A\u041c\13A\3A\3A\3A\3A\3A\3B\6B\u0424\nB\rB\16B\u0425\3B\6B\u0429"+
		"\nB\rB\16B\u042a\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0437\nC\3D\3D\3E\3"+
		"E\3F\3F\5F\u043f\nF\3F\3F\5F\u0443\nF\3F\3F\5F\u0447\nF\5F\u0449\nF\3"+
		"G\3G\5G\u044d\nG\3H\7H\u0450\nH\fH\16H\u0453\13H\3H\3H\3H\3H\3H\3I\3I"+
		"\3J\3J\3J\7J\u045f\nJ\fJ\16J\u0462\13J\3K\3K\3K\3K\5K\u0468\nK\3L\3L\3"+
		"L\3L\7L\u046e\nL\fL\16L\u0471\13L\3M\3M\5M\u0475\nM\3N\3N\3N\3N\7N\u047b"+
		"\nN\fN\16N\u047e\13N\3N\5N\u0481\nN\5N\u0483\nN\3N\3N\3O\3O\5O\u0489\n"+
		"O\3P\3P\3P\3P\7P\u048f\nP\fP\16P\u0492\13P\3P\3P\3Q\3Q\3Q\5Q\u0499\nQ"+
		"\3R\3R\3R\7R\u049e\nR\fR\16R\u04a1\13R\3S\3S\3S\7S\u04a6\nS\fS\16S\u04a9"+
		"\13S\3T\3T\3T\3T\7T\u04af\nT\fT\16T\u04b2\13T\3T\3T\3T\3T\7T\u04b8\nT"+
		"\fT\16T\u04bb\13T\5T\u04bd\nT\3U\3U\5U\u04c1\nU\3U\3U\3U\5U\u04c6\nU\7"+
		"U\u04c8\nU\fU\16U\u04cb\13U\3V\3V\3V\3V\3V\7V\u04d2\nV\fV\16V\u04d5\13"+
		"V\3V\3V\3W\3W\3W\3W\5W\u04dd\nW\5W\u04df\nW\3X\3X\3X\3X\5X\u04e5\nX\3"+
		"Y\3Y\3Z\3Z\3Z\3Z\7Z\u04ed\nZ\fZ\16Z\u04f0\13Z\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\5[\u04fc\n[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0506\n[\3[\3[\3[\3[\3["+
		"\3[\5[\u050e\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u051d\n[\3["+
		"\3[\3[\3[\3[\3[\3[\5[\u0526\n[\3[\3[\3[\3[\3[\5[\u052d\n[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0553\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\5[\u0562\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\5[\u0577\n[\3[\3[\3[\3[\3[\5[\u057e\n[\3[\3[\3[\7[\u0583\n["+
		"\f[\16[\u0586\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u059c\n\\\5\\\u059e\n\\\3]\3]\3^\3^\3"+
		"^\3^\5^\u05a6\n^\3_\3_\3_\3_\3`\3`\3`\3a\3a\3a\3a\5a\u05b3\na\3b\3b\3"+
		"b\3b\5b\u05b9\nb\5b\u05bb\nb\3c\3c\5c\u05bf\nc\3c\3c\3d\3d\3d\3d\3d\3"+
		"d\3d\5d\u05ca\nd\5d\u05cc\nd\3e\3e\5e\u05d0\ne\3e\3e\3e\5e\u05d5\ne\7"+
		"e\u05d7\ne\fe\16e\u05da\13e\3e\5e\u05dd\ne\3f\3f\5f\u05e1\nf\3g\3g\3g"+
		"\3g\3g\7g\u05e8\ng\fg\16g\u05eb\13g\3g\3g\3g\3g\3g\3g\3g\3g\7g\u05f5\n"+
		"g\fg\16g\u05f8\13g\3g\3g\3g\7g\u05fd\ng\fg\16g\u0600\13g\5g\u0602\ng\3"+
		"h\3h\5h\u0606\nh\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3"+
		"p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3"+
		"|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\2\3\u00b4\u00c8\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\2\7\4\2\23\23**\n\2\5\5\7\7\n\n\20\20\26"+
		"\26\35\35\37\37\'\'\3\2AB\4\2OPTT\3\2bg\u06f5\2\u018f\3\2\2\2\4\u01a2"+
		"\3\2\2\2\6\u01a8\3\2\2\2\b\u01ce\3\2\2\2\n\u01d0\3\2\2\2\f\u01d5\3\2\2"+
		"\2\16\u01d7\3\2\2\2\20\u01e8\3\2\2\2\22\u01fd\3\2\2\2\24\u0202\3\2\2\2"+
		"\26\u020b\3\2\2\2\30\u0212\3\2\2\2\32\u021e\3\2\2\2\34\u0229\3\2\2\2\36"+
		"\u0232\3\2\2\2 \u023a\3\2\2\2\"\u023c\3\2\2\2$\u024e\3\2\2\2&\u0264\3"+
		"\2\2\2(\u026d\3\2\2\2*\u0279\3\2\2\2,\u0284\3\2\2\2.\u0286\3\2\2\2\60"+
		"\u028b\3\2\2\2\62\u029e\3\2\2\2\64\u02a0\3\2\2\2\66\u02a3\3\2\2\28\u02a6"+
		"\3\2\2\2:\u02ae\3\2\2\2<\u02b0\3\2\2\2>\u02b5\3\2\2\2@\u02c6\3\2\2\2B"+
		"\u02d1\3\2\2\2D\u02e2\3\2\2\2F\u02eb\3\2\2\2H\u02ed\3\2\2\2J\u02f2\3\2"+
		"\2\2L\u0303\3\2\2\2N\u0319\3\2\2\2P\u031d\3\2\2\2R\u031f\3\2\2\2T\u0325"+
		"\3\2\2\2V\u0327\3\2\2\2X\u032a\3\2\2\2Z\u0335\3\2\2\2\\\u0337\3\2\2\2"+
		"^\u033f\3\2\2\2`\u0343\3\2\2\2b\u0355\3\2\2\2d\u0360\3\2\2\2f\u036a\3"+
		"\2\2\2h\u0372\3\2\2\2j\u0380\3\2\2\2l\u0385\3\2\2\2n\u03cf\3\2\2\2p\u03ec"+
		"\3\2\2\2r\u03ee\3\2\2\2t\u03f0\3\2\2\2v\u03f7\3\2\2\2x\u03fd\3\2\2\2z"+
		"\u0405\3\2\2\2|\u0408\3\2\2\2~\u040f\3\2\2\2\u0080\u041a\3\2\2\2\u0082"+
		"\u0423\3\2\2\2\u0084\u0436\3\2\2\2\u0086\u0438\3\2\2\2\u0088\u043a\3\2"+
		"\2\2\u008a\u0448\3\2\2\2\u008c\u044c\3\2\2\2\u008e\u0451\3\2\2\2\u0090"+
		"\u0459\3\2\2\2\u0092\u045b\3\2\2\2\u0094\u0463\3\2\2\2\u0096\u0469\3\2"+
		"\2\2\u0098\u0474\3\2\2\2\u009a\u0476\3\2\2\2\u009c\u0488\3\2\2\2\u009e"+
		"\u048a\3\2\2\2\u00a0\u0495\3\2\2\2\u00a2\u049a\3\2\2\2\u00a4\u04a2\3\2"+
		"\2\2\u00a6\u04bc\3\2\2\2\u00a8\u04be\3\2\2\2\u00aa\u04cc\3\2\2\2\u00ac"+
		"\u04de\3\2\2\2\u00ae\u04e4\3\2\2\2\u00b0\u04e6\3\2\2\2\u00b2\u04e8\3\2"+
		"\2\2\u00b4\u0505\3\2\2\2\u00b6\u059d\3\2\2\2\u00b8\u059f\3\2\2\2\u00ba"+
		"\u05a5\3\2\2\2\u00bc\u05a7\3\2\2\2\u00be\u05ab\3\2\2\2\u00c0\u05b2\3\2"+
		"\2\2\u00c2\u05ba\3\2\2\2\u00c4\u05bc\3\2\2\2\u00c6\u05cb\3\2\2\2\u00c8"+
		"\u05dc\3\2\2\2\u00ca\u05de\3\2\2\2\u00cc\u05e2\3\2\2\2\u00ce\u0603\3\2"+
		"\2\2\u00d0\u0609\3\2\2\2\u00d2\u060b\3\2\2\2\u00d4\u060d\3\2\2\2\u00d6"+
		"\u060f\3\2\2\2\u00d8\u0611\3\2\2\2\u00da\u0613\3\2\2\2\u00dc\u0615\3\2"+
		"\2\2\u00de\u0617\3\2\2\2\u00e0\u0619\3\2\2\2\u00e2\u061b\3\2\2\2\u00e4"+
		"\u061d\3\2\2\2\u00e6\u061f\3\2\2\2\u00e8\u0621\3\2\2\2\u00ea\u0623\3\2"+
		"\2\2\u00ec\u0625\3\2\2\2\u00ee\u0627\3\2\2\2\u00f0\u0629\3\2\2\2\u00f2"+
		"\u062b\3\2\2\2\u00f4\u062d\3\2\2\2\u00f6\u062f\3\2\2\2\u00f8\u0631\3\2"+
		"\2\2\u00fa\u0633\3\2\2\2\u00fc\u0635\3\2\2\2\u00fe\u0637\3\2\2\2\u0100"+
		"\u0639\3\2\2\2\u0102\u063b\3\2\2\2\u0104\u063d\3\2\2\2\u0106\u063f\3\2"+
		"\2\2\u0108\u0641\3\2\2\2\u010a\u0643\3\2\2\2\u010c\u0645\3\2\2\2\u010e"+
		"\u0647\3\2\2\2\u0110\u0649\3\2\2\2\u0112\u064b\3\2\2\2\u0114\u064d\3\2"+
		"\2\2\u0116\u064f\3\2\2\2\u0118\u0651\3\2\2\2\u011a\u0653\3\2\2\2\u011c"+
		"\u0655\3\2\2\2\u011e\u0657\3\2\2\2\u0120\u0659\3\2\2\2\u0122\u065b\3\2"+
		"\2\2\u0124\u065d\3\2\2\2\u0126\u065f\3\2\2\2\u0128\u0661\3\2\2\2\u012a"+
		"\u0663\3\2\2\2\u012c\u0665\3\2\2\2\u012e\u0667\3\2\2\2\u0130\u0669\3\2"+
		"\2\2\u0132\u066b\3\2\2\2\u0134\u066d\3\2\2\2\u0136\u066f\3\2\2\2\u0138"+
		"\u0671\3\2\2\2\u013a\u0673\3\2\2\2\u013c\u0675\3\2\2\2\u013e\u0677\3\2"+
		"\2\2\u0140\u0679\3\2\2\2\u0142\u067b\3\2\2\2\u0144\u067d\3\2\2\2\u0146"+
		"\u067f\3\2\2\2\u0148\u0681\3\2\2\2\u014a\u0683\3\2\2\2\u014c\u0685\3\2"+
		"\2\2\u014e\u0687\3\2\2\2\u0150\u0689\3\2\2\2\u0152\u068b\3\2\2\2\u0154"+
		"\u068d\3\2\2\2\u0156\u068f\3\2\2\2\u0158\u0691\3\2\2\2\u015a\u0693\3\2"+
		"\2\2\u015c\u0695\3\2\2\2\u015e\u0697\3\2\2\2\u0160\u0699\3\2\2\2\u0162"+
		"\u069b\3\2\2\2\u0164\u069d\3\2\2\2\u0166\u069f\3\2\2\2\u0168\u06a1\3\2"+
		"\2\2\u016a\u06a3\3\2\2\2\u016c\u06a5\3\2\2\2\u016e\u06a7\3\2\2\2\u0170"+
		"\u06a9\3\2\2\2\u0172\u06ab\3\2\2\2\u0174\u06ad\3\2\2\2\u0176\u06af\3\2"+
		"\2\2\u0178\u06b1\3\2\2\2\u017a\u06b3\3\2\2\2\u017c\u06b5\3\2\2\2\u017e"+
		"\u06b7\3\2\2\2\u0180\u06b9\3\2\2\2\u0182\u06bb\3\2\2\2\u0184\u06bd\3\2"+
		"\2\2\u0186\u06bf\3\2\2\2\u0188\u06c1\3\2\2\2\u018a\u06c3\3\2\2\2\u018c"+
		"\u06c5\3\2\2\2\u018e\u0190\5\4\3\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0194\3\2\2\2\u0191\u0193\5\6\4\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019a\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5\b\5\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\2\2\3\u019e\3\3\2\2\2\u019f\u01a1"+
		"\5X-\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\5\u010e"+
		"\u0088\2\u01a6\u01a7\5\36\20\2\u01a7\5\3\2\2\2\u01a8\u01aa\5\u0100\u0081"+
		"\2\u01a9\u01ab\5\u011a\u008e\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01b0\5\36\20\2\u01ad\u01ae\5\u0144\u00a3\2"+
		"\u01ae\u01af\5\u0168\u00b5\2\u01af\u01b1\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\7\3\2\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b2\3\2\2\2"+
		"\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01cf\5\"\22\2\u01b9\u01bb\5*\26\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01cf\5@!\2\u01c0"+
		"\u01c2\5*\26\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01cf\5H%\2\u01c7\u01c9\5*\26\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cd\u01cf\5`\61\2\u01ce\u01b5\3\2\2\2\u01ce\u01bc\3\2\2\2\u01ce"+
		"\u01c3\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\t\3\2\2\2\u01d0\u01d1\5\u00b4"+
		"[\2\u01d1\13\3\2\2\2\u01d2\u01d6\5\16\b\2\u01d3\u01d6\5X-\2\u01d4\u01d6"+
		"\5\u00b4[\2\u01d5\u01d2\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2"+
		"\2\u01d6\r\3\2\2\2\u01d7\u01e1\7\67\2\2\u01d8\u01de\5\f\7\2\u01d9\u01da"+
		"\5\u0142\u00a2\2\u01da\u01db\5\f\7\2\u01db\u01dd\3\2\2\2\u01dc\u01d9\3"+
		"\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5\u0142\u00a2\2\u01e4\u01e3\3\2\2"+
		"\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\78\2\2\u01e7\17"+
		"\3\2\2\2\u01e8\u01ea\5\u0134\u009b\2\u01e9\u01eb\5\22\n\2\u01ea\u01e9"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5\u0136\u009c"+
		"\2\u01ed\21\3\2\2\2\u01ee\u01f4\5\24\13\2\u01ef\u01f0\5\u0142\u00a2\2"+
		"\u01f0\u01f1\5\24\13\2\u01f1\u01f3\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01fa\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f7\u01f8\5\u0142\u00a2\2\u01f8\u01f9\5\26\f\2\u01f9"+
		"\u01fb\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fe\5\26\f\2\u01fd\u01ee\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\23\3\2\2\2\u01ff\u0201\5\u009cO\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0206\5\u00a6T\2\u0206\u0207\5\u0096L\2\u0207\25"+
		"\3\2\2\2\u0208\u020a\5\u009cO\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2"+
		"\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020e\u020f\5\u00a6T\2\u020f\u0210\7a\2\2\u0210\u0211\5\u0096"+
		"L\2\u0211\27\3\2\2\2\u0212\u0213\5\u00a6T\2\u0213\u0219\5\32\16\2\u0214"+
		"\u0215\5\u0142\u00a2\2\u0215\u0216\5\32\16\2\u0216\u0218\3\2\2\2\u0217"+
		"\u0214\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7;\2\2\u021d"+
		"\31\3\2\2\2\u021e\u0223\7h\2\2\u021f\u0220\79\2\2\u0220\u0222\7:\2\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7>\2\2\u0227"+
		"\u0228\5\u0098M\2\u0228\33\3\2\2\2\u0229\u022f\5\36\20\2\u022a\u022b\5"+
		"\u0142\u00a2\2\u022b\u022c\5\36\20\2\u022c\u022e\3\2\2\2\u022d\u022a\3"+
		"\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\35\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0237\7h\2\2\u0233\u0234\7=\2\2"+
		"\u0234\u0236\7h\2\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\37\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023b\7h\2\2\u023b!\3\2\2\2\u023c\u023d\5\u00e0q\2\u023d\u023f\5 \21"+
		"\2\u023e\u0240\5\u009eP\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0244\3\2\2\2\u0241\u0242\5\u00f0y\2\u0242\u0243\5\u00a6T\2\u0243\u0245"+
		"\3\2\2\2\u0244\u0241\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246"+
		"\u0247\5\u00fe\u0080\2\u0247\u0248\5\u00a4S\2\u0248\u024a\3\2\2\2\u0249"+
		"\u0246\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5$"+
		"\23\2\u024c#\3\2\2\2\u024d\u024f\7D\2\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0254\7k\2\2\u0251\u0253\5&\24\2\u0252"+
		"\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7l\2\2\u0258"+
		"%\3\2\2\2\u0259\u025b\5\u011a\u008e\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0265\5h\65\2\u025d\u025f\5(\25\2\u025e"+
		"\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\5,\27\2\u0264"+
		"\u025a\3\2\2\2\u0264\u0260\3\2\2\2\u0265\'\3\2\2\2\u0266\u026e\5*\26\2"+
		"\u0267\u026c\5\u010a\u0086\2\u0268\u026c\5\u0122\u0092\2\u0269\u026c\5"+
		"\u012a\u0096\2\u026a\u026c\5\u0130\u0099\2\u026b\u0267\3\2\2\2\u026b\u0268"+
		"\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026e\3\2\2\2\u026d"+
		"\u0266\3\2\2\2\u026d\u026b\3\2\2\2\u026e)\3\2\2\2\u026f\u027a\5X-\2\u0270"+
		"\u0278\5\u0114\u008b\2\u0271\u0278\5\u0112\u008a\2\u0272\u0278\5\u0110"+
		"\u0089\2\u0273\u0278\5\u011a\u008e\2\u0274\u0278\5\u00d0i\2\u0275\u0278"+
		"\5\u00f2z\2\u0276\u0278\5\u011c\u008f\2\u0277\u0270\3\2\2\2\u0277\u0271"+
		"\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u026f\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u027a+\3\2\2\2\u027b\u0285\5\"\22\2\u027c\u0285"+
		"\5.\30\2\u027d\u0285\5\60\31\2\u027e\u0285\5\64\33\2\u027f\u0285\5\66"+
		"\34\2\u0280\u0285\58\35\2\u0281\u0285\5@!\2\u0282\u0285\5H%\2\u0283\u0285"+
		"\5`\61\2\u0284\u027b\3\2\2\2\u0284\u027c\3\2\2\2\u0284\u027d\3\2\2\2\u0284"+
		"\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285-\3\2\2\2\u0286\u0287"+
		"\5\u009eP\2\u0287\u0288\5\60\31\2\u0288/\3\2\2\2\u0289\u028c\5\u00a6T"+
		"\2\u028a\u028c\5\u012e\u0098\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2"+
		"\u028c\u028d\3\2\2\2\u028d\u028e\5 \21\2\u028e\u0293\5\20\t\2\u028f\u0290"+
		"\79\2\2\u0290\u0292\7:\2\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293"+
		"\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0296\u0297\5\u0128\u0095\2\u0297\u0298\5\34\17\2\u0298\u029a\3\2"+
		"\2\2\u0299\u0296\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"+
		"\u029d\5\62\32\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\61\3\2"+
		"\2\2\u029e\u029f\5h\65\2\u029f\63\3\2\2\2\u02a0\u02a1\5\u00a6T\2\u02a1"+
		"\u02a2\5\u0092J\2\u02a2\65\3\2\2\2\u02a3\u02a4\5\u009eP\2\u02a4\u02a5"+
		"\58\35\2\u02a5\67\3\2\2\2\u02a6\u02a7\7h\2\2\u02a7\u02aa\5\20\t\2\u02a8"+
		"\u02a9\7/\2\2\u02a9\u02ab\5\34\17\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3"+
		"\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\5:\36\2\u02ad9\3\2\2\2\u02ae\u02af"+
		"\5h\65\2\u02af;\3\2\2\2\u02b0\u02b1\5\u009eP\2\u02b1\u02b2\5> \2\u02b2"+
		"=\3\2\2\2\u02b3\u02b6\5\u00a6T\2\u02b4\u02b6\7\62\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\7h\2\2\u02b8"+
		"\u02bd\5\20\t\2\u02b9\u02ba\79\2\2\u02ba\u02bc\7:\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c2\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7/\2\2\u02c1\u02c3\5\34"+
		"\17\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\7;\2\2\u02c5?\3\2\2\2\u02c6\u02c7\7\36\2\2\u02c7\u02c9\7h\2\2\u02c8"+
		"\u02ca\5\u009eP\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd"+
		"\3\2\2\2\u02cb\u02cc\7\23\2\2\u02cc\u02ce\5\u00a4S\2\u02cd\u02cb\3\2\2"+
		"\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\5B\"\2\u02d0A\3"+
		"\2\2\2\u02d1\u02d5\7\67\2\2\u02d2\u02d4\5D#\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\78\2\2\u02d9C\3\2\2\2\u02da\u02dc"+
		"\5(\25\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\5F"+
		"$\2\u02e1\u02e3\7;\2\2\u02e2\u02dd\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3E"+
		"\3\2\2\2\u02e4\u02ec\5\30\r\2\u02e5\u02ec\5> \2\u02e6\u02ec\5<\37\2\u02e7"+
		"\u02ec\5@!\2\u02e8\u02ec\5H%\2\u02e9\u02ec\5\"\22\2\u02ea\u02ec\5`\61"+
		"\2\u02eb\u02e4\3\2\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb\u02e7"+
		"\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec"+
		"G\3\2\2\2\u02ed\u02ee\5\u018a\u00c6\2\u02ee\u02ef\5\u0106\u0084\2\u02ef"+
		"\u02f0\5 \21\2\u02f0\u02f1\5J&\2\u02f1I\3\2\2\2\u02f2\u02f6\7\67\2\2\u02f3"+
		"\u02f5\5L\'\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9"+
		"\u02fa\78\2\2\u02faK\3\2\2\2\u02fb\u02fd\5(\25\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2"+
		"\2\2\u0300\u02fe\3\2\2\2\u0301\u0304\5N(\2\u0302\u0304\7;\2\2\u0303\u02fe"+
		"\3\2\2\2\u0303\u0302\3\2\2\2\u0304M\3\2\2\2\u0305\u0307\5H%\2\u0306\u0308"+
		"\7;\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u031a\3\2\2\2\u0309"+
		"\u030a\5\u00a6T\2\u030a\u030b\5P)\2\u030b\u030c\7;\2\2\u030c\u031a\3\2"+
		"\2\2\u030d\u030f\5\"\22\2\u030e\u0310\7;\2\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u031a\3\2\2\2\u0311\u0313\5@!\2\u0312\u0314\7;\2"+
		"\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u031a\3\2\2\2\u0315\u0317"+
		"\5`\61\2\u0316\u0318\7;\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u031a\3\2\2\2\u0319\u0305\3\2\2\2\u0319\u0309\3\2\2\2\u0319\u030d\3\2"+
		"\2\2\u0319\u0311\3\2\2\2\u0319\u0315\3\2\2\2\u031aO\3\2\2\2\u031b\u031e"+
		"\5R*\2\u031c\u031e\5T+\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2\u031e"+
		"Q\3\2\2\2\u031f\u0320\7h\2\2\u0320\u0321\5\u0134\u009b\2\u0321\u0323\5"+
		"\u0136\u009c\2\u0322\u0324\5V,\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2"+
		"\2\u0324S\3\2\2\2\u0325\u0326\5\u0092J\2\u0326U\3\2\2\2\u0327\u0328\7"+
		"\16\2\2\u0328\u0329\5\f\7\2\u0329W\3\2\2\2\u032a\u032b\5\u018a\u00c6\2"+
		"\u032b\u0333\5Z.\2\u032c\u032f\5\u0134\u009b\2\u032d\u0330\5\\/\2\u032e"+
		"\u0330\5\f\7\2\u032f\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0331\3\2\2\2\u0331\u0332\5\u0136\u009c\2\u0332\u0334\3\2\2"+
		"\2\u0333\u032c\3\2\2\2\u0333\u0334\3\2\2\2\u0334Y\3\2\2\2\u0335\u0336"+
		"\5\36\20\2\u0336[\3\2\2\2\u0337\u033c\5^\60\2\u0338\u0339\7<\2\2\u0339"+
		"\u033b\5^\60\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d]\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340"+
		"\7h\2\2\u0340\u0341\7>\2\2\u0341\u0342\5\f\7\2\u0342_\3\2\2\2\u0343\u0344"+
		"\7\22\2\2\u0344\u0347\7h\2\2\u0345\u0346\7\32\2\2\u0346\u0348\5\u00a4"+
		"S\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034b\7\67\2\2\u034a\u034c\5b\62\2\u034b\u034a\3\2\2\2\u034b\u034c\3"+
		"\2\2\2\u034c\u034e\3\2\2\2\u034d\u034f\7<\2\2\u034e\u034d\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\5f\64\2\u0351\u0350\3\2"+
		"\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\78\2\2\u0354"+
		"a\3\2\2\2\u0355\u035a\5d\63\2\u0356\u0357\7<\2\2\u0357\u0359\5d\63\2\u0358"+
		"\u0356\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035bc\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035f\5X-\2\u035e\u035d"+
		"\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\7h\2\2\u0364\u0366\5\u00c4"+
		"c\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367"+
		"\u0369\5$\23\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369e\3\2\2\2"+
		"\u036a\u036e\7;\2\2\u036b\u036d\5&\24\2\u036c\u036b\3\2\2\2\u036d\u0370"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036fg\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0373\7D\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u0378\7k\2\2\u0375\u0377\5j\66\2\u0376"+
		"\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2"+
		"\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7l\2\2\u037c"+
		"i\3\2\2\2\u037d\u0381\5l\67\2\u037e\u0381\5n8\2\u037f\u0381\5\b\5\2\u0380"+
		"\u037d\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u037f\3\2\2\2\u0381k\3\2\2\2"+
		"\u0382\u0384\5\u009cO\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u0389\5\u00a6T\2\u0389\u038a\5\u0092J\2\u038am\3\2\2\2\u038b"+
		"\u03d0\5h\65\2\u038c\u03d0\5p9\2\u038d\u038e\5\u00fa~\2\u038e\u038f\5"+
		"r:\2\u038f\u0393\5n8\2\u0390\u0391\5\u00ecw\2\u0391\u0392\5n8\2\u0392"+
		"\u0394\3\2\2\2\u0393\u0390\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u03d0\3\2"+
		"\2\2\u0395\u0396\5\u00f8}\2\u0396\u0397\5\u008aF\2\u0397\u0398\5n8\2\u0398"+
		"\u03d0\3\2\2\2\u0399\u039a\7\64\2\2\u039a\u039b\5r:\2\u039b\u039c\5n8"+
		"\2\u039c\u03d0\3\2\2\2\u039d\u039e\5\u012c\u0097\2\u039e\u03a8\5h\65\2"+
		"\u039f\u03a1\5t;\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a0"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\5z>\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a9\5z"+
		">\2\u03a8\u03a0\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03d0\3\2\2\2\u03aa"+
		"\u03ab\5\u012c\u0097\2\u03ab\u03ac\5|?\2\u03ac\u03b0\5h\65\2\u03ad\u03af"+
		"\5t;\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b5\5z"+
		">\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03d0\3\2\2\2\u03b6"+
		"\u03b7\7+\2\2\u03b7\u03b8\5r:\2\u03b8\u03bc\7\67\2\2\u03b9\u03bb\5\u0082"+
		"B\2\u03ba\u03b9\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03c2\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c1\5\u0084"+
		"C\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\78"+
		"\2\2\u03c6\u03d0\3\2\2\2\u03c7\u03c8\5\u0122\u0092\2\u03c8\u03c9\5r:\2"+
		"\u03c9\u03ca\5h\65\2\u03ca\u03d0\3\2\2\2\u03cb\u03cc\5 \21\2\u03cc\u03cd"+
		"\7D\2\2\u03cd\u03ce\5n8\2\u03ce\u03d0\3\2\2\2\u03cf\u038b\3\2\2\2\u03cf"+
		"\u038c\3\2\2\2\u03cf\u038d\3\2\2\2\u03cf\u0395\3\2\2\2\u03cf\u0399\3\2"+
		"\2\2\u03cf\u039d\3\2\2\2\u03cf\u03aa\3\2\2\2\u03cf\u03b6\3\2\2\2\u03cf"+
		"\u03c7\3\2\2\2\u03cf\u03cb\3\2\2\2\u03d0o\3\2\2\2\u03d1\u03ed\5\u00b4"+
		"[\2\u03d2\u03d4\5\u0116\u008c\2\u03d3\u03d5\5\u00b4[\2\u03d4\u03d3\3\2"+
		"\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03ed\3\2\2\2\u03d6\u03d7\5\u0126\u0094"+
		"\2\u03d7\u03d8\5\u00b4[\2\u03d8\u03ed\3\2\2\2\u03d9\u03db\5\u00d6l\2\u03da"+
		"\u03dc\5 \21\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03ed\3\2"+
		"\2\2\u03dd\u03df\5\u00e4s\2\u03de\u03e0\5 \21\2\u03df\u03de\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03ed\3\2\2\2\u03e1\u03e2\5\u00d2j\2\u03e2\u03e5"+
		"\5\u00b4[\2\u03e3\u03e4\7D\2\2\u03e4\u03e6\5\u00b4[\2\u03e5\u03e3\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ed\3\2\2\2\u03e7\u03e8\5\u00e8u\2\u03e8"+
		"\u03e9\5n8\2\u03e9\u03ea\5\u0132\u009a\2\u03ea\u03eb\5r:\2\u03eb\u03ed"+
		"\3\2\2\2\u03ec\u03d1\3\2\2\2\u03ec\u03d2\3\2\2\2\u03ec\u03d6\3\2\2\2\u03ec"+
		"\u03d9\3\2\2\2\u03ec\u03dd\3\2\2\2\u03ec\u03e1\3\2\2\2\u03ec\u03e7\3\2"+
		"\2\2\u03edq\3\2\2\2\u03ee\u03ef\5\u00b4[\2\u03efs\3\2\2\2\u03f0\u03f1"+
		"\5\u00dco\2\u03f1\u03f2\5v<\2\u03f2\u03f3\5h\65\2\u03f3u\3\2\2\2\u03f4"+
		"\u03f6\5\u009cO\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5"+
		"\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa"+
		"\u03fb\5x=\2\u03fb\u03fc\5 \21\2\u03fcw\3\2\2\2\u03fd\u0402\5\36\20\2"+
		"\u03fe\u03ff\7R\2\2\u03ff\u0401\5\36\20\2\u0400\u03fe\3\2\2\2\u0401\u0404"+
		"\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403y\3\2\2\2\u0404"+
		"\u0402\3\2\2\2\u0405\u0406\5\u00f4{\2\u0406\u0407\5h\65\2\u0407{\3\2\2"+
		"\2\u0408\u0409\7\65\2\2\u0409\u040b\5~@\2\u040a\u040c\7;\2\2\u040b\u040a"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\7\66\2\2"+
		"\u040e}\3\2\2\2\u040f\u0414\5\u0080A\2\u0410\u0411\7;\2\2\u0411\u0413"+
		"\5\u0080A\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415\177\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0419"+
		"\5\u009cO\2\u0418\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2"+
		"\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u041e"+
		"\5\u00a8U\2\u041e\u041f\5\u0096L\2\u041f\u0420\7>\2\2\u0420\u0421\5\u00b4"+
		"[\2\u0421\u0081\3\2\2\2\u0422\u0424\5\u0084C\2\u0423\u0422\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2"+
		"\2\2\u0427\u0429\5j\66\2\u0428\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0083\3\2\2\2\u042c\u042d\7\b"+
		"\2\2\u042d\u042e\5\u0086D\2\u042e\u042f\7D\2\2\u042f\u0437\3\2\2\2\u0430"+
		"\u0431\7\b\2\2\u0431\u0432\5\u0088E\2\u0432\u0433\7D\2\2\u0433\u0437\3"+
		"\2\2\2\u0434\u0435\7\16\2\2\u0435\u0437\7D\2\2\u0436\u042c\3\2\2\2\u0436"+
		"\u0430\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0085\3\2\2\2\u0438\u0439\5\u00b4"+
		"[\2\u0439\u0087\3\2\2\2\u043a\u043b\7h\2\2\u043b\u0089\3\2\2\2\u043c\u0449"+
		"\5\u008eH\2\u043d\u043f\5\u008cG\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0442\7;\2\2\u0441\u0443\5\u00b4[\2\u0442"+
		"\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\7;"+
		"\2\2\u0445\u0447\5\u0090I\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u043c\3\2\2\2\u0448\u043e\3\2\2\2\u0449\u008b\3\2"+
		"\2\2\u044a\u044d\5l\67\2\u044b\u044d\5\u00b2Z\2\u044c\u044a\3\2\2\2\u044c"+
		"\u044b\3\2\2\2\u044d\u008d\3\2\2\2\u044e\u0450\5\u009cO\2\u044f\u044e"+
		"\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0455\5\u00a6T\2\u0455\u0456"+
		"\5\u0096L\2\u0456\u0457\5\u0152\u00aa\2\u0457\u0458\5\u00b4[\2\u0458\u008f"+
		"\3\2\2\2\u0459\u045a\5\u00b2Z\2\u045a\u0091\3\2\2\2\u045b\u0460\5\u0094"+
		"K\2\u045c\u045d\7<\2\2\u045d\u045f\5\u0094K\2\u045e\u045c\3\2\2\2\u045f"+
		"\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0093\3\2"+
		"\2\2\u0462\u0460\3\2\2\2\u0463\u0467\5\u0096L\2\u0464\u0465\5\u0146\u00a4"+
		"\2\u0465\u0466\5\u0098M\2\u0466\u0468\3\2\2\2\u0467\u0464\3\2\2\2\u0467"+
		"\u0468\3\2\2\2\u0468\u0095\3\2\2\2\u0469\u046f\5 \21\2\u046a\u046b\5\u0138"+
		"\u009d\2\u046b\u046c\5\u013a\u009e\2\u046c\u046e\3\2\2\2\u046d\u046a\3"+
		"\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0097\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0475\5\u009aN\2\u0473\u0475"+
		"\5\u00b4[\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u0099\3\2\2"+
		"\2\u0476\u0482\7\67\2\2\u0477\u047c\5\u0098M\2\u0478\u0479\7<\2\2\u0479"+
		"\u047b\5\u0098M\2\u047a\u0478\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047f"+
		"\u0481\7<\2\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\3\2"+
		"\2\2\u0482\u0477\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0485\78\2\2\u0485\u009b\3\2\2\2\u0486\u0489\5\u00f2z\2\u0487\u0489\5"+
		"X-\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u009d\3\2\2\2\u048a"+
		"\u048b\7@\2\2\u048b\u0490\5\u00a0Q\2\u048c\u048d\7<\2\2\u048d\u048f\5"+
		"\u00a0Q\2\u048e\u048c\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2"+
		"\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0494"+
		"\7?\2\2\u0494\u009f\3\2\2\2\u0495\u0498\7h\2\2\u0496\u0497\7\23\2\2\u0497"+
		"\u0499\5\u00a2R\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u00a1"+
		"\3\2\2\2\u049a\u049f\5\u00a6T\2\u049b\u049c\7Q\2\2\u049c\u049e\5\u00a6"+
		"T\2\u049d\u049b\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u00a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a7\5\u00a6"+
		"T\2\u04a3\u04a4\7<\2\2\u04a4\u04a6\5\u00a6T\2\u04a5\u04a3\3\2\2\2\u04a6"+
		"\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00a5\3\2"+
		"\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04b0\5\u00a8U\2\u04ab\u04ac\5\u013c\u009f"+
		"\2\u04ac\u04ad\5\u013e\u00a0\2\u04ad\u04af\3\2\2\2\u04ae\u04ab\3\2\2\2"+
		"\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04bd"+
		"\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b9\5\u00b0Y\2\u04b4\u04b5\5\u013c"+
		"\u009f\2\u04b5\u04b6\5\u013e\u00a0\2\u04b6\u04b8\3\2\2\2\u04b7\u04b4\3"+
		"\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04aa\3\2\2\2\u04bc\u04b3\3\2"+
		"\2\2\u04bd\u00a7\3\2\2\2\u04be\u04c0\5 \21\2\u04bf\u04c1\5\u00aaV\2\u04c0"+
		"\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c9\3\2\2\2\u04c2\u04c3\5\u0144"+
		"\u00a3\2\u04c3\u04c5\5 \21\2\u04c4\u04c6\5\u00aaV\2\u04c5\u04c4\3\2\2"+
		"\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c2\3\2\2\2\u04c8\u04cb"+
		"\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u00a9\3\2\2\2\u04cb"+
		"\u04c9\3\2\2\2\u04cc\u04cd\5\u014a\u00a6\2\u04cd\u04d3\5\u00acW\2\u04ce"+
		"\u04cf\5\u0142\u00a2\2\u04cf\u04d0\5\u00acW\2\u04d0\u04d2\3\2\2\2\u04d1"+
		"\u04ce\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2"+
		"\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d6\u04d7\5\u0148\u00a5"+
		"\2\u04d7\u00ab\3\2\2\2\u04d8\u04df\5\u00a6T\2\u04d9\u04dc\7C\2\2\u04da"+
		"\u04db\t\2\2\2\u04db\u04dd\5\u00a6T\2\u04dc\u04da\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04d8\3\2\2\2\u04de\u04d9\3\2\2\2\u04df"+
		"\u00ad\3\2\2\2\u04e0\u04e1\5\u014a\u00a6\2\u04e1\u04e2\5\u0148\u00a5\2"+
		"\u04e2\u04e5\3\2\2\2\u04e3\u04e5\5\u00aaV\2\u04e4\u04e0\3\2\2\2\u04e4"+
		"\u04e3\3\2\2\2\u04e5\u00af\3\2\2\2\u04e6\u04e7\t\3\2\2\u04e7\u00b1\3\2"+
		"\2\2\u04e8\u04ee\5\u00b4[\2\u04e9\u04ea\5\u0142\u00a2\2\u04ea\u04eb\5"+
		"\u00b4[\2\u04eb\u04ed\3\2\2\2\u04ec\u04e9\3\2\2\2\u04ed\u04f0\3\2\2\2"+
		"\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u00b3\3\2\2\2\u04f0\u04ee"+
		"\3\2\2\2\u04f1\u04f2\b[\1\2\u04f2\u04f3\5\u0134\u009b\2\u04f3\u04f4\5"+
		"\u00a6T\2\u04f4\u04f5\5\u0136\u009c\2\u04f5\u04f6\5\u00b4[\23\u04f6\u0506"+
		"\3\2\2\2\u04f7\u04fc\5\u0164\u00b3\2\u04f8\u04fc\5\u0166\u00b4\2\u04f9"+
		"\u04fc\5\u0160\u00b1\2\u04fa\u04fc\5\u0162\u00b2\2\u04fb\u04f7\3\2\2\2"+
		"\u04fb\u04f8\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fc\u04fd"+
		"\3\2\2\2\u04fd\u04fe\5\u00b4[\21\u04fe\u0506\3\2\2\2\u04ff\u0500\t\4\2"+
		"\2\u0500\u0506\5\u00b4[\20\u0501\u0506\5\u00b6\\\2\u0502\u0503\5\u010c"+
		"\u0087\2\u0503\u0504\5\u00c6d\2\u0504\u0506\3\2\2\2\u0505\u04f1\3\2\2"+
		"\2\u0505\u04fb\3\2\2\2\u0505\u04ff\3\2\2\2\u0505\u0501\3\2\2\2\u0505\u0502"+
		"\3\2\2\2\u0506\u0584\3\2\2\2\u0507\u0508\f\17\2\2\u0508\u0509\t\5\2\2"+
		"\u0509\u0583\5\u00b4[\20\u050a\u050d\f\16\2\2\u050b\u050e\5\u0164\u00b3"+
		"\2\u050c\u050e\5\u0166\u00b4\2\u050d\u050b\3\2\2\2\u050d\u050c\3\2\2\2"+
		"\u050e\u050f\3\2\2\2\u050f\u0510\5\u00b4[\17\u0510\u0583\3\2\2\2\u0511"+
		"\u051c\f\r\2\2\u0512\u0513\5\u014a\u00a6\2\u0513\u0514\5\u014a\u00a6\2"+
		"\u0514\u051d\3\2\2\2\u0515\u0516\5\u0148\u00a5\2\u0516\u0517\5\u0148\u00a5"+
		"\2\u0517\u0518\5\u0148\u00a5\2\u0518\u051d\3\2\2\2\u0519\u051a\5\u0148"+
		"\u00a5\2\u051a\u051b\5\u0148\u00a5\2\u051b\u051d\3\2\2\2\u051c\u0512\3"+
		"\2\2\2\u051c\u0515\3\2\2\2\u051c\u0519\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u051f\5\u00b4[\16\u051f\u0583\3\2\2\2\u0520\u0525\f\f\2\2\u0521\u0526"+
		"\5\u0156\u00ac\2\u0522\u0526\5\u0158\u00ad\2\u0523\u0526\5\u0148\u00a5"+
		"\2\u0524\u0526\5\u014a\u00a6\2\u0525\u0521\3\2\2\2\u0525\u0522\3\2\2\2"+
		"\u0525\u0523\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"+
		"\5\u00b4[\r\u0528\u0583\3\2\2\2\u0529\u052c\f\n\2\2\u052a\u052d\5\u0154"+
		"\u00ab\2\u052b\u052d\5\u015a\u00ae\2\u052c\u052a\3\2\2\2\u052c\u052b\3"+
		"\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\5\u00b4[\13\u052f\u0583\3\2\2\2"+
		"\u0530\u0531\f\t\2\2\u0531\u0532\7Q\2\2\u0532\u0583\5\u00b4[\n\u0533\u0534"+
		"\f\b\2\2\u0534\u0535\7S\2\2\u0535\u0583\5\u00b4[\t\u0536\u0537\f\7\2\2"+
		"\u0537\u0538\7R\2\2\u0538\u0583\5\u00b4[\b\u0539\u053a\f\6\2\2\u053a\u053b"+
		"\7I\2\2\u053b\u0583\5\u00b4[\7\u053c\u053d\f\5\2\2\u053d\u053e\7J\2\2"+
		"\u053e\u0583\5\u00b4[\6\u053f\u0540\f\4\2\2\u0540\u0541\5\u0150\u00a9"+
		"\2\u0541\u0542\5\u00b4[\2\u0542\u0543\5\u0152\u00aa\2\u0543\u0544\5\u00b4"+
		"[\5\u0544\u0583\3\2\2\2\u0545\u0552\f\3\2\2\u0546\u0553\5\u0146\u00a4"+
		"\2\u0547\u0553\7U\2\2\u0548\u0553\7V\2\2\u0549\u0553\7W\2\2\u054a\u0553"+
		"\7X\2\2\u054b\u0553\7Y\2\2\u054c\u0553\7Z\2\2\u054d\u0553\7[\2\2\u054e"+
		"\u0553\7^\2\2\u054f\u0553\7_\2\2\u0550\u0553\7]\2\2\u0551\u0553\7\\\2"+
		"\2\u0552\u0546\3\2\2\2\u0552\u0547\3\2\2\2\u0552\u0548\3\2\2\2\u0552\u0549"+
		"\3\2\2\2\u0552\u054a\3\2\2\2\u0552\u054b\3\2\2\2\u0552\u054c\3\2\2\2\u0552"+
		"\u054d\3\2\2\2\u0552\u054e\3\2\2\2\u0552\u054f\3\2\2\2\u0552\u0550\3\2"+
		"\2\2\u0552\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0583\5\u00b4[\3\u0555"+
		"\u0556\f\33\2\2\u0556\u0557\5\u0144\u00a3\2\u0557\u0558\5 \21\2\u0558"+
		"\u0583\3\2\2\2\u0559\u055a\f\32\2\2\u055a\u055b\5\u0144\u00a3\2\u055b"+
		"\u055c\7-\2\2\u055c\u0583\3\2\2\2\u055d\u055e\f\31\2\2\u055e\u055f\5\u0144"+
		"\u00a3\2\u055f\u0561\5\u010c\u0087\2\u0560\u0562\5\u00bc_\2\u0561\u0560"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\5\u00ceh"+
		"\2\u0564\u0583\3\2\2\2\u0565\u0566\f\30\2\2\u0566\u0567\5\u0144\u00a3"+
		"\2\u0567\u0568\7*\2\2\u0568\u0569\5\u00c2b\2\u0569\u0583\3\2\2\2\u056a"+
		"\u056b\f\27\2\2\u056b\u056c\5\u0144\u00a3\2\u056c\u056d\5\u00be`\2\u056d"+
		"\u0583\3\2\2\2\u056e\u056f\f\26\2\2\u056f\u0570\5\u013c\u009f\2\u0570"+
		"\u0571\5\u00b4[\2\u0571\u0572\5\u013e\u00a0\2\u0572\u0583\3\2\2\2\u0573"+
		"\u0574\f\25\2\2\u0574\u0576\5\u0134\u009b\2\u0575\u0577\5\u00b2Z\2\u0576"+
		"\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\5\u0136"+
		"\u009c\2\u0579\u0583\3\2\2\2\u057a\u057d\f\22\2\2\u057b\u057e\5\u0160"+
		"\u00b1\2\u057c\u057e\5\u0162\u00b2\2\u057d\u057b\3\2\2\2\u057d\u057c\3"+
		"\2\2\2\u057e\u0583\3\2\2\2\u057f\u0580\f\13\2\2\u0580\u0581\7\34\2\2\u0581"+
		"\u0583\5\u00a6T\2\u0582\u0507\3\2\2\2\u0582\u050a\3\2\2\2\u0582\u0511"+
		"\3\2\2\2\u0582\u0520\3\2\2\2\u0582\u0529\3\2\2\2\u0582\u0530\3\2\2\2\u0582"+
		"\u0533\3\2\2\2\u0582\u0536\3\2\2\2\u0582\u0539\3\2\2\2\u0582\u053c\3\2"+
		"\2\2\u0582\u053f\3\2\2\2\u0582\u0545\3\2\2\2\u0582\u0555\3\2\2\2\u0582"+
		"\u0559\3\2\2\2\u0582\u055d\3\2\2\2\u0582\u0565\3\2\2\2\u0582\u056a\3\2"+
		"\2\2\u0582\u056e\3\2\2\2\u0582\u0573\3\2\2\2\u0582\u057a\3\2\2\2\u0582"+
		"\u057f\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585\u00b5\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\5\u0134\u009b"+
		"\2\u0588\u0589\5\u00b4[\2\u0589\u058a\5\u0136\u009c\2\u058a\u059e\3\2"+
		"\2\2\u058b\u059e\5\u0124\u0093\2\u058c\u059e\5\u011e\u0090\2\u058d\u059e"+
		"\5\u00b8]\2\u058e\u059e\5 \21\2\u058f\u0590\5\u00a6T\2\u0590\u0591\5\u0144"+
		"\u00a3\2\u0591\u0592\7\13\2\2\u0592\u059e\3\2\2\2\u0593\u0594\7\62\2\2"+
		"\u0594\u0595\5\u0144\u00a3\2\u0595\u0596\7\13\2\2\u0596\u059e\3\2\2\2"+
		"\u0597\u059b\5\u00bc_\2\u0598\u059c\5\u00c0a\2\u0599\u059a\7-\2\2\u059a"+
		"\u059c\5\u00c4c\2\u059b\u0598\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u059e"+
		"\3\2\2\2\u059d\u0587\3\2\2\2\u059d\u058b\3\2\2\2\u059d\u058c\3\2\2\2\u059d"+
		"\u058d\3\2\2\2\u059d\u058e\3\2\2\2\u059d\u058f\3\2\2\2\u059d\u0593\3\2"+
		"\2\2\u059d\u0597\3\2\2\2\u059e\u00b7\3\2\2\2\u059f\u05a0\t\6\2\2\u05a0"+
		"\u00b9\3\2\2\2\u05a1\u05a2\5\u014a\u00a6\2\u05a2\u05a3\5\u0148\u00a5\2"+
		"\u05a3\u05a6\3\2\2\2\u05a4\u05a6\5\u00bc_\2\u05a5\u05a1\3\2\2\2\u05a5"+
		"\u05a4\3\2\2\2\u05a6\u00bb\3\2\2\2\u05a7\u05a8\5\u014a\u00a6\2\u05a8\u05a9"+
		"\5\u00a4S\2\u05a9\u05aa\5\u0148\u00a5\2\u05aa\u00bd\3\2\2\2\u05ab\u05ac"+
		"\5\u00bc_\2\u05ac\u05ad\5\u00c0a\2\u05ad\u00bf\3\2\2\2\u05ae\u05af\7*"+
		"\2\2\u05af\u05b3\5\u00c2b\2\u05b0\u05b1\7h\2\2\u05b1\u05b3\5\u00c4c\2"+
		"\u05b2\u05ae\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u00c1\3\2\2\2\u05b4\u05bb"+
		"\5\u00c4c\2\u05b5\u05b6\5\u0144\u00a3\2\u05b6\u05b8\7h\2\2\u05b7\u05b9"+
		"\5\u00c4c\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2"+
		"\2\u05ba\u05b4\3\2\2\2\u05ba\u05b5\3\2\2\2\u05bb\u00c3\3\2\2\2\u05bc\u05be"+
		"\5\u0134\u009b\2\u05bd\u05bf\5\u00b2Z\2\u05be\u05bd\3\2\2\2\u05be\u05bf"+
		"\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\5\u0136\u009c\2\u05c1\u00c5\3"+
		"\2\2\2\u05c2\u05c3\5\u00bc_\2\u05c3\u05c4\5\u00c8e\2\u05c4\u05c5\5\u00ca"+
		"f\2\u05c5\u05cc\3\2\2\2\u05c6\u05c9\5\u00c8e\2\u05c7\u05ca\5\u00ccg\2"+
		"\u05c8\u05ca\5\u00caf\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca"+
		"\u05cc\3\2\2\2\u05cb\u05c2\3\2\2\2\u05cb\u05c6\3\2\2\2\u05cc\u00c7\3\2"+
		"\2\2\u05cd\u05cf\5 \21\2\u05ce\u05d0\5\u00aeX\2\u05cf\u05ce\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u05d8\3\2\2\2\u05d1\u05d2\5\u0144\u00a3\2\u05d2\u05d4"+
		"\7h\2\2\u05d3\u05d5\5\u00aeX\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2"+
		"\u05d5\u05d7\3\2\2\2\u05d6\u05d1\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6"+
		"\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dd\3\2\2\2\u05da\u05d8\3\2\2\2\u05db"+
		"\u05dd\5\u00b0Y\2\u05dc\u05cd\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd\u00c9"+
		"\3\2\2\2\u05de\u05e0\5\u00c4c\2\u05df\u05e1\5$\23\2\u05e0\u05df\3\2\2"+
		"\2\u05e0\u05e1\3\2\2\2\u05e1\u00cb\3\2\2\2\u05e2\u0601\5\u013c\u009f\2"+
		"\u05e3\u05e9\5\u013e\u00a0\2\u05e4\u05e5\5\u013c\u009f\2\u05e5\u05e6\5"+
		"\u013e\u00a0\2\u05e6\u05e8\3\2\2\2\u05e7\u05e4\3\2\2\2\u05e8\u05eb\3\2"+
		"\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\3\2\2\2\u05eb"+
		"\u05e9\3\2\2\2\u05ec\u05ed\5\u009aN\2\u05ed\u0602\3\2\2\2\u05ee\u05ef"+
		"\5\u00b4[\2\u05ef\u05f6\5\u013e\u00a0\2\u05f0\u05f1\5\u013c\u009f\2\u05f1"+
		"\u05f2\5\u00b4[\2\u05f2\u05f3\5\u013e\u00a0\2\u05f3\u05f5\3\2\2\2\u05f4"+
		"\u05f0\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2"+
		"\2\2\u05f7\u05fe\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fa\5\u013c\u009f"+
		"\2\u05fa\u05fb\5\u013e\u00a0\2\u05fb\u05fd\3\2\2\2\u05fc\u05f9\3\2\2\2"+
		"\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602"+
		"\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u05e3\3\2\2\2\u0601\u05ee\3\2\2\2\u0602"+
		"\u00cd\3\2\2\2\u0603\u0605\7h\2\2\u0604\u0606\5\u00ba^\2\u0605\u0604\3"+
		"\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\5\u00caf\2"+
		"\u0608\u00cf\3\2\2\2\u0609\u060a\7\3\2\2\u060a\u00d1\3\2\2\2\u060b\u060c"+
		"\7\4\2\2\u060c\u00d3\3\2\2\2\u060d\u060e\7\5\2\2\u060e\u00d5\3\2\2\2\u060f"+
		"\u0610\7\6\2\2\u0610\u00d7\3\2\2\2\u0611\u0612\7\7\2\2\u0612\u00d9\3\2"+
		"\2\2\u0613\u0614\7\b\2\2\u0614\u00db\3\2\2\2\u0615\u0616\7\t\2\2\u0616"+
		"\u00dd\3\2\2\2\u0617\u0618\7\n\2\2\u0618\u00df\3\2\2\2\u0619\u061a\7\13"+
		"\2\2\u061a\u00e1\3\2\2\2\u061b\u061c\7\f\2\2\u061c\u00e3\3\2\2\2\u061d"+
		"\u061e\7\r\2\2\u061e\u00e5\3\2\2\2\u061f\u0620\7\16\2\2\u0620\u00e7\3"+
		"\2\2\2\u0621\u0622\7\17\2\2\u0622\u00e9\3\2\2\2\u0623\u0624\7\20\2\2\u0624"+
		"\u00eb\3\2\2\2\u0625\u0626\7\21\2\2\u0626\u00ed\3\2\2\2\u0627\u0628\7"+
		"\22\2\2\u0628\u00ef\3\2\2\2\u0629\u062a\7\23\2\2\u062a\u00f1\3\2\2\2\u062b"+
		"\u062c\7\24\2\2\u062c\u00f3\3\2\2\2\u062d\u062e\7\25\2\2\u062e\u00f5\3"+
		"\2\2\2\u062f\u0630\7\26\2\2\u0630\u00f7\3\2\2\2\u0631\u0632\7\27\2\2\u0632"+
		"\u00f9\3\2\2\2\u0633\u0634\7\30\2\2\u0634\u00fb\3\2\2\2\u0635\u0636\7"+
		"\31\2\2\u0636\u00fd\3\2\2\2\u0637\u0638\7\32\2\2\u0638\u00ff\3\2\2\2\u0639"+
		"\u063a\7\33\2\2\u063a\u0101\3\2\2\2\u063b\u063c\7\34\2\2\u063c\u0103\3"+
		"\2\2\2\u063d\u063e\7\35\2\2\u063e\u0105\3\2\2\2\u063f\u0640\7\36\2\2\u0640"+
		"\u0107\3\2\2\2\u0641\u0642\7\37\2\2\u0642\u0109\3\2\2\2\u0643\u0644\7"+
		" \2\2\u0644\u010b\3\2\2\2\u0645\u0646\7!\2\2\u0646\u010d\3\2\2\2\u0647"+
		"\u0648\7\"\2\2\u0648\u010f\3\2\2\2\u0649\u064a\7#\2\2\u064a\u0111\3\2"+
		"\2\2\u064b\u064c\7$\2\2\u064c\u0113\3\2\2\2\u064d\u064e\7%\2\2\u064e\u0115"+
		"\3\2\2\2\u064f\u0650\7&\2\2\u0650\u0117\3\2\2\2\u0651\u0652\7\'\2\2\u0652"+
		"\u0119\3\2\2\2\u0653\u0654\7(\2\2\u0654\u011b\3\2\2\2\u0655\u0656\7)\2"+
		"\2\u0656\u011d\3\2\2\2\u0657\u0658\7*\2\2\u0658\u011f\3\2\2\2\u0659\u065a"+
		"\7+\2\2\u065a\u0121\3\2\2\2\u065b\u065c\7,\2\2\u065c\u0123\3\2\2\2\u065d"+
		"\u065e\7-\2\2\u065e\u0125\3\2\2\2\u065f\u0660\7.\2\2\u0660\u0127\3\2\2"+
		"\2\u0661\u0662\7/\2\2\u0662\u0129\3\2\2\2\u0663\u0664\7\60\2\2\u0664\u012b"+
		"\3\2\2\2\u0665\u0666\7\61\2\2\u0666\u012d\3\2\2\2\u0667\u0668\7\62\2\2"+
		"\u0668\u012f\3\2\2\2\u0669\u066a\7\63\2\2\u066a\u0131\3\2\2\2\u066b\u066c"+
		"\7\64\2\2\u066c\u0133\3\2\2\2\u066d\u066e\7\65\2\2\u066e\u0135\3\2\2\2"+
		"\u066f\u0670\7\66\2\2\u0670\u0137\3\2\2\2\u0671\u0672\7\67\2\2\u0672\u0139"+
		"\3\2\2\2\u0673\u0674\78\2\2\u0674\u013b\3\2\2\2\u0675\u0676\79\2\2\u0676"+
		"\u013d\3\2\2\2\u0677\u0678\7:\2\2\u0678\u013f\3\2\2\2\u0679\u067a\7;\2"+
		"\2\u067a\u0141\3\2\2\2\u067b\u067c\7<\2\2\u067c\u0143\3\2\2\2\u067d\u067e"+
		"\7=\2\2\u067e\u0145\3\2\2\2\u067f\u0680\7>\2\2\u0680\u0147\3\2\2\2\u0681"+
		"\u0682\7?\2\2\u0682\u0149\3\2\2\2\u0683\u0684\7@\2\2\u0684\u014b\3\2\2"+
		"\2\u0685\u0686\7A\2\2\u0686\u014d\3\2\2\2\u0687\u0688\7B\2\2\u0688\u014f"+
		"\3\2\2\2\u0689\u068a\7C\2\2\u068a\u0151\3\2\2\2\u068b\u068c\7D\2\2\u068c"+
		"\u0153\3\2\2\2\u068d\u068e\7E\2\2\u068e\u0155\3\2\2\2\u068f\u0690\7F\2"+
		"\2\u0690\u0157\3\2\2\2\u0691\u0692\7G\2\2\u0692\u0159\3\2\2\2\u0693\u0694"+
		"\7H\2\2\u0694\u015b\3\2\2\2\u0695\u0696\7I\2\2\u0696\u015d\3\2\2\2\u0697"+
		"\u0698\7J\2\2\u0698\u015f\3\2\2\2\u0699\u069a\7K\2\2\u069a\u0161\3\2\2"+
		"\2\u069b\u069c\7L\2\2\u069c\u0163\3\2\2\2\u069d\u069e\7M\2\2\u069e\u0165"+
		"\3\2\2\2\u069f\u06a0\7N\2\2\u06a0\u0167\3\2\2\2\u06a1\u06a2\7O\2\2\u06a2"+
		"\u0169\3\2\2\2\u06a3\u06a4\7P\2\2\u06a4\u016b\3\2\2\2\u06a5\u06a6\7Q\2"+
		"\2\u06a6\u016d\3\2\2\2\u06a7\u06a8\7R\2\2\u06a8\u016f\3\2\2\2\u06a9\u06aa"+
		"\7S\2\2\u06aa\u0171\3\2\2\2\u06ab\u06ac\7T\2\2\u06ac\u0173\3\2\2\2\u06ad"+
		"\u06ae\7U\2\2\u06ae\u0175\3\2\2\2\u06af\u06b0\7V\2\2\u06b0\u0177\3\2\2"+
		"\2\u06b1\u06b2\7W\2\2\u06b2\u0179\3\2\2\2\u06b3\u06b4\7X\2\2\u06b4\u017b"+
		"\3\2\2\2\u06b5\u06b6\7Y\2\2\u06b6\u017d\3\2\2\2\u06b7\u06b8\7Z\2\2\u06b8"+
		"\u017f\3\2\2\2\u06b9\u06ba\7[\2\2\u06ba\u0181\3\2\2\2\u06bb\u06bc\7\\"+
		"\2\2\u06bc\u0183\3\2\2\2\u06bd\u06be\7]\2\2\u06be\u0185\3\2\2\2\u06bf"+
		"\u06c0\7^\2\2\u06c0\u0187\3\2\2\2\u06c1\u06c2\7_\2\2\u06c2\u0189\3\2\2"+
		"\2\u06c3\u06c4\7`\2\2\u06c4\u018b\3\2\2\2\u06c5\u06c6\7a\2\2\u06c6\u018d"+
		"\3\2\2\2\u00a2\u018f\u0194\u019a\u01a2\u01aa\u01b0\u01b5\u01bc\u01c3\u01ca"+
		"\u01ce\u01d5\u01de\u01e1\u01e4\u01ea\u01f4\u01fa\u01fd\u0202\u020b\u0219"+
		"\u0223\u022f\u0237\u023f\u0244\u0249\u024e\u0254\u025a\u0260\u0264\u026b"+
		"\u026d\u0277\u0279\u0284\u028b\u0293\u0299\u029c\u02aa\u02b5\u02bd\u02c2"+
		"\u02c9\u02cd\u02d5\u02dd\u02e2\u02eb\u02f6\u02fe\u0303\u0307\u030f\u0313"+
		"\u0317\u0319\u031d\u0323\u032f\u0333\u033c\u0347\u034b\u034e\u0351\u035a"+
		"\u0360\u0365\u0368\u036e\u0372\u0378\u0380\u0385\u0393\u03a2\u03a5\u03a8"+
		"\u03b0\u03b4\u03bc\u03c2\u03cf\u03d4\u03db\u03df\u03e5\u03ec\u03f7\u0402"+
		"\u040b\u0414\u041a\u0425\u042a\u0436\u043e\u0442\u0446\u0448\u044c\u0451"+
		"\u0460\u0467\u046f\u0474\u047c\u0480\u0482\u0488\u0490\u0498\u049f\u04a7"+
		"\u04b0\u04b9\u04bc\u04c0\u04c5\u04c9\u04d3\u04dc\u04de\u04e4\u04ee\u04fb"+
		"\u0505\u050d\u051c\u0525\u052c\u0552\u0561\u0576\u057d\u0582\u0584\u059b"+
		"\u059d\u05a5\u05b2\u05b8\u05ba\u05be\u05c9\u05cb\u05cf\u05d4\u05d8\u05dc"+
		"\u05e0\u05e9\u05f6\u05fe\u0601\u0605";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}