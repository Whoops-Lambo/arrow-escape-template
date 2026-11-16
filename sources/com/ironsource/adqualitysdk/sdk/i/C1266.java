package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1266 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3818;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3819;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3820;

    public C1266(C1192 c1192, Activity activity, Bundle bundle) {
        this.f3818 = c1192;
        this.f3820 = activity;
        this.f3819 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3818, this.f3820)) {
            this.f3818.f3595.getClass();
            this.f3818.getClass();
            C1192 c1192 = this.f3818;
            c1192.f3592 = false;
            Bundle bundle = this.f3819;
            if (bundle == null) {
                c1192.f3593 = false;
                return;
            }
            c1192.f3593 = bundle.getBoolean(C1192.f3587);
            C1192 c1193 = this.f3818;
            if (c1193.f3593) {
                c1193.f3592 = true;
            }
            c1193.f3590 = true;
        }
    }
}
