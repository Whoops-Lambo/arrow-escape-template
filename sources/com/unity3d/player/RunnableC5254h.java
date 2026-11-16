package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5254h implements Runnable {
    public final IAssetPackManagerStatusQueryCallback a;
    public final long b;
    public final String[] c;
    public final int[] d;
    public final int[] e;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onStatusResult(this.b, this.c, this.d, this.e);
    }

    public RunnableC5254h(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
        this.a = iAssetPackManagerStatusQueryCallback;
        this.b = j;
        this.c = strArr;
        this.d = iArr;
        this.e = iArr2;
    }
}
