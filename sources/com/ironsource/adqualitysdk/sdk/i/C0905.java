package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔾ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0905 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2406;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f2407 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f2408;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1051 f2409;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0969 f2410;

    static {
        StringFog.decrypt("ICn/BQFrEAU=\n", "ckySanUOVEc=\n");
        StringFog.decrypt("EqwMv6eIMIAN8Aaq7I4zzRS7ALO2jzWB\n", "Zt5t3MLqUeM=\n");
        StringFog.decrypt("Cj4kV1srckAcMjlfQ2drVxs=\n", "eVFLOjdKXzM=\n");
        f2406 = StringFog.decrypt("k8vRD1fwyjzbtPBbcPKUe/WeqVVett4h1InnEk/13SGaq+xSTfWJKoKF6gpepog8w4WrB1ixnybj\ngvcsT4yIGNiJ8gYQ6Q==\n", "t/ueYjvE7U8=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m678(AbstractC0806 abstractC0806, InterfaceC1209 interfaceC1209) {
        boolean z;
        if (TextUtils.isEmpty(abstractC0806.f2117) || TextUtils.isEmpty(abstractC0806.f2115)) {
            return null;
        }
        String strReplace = m675(abstractC0806).mo616().replace(StringFog.decrypt("Vw==\n", "eAvz17XdJPs=\n"), StringFog.decrypt("9Q==\n", "2xR8/nPm9uo=\n"));
        synchronized (this) {
            try {
                if (AbstractC1081.m765().mo778()) {
                    z = true;
                } else {
                    this.f2407.add(new C1019(this, abstractC0806, interfaceC1209));
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m677(abstractC0806, interfaceC1209);
        }
        return this.f2410.m741(strReplace);
    }

    public C0905(Context context, C1051 c1051, String str) {
        this.f2410 = new C0969(context, StringFog.decrypt("8LZAasvtQk3v6kp/gOtBAPahTGba6kdM\n", "hMQhCa6PIy4=\n"), StringFog.decrypt("RjWND/jXTiRQOZAH4JtXM1c=\n", "NVriYpS2Y1c=\n"));
        this.f2409 = c1051;
        this.f2408 = str;
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        C1030 c1030 = new C1030(this);
        C1082 c1082 = (C1082) abstractC1081M765;
        Handler handler = c1082.f3131;
        if (handler != null) {
            handler.post(new C1135(c1082, c1030));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m677(AbstractC0806 abstractC0806, InterfaceC1209 interfaceC1209) {
        String str;
        AbstractC0806 abstractC0806M675 = m675(abstractC0806);
        String strMo616 = abstractC0806M675.mo616();
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            str = this.f2408;
        }
        sb.append(str);
        String strM515 = AbstractC0529.m515("Yg==\n", "TYDggO3UZSA=\n", sb, strMo616);
        String strReplace = abstractC0806M675.mo616().replace(StringFog.decrypt("Vw==\n", "eAvz17XdJPs=\n"), StringFog.decrypt("9Q==\n", "2xR8/nPm9uo=\n"));
        if (AbstractC1081.m765().mo772()) {
            if (AbstractC1081.m765().mo770() || this.f2410.m741(strReplace) == null) {
                C0915 c0915 = new C0915(this, strM515, abstractC0806, strReplace, interfaceC1209);
                String str2 = AbstractC0388.f814;
                try {
                    Executors.newSingleThreadExecutor().execute(c0915);
                } catch (Throwable th) {
                    AbstractC1290.m905(AbstractC0388.f814, StringFog.decrypt("33dALPYTxOj/Zkc37V3GsPt2Sy3nE9Xx6W4=\n", "mgUyQ4QzoZA=\n"), th, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m676(AbstractC0806 abstractC0806) {
        String strDecrypt;
        JSONObject jSONObject;
        if (abstractC0806 instanceof C0846) {
            if (abstractC0806.f2112) {
                C1082 c1082 = (C1082) AbstractC1081.m765();
                synchronized (c1082) {
                    jSONObject = c1082.f2544;
                }
                if (jSONObject.optBoolean(StringFog.decrypt("Rd7N\n", "IqSuhgWRzSw=\n"))) {
                    strDecrypt = StringFog.decrypt("HTC+w0iy6PoSLbI=\n", "d0PRrWbVktQ=\n");
                } else {
                    strDecrypt = StringFog.decrypt("PK3/bP3tFRc=\n", "Vt6QAtOIe3Q=\n");
                }
            } else {
                strDecrypt = StringFog.decrypt("PK3/bP3tFRc=\n", "Vt6QAtOIe3Q=\n");
            }
            abstractC0806.f2114 = strDecrypt;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static AbstractC0806 m675(AbstractC0806 abstractC0806) {
        JSONObject jSONObject;
        if (abstractC0806 instanceof C0846) {
            AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
            C1082 c1082 = (C1082) abstractC1081M765;
            synchronized (c1082) {
                jSONObject = c1082.f2544;
            }
            if (jSONObject.has(StringFog.decrypt("tT8G\n", "1lhwHBtv4XI=\n"))) {
                String strMo785 = abstractC1081M765.mo785();
                if (!strMo785.equals(abstractC0806.f2115)) {
                    abstractC0806 = ((C0846) abstractC0806).mo618(strMo785);
                }
            }
        }
        m676(abstractC0806);
        return abstractC0806;
    }
}
