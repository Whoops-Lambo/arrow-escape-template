package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CCPA_FIELD_NUMBER = 1;
    public static final int COPPA_FIELD_NUMBER = 3;
    private static final l0 DEFAULT_INSTANCE;
    public static final int GDPR_FIELD_NUMBER = 2;
    private static volatile Parser<l0> PARSER = null;
    public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
    public static final int US_PRIVACY_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean ccpa_;
    private boolean coppa_;
    private boolean gdpr_;
    private String usPrivacy_ = "";
    private String tcfConsentString_ = "";

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        GeneratedMessageLite.registerDefaultInstance(l0.class, l0Var);
    }

    public static void a(l0 l0Var, boolean z) {
        l0Var.bitField0_ |= 1;
        l0Var.ccpa_ = z;
    }

    public static void b(l0 l0Var, boolean z) {
        l0Var.bitField0_ |= 4;
        l0Var.coppa_ = z;
    }

    public static void c(l0 l0Var, boolean z) {
        l0Var.bitField0_ |= 2;
        l0Var.gdpr_ = z;
    }

    public static k0 g() {
        return (k0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return new k0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (l0.class) {
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

    public static void d(l0 l0Var, String str) {
        l0Var.getClass();
        l0Var.bitField0_ |= 16;
        l0Var.tcfConsentString_ = str;
    }

    public static void e(l0 l0Var, String str) {
        l0Var.getClass();
        str.getClass();
        l0Var.bitField0_ |= 8;
        l0Var.usPrivacy_ = str;
    }
}
