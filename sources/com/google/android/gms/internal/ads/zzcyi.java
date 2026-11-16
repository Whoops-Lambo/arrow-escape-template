package com.google.android.gms.internal.ads;

import defpackage.g44;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcyi implements zzbfr {
    public final zzcly a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final synchronized void K(zzbfq zzbfqVar) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.xe)).booleanValue()) {
                boolean z = zzbfqVar.j;
                AtomicReference atomicReference = this.c;
                if (z) {
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.b.execute(new g44(zzclyVar, 3));
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference.getAndSet(bool2))) {
                        this.b.execute(new g44(zzclyVar, 2));
                    }
                }
            }
        }
    }

    public zzcyi(zzcly zzclyVar, Executor executor) {
        this.a = zzclyVar;
        this.b = executor;
    }
}
