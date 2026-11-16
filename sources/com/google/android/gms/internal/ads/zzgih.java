package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.pl4;
import defpackage.ql4;
import defpackage.xu4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgih implements zzgic, zzghy, zzgin {
    public static final zzbej u;
    public final Context a;
    public final zzghg b;
    public final ExecutorService c;
    public final zzggz d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final long k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object m = new Object();
    public final Object n = new Object();
    public final Object o = new Object();
    public final zzaxm p = zzaxn.E();
    public final ArrayList q = new ArrayList();
    public boolean r = false;
    public final HashMap s = new HashMap();
    public final int t;

    public zzgih(Context context, zzghg zzghgVar, ExecutorService executorService, zzggz zzggzVar, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.a = context;
        this.b = zzghgVar;
        this.c = executorService;
        this.d = zzggzVar;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.t = i;
        this.k = j3;
        this.e = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzgin
    public final void a(zzgim zzgimVar) {
        synchronized (this.m) {
            zzaxm zzaxmVar = this.p;
            String strZza = zzgimVar.zza();
            zzaxmVar.l();
            ((zzaxn) zzaxmVar.b).O(strZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgic
    public final void b(String str, Throwable th, int i, long j) {
        long jLongValue;
        if (this.e) {
            synchronized (this.n) {
                try {
                    ArrayList arrayList = this.q;
                    synchronized (this.o) {
                        try {
                            HashMap map = this.s;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l = (Long) map.get(numValueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            jLongValue = 1 + l.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    arrayList.add(new pl4(i, j, th, str, jLongValue));
                    if (!this.r) {
                        this.r = true;
                        this.b.a(this.h, new ql4(this, 1));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgin
    public final void c(zzihk zzihkVar) {
        synchronized (this.m) {
            zzaxm zzaxmVar = this.p;
            zzaxmVar.l();
            ((zzaxn) zzaxmVar.b).R(zzihkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        xu4 xu4Var = new xu4(Executors.callable(new ql4(this, 0), null));
        this.c.execute(xu4Var);
        return xu4Var;
    }

    static {
        zzbei zzbeiVarE = zzbej.E();
        zzbeiVarE.l();
        ((zzbej) zzbeiVarE.b).F(17);
        u = (zzbej) zzbeiVarE.m();
    }

    public final void d(zzaxn zzaxnVar) {
        try {
            zzbeq zzbeqVarE = zzber.E();
            zzbej zzbejVar = u;
            zzbeqVarE.l();
            ((zzber) zzbeqVarE.b).G(zzbejVar);
            zzbeo zzbeoVarE = zzbep.E();
            zzbeoVarE.l();
            ((zzbep) zzbeoVarE.b).F(zzaxnVar);
            zzbep zzbepVar = (zzbep) zzbeoVarE.m();
            zzbeqVarE.l();
            ((zzber) zzbeqVarE.b).F(zzbepVar);
            this.d.a(this.f, ((zzber) zzbeqVarE.m()).h());
        } catch (RuntimeException unused) {
        }
    }
}
