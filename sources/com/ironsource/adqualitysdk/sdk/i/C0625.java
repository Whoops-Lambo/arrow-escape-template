package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ץ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0625 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0618 f1529;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f1530;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1274 f1531;

    public C0625(C0618 c0618, C1274 c1274, MediaPlayer mediaPlayer) {
        this.f1529 = c0618;
        this.f1531 = c1274;
        this.f1530 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f1529.f1519.mo454(this.f1531, this.f1530);
    }
}
