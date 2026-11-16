package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5273q0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5275r0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5273q0(C5275r0 c5275r0, boolean z) {
        super();
        this.c = c5275r0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
