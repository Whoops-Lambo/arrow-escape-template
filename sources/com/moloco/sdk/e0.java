package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final e0 DEFAULT_INSTANCE;
    public static final int IMP_COUNTS_FIELD_NUMBER = 4;
    public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
    private static volatile Parser<e0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_START_TS_FIELD_NUMBER = 3;
    private d0 impCounts_;
    private long lastImpTs_;
    private String sessionId_ = "";
    private long sessionStartTs_;

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        GeneratedMessageLite.registerDefaultInstance(e0.class, e0Var);
    }

    public static void b(e0 e0Var, long j) {
        e0Var.lastImpTs_ = j;
    }

    public static void d(e0 e0Var, long j) {
        e0Var.sessionStartTs_ = j;
    }

    public static b0 f() {
        return (b0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new b0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (e0.class) {
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

    public static void a(e0 e0Var, d0 d0Var) {
        e0Var.getClass();
        d0Var.getClass();
        e0Var.impCounts_ = d0Var;
    }

    public static void c(e0 e0Var, String str) {
        e0Var.getClass();
        str.getClass();
        e0Var.sessionId_ = str;
    }
}
