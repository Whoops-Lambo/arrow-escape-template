package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import java.util.Collections;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0849 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0808 f2243;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2244;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2245;

    public C0849(C0808 c0808, String str, Activity activity) {
        this.f2243 = c0808;
        this.f2245 = str;
        this.f2244 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1199.m874(this.f2243.f2119, this.f2245, false, false, Collections.singletonList(this.f2244));
    }
}
