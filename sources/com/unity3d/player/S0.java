package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class S0 extends UnityPlayer.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ UnityPlayerForGameActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(UnityPlayerForGameActivity unityPlayerForGameActivity, int i, int i2) {
        super();
        this.d = unityPlayerForGameActivity;
        this.b = i;
        this.c = i2;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        this.d.nativeOrientationChanged(this.b, this.c);
    }
}
