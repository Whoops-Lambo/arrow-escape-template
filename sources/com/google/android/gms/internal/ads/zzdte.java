package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bu4;
import defpackage.g44;
import defpackage.ku4;
import defpackage.mx3;
import defpackage.o24;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdte implements zzdew {
    public final zzdre a;
    public final zzdri b;
    public final Executor c;
    public final Executor d;

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        zzcha zzchaVar;
        if (this.b.e) {
            zzdre zzdreVar = this.a;
            zzemy zzemyVarK = zzdreVar.k();
            if (zzemyVarK == null) {
                synchronized (zzdreVar) {
                    listenableFuture = zzdreVar.m;
                }
                if (listenableFuture != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.E6)).booleanValue()) {
                    synchronized (zzdreVar) {
                        listenableFuture2 = zzdreVar.m;
                    }
                    synchronized (zzdreVar) {
                        zzchaVar = zzdreVar.n;
                    }
                    if (listenableFuture2 == null || zzchaVar == null) {
                        return;
                    }
                    bu4 bu4Var = new bu4(zzgzb.C(new ListenableFuture[]{listenableFuture2, zzchaVar}), false);
                    bu4Var.addListener(new ku4(0, bu4Var, new mx3(this, 24)), this.d);
                    return;
                }
            }
            if (zzemyVarK != null) {
                zzcly zzclyVarJ = zzdreVar.j();
                zzcly zzclyVarH = zzdreVar.h();
                if (zzclyVarJ == null) {
                    zzclyVarJ = zzclyVarH == null ? null : zzclyVarH;
                }
                if (zzclyVarJ != null) {
                    this.c.execute(new g44(zzclyVarJ, 5));
                }
            }
        }
    }

    public zzdte(zzdre zzdreVar, zzdri zzdriVar, Executor executor, o24 o24Var) {
        this.a = zzdreVar;
        this.b = zzdriVar;
        this.c = executor;
        this.d = o24Var;
    }
}
