package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.rl3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ἵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1082 extends AbstractC1081 {

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3110;

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public C4610d0 f3115;

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public volatile long f3116;

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public boolean f3117;

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public ArrayList f3118;

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public C4603b f3119;

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public boolean f3120;

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public int f3121;

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public boolean f3122;

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public C0671 f3123;

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public ArrayList f3124;

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public ArrayList f3125;

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public C0670 f3126;

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public C1314 f3127;

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public C0592 f3128;

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public C0928 f3129;

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public Z0 f3130;

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public Handler f3131;

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public C1051 f3132;

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public C0969 f3133;

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public final String f3134;

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public final String f3135;

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public final int f3136;

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public final int f3137;

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public final int f3138;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public final int f3139;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public final String f3140;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public final String f3141;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public final String f3142;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public final String f3143;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public final String f3144;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public final String f3145;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public final String f3146;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public final String f3147;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final String f3148;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final String f3149;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final String f3150;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final String f3151;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final String f3152;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String f3153;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String f3154;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String f3155;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String f3156;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String f3157;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f3158;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f3159 = StringFog.decrypt("PY/E\n", "WOGysiAe9yA=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3114 = StringFog.decrypt("/chbG1WgsCXBy18T\n", "r602dCHF80o=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3113 = StringFog.decrypt("LSqyV/VpqGc8KL5R9g==\n", "X0ndOZMAz0k=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3112 = StringFog.decrypt("yxJ8BtQcFn3UTnYTnxoVMM0FcArFGxRx0QZ0Ag==\n", "v2AdZbF+dx4=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3111 = StringFog.decrypt("lJDRhjbE4ViCnMyOLoj4WYSQ0I0=\n", "5/++61qlzCs=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public final synchronized void m788() {
        this.f3122 = false;
    }

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public final synchronized void m789() {
        Handler handler = this.f3131;
        if (handler != null) {
            handler.post(new C1161(this));
        }
    }

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public final boolean m790() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(this.f3135, false);
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public final synchronized C1051 m791() {
        return this.f3132;
    }

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public final int m792() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optInt(StringFog.decrypt("NU5PQQ==\n", "WC0jMxKJYcA=\n"), 3);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: 丫 */
    public final boolean mo766() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(this.f3154);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: 乁 */
    public final synchronized void mo767() {
        this.f3131.removeCallbacksAndMessages(null);
        this.f3131 = null;
        AbstractC4631n.m401(new C1223(this));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: 爫 */
    public final boolean mo768() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(this.f3146);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﬤ */
    public final boolean mo769() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(this.f3145);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: טּ */
    public final boolean mo770() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(StringFog.decrypt("Br34CQ==\n", "dNubaGbkrTo=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: סּ */
    public final boolean mo771() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        if (jSONObject == null) {
            return true;
        }
        return jSONObject.optBoolean(StringFog.decrypt("GVPp\n", "cSeGWwTjANs=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ףּ */
    public final boolean mo772() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(StringFog.decrypt("hnP6\n", "9BefEAe3nPM=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﭖ */
    public final boolean mo773() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(this.f3141, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﭴ */
    public final boolean mo774() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject != null && jSONObject.optBoolean(this.f3150, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﭸ */
    public final boolean mo775() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject != null && jSONObject.optBoolean(this.f3149, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﮉ */
    public final boolean mo776() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean(this.f3152, false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﮌ */
    public final boolean mo777() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optBoolean(StringFog.decrypt("LUnE\n", "SC+3e1fhCMc=\n"), false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﮐ */
    public final synchronized boolean mo778() {
        return this.f3122;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﱟ */
    public final String mo779() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        if (jSONObject == null) {
            return null;
        }
        String strOptString = m705().optString(StringFog.decrypt("DlhlNA==\n", "aiwBQM6yrt0=\n"));
        return TextUtils.isEmpty(strOptString) ? this.f2543.f3271.optString(C1127.f3269, C1127.f3267) : strOptString;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﺙ */
    public final int mo780() {
        synchronized (this) {
            try {
                JSONObject jSONObjectM705 = m705();
                if (jSONObjectM705 == null) {
                    return 20000;
                }
                return jSONObjectM705.optInt(this.f3151, 20000);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﻐ */
    public final int mo782() {
        int iOptInt;
        synchronized (this) {
            iOptInt = m705().optInt(this.f3153, 100);
        }
        return iOptInt;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﻛ */
    public final int mo783() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optInt(this.f3157, this.f3136);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ｋ */
    public final int mo784() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        if (jSONObject == null) {
            return 2000;
        }
        return Math.max(0, jSONObject.optInt(this.f3148, 2000));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﾇ */
    public final String mo785() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optString(StringFog.decrypt("oy3t\n", "wEqbsrAw0ns=\n"), this.f3134);
    }

    static {
        StringFog.decrypt("UyLs\n", "IEaAjXth4nM=\n");
        f3110 = StringFog.decrypt("iR/uRCNZk8zLHOFQeXuY04sV41diSqLNgRH0RllRmtiWBOFOfQ==\n", "5XCAIw04970=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﻏ */
    public final HashMap mo781() {
        JSONObject jSONObject;
        HashMap map = new HashMap();
        try {
            synchronized (this) {
                jSONObject = this.f2544;
            }
            String strOptString = jSONObject.optString(StringFog.decrypt("QPrj\n", "JJmQG36ZdZ0=\n"));
            if (TextUtils.isEmpty(strOptString)) {
                return map;
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(strOptString);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, new C0839(jSONObjectJsonObjectInit.optJSONObject(next)));
            }
            return linkedHashMap;
        } catch (JSONException e) {
            AbstractC1290.m905(f3114, StringFog.decrypt("RzvSXiHLww4iLsVFEITEDmcq1F4hmP4PRiDTUDGHzw==\n", "AkmgMVPrqmA=\n"), (Throwable) e, false);
            return map;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﾒ */
    public final void mo786(Context context, C4610d0 c4610d0, boolean z) {
        JSONObject jSONObject;
        String str = AbstractC0388.f814;
        this.f3116 = SystemClock.elapsedRealtime();
        this.f3115 = c4610d0;
        if (z) {
            C1220 c1220 = new C1220(this);
            C1082 c1082 = (C1082) AbstractC1081.m765();
            synchronized (c1082) {
                jSONObject = c1082.f2544;
            }
            AbstractC4631n.m404(c1220, jSONObject.optInt(c1082.f3158, c1082.f3137));
        }
        m788();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            String strM741 = this.f3133.m741(f3110);
            jSONObjectJsonObjectInit = new C0508(context, c4610d0, !TextUtils.isEmpty(strM741) ? Long.parseLong(strM741) : 0L).m487(m791().f3040.m753());
        } catch (JSONException e) {
            String str2 = f3114;
            AbstractC0509.m497(str2, str2, StringFog.decrypt("7fI3IL5BW4DN4TEmogYYm8bpMW++BEmHzfMx\n", "qIBFT8xhOPI=\n"), e, null, false);
        }
        C1051 c1051M791 = m791();
        C4603b c4603b = this.f3119;
        String strDecrypt = StringFog.decrypt("GzrF+g==\n", "clSsjrw1IXY=\n");
        String str3 = c4603b.f304;
        StringBuilder sb = new StringBuilder();
        if (str3 == null) {
            str3 = "";
        }
        rl3.p(str3, "/A==\n", sb, "0+e3kZUAXUw=\n");
        if (strDecrypt == null) {
            strDecrypt = "";
        }
        sb.append(strDecrypt);
        String string = sb.toString();
        boolean z2 = m790() && this.f3121 != m792();
        C1179 c1179 = new C1179(this, context, c4610d0);
        c1051M791.getClass();
        if (TextUtils.isEmpty(string)) {
            String str4 = C1051.f3038;
            AbstractC0509.m491(str4, str4, StringFog.decrypt("4nnDpvRnOEvYN9Kr63Y4XMJk1qv1ImpaxmLHt+wifVbDf8e2uFdKc5d40OTqZ2tP2HnRodBjdlvb\nctDk72dqWpd5zbC4cmpQwX7Gofw=\n", "txeixJgCGD8=\n"), true);
            return;
        }
        C1094 c1094 = new C1094(jSONObjectJsonObjectInit, string, c4610d0, context, z2);
        if (c1051M791.f3039) {
            AbstractC0509.m488(C1051.f3038, StringFog.decrypt("yBPd6N4ILDPvDtno1UY9fLsV3vveDSxB/g3F6MISaWTzGd6t/wM9ZPQO28DQCCh0/g6Q+tAVaWDz\nCcTp3hEn\n", "m3ywjbFmSRM=\n"));
            return;
        }
        C1052 c1052 = new C1052(c1051M791, c1179, c1094);
        String str5 = AbstractC0388.f814;
        try {
            Executors.newSingleThreadExecutor().execute(c1052);
        } catch (Throwable th) {
            AbstractC1290.m905(AbstractC0388.f814, StringFog.decrypt("33dALPYTxOj/Zkc37V3GsPt2Sy3nE9Xx6W4=\n", "mgUyQ4QzoZA=\n"), th, false);
        }
    }

    public C1082() {
        StringFog.decrypt("H2/6\n", "egKejpJb4Ag=\n");
        this.f3158 = StringFog.decrypt("TQIEIQ==\n", "LmVoVW7CfA4=\n");
        this.f3157 = StringFog.decrypt("jM1F6Q==\n", "774pnZUwQs4=\n");
        this.f3156 = StringFog.decrypt("Ip/Gsg==\n", "TPajwoL6OvA=\n");
        this.f3155 = StringFog.decrypt("kyoFUw==\n", "8l5xMQEhC2c=\n");
        this.f3154 = StringFog.decrypt("4tDzrw==\n", "gaOfyzZkGEI=\n");
        this.f3153 = StringFog.decrypt("r2UD\n", "3AlncKJpBu0=\n");
        this.f3152 = StringFog.decrypt("Qm7Nvg==\n", "Jweu2AZjSys=\n");
        this.f3151 = StringFog.decrypt("mqf1\n", "88SRg4L3Tmg=\n");
        this.f3150 = StringFog.decrypt("eTf/IQ==\n", "DVyRQtkHOoo=\n");
        this.f3149 = StringFog.decrypt("SkZ1hw==\n", "OCEN5EPt+oY=\n");
        this.f3148 = StringFog.decrypt("X0hsQQ==\n", "PDoAJXU+r44=\n");
        this.f3147 = StringFog.decrypt("pubGzH0=\n", "0YCyuBFlW3I=\n");
        this.f3146 = StringFog.decrypt("o2uDgQ==\n", "0Ary8pDGEMo=\n");
        this.f3145 = StringFog.decrypt("nQQzFQ==\n", "72dSZn/NAFI=\n");
        this.f3144 = StringFog.decrypt("pG1p\n", "xxoKOBopPgk=\n");
        this.f3143 = StringFog.decrypt("DJPS\n", "eeCmEm5xd/8=\n");
        this.f3142 = StringFog.decrypt("I58j+Q==\n", "TutHjR+Bn98=\n");
        this.f3141 = StringFog.decrypt("BocH\n", "a+50P4vmlqY=\n");
        this.f3140 = StringFog.decrypt("mEP54w==\n", "6yCKitzoT5s=\n");
        this.f3139 = 5000;
        this.f3138 = 43200000;
        this.f3137 = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        this.f3136 = 10000;
        this.f3135 = StringFog.decrypt("R7sH\n", "ItVkwq6AuDk=\n");
        this.f3134 = StringFog.decrypt("IgI1\n", "FSwFv3uOEoM=\n");
        this.f3121 = 0;
        this.f3118 = null;
        this.f3117 = false;
        this.f3116 = 0L;
    }

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public final void m793() {
        C0733 c0733M448;
        if (mo773()) {
            C0712 c0712 = C0712.f1791;
            c0712.getClass();
            try {
                if (c0712.f1794 == null) {
                    synchronized (c0712) {
                        try {
                            if (c0712.f1794 != null) {
                                return;
                            }
                            C4652y c4652y = C0843.f2235.f2238;
                            if (c4652y == null) {
                                c0733M448 = null;
                            } else {
                                c0733M448 = c4652y.m448();
                            }
                            if (c0733M448 != null) {
                                c0712.f1794 = c0733M448;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Exception e) {
                String str = C0712.f1792;
                AbstractC0509.m497(str, str, StringFog.decrypt("xN3is49K+a70k/elm13jqeDW+KLIXvGz4dby\n", "jbOW1ug4kNo=\n"), e, null, false);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1081
    /* JADX INFO: renamed from: ﾒ */
    public final void mo787(Context context, C1051 c1051, C4603b c4603b, C0671 c0671, boolean z) {
        JSONObject jSONObjectJsonObjectInit;
        this.f3133 = new C0969(context, f3112, f3111);
        this.f3132 = c1051;
        this.f3122 = false;
        this.f3120 = z;
        this.f3119 = c4603b;
        this.f3131 = new Handler(Looper.getMainLooper());
        C1127 c1127 = new C1127();
        this.f3130 = new Z0(c1127);
        this.f3129 = new C0928(c1127);
        this.f3128 = new C0592(c1127);
        this.f3127 = new C1314();
        String strM741 = this.f3133.m741(f3113);
        if (strM741 != null) {
            try {
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(strM741);
            } catch (JSONException unused) {
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            }
        } else {
            jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        }
        mo706(jSONObjectJsonObjectInit);
        this.f2543 = c1127;
        this.f3123 = c0671;
        this.f3125 = new ArrayList();
        this.f3124 = new ArrayList();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0945
    /* JADX INFO: renamed from: ﾒ */
    public final synchronized void mo706(JSONObject jSONObject) {
        try {
            if (jSONObject.has(StringFog.decrypt("leaShec8\n", "4ZTz7JNPDrg=\n"))) {
                AbstractC1125.m835(jSONObject, jSONObject.optJSONObject(StringFog.decrypt("Z2k+22NC\n", "Extfshcx2/c=\n")), false);
            }
            super.mo706(jSONObject);
            this.f3130.mo706(jSONObject);
            this.f3129.mo706(jSONObject);
            this.f3128.mo706(jSONObject);
            this.f3127.mo706(jSONObject);
        } catch (Throwable th) {
            throw th;
        }
    }
}
