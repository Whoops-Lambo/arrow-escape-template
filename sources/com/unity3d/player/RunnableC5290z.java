package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5290z implements Runnable {
    public final /* synthetic */ A a;

    public RunnableC5290z(A a) {
        this.a = a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f = this.a.d;
        f.a(f.b(), true);
    }
}
