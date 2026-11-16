package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class w extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BRAND_FIELD_NUMBER = 23;
    public static final int CARRIER_FIELD_NUMBER = 6;
    public static final int DBT_FIELD_NUMBER = 15;
    private static final w DEFAULT_INSTANCE;
    public static final int DEVICETYPE_FIELD_NUMBER = 7;
    public static final int GEO_FIELD_NUMBER = 9;
    public static final int HARDWARE_FIELD_NUMBER = 22;
    public static final int HAS_GY_FIELD_NUMBER = 17;
    public static final int HWV_FIELD_NUMBER = 5;
    public static final int H_FIELD_NUMBER = 11;
    public static final int JS_FIELD_NUMBER = 8;
    public static final int KB_LOC_FIELD_NUMBER = 18;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LOCALE_FIELD_NUMBER = 19;
    public static final int MAKE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 4;
    public static final int ORTN_FIELD_NUMBER = 16;
    public static final int OSV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 14;
    private static volatile Parser<w> PARSER = null;
    public static final int PPI_FIELD_NUMBER = 12;
    public static final int PXRATIO_FIELD_NUMBER = 13;
    public static final int W_FIELD_NUMBER = 10;
    public static final int XDPI_FIELD_NUMBER = 20;
    public static final int YDPI_FIELD_NUMBER = 21;
    private int bitField0_;
    private long dbt_;
    private int devicetype_;
    private a0 geo_;
    private int h_;
    private boolean hasGy_;
    private int js_;
    private int ortn_;
    private int ppi_;
    private double pxratio_;
    private int w_;
    private float xdpi_;
    private float ydpi_;
    private String language_ = "";
    private String osv_ = "";
    private String make_ = "";
    private String model_ = "";
    private String hwv_ = "";
    private String carrier_ = "";
    private String os_ = "";
    private String kbLoc_ = "";
    private String locale_ = "";
    private String hardware_ = "";
    private String brand_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        GeneratedMessageLite.registerDefaultInstance(w.class, wVar);
    }

    public static void c(w wVar, long j) {
        wVar.bitField0_ |= 16384;
        wVar.dbt_ = j;
    }

    public static void d(w wVar, int i) {
        wVar.bitField0_ |= 64;
        wVar.devicetype_ = i;
    }

    public static void f(w wVar, int i) {
        wVar.bitField0_ |= 1024;
        wVar.h_ = i;
    }

    public static void h(w wVar, boolean z) {
        wVar.bitField0_ |= 65536;
        wVar.hasGy_ = z;
    }

    public static void j(w wVar) {
        wVar.bitField0_ |= 128;
        wVar.js_ = 1;
    }

    public static void r(w wVar) {
        String str = Build.VERSION.RELEASE;
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= 2;
        wVar.osv_ = str;
    }

    public static void s(w wVar, int i) {
        wVar.bitField0_ |= 2048;
        wVar.ppi_ = i;
    }

    public static void t(w wVar, double d) {
        wVar.bitField0_ |= 4096;
        wVar.pxratio_ = d;
    }

    public static void u(w wVar, int i) {
        wVar.bitField0_ |= 512;
        wVar.w_ = i;
    }

    public static void v(w wVar, float f) {
        wVar.bitField0_ |= 524288;
        wVar.xdpi_ = f;
    }

    public static void w(w wVar, float f) {
        wVar.bitField0_ |= 1048576;
        wVar.ydpi_ = f;
    }

    public static u y() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new u(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<w> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (w.class) {
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

    public static void a(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 4194304;
        wVar.brand_ = str;
    }

    public static void b(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 32;
        wVar.carrier_ = str;
    }

    public static void e(w wVar, a0 a0Var) {
        wVar.getClass();
        a0Var.getClass();
        wVar.geo_ = a0Var;
        wVar.bitField0_ |= 256;
    }

    public static void g(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 2097152;
        wVar.hardware_ = str;
    }

    public static void i(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 16;
        wVar.hwv_ = str;
    }

    public static void k(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= 131072;
        wVar.kbLoc_ = str;
    }

    public static void l(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 1;
        wVar.language_ = str;
    }

    public static void m(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
        wVar.locale_ = str;
    }

    public static void n(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 4;
        wVar.make_ = str;
    }

    public static void o(w wVar, String str) {
        wVar.getClass();
        wVar.bitField0_ |= 8;
        wVar.model_ = str;
    }

    public static void p(w wVar, v vVar) {
        wVar.getClass();
        wVar.ortn_ = vVar.getNumber();
        wVar.bitField0_ |= 32768;
    }

    public static void q(w wVar) {
        wVar.getClass();
        wVar.bitField0_ |= 8192;
        wVar.os_ = "android";
    }
}
