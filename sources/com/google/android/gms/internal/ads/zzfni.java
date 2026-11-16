package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfni {
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final Callable b;
    public final zzher c;

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.a;
        int size = i - linkedBlockingDeque.size();
        for (int i2 = 0; i2 < size; i2++) {
            linkedBlockingDeque.add(this.c.submit(this.b));
        }
    }

    public final synchronized ListenableFuture b() {
        a(1);
        return (ListenableFuture) this.a.poll();
    }

    public zzfni(zzdwg zzdwgVar, zzher zzherVar) {
        this.b = zzdwgVar;
        this.c = zzherVar;
    }
}
