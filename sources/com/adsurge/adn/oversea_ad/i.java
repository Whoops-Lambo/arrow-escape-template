package com.adsurge.adn.oversea_ad;

import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static final e c = new e();
    public h a = null;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final synchronized r0 a(int i, int i2, int i3, byte[] bArr, Pyxis pyxis) {
        AtomicReference atomicReference;
        if (!this.b.get()) {
            throw new RuntimeException("Must call after initialized");
        }
        Object obj = new Object();
        atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        q0 q0Var = new q0();
        q0Var.a = -4;
        atomicReference.set(new r0(q0Var));
        f fVar = new f(atomicBoolean, atomicReference, obj);
        h hVar = this.a;
        o0 o0Var = new o0(i, i2, i3);
        o0Var.d = null;
        o0Var.e = bArr;
        o0Var.f = null;
        o0Var.a = fVar;
        o0Var.g = pyxis;
        Message.obtain(hVar, 2, new p0(o0Var)).sendToTarget();
        synchronized (obj) {
            try {
                obj.wait(200000L);
            } catch (InterruptedException unused) {
            }
        }
        atomicBoolean.set(true);
        return (r0) atomicReference.get();
    }
}
