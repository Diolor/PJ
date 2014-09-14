package com.lorentzos.pj;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;

/**
 * Created by dionysis_lorentzos on 7/9/14.
 * Beware the dinosaurs!
 */


public class Visitor extends RuleWrapperVisitor {


    String appendSemi(ParserRuleContext ctx){
        return visitChildren(ctx)+";";
    }

    String appendSemiAndNewline(ParserRuleContext ctx){
        return visitChildren(ctx)+";\n";
    }

    String appendSemiAndDoubleNL(ParserRuleContext ctx){
        return visitChildren(ctx)+";\n\n";
    }

    String appendNewLine(ParserRuleContext ctx) {
        return visitChildren(ctx)+"\n";
    }

    String prependNewline(ParserRuleContext ctx) {
        return "\n"+visitChildren(ctx);
    }

    String wrapWithParenthesis(ParserRuleContext ctx){
        return "("+visitChildren(ctx)+")";
    }

    String appendSpace(ParserRuleContext ctx){
        return visitChildren(ctx)+" ";
    }

    String prependSpace(ParserRuleContext ctx){
        return " "+visitChildren(ctx);
    }

    String surroundBraces(ParserRuleContext ctx){
        return "{\n" + createIndent(visitChildren(ctx)) + "}\n";
    }

    String surroundBracesNewLine(ParserRuleContext ctx){
        return "{\n" + createIndent(visitChildren(ctx)) + "}\n\n";
    }

    String createIndent(String childResult) {
        String[] parts = childResult.split("\n");

        String result = "";
        for(String part: parts){
            result = result+ "\t" +part+"\n";
        }

        return result;
    }








    // Basics

    public String visitPackageDeclaration(@NotNull PJParser.PackageDeclarationContext ctx) {
        return appendSemiAndDoubleNL(ctx);
    }

    public String visitImportDeclaration(@NotNull PJParser.ImportDeclarationContext ctx) {
        return appendSemiAndNewline(ctx);
    }

    public String visitTypeDeclaration(@NotNull PJParser.TypeDeclarationContext ctx) {
        return prependNewline(ctx);
    }




    // Classes

    public String visitClassBody(@NotNull PJParser.ClassBodyContext ctx) {
        return surroundBraces(ctx);
    }

    public String visitMemberDeclarationNL(@NotNull PJParser.MemberDeclarationNLContext ctx) {
        return appendNewLine(ctx);
    }




    // Fields

    public String visitFieldDeclaration(@NotNull PJParser.FieldDeclarationContext ctx) {
        return appendSemiAndNewline(ctx);
    }


    // Anotations

    public String visitAnnotation(@NotNull PJParser.AnnotationContext ctx) {
        return appendNewLine(ctx);
    }



    // Blocks

    public String visitBlock(@NotNull PJParser.BlockContext ctx) {
        return surroundBraces(ctx);
    }





    // Statements

    public String visitStatementsCommaless(@NotNull PJParser.StatementsCommalessContext ctx) {
        return appendSemiAndNewline(ctx);
    }

    public String visitCatchDeclaration(@NotNull PJParser.CatchDeclarationContext ctx) {
        return wrapWithParenthesis(ctx);
    }

    public String visitCatchType(@NotNull PJParser.CatchTypeContext ctx) {
        return appendSpace(ctx);
    }

    public String visitForControl(@NotNull PJParser.ForControlContext ctx) {
        return wrapWithParenthesis(ctx);
    }

    public String visitParExpression(@NotNull PJParser.ParExpressionContext ctx) {
        return wrapWithParenthesis(ctx);
    }





    // Variables

//    public String visitVariableDeclaratorId(@NotNull PJParser.VariableDeclaratorIdContext ctx) {
//        return prependSpace(ctx);
//    }

    public String visitLocalVariableDeclaration(@NotNull PJParser.LocalVariableDeclarationContext ctx) {
        return appendSemiAndNewline(ctx);
    }


    // Types

    public String visitType(@NotNull PJParser.TypeContext ctx) { return appendSpace(ctx); }






    // End tokens - return text

    public String visitQualifiedName(@NotNull PJParser.QualifiedNameContext ctx) {
        return ctx.getText();
    }

    public String visitIdentifierRule(@NotNull PJParser.IdentifierRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLiteral(@NotNull PJParser.LiteralContext ctx) {
        return ctx.getText();
    }

    public String visitPrimitiveType(@NotNull PJParser.PrimitiveTypeContext ctx) {
        return ctx.getText();
    }





    protected String defaultResult() {
        return "";
    }

    protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate+nextResult;
    }





    public String visitTerminal(@NotNull TerminalNode node) {

        return defaultResult();
    }


}
