package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class n0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final n0 DEFAULT_INSTANCE;
    public static final int INITIALIZED_FIELD_NUMBER = 1;
    private static volatile Parser<n0> PARSER;
    private int bitField0_;
    private boolean initialized_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        GeneratedMessageLite.registerDefaultInstance(n0.class, n0Var);
    }

    public static void a(n0 n0Var, boolean z) {
        n0Var.bitField0_ |= 1;
        n0Var.initialized_ = z;
    }

    public static m0 c() {
        return (m0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return new m0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "initialized_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (n0.class) {
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
