package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮌ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1225 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3724;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3725;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3726;

    public C1225(C1192 c1192, Activity activity, Bundle bundle) {
        this.f3724 = c1192;
        this.f3726 = activity;
        this.f3725 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3724, this.f3726)) {
            this.f3724.f3595.getClass();
            Bundle bundle = this.f3725;
            if (bundle != null) {
                bundle.putBoolean(C1192.f3587, this.f3724.f3593);
            }
            this.f3724.f3591 = true;
        }
    }
}
