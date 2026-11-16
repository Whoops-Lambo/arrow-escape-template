package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 4;
    private static final d0 DEFAULT_INSTANCE;
    public static final int INTERSTITIAL_FIELD_NUMBER = 1;
    public static final int MREC_FIELD_NUMBER = 3;
    public static final int NATIVE_FIELD_NUMBER = 5;
    private static volatile Parser<d0> PARSER = null;
    public static final int REWARDED_FIELD_NUMBER = 2;
    private int banner_;
    private int interstitial_;
    private int mrec_;
    private int native_;
    private int rewarded_;

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        GeneratedMessageLite.registerDefaultInstance(d0.class, d0Var);
    }

    public static void a(d0 d0Var, int i) {
        d0Var.banner_ = i;
    }

    public static void b(d0 d0Var, int i) {
        d0Var.interstitial_ = i;
    }

    public static void c(d0 d0Var, int i) {
        d0Var.mrec_ = i;
    }

    public static void d(d0 d0Var, int i) {
        d0Var.native_ = i;
    }

    public static void e(d0 d0Var, int i) {
        d0Var.rewarded_ = i;
    }

    public static c0 g() {
        return (c0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new c0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<d0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (d0.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            default:
                defpackage.d.c();
            case 7:
                return null;
        }
    }
}
