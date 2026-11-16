package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.e32;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements ServiceConnection {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final LinkedBlockingDeque b = new LinkedBlockingDeque();

    public final IBinder l() throws InterruptedException {
        if (!this.a.compareAndSet(false, true)) {
            e32.i("Binder already consumed");
            return null;
        }
        Object objTake = this.b.take();
        objTake.getClass();
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
                com.facebook.a0 a0Var = com.facebook.a0.a;
            }
        }
    }
}
