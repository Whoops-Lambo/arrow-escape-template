package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ڐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0664 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0641 f1710;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f1711;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1248 f1712;

    public C0664(C0641 c0641, C1248 c1248, MediaPlayer mediaPlayer) {
        this.f1710 = c0641;
        this.f1712 = c1248;
        this.f1711 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f1710.f1674.mo451(this.f1712, this.f1711);
    }
}
