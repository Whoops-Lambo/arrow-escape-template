package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Γ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0506 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0505 f1133;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f1134;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0381 f1135;

    public C0506(C0505 c0505, C0381 c0381, MediaPlayer mediaPlayer) {
        this.f1133 = c0505;
        this.f1135 = c0381;
        this.f1134 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f1133.f1132.mo452(this.f1135, this.f1134);
    }
}
