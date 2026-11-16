package com.adsurge.adn.oversea_ad;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class White implements ServiceConnection {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public White(AtomicReference atomicReference, long j, Object obj) {
        this.a = atomicReference;
        this.b = j;
        this.c = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        new Watermelon(this, iBinder).start();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.set(new Teazle(-2004, 200, -1L, "", -1, -3));
        synchronized (this.c) {
            this.c.notify();
        }
    }
}
