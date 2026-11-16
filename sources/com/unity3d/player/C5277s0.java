package com.unity3d.player;

import android.view.WindowInsets;

/* JADX INFO: renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5277s0 extends UnityPlayer.b {
    public final /* synthetic */ WindowInsets b;
    public final /* synthetic */ F0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5277s0(F0 f0, WindowInsets windowInsets) {
        super();
        this.c = f0;
        this.b = windowInsets;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.c.a.nativeOnApplyWindowInsets(this.b);
    }
}
