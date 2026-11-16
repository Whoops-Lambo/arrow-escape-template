package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ḽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1050 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC1061 f3035;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1053 f3036;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f3037;

    public C1050(ViewGroup viewGroup, C1053 c1053, ViewOnLayoutChangeListenerC1061 viewOnLayoutChangeListenerC1061) {
        this.f3037 = viewGroup;
        this.f3036 = c1053;
        this.f3035 = viewOnLayoutChangeListenerC1061;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f3037.addView(this.f3036, new ViewGroup.LayoutParams(-1, -1));
        this.f3037.removeOnLayoutChangeListener(this.f3035);
        this.f3037.addOnLayoutChangeListener(this.f3035);
    }
}
