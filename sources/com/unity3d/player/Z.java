package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Z extends Thread {
    public final UnityPlayerForActivityOrService a;
    public Handler c;
    public int h;
    public int i;
    public final CountDownLatch b = new CountDownLatch(1);
    public boolean d = false;
    public boolean e = false;
    public int f = 2;
    public int g = 0;
    public int j = 5;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("UnityMain");
        Looper.prepare();
        this.c = new Handler(Looper.myLooper(), new X(this));
        this.b.countDown();
        Looper.loop();
    }

    public Z(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }
}
