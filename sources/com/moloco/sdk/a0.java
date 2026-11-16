package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final a0 DEFAULT_INSTANCE;
    private static volatile Parser<a0> PARSER = null;
    public static final int UTCOFFSET_FIELD_NUMBER = 1;
    private int bitField0_;
    private int utcoffset_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        GeneratedMessageLite.registerDefaultInstance(a0.class, a0Var);
    }

    public static void a(a0 a0Var, int i) {
        a0Var.bitField0_ |= 1;
        a0Var.utcoffset_ = i;
    }

    public static z c() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new z(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "utcoffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<a0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (a0.class) {
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
