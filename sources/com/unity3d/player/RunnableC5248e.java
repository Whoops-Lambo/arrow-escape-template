package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5248e implements Runnable {
    public final IAssetPackManagerMobileDataConfirmationCallback a;
    public final boolean b;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }

    public RunnableC5248e(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }
}
