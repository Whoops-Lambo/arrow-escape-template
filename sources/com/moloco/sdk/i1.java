package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AB_FIELD_NUMBER = 10;
    public static final int AD_FORMAT_FIELD_NUMBER = 2;
    public static final int AUCTION_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    public static final int CREATIVE_ID_FIELD_NUMBER = 14;
    private static final i1 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_CPM_FIELD_NUMBER = 13;
    public static final int INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int INSTANCE_NAME_FIELD_NUMBER = 4;
    public static final int LIFETIME_REVENUE_FIELD_NUMBER = 12;
    public static final int NETWORK_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<i1> PARSER = null;
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PRECISION_FIELD_NUMBER = 9;
    public static final int REVENUE_FIELD_NUMBER = 8;
    public static final int SEGMENT_NAME_FIELD_NUMBER = 11;
    private double lifetimeRevenue_;
    private double revenue_;
    private String auctionId_ = "";
    private String adFormat_ = "";
    private String networkName_ = "";
    private String instanceName_ = "";
    private String instanceId_ = "";
    private String countryCode_ = "";
    private String placement_ = "";
    private String precision_ = "";
    private String ab_ = "";
    private String segmentName_ = "";
    private String encryptedCpm_ = "";
    private String creativeId_ = "";

    static {
        i1 i1Var = new i1();
        DEFAULT_INSTANCE = i1Var;
        GeneratedMessageLite.registerDefaultInstance(i1.class, i1Var);
    }

    public static void l(i1 i1Var, double d) {
        i1Var.revenue_ = d;
    }

    public static h1 p() {
        return (h1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i1();
            case 2:
                return new h1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0000\tȈ\nȈ\u000bȈ\f\u0000\rȈ\u000eȈ", new Object[]{"auctionId_", "adFormat_", "networkName_", "instanceName_", "instanceId_", "countryCode_", "placement_", "revenue_", "precision_", "ab_", "segmentName_", "lifetimeRevenue_", "encryptedCpm_", "creativeId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (i1.class) {
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

    public final String o() {
        return this.adFormat_;
    }

    public static void a(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.ab_ = str;
    }

    public static void b(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.adFormat_ = str;
    }

    public static void c(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.auctionId_ = str;
    }

    public static void d(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.countryCode_ = str;
    }

    public static void e(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.creativeId_ = str;
    }

    public static void f(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.encryptedCpm_ = str;
    }

    public static void g(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.instanceId_ = str;
    }

    public static void h(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.instanceName_ = str;
    }

    public static void i(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.networkName_ = str;
    }

    public static void j(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.placement_ = str;
    }

    public static void k(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.precision_ = str;
    }

    public static void m(i1 i1Var, String str) {
        i1Var.getClass();
        i1Var.segmentName_ = str;
    }
}
