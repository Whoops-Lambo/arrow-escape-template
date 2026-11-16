package com.adsurge.adn.oversea_ad;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Dew implements ServiceConnection {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ Object c;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public Dew(AtomicReference atomicReference, AtomicReference atomicReference2, Object obj) {
        this.a = atomicReference;
        this.b = atomicReference2;
        this.c = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.set(iBinder);
        this.b.set(this);
        synchronized (this.c) {
            try {
                this.c.notifyAll();
            } catch (Throwable unused) {
            }
        }
    }
}
