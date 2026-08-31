/*
 * Decompiled with CFR 0.152.
 */
package j\u0435a\u0435ca;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import r.d8.Cade0e18b60fd9f037d8b2fc8;

public final class xjee\u04bb
extends Enum<xjee\u04bb> {
    public static final /* synthetic */ /* enum */ xjee\u04bb \u0458i\u0456e;
    public static final /* synthetic */ /* enum */ xjee\u04bb x\u043ec\u0441;
    private final /* synthetic */ String c\u04bb\u0445jx;
    private static final /* synthetic */ xjee\u04bb[] s\u043e\u0435\u043ea;

    public static /* synthetic */ xjee\u04bb[] values() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (xjee\u04bb[])s\u043e\u0435\u043ea.clone();
    }

    public static /* synthetic */ xjee\u04bb valueOf(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (xjee\u04bb)((Object)xjee\u04bb.a_bsm0("valueOf", valueOf(java.lang.Class<T> java.lang.String ), xjee\u04bb.class, (String)string));
    }

    private xjee\u04bb(String string2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.c\u04bb\u0445jx = string2;
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ xjee\u04bb fromString(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public /* synthetic */ String toString() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.c\u04bb\u0445jx;
    }

    private static /* synthetic */ xjee\u04bb[] $values() {
        if (true | false) {
        }
        return new xjee\u04bb[]{\u0458i\u0456e, x\u043ec\u0441};
    }

    static {
        \u0458i\u0456e = new xjee\u04bb(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-423322295 + 423322197, -1342776128 + 1342776194, -2038920983 + 2038920881}, 702822490 + 62911817, -457366481 + 145344823));
        x\u043ec\u0441 = new xjee\u04bb(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-1904703447 + 1904703474, -1647083582 + 1647083645, -625474876 + 625474938}, -177717414 + 795272564, -1688757342 + 1403147095));
        s\u043e\u0435\u043ea = xjee\u04bb.$values();
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

