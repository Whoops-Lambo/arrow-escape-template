package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class v3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ADAPTER_VER_FIELD_NUMBER = 2;
    public static final int CORE_VER_FIELD_NUMBER = 1;
    private static final v3 DEFAULT_INSTANCE;
    private static volatile Parser<v3> PARSER;
    private String coreVer_ = "";
    private String adapterVer_ = "";

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        GeneratedMessageLite.registerDefaultInstance(v3.class, v3Var);
    }

    public static u3 c() {
        return (u3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new v3();
            case 2:
                return new u3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<v3> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (v3.class) {
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

    public static void a(v3 v3Var) {
        v3Var.getClass();
        v3Var.coreVer_ = "4.12.0";
    }
}
