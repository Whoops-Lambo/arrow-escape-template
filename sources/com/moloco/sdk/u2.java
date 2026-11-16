package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class u2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
    private static final u2 DEFAULT_INSTANCE;
    private static volatile Parser<u2> PARSER;
    private int bitField0_;
    private int clientFailureType_;

    static {
        u2 u2Var = new u2();
        DEFAULT_INSTANCE = u2Var;
        GeneratedMessageLite.registerDefaultInstance(u2.class, u2Var);
    }

    public static s2 c() {
        return (s2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u2();
            case 2:
                return new s2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<u2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (u2.class) {
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

    public static void a(u2 u2Var, t2 t2Var) {
        u2Var.getClass();
        u2Var.clientFailureType_ = t2Var.getNumber();
        u2Var.bitField0_ |= 1;
    }
}
