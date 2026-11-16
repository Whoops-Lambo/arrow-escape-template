package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ⅈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1121 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0949 f3259;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Handler f3260;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public C0523 f3261;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3256 = StringFog.decrypt("5EgXIGtzRvrFWwA=\n", "oT5yTh8gI5Q=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3255 = StringFog.decrypt("/6Ef7PZwtx37pg==\n", "nsJrs4YRwm4=\n");

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f3254 = StringFog.decrypt("JNNjQmKZkyEo1XM=\n", "RbAXHRD84FQ=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f3253 = StringFog.decrypt("bKA7T5fRcUZ5pis=\n", "DcNPEPSjFCc=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f3252 = StringFog.decrypt("iu/UNj8AMgqf6cQ=\n", "64ygaUx0U3g=\n");

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f3251 = StringFog.decrypt("0yH3PMNe2w/CJ+c=\n", "skKDY7AqtH8=\n");

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3250 = StringFog.decrypt("wXtR3MId0hzSd1zmwg==\n", "oBglg6Z4oWg=\n");

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3249 = StringFog.decrypt("rs3qL0gUh2Gr8e0EWgGU\n", "z66ecDt18QQ=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f3258 = new HashSet();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f3257 = new HashSet();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m828(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f3257) {
            try {
                String str5 = str3 + StringFog.decrypt("2Q==\n", "4xf9KlTXf0c=\n") + str2;
                if (!this.f3257.contains(str5) || z || AbstractC1081.m765().mo777()) {
                    this.f3257.add(str5);
                    if (Math.random() * 100.0d >= m827()) {
                        AbstractC0509.m489(f3256, StringFog.decrypt("ST7pr4ZmP2RjMLq4l0s+f3846OyCYj5jeXe37IN9P2MqI7q8hmcoLXk/6KmUfDRhaQ==\n", "DVeazOcUWw0=\n"));
                        return;
                    }
                    this.f3259.getClass();
                    JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    try {
                        jSONObjectJsonObjectInit.put(StringFog.decrypt("dKP6M/Y=\n", "EdGOUpGGy7c=\n"), str);
                        jSONObjectJsonObjectInit.put(StringFog.decrypt("eqhECVU=\n", "H9opejK/6iI=\n"), str2);
                        jSONObjectJsonObjectInit.put(StringFog.decrypt("3G11fnmT\n", "uR8WER32qzE=\n"), str3);
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObjectJsonObjectInit.put(StringFog.decrypt("jswsLK0=\n", "675fWMZC+dY=\n"), str4);
                        }
                        if (jSONObject != null) {
                            AbstractC1125.m835(jSONObjectJsonObjectInit, jSONObject, false);
                        }
                    } catch (JSONException e) {
                        String str6 = C0949.f2552;
                        AbstractC0509.m497(str6, str6, StringFog.decrypt("OZPQCdf/AWAYiMwBhboSdhOTggvArBNlG4Q=\n", "fOGiZqXfYAQ=\n"), e, null, false);
                    }
                    String strDecrypt = StringFog.decrypt("FCZVSEoFpUM=\n", "YFYKLTh3yjE=\n");
                    Iterator it = new HashSet(this.f3258).iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectMo584 = ((InterfaceC0838) it.next()).mo584(strDecrypt, jSONObjectJsonObjectInit);
                        if (jSONObjectMo584 != null) {
                            AbstractC1125.m835(jSONObjectJsonObjectInit, jSONObjectMo584, false);
                        }
                    }
                    this.f3259.m728(StringFog.decrypt("Wwk0HpWeuNI=\n", "L3lre+fs16A=\n"), jSONObjectJsonObjectInit);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1121(Handler handler, C0949 c0949) {
        this.f3259 = c0949;
        this.f3260 = handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static double m827() {
        JSONObject jSONObject;
        if (((C1082) AbstractC1081.m765()).f3120) {
            return 100.0d;
        }
        C1082 c1082 = (C1082) AbstractC1081.m765();
        synchronized (c1082) {
            jSONObject = c1082.f2544;
        }
        return jSONObject.optDouble(StringFog.decrypt("CcIe\n", "faduNbcPcIM=\n"), 5.0d);
    }
}
