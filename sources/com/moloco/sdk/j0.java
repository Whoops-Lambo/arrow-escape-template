package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class j0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final j0 DEFAULT_INSTANCE;
    public static final int MCC_FIELD_NUMBER = 3;
    public static final int MNC_FIELD_NUMBER = 4;
    private static volatile Parser<j0> PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int mcc_;
    private int mnc_;
    private boolean restricted_;
    private int type_;

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        GeneratedMessageLite.registerDefaultInstance(j0.class, j0Var);
    }

    public static void a(j0 j0Var, int i) {
        j0Var.bitField0_ |= 4;
        j0Var.mcc_ = i;
    }

    public static void b(j0 j0Var, int i) {
        j0Var.bitField0_ |= 8;
        j0Var.mnc_ = i;
    }

    public static void c(j0 j0Var, boolean z) {
        j0Var.bitField0_ |= 2;
        j0Var.restricted_ = z;
    }

    public static h0 f() {
        return (h0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j0();
            case 2:
                return new h0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "type_", "restricted_", "mcc_", "mnc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (j0.class) {
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

    public static void d(j0 j0Var, i0 i0Var) {
        j0Var.getClass();
        j0Var.type_ = i0Var.getNumber();
        j0Var.bitField0_ |= 1;
    }
}
