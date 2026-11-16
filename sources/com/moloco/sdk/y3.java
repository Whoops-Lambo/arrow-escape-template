package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CARRIER_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
    private static final y3 DEFAULT_INSTANCE;
    private static volatile Parser<y3> PARSER;
    private String carrier_ = "";
    private int connectionType_;

    static {
        y3 y3Var = new y3();
        DEFAULT_INSTANCE = y3Var;
        GeneratedMessageLite.registerDefaultInstance(y3.class, y3Var);
    }

    public static w3 d() {
        return (w3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new y3();
            case 2:
                return new w3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y3> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (y3.class) {
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

    public static void a(y3 y3Var, String str) {
        y3Var.getClass();
        y3Var.carrier_ = str;
    }

    public static void b(y3 y3Var, x3 x3Var) {
        y3Var.getClass();
        y3Var.connectionType_ = x3Var.getNumber();
    }
}
