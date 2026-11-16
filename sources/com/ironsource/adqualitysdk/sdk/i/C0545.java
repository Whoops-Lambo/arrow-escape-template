package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Г, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0545 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0524 f1306;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ int f1307;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ int f1308;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f1309;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0370 f1310;

    public C0545(C0524 c0524, C0370 c0370, MediaPlayer mediaPlayer, int i, int i2) {
        this.f1306 = c0524;
        this.f1310 = c0370;
        this.f1309 = mediaPlayer;
        this.f1308 = i;
        this.f1307 = i2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        this.f1306.f1270.mo453(this.f1310, this.f1309, this.f1308, this.f1307);
    }
}
