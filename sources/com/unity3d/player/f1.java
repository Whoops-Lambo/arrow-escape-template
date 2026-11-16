package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import defpackage.uj2;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f1 {
    public final UnityPlayer a;
    public C5265m0 c;
    public Context b = null;
    public final Semaphore d = new Semaphore(0);
    public final ReentrantLock e = new ReentrantLock();
    public VideoPlayer f = null;
    public int g = 2;
    public boolean h = false;
    public boolean i = false;

    public void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            uj2.a(5, "Not running from an Activity; Ignoring execution request...");
        }
    }

    public f1(UnityPlayer unityPlayer) {
        this.a = null;
        this.a = unityPlayer;
    }
}
