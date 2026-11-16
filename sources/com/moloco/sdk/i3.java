package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BG_TS_MS_FIELD_NUMBER = 1;
    private static final i3 DEFAULT_INSTANCE;
    private static volatile Parser<i3> PARSER;
    private long bgTsMs_;

    static {
        i3 i3Var = new i3();
        DEFAULT_INSTANCE = i3Var;
        GeneratedMessageLite.registerDefaultInstance(i3.class, i3Var);
    }

    public static void a(i3 i3Var, long j) {
        i3Var.bgTsMs_ = j;
    }

    public static h3 c() {
        return (h3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i3();
            case 2:
                return new h3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i3> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (i3.class) {
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
