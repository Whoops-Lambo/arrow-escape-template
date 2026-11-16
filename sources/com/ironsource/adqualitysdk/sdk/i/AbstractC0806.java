package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.h50;
import defpackage.rl3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᑋ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0806 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2110;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2111 = StringFog.decrypt("eDUoaw==\n", "HVteRHBZFPo=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public String f2114;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f2115;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f2116;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f2117;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public boolean f2113 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean f2112 = true;

    static {
        StringFog.decrypt("a4jLRkWj9oA=\n", "AfukKGvGmOM=\n");
        StringFog.decrypt("9enNEqcMPW769ME=\n", "n5qifIlrR0A=\n");
        f2110 = StringFog.decrypt("xJCw\n", "pf7Uc968koQ=\n");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m615() {
        JSONObject jSONObject;
        String strDecrypt = StringFog.decrypt("mUF0JdCOzRLE\n", "6yQZSqTrqXA=\n");
        if (this.f2113) {
            C1082 c1082 = (C1082) AbstractC1081.m765();
            synchronized (c1082) {
                jSONObject = c1082.f2544;
            }
            String strOptString = jSONObject.optString(c1082.f3159);
            if (!TextUtils.isEmpty(strOptString)) {
                StringBuilder sbP = h50.p(strDecrypt);
                sbP.append(f2111);
                sbP.append(strOptString);
                return AbstractC1156.m868("lQ==\n", "ukS3YcD5adg=\n", sbP);
            }
        }
        return strDecrypt;
    }

    public AbstractC0806(String str, String str2, String str3, String str4) {
        this.f2117 = str;
        this.f2116 = str2;
        this.f2115 = str3;
        this.f2114 = str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m617(String str) {
        StringBuilder sbP = h50.p(m615());
        rl3.p(this.f2117, "yg==\n", sbP, "5RSRTdvvu0s=\n");
        String str2 = f2110;
        sbP.append(str2);
        StringBuilder sbM577 = AbstractC0688.m577("Qw==\n", "bCI3GBk6a/I=\n", sbP, str);
        sbM577.append(StringFog.decrypt("2g==\n", "9ecWsiYHkdo=\n"));
        sbM577.append(this.f2116);
        StringBuilder sbM578 = AbstractC0688.m577("Rw==\n", "ac9eTg8vKpA=\n", sbM577, str2);
        sbM578.append(StringFog.decrypt("vQ==\n", "kwcGcjV1zbI=\n"));
        rl3.p(this.f2115, "zg==\n", sbM578, "4L7V9jfpSAY=\n");
        sbM578.append(this.f2114);
        return sbM578.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo616() {
        StringBuilder sbP = h50.p(m615());
        rl3.p(this.f2117, "hg==\n", sbP, "qa6pqYPWqvQ=\n");
        rl3.p(this.f2116, "Ow==\n", sbP, "FeasRQ3Fb3c=\n");
        rl3.p(f2110, "6g==\n", sbP, "xHVlouUBgCg=\n");
        rl3.p(this.f2115, "Ew==\n", sbP, "PU9TWKlrQiI=\n");
        sbP.append(this.f2114);
        return sbP.toString();
    }
}
