package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.n24;
import defpackage.o24;
import defpackage.qf4;
import defpackage.rf4;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeyj implements zzfdv {
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference(Boolean.FALSE);
    public final Clock c;
    public final Executor d;
    public final zzfdv e;
    public final long f;
    public final zzeaw g;

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        qf4 qf4Var;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Gd)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Fd)).booleanValue() && !((Boolean) this.b.getAndSet(Boolean.TRUE)).booleanValue()) {
                n24 n24Var = zzcgv.d;
                rf4 rf4Var = new rf4(this, 1);
                long j = this.f;
                n24Var.scheduleWithFixedDelay(rf4Var, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.a;
                    qf4Var = (qf4) atomicReference.get();
                    if (qf4Var == null) {
                        ListenableFuture listenableFutureZza = this.e.zza();
                        atomicReference.set(new qf4(listenableFutureZza, this.f, this.c));
                        return listenableFutureZza;
                    }
                    if (!((Boolean) this.b.get()).booleanValue()) {
                        if (qf4Var.b < qf4Var.c.elapsedRealtime()) {
                            ListenableFuture listenableFuture = qf4Var.a;
                            zzfdv zzfdvVar = this.e;
                            qf4 qf4Var2 = new qf4(zzfdvVar.zza(), this.f, this.c);
                            this.a.set(qf4Var2);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Hd)).booleanValue()) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Id)).booleanValue()) {
                                    zzeav zzeavVarA = this.g.a();
                                    zzeavVarA.b("action", "scs");
                                    zzeavVarA.b("sid", String.valueOf(zzfdvVar.zzb()));
                                    zzeavVarA.c();
                                }
                                return listenableFuture;
                            }
                            qf4Var = qf4Var2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.a;
            qf4Var = (qf4) atomicReference2.get();
            if (qf4Var != null) {
                if (qf4Var.b < qf4Var.c.elapsedRealtime()) {
                    zzfdv zzfdvVar2 = this.e;
                    qf4 qf4Var3 = new qf4(zzfdvVar2.zza(), this.f, this.c);
                    atomicReference2.set(qf4Var3);
                    qf4Var = qf4Var3;
                }
            } else {
                zzfdv zzfdvVar3 = this.e;
                qf4 qf4Var4 = new qf4(zzfdvVar3.zza(), this.f, this.c);
                atomicReference2.set(qf4Var4);
                qf4Var = qf4Var4;
            }
        }
        return qf4Var.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return this.e.zzb();
    }

    public zzeyj(zzfdv zzfdvVar, long j, Clock clock, o24 o24Var, zzeaw zzeawVar) {
        this.c = clock;
        this.e = zzfdvVar;
        this.f = j;
        this.d = o24Var;
        this.g = zzeawVar;
    }
}
