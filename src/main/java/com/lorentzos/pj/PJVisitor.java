// Generated from /Users/Dionysis_Lorentzos/Projects/untitled1/PJ Grammar/PJ.g4 by ANTLR 4.4.1-dev

package com.lorentzos.pj;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PJVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PJParser#equalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualRule(@NotNull PJParser.EqualRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull PJParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#rshift_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRshift_assignRule(@NotNull PJParser.Rshift_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#mul_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_assignRule(@NotNull PJParser.Mul_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull PJParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#throwRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowRule(@NotNull PJParser.ThrowRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#byteRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteRule(@NotNull PJParser.ByteRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull PJParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull PJParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#forRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRule(@NotNull PJParser.ForRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#xor_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_assignRule(@NotNull PJParser.Xor_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(@NotNull PJParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull PJParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#continueRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueRule(@NotNull PJParser.ContinueRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#gtRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtRule(@NotNull PJParser.GtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#bitandRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitandRule(@NotNull PJParser.BitandRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#geRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeRule(@NotNull PJParser.GeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(@NotNull PJParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull PJParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull PJParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#defaultRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultRule(@NotNull PJParser.DefaultRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#lparenRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparenRule(@NotNull PJParser.LparenRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#volatileRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVolatileRule(@NotNull PJParser.VolatileRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#tildeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeRule(@NotNull PJParser.TildeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull PJParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#caretRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaretRule(@NotNull PJParser.CaretRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull PJParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassRule(@NotNull PJParser.ClassRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(@NotNull PJParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull PJParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleBlockStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBlockStatement(@NotNull PJParser.SimpleBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull PJParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#addRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddRule(@NotNull PJParser.AddRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull PJParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierStament}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierStament(@NotNull PJParser.IdentifierStamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#switchRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRule(@NotNull PJParser.SwitchRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#subRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRule(@NotNull PJParser.SubRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#charRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharRule(@NotNull PJParser.CharRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull PJParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#booleanRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanRule(@NotNull PJParser.BooleanRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#newRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewRule(@NotNull PJParser.NewRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#andRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndRule(@NotNull PJParser.AndRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#importRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRule(@NotNull PJParser.ImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull PJParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull PJParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceRule(@NotNull PJParser.InterfaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull PJParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(@NotNull PJParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#identifierRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierRule(@NotNull PJParser.IdentifierRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#bangRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangRule(@NotNull PJParser.BangRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull PJParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull PJParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PJParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(@NotNull PJParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull PJParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#whileRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileRule(@NotNull PJParser.WhileRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#packageRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageRule(@NotNull PJParser.PackageRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#dotRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotRule(@NotNull PJParser.DotRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#divRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivRule(@NotNull PJParser.DivRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull PJParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(@NotNull PJParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#rbraceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbraceRule(@NotNull PJParser.RbraceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#urshift_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrshift_assignRule(@NotNull PJParser.Urshift_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstRule(@NotNull PJParser.ConstRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull PJParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#instanceofRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofRule(@NotNull PJParser.InstanceofRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationNL(@NotNull PJParser.MemberDeclarationNLContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull PJParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull PJParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(@NotNull PJParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#doubleRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleRule(@NotNull PJParser.DoubleRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#leRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeRule(@NotNull PJParser.LeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#or_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_assignRule(@NotNull PJParser.Or_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#modRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModRule(@NotNull PJParser.ModRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull PJParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull PJParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull PJParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull PJParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull PJParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#statementsCommaless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsCommaless(@NotNull PJParser.StatementsCommalessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull PJParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull PJParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull PJParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#protectedRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedRule(@NotNull PJParser.ProtectedRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#notEqualRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualRule(@NotNull PJParser.NotEqualRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(@NotNull PJParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(@NotNull PJParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#mod_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_assignRule(@NotNull PJParser.Mod_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull PJParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#superRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperRule(@NotNull PJParser.SuperRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#extendsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsRule(@NotNull PJParser.ExtendsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#ltRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtRule(@NotNull PJParser.LtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull PJParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull PJParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#colonRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonRule(@NotNull PJParser.ColonRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#returnRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(@NotNull PJParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull PJParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#strictfpRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictfpRule(@NotNull PJParser.StrictfpRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#bitorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitorRule(@NotNull PJParser.BitorRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull PJParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull PJParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(@NotNull PJParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull PJParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#ifRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(@NotNull PJParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(@NotNull PJParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#questionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionRule(@NotNull PJParser.QuestionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(@NotNull PJParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(@NotNull PJParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#floatRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatRule(@NotNull PJParser.FloatRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#gotoRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoRule(@NotNull PJParser.GotoRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull PJParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull PJParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull PJParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(@NotNull PJParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#rbrackRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbrackRule(@NotNull PJParser.RbrackRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRule(@NotNull PJParser.AssignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull PJParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(@NotNull PJParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#doRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoRule(@NotNull PJParser.DoRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#tryRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryRule(@NotNull PJParser.TryRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#mulRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulRule(@NotNull PJParser.MulRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull PJParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#commaRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaRule(@NotNull PJParser.CommaRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#privateRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateRule(@NotNull PJParser.PrivateRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(@NotNull PJParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#publicRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicRule(@NotNull PJParser.PublicRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull PJParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(@NotNull PJParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#pj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPj(@NotNull PJParser.PjContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull PJParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#lbrackRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbrackRule(@NotNull PJParser.LbrackRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#catchDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchDeclaration(@NotNull PJParser.CatchDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull PJParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull PJParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#finallyRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyRule(@NotNull PJParser.FinallyRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#voidRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidRule(@NotNull PJParser.VoidRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PJParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#caseRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseRule(@NotNull PJParser.CaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#intRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntRule(@NotNull PJParser.IntRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#abstractRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractRule(@NotNull PJParser.AbstractRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#breakRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakRule(@NotNull PJParser.BreakRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(@NotNull PJParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(@NotNull PJParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#div_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_assignRule(@NotNull PJParser.Div_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationNoNL}
	 * labeled alternative in {@link PJParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationNoNL(@NotNull PJParser.MemberDeclarationNoNLContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(@NotNull PJParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull PJParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull PJParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#longRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongRule(@NotNull PJParser.LongRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull PJParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(@NotNull PJParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#nativeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeRule(@NotNull PJParser.NativeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#orRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrRule(@NotNull PJParser.OrRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#testingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestingRule(@NotNull PJParser.TestingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull PJParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enumRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumRule(@NotNull PJParser.EnumRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull PJParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#catchRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchRule(@NotNull PJParser.CatchRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#assertRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertRule(@NotNull PJParser.AssertRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull PJParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#throwsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsRule(@NotNull PJParser.ThrowsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull PJParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(@NotNull PJParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(@NotNull PJParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(@NotNull PJParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#incRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncRule(@NotNull PJParser.IncRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull PJParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#ellipsisRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsisRule(@NotNull PJParser.EllipsisRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull PJParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(@NotNull PJParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(@NotNull PJParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(@NotNull PJParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull PJParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#shortRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortRule(@NotNull PJParser.ShortRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(@NotNull PJParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#transientRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransientRule(@NotNull PJParser.TransientRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#lshift_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLshift_assignRule(@NotNull PJParser.Lshift_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull PJParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#elseRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseRule(@NotNull PJParser.ElseRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull PJParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull PJParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#synchronizedRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedRule(@NotNull PJParser.SynchronizedRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commalessStatement}
	 * labeled alternative in {@link PJParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommalessStatement(@NotNull PJParser.CommalessStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#lbraceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbraceRule(@NotNull PJParser.LbraceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull PJParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#sub_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_assignRule(@NotNull PJParser.Sub_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#finalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalRule(@NotNull PJParser.FinalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull PJParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull PJParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#staticRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticRule(@NotNull PJParser.StaticRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#and_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_assignRule(@NotNull PJParser.And_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#decRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecRule(@NotNull PJParser.DecRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#semiRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemiRule(@NotNull PJParser.SemiRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(@NotNull PJParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull PJParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#implementsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsRule(@NotNull PJParser.ImplementsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#thisRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisRule(@NotNull PJParser.ThisRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull PJParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull PJParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull PJParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(@NotNull PJParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(@NotNull PJParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#rparenRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparenRule(@NotNull PJParser.RparenRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#add_assignRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_assignRule(@NotNull PJParser.Add_assignRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull PJParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(@NotNull PJParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PJParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull PJParser.LiteralContext ctx);
}