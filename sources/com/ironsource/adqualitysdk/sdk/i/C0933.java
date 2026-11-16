package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0933 extends C0508 {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2512 = StringFog.decrypt("0qnxKtC9xG3gguYjx73qa/2i4ifdpt8=\n", "k8eQRqnJrQ4=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Handler f2513;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public int f2514;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public int f2515;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final int f2516;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f2517;

    @Override // com.ironsource.adqualitysdk.sdk.i.C0508
    /* JADX INFO: renamed from: ﾒ */
    public final JSONObject mo486(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        long timeInMillis;
        long jElapsedRealtime;
        synchronized (this) {
            String str = AbstractC0388.f814;
            timeInMillis = Calendar.getInstance().getTimeInMillis();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        JSONObject jSONObjectMo486 = super.mo486(jSONObject, z, z2, z3);
        try {
            String str2 = AbstractC1219.f3710;
            long jOptLong = jSONObjectMo486.optLong(str2);
            jSONObjectMo486.remove(str2);
            if (jOptLong != 0) {
                long j = jElapsedRealtime - (timeInMillis - jOptLong);
                jSONObjectMo486.put(StringFog.decrypt("Cygm\n", "eFxVB2vOtnY=\n"), timeInMillis);
                jSONObjectMo486.put(StringFog.decrypt("MEiC\n", "Qz32O4PgMwE=\n"), jElapsedRealtime);
                timeInMillis = jOptLong;
                jElapsedRealtime = j;
            }
            jSONObjectMo486.put(StringFog.decrypt("cy4u\n", "F1pdBctoOG0=\n"), timeInMillis);
            jSONObjectMo486.put(StringFog.decrypt("UjY=\n", "J0IIt54KJjM=\n"), jElapsedRealtime);
            jSONObjectMo486.put(StringFog.decrypt("yiEJTA==\n", "uVRgKHyI+9Q=\n"), this.f2517);
            jSONObjectMo486.put(StringFog.decrypt("zte6\n", "vb7e5AaX0xI=\n"), this.f2516);
            String strDecrypt = StringFog.decrypt("QJLK\n", "M/ynpjQdA/s=\n");
            int i = this.f2515;
            if (i == 0) {
                i = 1;
            }
            jSONObjectMo486.put(strDecrypt, i);
            if (AbstractC1081.m765().mo766()) {
                jSONObjectMo486.put(StringFog.decrypt("xehB5g==\n", "ppstgjOsl8o=\n"), true);
            }
            jSONObjectMo486.put(StringFog.decrypt("FX43\n", "dhlB2Q/nFSs=\n"), AbstractC1081.m765().mo785());
            C1314 c1314 = ((C1082) AbstractC1081.m765()).f3127;
            if (c1314 != null) {
                String strM910 = c1314.m910();
                if (!TextUtils.isEmpty(strM910)) {
                    jSONObjectMo486.put(StringFog.decrypt("UysY\n", "Nl9sIeV1Jnc=\n"), strM910);
                }
                Object objM912 = c1314.m912();
                if (objM912 != null) {
                    jSONObjectMo486.put(StringFog.decrypt("bwxl8Q==\n", "CngRgsQ84Ng=\n"), objM912);
                }
            }
            if (z2) {
                m703(jSONObjectMo486);
            }
            return jSONObjectMo486;
        } catch (JSONException e) {
            String str3 = f2512;
            AbstractC0509.m497(str3, str3, StringFog.decrypt("7Dk4zMkExPrMKj7K1UOH7d8uJNf2QdPp\n", "qUtKo7skp4g=\n"), e, null, false);
            return jSONObjectMo486;
        }
    }

    public C0933(Context context, C4610d0 c4610d0, int i, String str, long j) {
        super(context, c4610d0, j);
        this.f2516 = i;
        this.f2515 = 0;
        this.f2514 = 1;
        this.f2517 = str;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("s2ZVdb8CPgmBTUJ8qAIQD5xtRniyGSU=\n", "8gg0GcZ2V2o=\n"));
        handlerThread.start();
        this.f2513 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m702(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1057 c1057) {
        try {
            try {
                this.f2513.post(new C0937(this, str, jSONObject, jSONObject2, z, c1057));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m703(JSONObject jSONObject) {
        C4648w c4648wM748 = C0992.m743().m748();
        try {
            jSONObject.put(StringFog.decrypt("EQXnht70WnYV\n", "fWSU8oqbLxU=\n"), AbstractC1125.m832(c4648wM748.f519, c4648wM748.f518, c4648wM748.f517, c4648wM748.f516));
        } catch (JSONException e) {
            String str = f2512;
            AbstractC0509.m497(str, str, StringFog.decrypt("zr5xLqZu0KvPpW0m9CLQvN+jdiK8bsWgi6l1JLo6\n", "q8wDQdROsc8=\n"), e, null, false);
        }
    }
}
