package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.לּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1189 {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3571 = StringFog.decrypt("eBW4eloPYlxdHqVrTRJuT1oeow==\n", "MXvRDhlgDyw=\n");

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public boolean f3572;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public int f3573;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public boolean f3574;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public int f3575;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public long f3576;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public volatile int f3577;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public volatile long f3578;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean f3579;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean f3580;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public boolean f3581;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public Handler f3582 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0519 f3583;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0530 f3584;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0549 f3585;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m871(boolean z) {
        boolean z2;
        if (this.f3580 || this.f3582 == null) {
            return;
        }
        C1328 c1328M948 = C1328.m948();
        synchronized (c1328M948) {
            z2 = c1328M948.f3963;
        }
        if (z2) {
            return;
        }
        this.f3580 = true;
        Handler handler = this.f3582;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C0517 c0517 = this.f3585.f1314;
        c0517.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(StringFog.decrypt("qBNJgw==\n", "3mAn8K5y4zw=\n"), c0517.m513());
        } catch (Exception unused) {
        }
        AbstractC4631n.m405(new C0521(new RunnableC1216(this, jSONObjectJsonObjectInit, z, this.f3576, this.f3575)));
    }

    public C1189(C0549 c0549, C0530 c0530, C0519 c0519) {
        this.f3585 = c0549;
        this.f3584 = c0530;
        this.f3583 = c0519;
    }
}
