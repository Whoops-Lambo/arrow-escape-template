package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ҁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0571 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0512 f1401;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0578 f1402;

    public C0571(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f1401 = new C0512(applicationContext, str);
        this.f1402 = new C0578(AbstractC0541.f1303, applicationContext.getPackageName(), AbstractC0453.m477(applicationContext), str2);
    }
}
