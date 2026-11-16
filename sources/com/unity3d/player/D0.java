package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class D0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        super();
        this.c = unityPlayerForActivityOrService;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.c.nativeSetKeyboardIsVisible(this.b);
    }
}
