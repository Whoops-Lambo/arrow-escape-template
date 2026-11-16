package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮃ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1216 implements Runnable {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1189 f3653;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ int f3654;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ long f3655;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3656;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3657;

    public RunnableC1216(C1189 c1189, JSONObject jSONObject, boolean z, long j, int i) {
        this.f3653 = c1189;
        this.f3657 = jSONObject;
        this.f3656 = z;
        this.f3655 = j;
        this.f3654 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C1189 c1189 = this.f3653;
        JSONObject jSONObject = this.f3657;
        boolean z2 = this.f3656;
        long j = this.f3655;
        int i = this.f3654;
        c1189.getClass();
        C1328 c1328M948 = C1328.m948();
        synchronized (c1328M948) {
            z = c1328M948.f3963;
        }
        if (z) {
            return;
        }
        try {
            if (c1189.f3578 > 0 && j > 0) {
                jSONObject.put(StringFog.decrypt("R5eG\n", "LvPygb15BMU=\n"), j - c1189.f3578);
            }
            if (c1189.f3577 > 0 && i > 0) {
                jSONObject.put(StringFog.decrypt("CemGkg==\n", "YITr9hY9i6Q=\n"), i - c1189.f3577);
            }
            jSONObject.put(StringFog.decrypt("itS+XH8=\n", "7LvMPxrDXZU=\n"), z2);
        } catch (Exception e) {
            String str = C1189.f3571;
            AbstractC0509.m497(str, str, StringFog.decrypt("4N2sPrGuh2PMw7o4renFYtXwtz+q+rp1ysKuPab6gDbVzqc9rO+B\n", "pa/eUcOO5RY=\n"), e, null, false);
        }
        c1189.f3584.f1279.f1162.f1364.f1142.f3954.m728(StringFog.decrypt("gxWAaSMxum6UCrJwIT26VA==\n", "92XfAE1YzjE=\n"), jSONObject);
    }
}
