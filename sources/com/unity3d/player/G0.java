package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class G0 implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore) {
        this.b = unityPlayerForActivityOrService;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.shutdown();
        this.a.release();
    }
}
