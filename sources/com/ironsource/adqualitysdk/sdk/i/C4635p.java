package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4635p {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f424 = StringFog.decrypt("tsLB8V41VPmS+NX6TilH+4zC1vFf\n", "4quslC1BNZQ=\n");

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final int f425;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public long f426;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public long f427;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public long f428;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public long f429;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public Boolean f430 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m425(JSONObject jSONObject) {
        boolean z;
        long jOptLong;
        try {
            if (jSONObject.optInt(StringFog.decrypt("kACK\n", "42nuKP1r3Ng=\n"), 1) == this.f425 || Math.abs((this.f428 - this.f429) - (jSONObject.optLong(StringFog.decrypt("EJwv\n", "dOhcwwzng2A=\n")) - jSONObject.optLong(StringFog.decrypt("ERc=\n", "ZGOfvRKzpMQ=\n")))) <= 10) {
                long jOptLong2 = jSONObject.optLong(StringFog.decrypt("+xY=\n", "jmKEoyC71Do=\n")) + this.f427;
                jSONObject.put(StringFog.decrypt("y9p5\n", "vq4WTMP7E+k=\n"), this.f427);
                z = true;
                jOptLong = jOptLong2;
            } else {
                jOptLong = jSONObject.optLong(StringFog.decrypt("Fyzz\n", "c1iACEECEeA=\n")) + this.f426;
                jSONObject.put(StringFog.decrypt("8BWC\n", "hGbtkUjKmbE=\n"), this.f426);
                z = false;
            }
            jSONObject.put(AbstractC1219.f3710, jOptLong);
            if (!this.f430.booleanValue()) {
                jSONObject.put(StringFog.decrypt("4/yq\n", "l4/ZUxzKq3o=\n"), false);
            }
            m426(jSONObject, z);
            m427(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m427(JSONObject jSONObject, boolean z) {
        Long lValueOf;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StringFog.decrypt("ZCukXVeXTVVg\n", "CErXKQP4ODY=\n"));
            if (jSONObjectOptJSONObject != null) {
                if (z) {
                    long jOptLong = jSONObjectOptJSONObject.optLong(StringFog.decrypt("xg==\n", "s/UuWnBiWjg=\n"));
                    if (jOptLong > 0) {
                        lValueOf = Long.valueOf(jOptLong + this.f427);
                    } else {
                        lValueOf = null;
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(StringFog.decrypt("kg==\n", "5tPK7Xhow6A=\n"));
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f426);
                    } else {
                        lValueOf = null;
                    }
                }
                if (lValueOf != null) {
                    jSONObjectOptJSONObject.put(StringFog.decrypt("8Q==\n", "hVPeiXgCSyc=\n"), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public C4635p(int i) {
        this.f425 = i;
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        C4633o c4633o = new C4633o(this);
        C1082 c1082 = (C1082) abstractC1081M765;
        Handler handler = c1082.f3131;
        if (handler != null) {
            handler.post(new C1135(c1082, c4633o));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m428(JSONObject jSONObject) {
        if (!jSONObject.has(StringFog.decrypt("vqhq\n", "y9wF6tpBQdI=\n")) && !jSONObject.has(StringFog.decrypt("dm0U\n", "Ah57pr5yqCI=\n")) && this.f430 != null) {
            try {
                m425(jSONObject);
                return true;
            } catch (Exception e) {
                AbstractC1290.m905(f424, StringFog.decrypt("cBG8cmS6M1ZbAKZvefQpVVwNqT1z7CVBQQ==\n", "NWPOHRaaQC8=\n"), (Throwable) e, false);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m426(JSONObject jSONObject, boolean z) {
        long jOptLong;
        long j;
        if (jSONObject.has(StringFog.decrypt("XKbw\n", "L9KDJoUhkQM=\n"))) {
            if (z) {
                jOptLong = jSONObject.optLong(StringFog.decrypt("MDQz\n", "Q0FH9MwuF98=\n"));
                j = this.f427;
            } else {
                jOptLong = jSONObject.optLong(StringFog.decrypt("oleN\n", "0SP+A2U+rV4=\n"));
                j = this.f426;
            }
            try {
                jSONObject.put(StringFog.decrypt("rbAx\n", "3sRCWAPB6Ys=\n"), jOptLong + j);
            } catch (JSONException unused) {
            }
        }
    }
}
