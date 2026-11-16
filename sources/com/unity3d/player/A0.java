package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class A0 extends UnityPlayer.b {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z, String str, int i) {
        super();
        this.e = unityPlayerForActivityOrService;
        this.b = z;
        this.c = str;
        this.d = i;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        if (this.b) {
            this.e.nativeSoftInputCanceled();
        } else {
            String str = this.c;
            if (str != null) {
                this.e.nativeSetInputString(str);
            }
        }
        if (this.d == 1) {
            this.e.nativeSoftInputClosed();
        }
    }
}
