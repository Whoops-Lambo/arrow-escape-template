package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c4 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final c4 DEFAULT_INSTANCE;
    public static final int H_FIELD_NUMBER = 2;
    private static volatile Parser<c4> PARSER = null;
    public static final int W_FIELD_NUMBER = 1;
    private float h_;
    private float w_;

    static {
        c4 c4Var = new c4();
        DEFAULT_INSTANCE = c4Var;
        GeneratedMessageLite.registerDefaultInstance(c4.class, c4Var);
    }

    public static void a(c4 c4Var, float f) {
        c4Var.h_ = f;
    }

    public static void b(c4 c4Var, float f) {
        c4Var.w_ = f;
    }

    public static b4 d() {
        return (b4) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c4();
            case 2:
                return new b4(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c4> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (c4.class) {
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
