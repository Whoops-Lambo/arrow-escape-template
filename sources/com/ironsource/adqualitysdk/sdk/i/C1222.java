package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1222 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3720;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3721;

    public C1222(C1192 c1192, Activity activity) {
        this.f3720 = c1192;
        this.f3721 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3720, this.f3721)) {
            this.f3720.f3595.onActivityPaused(this.f3721);
        }
    }
}
