// Generated from /Users/Dionysis_Lorentzos/Projects/untitled1/PJ Grammar/PJ.g4 by ANTLR 4.4.1-dev

package com.lorentzos.pj;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PJParser}.
 */
public interface PJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PJParser#equalRule}.
	 * @param ctx the parse tree
	 */
	void enterEqualRule(@NotNull PJParser.EqualRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#equalRule}.
	 * @param ctx the parse tree
	 */
	void exitEqualRule(@NotNull PJParser.EqualRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull PJParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull PJParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#rshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterRshift_assignRule(@NotNull PJParser.Rshift_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#rshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitRshift_assignRule(@NotNull PJParser.Rshift_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#mul_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterMul_assignRule(@NotNull PJParser.Mul_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#mul_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitMul_assignRule(@NotNull PJParser.Mul_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull PJParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull PJParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#throwRule}.
	 * @param ctx the parse tree
	 */
	void enterThrowRule(@NotNull PJParser.ThrowRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#throwRule}.
	 * @param ctx the parse tree
	 */
	void exitThrowRule(@NotNull PJParser.ThrowRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#byteRule}.
	 * @param ctx the parse tree
	 */
	void enterByteRule(@NotNull PJParser.ByteRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#byteRule}.
	 * @param ctx the parse tree
	 */
	void exitByteRule(@NotNull PJParser.ByteRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull PJParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull PJParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull PJParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull PJParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#forRule}.
	 * @param ctx the parse tree
	 */
	void enterForRule(@NotNull PJParser.ForRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#forRule}.
	 * @param ctx the parse tree
	 */
	void exitForRule(@NotNull PJParser.ForRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#xor_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterXor_assignRule(@NotNull PJParser.Xor_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#xor_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitXor_assignRule(@NotNull PJParser.Xor_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull PJParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull PJParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull PJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull PJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#continueRule}.
	 * @param ctx the parse tree
	 */
	void enterContinueRule(@NotNull PJParser.ContinueRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#continueRule}.
	 * @param ctx the parse tree
	 */
	void exitContinueRule(@NotNull PJParser.ContinueRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#gtRule}.
	 * @param ctx the parse tree
	 */
	void enterGtRule(@NotNull PJParser.GtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#gtRule}.
	 * @param ctx the parse tree
	 */
	void exitGtRule(@NotNull PJParser.GtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#bitandRule}.
	 * @param ctx the parse tree
	 */
	void enterBitandRule(@NotNull PJParser.BitandRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#bitandRule}.
	 * @param ctx the parse tree
	 */
	void exitBitandRule(@NotNull PJParser.BitandRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#geRule}.
	 * @param ctx the parse tree
	 */
	void enterGeRule(@NotNull PJParser.GeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#geRule}.
	 * @param ctx the parse tree
	 */
	void exitGeRule(@NotNull PJParser.GeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull PJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull PJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull PJParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull PJParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull PJParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull PJParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#defaultRule}.
	 * @param ctx the parse tree
	 */
	void enterDefaultRule(@NotNull PJParser.DefaultRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#defaultRule}.
	 * @param ctx the parse tree
	 */
	void exitDefaultRule(@NotNull PJParser.DefaultRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#lparenRule}.
	 * @param ctx the parse tree
	 */
	void enterLparenRule(@NotNull PJParser.LparenRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#lparenRule}.
	 * @param ctx the parse tree
	 */
	void exitLparenRule(@NotNull PJParser.LparenRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#volatileRule}.
	 * @param ctx the parse tree
	 */
	void enterVolatileRule(@NotNull PJParser.VolatileRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#volatileRule}.
	 * @param ctx the parse tree
	 */
	void exitVolatileRule(@NotNull PJParser.VolatileRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#tildeRule}.
	 * @param ctx the parse tree
	 */
	void enterTildeRule(@NotNull PJParser.TildeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#tildeRule}.
	 * @param ctx the parse tree
	 */
	void exitTildeRule(@NotNull PJParser.TildeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull PJParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull PJParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#caretRule}.
	 * @param ctx the parse tree
	 */
	void enterCaretRule(@NotNull PJParser.CaretRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#caretRule}.
	 * @param ctx the parse tree
	 */
	void exitCaretRule(@NotNull PJParser.CaretRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull PJParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull PJParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classRule}.
	 * @param ctx the parse tree
	 */
	void enterClassRule(@NotNull PJParser.ClassRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classRule}.
	 * @param ctx the parse tree
	 */
	void exitClassRule(@NotNull PJParser.ClassRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull PJParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull PJParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull PJParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull PJParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleBlockStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBlockStatement(@NotNull PJParser.SimpleBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleBlockStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBlockStatement(@NotNull PJParser.SimpleBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull PJParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull PJParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#addRule}.
	 * @param ctx the parse tree
	 */
	void enterAddRule(@NotNull PJParser.AddRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#addRule}.
	 * @param ctx the parse tree
	 */
	void exitAddRule(@NotNull PJParser.AddRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull PJParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull PJParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierStament}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierStament(@NotNull PJParser.IdentifierStamentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierStament}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierStament(@NotNull PJParser.IdentifierStamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#switchRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRule(@NotNull PJParser.SwitchRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#switchRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRule(@NotNull PJParser.SwitchRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#subRule}.
	 * @param ctx the parse tree
	 */
	void enterSubRule(@NotNull PJParser.SubRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#subRule}.
	 * @param ctx the parse tree
	 */
	void exitSubRule(@NotNull PJParser.SubRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#charRule}.
	 * @param ctx the parse tree
	 */
	void enterCharRule(@NotNull PJParser.CharRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#charRule}.
	 * @param ctx the parse tree
	 */
	void exitCharRule(@NotNull PJParser.CharRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull PJParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull PJParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#booleanRule}.
	 * @param ctx the parse tree
	 */
	void enterBooleanRule(@NotNull PJParser.BooleanRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#booleanRule}.
	 * @param ctx the parse tree
	 */
	void exitBooleanRule(@NotNull PJParser.BooleanRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#newRule}.
	 * @param ctx the parse tree
	 */
	void enterNewRule(@NotNull PJParser.NewRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#newRule}.
	 * @param ctx the parse tree
	 */
	void exitNewRule(@NotNull PJParser.NewRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#andRule}.
	 * @param ctx the parse tree
	 */
	void enterAndRule(@NotNull PJParser.AndRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#andRule}.
	 * @param ctx the parse tree
	 */
	void exitAndRule(@NotNull PJParser.AndRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#importRule}.
	 * @param ctx the parse tree
	 */
	void enterImportRule(@NotNull PJParser.ImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#importRule}.
	 * @param ctx the parse tree
	 */
	void exitImportRule(@NotNull PJParser.ImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull PJParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull PJParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull PJParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull PJParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceRule}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceRule(@NotNull PJParser.InterfaceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceRule}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceRule(@NotNull PJParser.InterfaceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull PJParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull PJParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull PJParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull PJParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#identifierRule}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierRule(@NotNull PJParser.IdentifierRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#identifierRule}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierRule(@NotNull PJParser.IdentifierRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#bangRule}.
	 * @param ctx the parse tree
	 */
	void enterBangRule(@NotNull PJParser.BangRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#bangRule}.
	 * @param ctx the parse tree
	 */
	void exitBangRule(@NotNull PJParser.BangRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull PJParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull PJParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull PJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull PJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PJParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PJParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull PJParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull PJParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull PJParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull PJParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#whileRule}.
	 * @param ctx the parse tree
	 */
	void enterWhileRule(@NotNull PJParser.WhileRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#whileRule}.
	 * @param ctx the parse tree
	 */
	void exitWhileRule(@NotNull PJParser.WhileRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#packageRule}.
	 * @param ctx the parse tree
	 */
	void enterPackageRule(@NotNull PJParser.PackageRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#packageRule}.
	 * @param ctx the parse tree
	 */
	void exitPackageRule(@NotNull PJParser.PackageRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#dotRule}.
	 * @param ctx the parse tree
	 */
	void enterDotRule(@NotNull PJParser.DotRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#dotRule}.
	 * @param ctx the parse tree
	 */
	void exitDotRule(@NotNull PJParser.DotRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#divRule}.
	 * @param ctx the parse tree
	 */
	void enterDivRule(@NotNull PJParser.DivRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#divRule}.
	 * @param ctx the parse tree
	 */
	void exitDivRule(@NotNull PJParser.DivRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull PJParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull PJParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull PJParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull PJParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#rbraceRule}.
	 * @param ctx the parse tree
	 */
	void enterRbraceRule(@NotNull PJParser.RbraceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#rbraceRule}.
	 * @param ctx the parse tree
	 */
	void exitRbraceRule(@NotNull PJParser.RbraceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#urshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterUrshift_assignRule(@NotNull PJParser.Urshift_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#urshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitUrshift_assignRule(@NotNull PJParser.Urshift_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constRule}.
	 * @param ctx the parse tree
	 */
	void enterConstRule(@NotNull PJParser.ConstRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constRule}.
	 * @param ctx the parse tree
	 */
	void exitConstRule(@NotNull PJParser.ConstRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull PJParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull PJParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#instanceofRule}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofRule(@NotNull PJParser.InstanceofRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#instanceofRule}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofRule(@NotNull PJParser.InstanceofRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclarationNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationNL(@NotNull PJParser.MemberDeclarationNLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclarationNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationNL(@NotNull PJParser.MemberDeclarationNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull PJParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull PJParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull PJParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull PJParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull PJParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull PJParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#doubleRule}.
	 * @param ctx the parse tree
	 */
	void enterDoubleRule(@NotNull PJParser.DoubleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#doubleRule}.
	 * @param ctx the parse tree
	 */
	void exitDoubleRule(@NotNull PJParser.DoubleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#leRule}.
	 * @param ctx the parse tree
	 */
	void enterLeRule(@NotNull PJParser.LeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#leRule}.
	 * @param ctx the parse tree
	 */
	void exitLeRule(@NotNull PJParser.LeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#or_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterOr_assignRule(@NotNull PJParser.Or_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#or_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitOr_assignRule(@NotNull PJParser.Or_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#modRule}.
	 * @param ctx the parse tree
	 */
	void enterModRule(@NotNull PJParser.ModRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#modRule}.
	 * @param ctx the parse tree
	 */
	void exitModRule(@NotNull PJParser.ModRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull PJParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull PJParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull PJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull PJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull PJParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull PJParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull PJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull PJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull PJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull PJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#statementsCommaless}.
	 * @param ctx the parse tree
	 */
	void enterStatementsCommaless(@NotNull PJParser.StatementsCommalessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#statementsCommaless}.
	 * @param ctx the parse tree
	 */
	void exitStatementsCommaless(@NotNull PJParser.StatementsCommalessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull PJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull PJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull PJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull PJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull PJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull PJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#protectedRule}.
	 * @param ctx the parse tree
	 */
	void enterProtectedRule(@NotNull PJParser.ProtectedRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#protectedRule}.
	 * @param ctx the parse tree
	 */
	void exitProtectedRule(@NotNull PJParser.ProtectedRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#notEqualRule}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualRule(@NotNull PJParser.NotEqualRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#notEqualRule}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualRule(@NotNull PJParser.NotEqualRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull PJParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull PJParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull PJParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull PJParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#mod_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterMod_assignRule(@NotNull PJParser.Mod_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#mod_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitMod_assignRule(@NotNull PJParser.Mod_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull PJParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull PJParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#superRule}.
	 * @param ctx the parse tree
	 */
	void enterSuperRule(@NotNull PJParser.SuperRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#superRule}.
	 * @param ctx the parse tree
	 */
	void exitSuperRule(@NotNull PJParser.SuperRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#extendsRule}.
	 * @param ctx the parse tree
	 */
	void enterExtendsRule(@NotNull PJParser.ExtendsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#extendsRule}.
	 * @param ctx the parse tree
	 */
	void exitExtendsRule(@NotNull PJParser.ExtendsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#ltRule}.
	 * @param ctx the parse tree
	 */
	void enterLtRule(@NotNull PJParser.LtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#ltRule}.
	 * @param ctx the parse tree
	 */
	void exitLtRule(@NotNull PJParser.LtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull PJParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull PJParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull PJParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull PJParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#colonRule}.
	 * @param ctx the parse tree
	 */
	void enterColonRule(@NotNull PJParser.ColonRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#colonRule}.
	 * @param ctx the parse tree
	 */
	void exitColonRule(@NotNull PJParser.ColonRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#returnRule}.
	 * @param ctx the parse tree
	 */
	void enterReturnRule(@NotNull PJParser.ReturnRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#returnRule}.
	 * @param ctx the parse tree
	 */
	void exitReturnRule(@NotNull PJParser.ReturnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PJParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PJParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#strictfpRule}.
	 * @param ctx the parse tree
	 */
	void enterStrictfpRule(@NotNull PJParser.StrictfpRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#strictfpRule}.
	 * @param ctx the parse tree
	 */
	void exitStrictfpRule(@NotNull PJParser.StrictfpRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#bitorRule}.
	 * @param ctx the parse tree
	 */
	void enterBitorRule(@NotNull PJParser.BitorRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#bitorRule}.
	 * @param ctx the parse tree
	 */
	void exitBitorRule(@NotNull PJParser.BitorRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull PJParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull PJParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull PJParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull PJParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull PJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull PJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull PJParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull PJParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(@NotNull PJParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#ifRule}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(@NotNull PJParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull PJParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull PJParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#questionRule}.
	 * @param ctx the parse tree
	 */
	void enterQuestionRule(@NotNull PJParser.QuestionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#questionRule}.
	 * @param ctx the parse tree
	 */
	void exitQuestionRule(@NotNull PJParser.QuestionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull PJParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull PJParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull PJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull PJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#floatRule}.
	 * @param ctx the parse tree
	 */
	void enterFloatRule(@NotNull PJParser.FloatRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#floatRule}.
	 * @param ctx the parse tree
	 */
	void exitFloatRule(@NotNull PJParser.FloatRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#gotoRule}.
	 * @param ctx the parse tree
	 */
	void enterGotoRule(@NotNull PJParser.GotoRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#gotoRule}.
	 * @param ctx the parse tree
	 */
	void exitGotoRule(@NotNull PJParser.GotoRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull PJParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull PJParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull PJParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull PJParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull PJParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull PJParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(@NotNull PJParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(@NotNull PJParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#rbrackRule}.
	 * @param ctx the parse tree
	 */
	void enterRbrackRule(@NotNull PJParser.RbrackRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#rbrackRule}.
	 * @param ctx the parse tree
	 */
	void exitRbrackRule(@NotNull PJParser.RbrackRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#assignRule}.
	 * @param ctx the parse tree
	 */
	void enterAssignRule(@NotNull PJParser.AssignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#assignRule}.
	 * @param ctx the parse tree
	 */
	void exitAssignRule(@NotNull PJParser.AssignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull PJParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull PJParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull PJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull PJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#doRule}.
	 * @param ctx the parse tree
	 */
	void enterDoRule(@NotNull PJParser.DoRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#doRule}.
	 * @param ctx the parse tree
	 */
	void exitDoRule(@NotNull PJParser.DoRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#tryRule}.
	 * @param ctx the parse tree
	 */
	void enterTryRule(@NotNull PJParser.TryRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#tryRule}.
	 * @param ctx the parse tree
	 */
	void exitTryRule(@NotNull PJParser.TryRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#mulRule}.
	 * @param ctx the parse tree
	 */
	void enterMulRule(@NotNull PJParser.MulRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#mulRule}.
	 * @param ctx the parse tree
	 */
	void exitMulRule(@NotNull PJParser.MulRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull PJParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull PJParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#commaRule}.
	 * @param ctx the parse tree
	 */
	void enterCommaRule(@NotNull PJParser.CommaRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#commaRule}.
	 * @param ctx the parse tree
	 */
	void exitCommaRule(@NotNull PJParser.CommaRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#privateRule}.
	 * @param ctx the parse tree
	 */
	void enterPrivateRule(@NotNull PJParser.PrivateRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#privateRule}.
	 * @param ctx the parse tree
	 */
	void exitPrivateRule(@NotNull PJParser.PrivateRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull PJParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull PJParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#publicRule}.
	 * @param ctx the parse tree
	 */
	void enterPublicRule(@NotNull PJParser.PublicRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#publicRule}.
	 * @param ctx the parse tree
	 */
	void exitPublicRule(@NotNull PJParser.PublicRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull PJParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull PJParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull PJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull PJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#pj}.
	 * @param ctx the parse tree
	 */
	void enterPj(@NotNull PJParser.PjContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#pj}.
	 * @param ctx the parse tree
	 */
	void exitPj(@NotNull PJParser.PjContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull PJParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull PJParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#lbrackRule}.
	 * @param ctx the parse tree
	 */
	void enterLbrackRule(@NotNull PJParser.LbrackRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#lbrackRule}.
	 * @param ctx the parse tree
	 */
	void exitLbrackRule(@NotNull PJParser.LbrackRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#catchDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCatchDeclaration(@NotNull PJParser.CatchDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#catchDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCatchDeclaration(@NotNull PJParser.CatchDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull PJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull PJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull PJParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull PJParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#finallyRule}.
	 * @param ctx the parse tree
	 */
	void enterFinallyRule(@NotNull PJParser.FinallyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#finallyRule}.
	 * @param ctx the parse tree
	 */
	void exitFinallyRule(@NotNull PJParser.FinallyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#voidRule}.
	 * @param ctx the parse tree
	 */
	void enterVoidRule(@NotNull PJParser.VoidRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#voidRule}.
	 * @param ctx the parse tree
	 */
	void exitVoidRule(@NotNull PJParser.VoidRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PJParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PJParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#caseRule}.
	 * @param ctx the parse tree
	 */
	void enterCaseRule(@NotNull PJParser.CaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#caseRule}.
	 * @param ctx the parse tree
	 */
	void exitCaseRule(@NotNull PJParser.CaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#intRule}.
	 * @param ctx the parse tree
	 */
	void enterIntRule(@NotNull PJParser.IntRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#intRule}.
	 * @param ctx the parse tree
	 */
	void exitIntRule(@NotNull PJParser.IntRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#abstractRule}.
	 * @param ctx the parse tree
	 */
	void enterAbstractRule(@NotNull PJParser.AbstractRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#abstractRule}.
	 * @param ctx the parse tree
	 */
	void exitAbstractRule(@NotNull PJParser.AbstractRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#breakRule}.
	 * @param ctx the parse tree
	 */
	void enterBreakRule(@NotNull PJParser.BreakRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#breakRule}.
	 * @param ctx the parse tree
	 */
	void exitBreakRule(@NotNull PJParser.BreakRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull PJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull PJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(@NotNull PJParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(@NotNull PJParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#div_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterDiv_assignRule(@NotNull PJParser.Div_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#div_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitDiv_assignRule(@NotNull PJParser.Div_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDeclarationNoNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationNoNL(@NotNull PJParser.MemberDeclarationNoNLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDeclarationNoNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationNoNL(@NotNull PJParser.MemberDeclarationNoNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull PJParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull PJParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull PJParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull PJParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull PJParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull PJParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#longRule}.
	 * @param ctx the parse tree
	 */
	void enterLongRule(@NotNull PJParser.LongRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#longRule}.
	 * @param ctx the parse tree
	 */
	void exitLongRule(@NotNull PJParser.LongRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull PJParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull PJParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull PJParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull PJParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#nativeRule}.
	 * @param ctx the parse tree
	 */
	void enterNativeRule(@NotNull PJParser.NativeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#nativeRule}.
	 * @param ctx the parse tree
	 */
	void exitNativeRule(@NotNull PJParser.NativeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#orRule}.
	 * @param ctx the parse tree
	 */
	void enterOrRule(@NotNull PJParser.OrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#orRule}.
	 * @param ctx the parse tree
	 */
	void exitOrRule(@NotNull PJParser.OrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#testingRule}.
	 * @param ctx the parse tree
	 */
	void enterTestingRule(@NotNull PJParser.TestingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#testingRule}.
	 * @param ctx the parse tree
	 */
	void exitTestingRule(@NotNull PJParser.TestingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull PJParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull PJParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enumRule}.
	 * @param ctx the parse tree
	 */
	void enterEnumRule(@NotNull PJParser.EnumRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enumRule}.
	 * @param ctx the parse tree
	 */
	void exitEnumRule(@NotNull PJParser.EnumRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull PJParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull PJParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#catchRule}.
	 * @param ctx the parse tree
	 */
	void enterCatchRule(@NotNull PJParser.CatchRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#catchRule}.
	 * @param ctx the parse tree
	 */
	void exitCatchRule(@NotNull PJParser.CatchRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#assertRule}.
	 * @param ctx the parse tree
	 */
	void enterAssertRule(@NotNull PJParser.AssertRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#assertRule}.
	 * @param ctx the parse tree
	 */
	void exitAssertRule(@NotNull PJParser.AssertRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PJParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PJParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#throwsRule}.
	 * @param ctx the parse tree
	 */
	void enterThrowsRule(@NotNull PJParser.ThrowsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#throwsRule}.
	 * @param ctx the parse tree
	 */
	void exitThrowsRule(@NotNull PJParser.ThrowsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull PJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull PJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull PJParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull PJParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull PJParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull PJParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull PJParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull PJParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#incRule}.
	 * @param ctx the parse tree
	 */
	void enterIncRule(@NotNull PJParser.IncRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#incRule}.
	 * @param ctx the parse tree
	 */
	void exitIncRule(@NotNull PJParser.IncRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull PJParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull PJParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#ellipsisRule}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisRule(@NotNull PJParser.EllipsisRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#ellipsisRule}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisRule(@NotNull PJParser.EllipsisRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull PJParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull PJParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull PJParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull PJParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull PJParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull PJParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull PJParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull PJParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull PJParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull PJParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#shortRule}.
	 * @param ctx the parse tree
	 */
	void enterShortRule(@NotNull PJParser.ShortRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#shortRule}.
	 * @param ctx the parse tree
	 */
	void exitShortRule(@NotNull PJParser.ShortRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull PJParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull PJParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#transientRule}.
	 * @param ctx the parse tree
	 */
	void enterTransientRule(@NotNull PJParser.TransientRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#transientRule}.
	 * @param ctx the parse tree
	 */
	void exitTransientRule(@NotNull PJParser.TransientRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#lshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterLshift_assignRule(@NotNull PJParser.Lshift_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#lshift_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitLshift_assignRule(@NotNull PJParser.Lshift_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull PJParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull PJParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#elseRule}.
	 * @param ctx the parse tree
	 */
	void enterElseRule(@NotNull PJParser.ElseRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#elseRule}.
	 * @param ctx the parse tree
	 */
	void exitElseRule(@NotNull PJParser.ElseRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull PJParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull PJParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull PJParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull PJParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#synchronizedRule}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedRule(@NotNull PJParser.SynchronizedRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#synchronizedRule}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedRule(@NotNull PJParser.SynchronizedRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commalessStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommalessStatement(@NotNull PJParser.CommalessStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commalessStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommalessStatement(@NotNull PJParser.CommalessStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#lbraceRule}.
	 * @param ctx the parse tree
	 */
	void enterLbraceRule(@NotNull PJParser.LbraceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#lbraceRule}.
	 * @param ctx the parse tree
	 */
	void exitLbraceRule(@NotNull PJParser.LbraceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull PJParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull PJParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#sub_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterSub_assignRule(@NotNull PJParser.Sub_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#sub_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitSub_assignRule(@NotNull PJParser.Sub_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#finalRule}.
	 * @param ctx the parse tree
	 */
	void enterFinalRule(@NotNull PJParser.FinalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#finalRule}.
	 * @param ctx the parse tree
	 */
	void exitFinalRule(@NotNull PJParser.FinalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull PJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull PJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull PJParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull PJParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#staticRule}.
	 * @param ctx the parse tree
	 */
	void enterStaticRule(@NotNull PJParser.StaticRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#staticRule}.
	 * @param ctx the parse tree
	 */
	void exitStaticRule(@NotNull PJParser.StaticRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#and_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterAnd_assignRule(@NotNull PJParser.And_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#and_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitAnd_assignRule(@NotNull PJParser.And_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#decRule}.
	 * @param ctx the parse tree
	 */
	void enterDecRule(@NotNull PJParser.DecRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#decRule}.
	 * @param ctx the parse tree
	 */
	void exitDecRule(@NotNull PJParser.DecRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#semiRule}.
	 * @param ctx the parse tree
	 */
	void enterSemiRule(@NotNull PJParser.SemiRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#semiRule}.
	 * @param ctx the parse tree
	 */
	void exitSemiRule(@NotNull PJParser.SemiRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull PJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull PJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull PJParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull PJParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#implementsRule}.
	 * @param ctx the parse tree
	 */
	void enterImplementsRule(@NotNull PJParser.ImplementsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#implementsRule}.
	 * @param ctx the parse tree
	 */
	void exitImplementsRule(@NotNull PJParser.ImplementsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#thisRule}.
	 * @param ctx the parse tree
	 */
	void enterThisRule(@NotNull PJParser.ThisRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#thisRule}.
	 * @param ctx the parse tree
	 */
	void exitThisRule(@NotNull PJParser.ThisRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull PJParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull PJParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull PJParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull PJParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull PJParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull PJParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull PJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull PJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull PJParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull PJParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#rparenRule}.
	 * @param ctx the parse tree
	 */
	void enterRparenRule(@NotNull PJParser.RparenRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#rparenRule}.
	 * @param ctx the parse tree
	 */
	void exitRparenRule(@NotNull PJParser.RparenRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#add_assignRule}.
	 * @param ctx the parse tree
	 */
	void enterAdd_assignRule(@NotNull PJParser.Add_assignRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#add_assignRule}.
	 * @param ctx the parse tree
	 */
	void exitAdd_assignRule(@NotNull PJParser.Add_assignRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull PJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull PJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull PJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull PJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull PJParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull PJParser.LiteralContext ctx);
}