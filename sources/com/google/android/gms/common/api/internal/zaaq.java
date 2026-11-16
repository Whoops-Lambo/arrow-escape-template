package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zaaq implements Runnable {
    final /* synthetic */ zaar zab;

    @WorkerThread
    public abstract void zaa();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Lock lockZas;
        zaar zaarVar = this.zab;
        zaarVar.zas().lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lockZas = zaarVar.zas();
                } else {
                    zaa();
                    lockZas = this.zab.zas();
                }
            } catch (RuntimeException e) {
                this.zab.zar().zas(e);
            }
            lockZas.unlock();
        } catch (Throwable th) {
            this.zab.zas().unlock();
            throw th;
        }
    }

    public /* synthetic */ zaaq(zaar zaarVar, byte[] bArr) {
        Objects.requireNonNull(zaarVar);
        this.zab = zaarVar;
    }
}
