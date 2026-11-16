package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzne {
    public final zznd a;
    public final zznc b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public zzne(zznc zzncVar, zznd zzndVar, Looper looper) {
        this.b = zzncVar;
        this.a = zzndVar;
        this.e = looper;
    }
}
