package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final p0 DEFAULT_INSTANCE;
    public static final int JSON_CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<p0> PARSER;
    private int bitField0_;
    private String jsonConfig_ = "";

    static {
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        GeneratedMessageLite.registerDefaultInstance(p0.class, p0Var);
    }

    public static o0 c() {
        return (o0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p0();
            case 2:
                return new o0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "jsonConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (p0.class) {
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

    public static void a(p0 p0Var, String str) {
        p0Var.getClass();
        str.getClass();
        p0Var.bitField0_ |= 1;
        p0Var.jsonConfig_ = str;
    }
}
