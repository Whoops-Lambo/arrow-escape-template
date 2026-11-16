package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɻ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0443 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0440 f897;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f898;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0387 f899;

    public C0443(C0440 c0440, ViewOnClickListenerC0387 viewOnClickListenerC0387, View view) {
        this.f897 = c0440;
        this.f899 = viewOnClickListenerC0387;
        this.f898 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f897.f893.mo457(this.f899, this.f898);
    }
}
