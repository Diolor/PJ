package com.lorentzos.pj;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by dionysis_lorentzos on 8/9/14.
 * Beware the dinosaurs!
 *
 *  The com.lorentzos.pj.RuleWrapperVisitor class is wrapper responsible when reaching a keyword to give back the keyword itself
 *
 */




public class RuleWrapperVisitor extends PJBaseVisitor<String> {

    
    @Override
    public String visitEqualRule(@NotNull PJParser.EqualRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitRshift_assignRule(@NotNull PJParser.Rshift_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMul_assignRule(@NotNull PJParser.Mul_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitThrowRule(@NotNull PJParser.ThrowRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitByteRule(@NotNull PJParser.ByteRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitForRule(@NotNull PJParser.ForRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitXor_assignRule(@NotNull PJParser.Xor_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitContinueRule(@NotNull PJParser.ContinueRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitGtRule(@NotNull PJParser.GtRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBitandRule(@NotNull PJParser.BitandRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitGeRule(@NotNull PJParser.GeRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDefaultRule(@NotNull PJParser.DefaultRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLparenRule(@NotNull PJParser.LparenRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVolatileRule(@NotNull PJParser.VolatileRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTildeRule(@NotNull PJParser.TildeRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCaretRule(@NotNull PJParser.CaretRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitClassRule(@NotNull PJParser.ClassRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAddRule(@NotNull PJParser.AddRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSwitchRule(@NotNull PJParser.SwitchRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSubRule(@NotNull PJParser.SubRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCharRule(@NotNull PJParser.CharRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBooleanRule(@NotNull PJParser.BooleanRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNewRule(@NotNull PJParser.NewRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAndRule(@NotNull PJParser.AndRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitImportRule(@NotNull PJParser.ImportRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitInterfaceRule(@NotNull PJParser.InterfaceRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBangRule(@NotNull PJParser.BangRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitWhileRule(@NotNull PJParser.WhileRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPackageRule(@NotNull PJParser.PackageRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDotRule(@NotNull PJParser.DotRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDivRule(@NotNull PJParser.DivRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitRbraceRule(@NotNull PJParser.RbraceRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitUrshift_assignRule(@NotNull PJParser.Urshift_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitConstRule(@NotNull PJParser.ConstRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitInstanceofRule(@NotNull PJParser.InstanceofRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNotEqualRule(@NotNull PJParser.NotEqualRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDoubleRule(@NotNull PJParser.DoubleRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLeRule(@NotNull PJParser.LeRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOr_assignRule(@NotNull PJParser.Or_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitModRule(@NotNull PJParser.ModRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitProtectedRule(@NotNull PJParser.ProtectedRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMod_assignRule(@NotNull PJParser.Mod_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSuperRule(@NotNull PJParser.SuperRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExtendsRule(@NotNull PJParser.ExtendsRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLtRule(@NotNull PJParser.LtRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColonRule(@NotNull PJParser.ColonRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitReturnRule(@NotNull PJParser.ReturnRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStrictfpRule(@NotNull PJParser.StrictfpRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBitorRule(@NotNull PJParser.BitorRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIfRule(@NotNull PJParser.IfRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitQuestionRule(@NotNull PJParser.QuestionRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFloatRule(@NotNull PJParser.FloatRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitGotoRule(@NotNull PJParser.GotoRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAtRule(@NotNull PJParser.AtRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitRbrackRule(@NotNull PJParser.RbrackRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAssignRule(@NotNull PJParser.AssignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDoRule(@NotNull PJParser.DoRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTryRule(@NotNull PJParser.TryRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMulRule(@NotNull PJParser.MulRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCommaRule(@NotNull PJParser.CommaRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPrivateRule(@NotNull PJParser.PrivateRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPublicRule(@NotNull PJParser.PublicRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLbrackRule(@NotNull PJParser.LbrackRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFinallyRule(@NotNull PJParser.FinallyRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVoidRule(@NotNull PJParser.VoidRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCaseRule(@NotNull PJParser.CaseRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIntRule(@NotNull PJParser.IntRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAbstractRule(@NotNull PJParser.AbstractRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBreakRule(@NotNull PJParser.BreakRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDiv_assignRule(@NotNull PJParser.Div_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLongRule(@NotNull PJParser.LongRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNativeRule(@NotNull PJParser.NativeRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOrRule(@NotNull PJParser.OrRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTestingRule(@NotNull PJParser.TestingRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitEnumRule(@NotNull PJParser.EnumRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCatchRule(@NotNull PJParser.CatchRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAssertRule(@NotNull PJParser.AssertRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitThrowsRule(@NotNull PJParser.ThrowsRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIncRule(@NotNull PJParser.IncRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitEllipsisRule(@NotNull PJParser.EllipsisRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitShortRule(@NotNull PJParser.ShortRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTransientRule(@NotNull PJParser.TransientRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLshift_assignRule(@NotNull PJParser.Lshift_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitElseRule(@NotNull PJParser.ElseRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSynchronizedRule(@NotNull PJParser.SynchronizedRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLbraceRule(@NotNull PJParser.LbraceRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSub_assignRule(@NotNull PJParser.Sub_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFinalRule(@NotNull PJParser.FinalRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStaticRule(@NotNull PJParser.StaticRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAnd_assignRule(@NotNull PJParser.And_assignRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDecRule(@NotNull PJParser.DecRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSemiRule(@NotNull PJParser.SemiRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitImplementsRule(@NotNull PJParser.ImplementsRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitThisRule(@NotNull PJParser.ThisRuleContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitRparenRule(@NotNull PJParser.RparenRuleContext ctx) {
        return ctx.getText();
    }
}
