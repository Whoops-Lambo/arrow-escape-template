package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzddv;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfvw;
import defpackage.kt4;
import defpackage.ku4;
import defpackage.rl3;
import defpackage.sl3;
import defpackage.tc4;
import defpackage.vi4;
import defpackage.xi4;
import defpackage.yi4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzfvw {
    public final ClientApi a;
    public final Context b;
    public final int c;
    public final zzfnf d;
    public final AtomicReference e;
    public final zzfui f;
    public final AtomicBoolean g;
    public final zzcb h;
    public final com.google.android.gms.ads.internal.client.zzce i;
    public final Queue j;
    public final zzfur k;
    public final String l;
    public final AtomicBoolean m;
    public final ScheduledExecutorService n;
    public final zzfpz o;
    public final AtomicBoolean p;
    public zzfuy q;
    public final Clock r;
    public final vi4 s;

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public final void a(final int i) {
        int size;
        zzfui zzfuiVar;
        boolean z = true;
        int size2 = 0;
        Preconditions.checkArgument(i > 0);
        zzfp zzfpVar = (zzfp) this.e.getAndUpdate(new UnaryOperator() { // from class: aj4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((zzfp) obj).zza(i);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i2 = zzfpVar.zzd;
        Queue queue = this.j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() <= i) {
                    z = false;
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.B)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    while (size2 < i) {
                        zzfvh zzfvhVar = (zzfvh) queue.poll();
                        if (zzfvhVar != null) {
                            arrayList.add(zzfvhVar);
                        }
                        size2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    size2 = arrayList.size();
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && size > size2 && (zzfuiVar = this.f) != null) {
            int i3 = size - size2;
            if (size2 == 0) {
                i3--;
            }
            zzfuiVar.d(this, i3);
        }
        zzfuy zzfuyVar = this.q;
        if (zzfuyVar == null || adFormat == null) {
            return;
        }
        long jCurrentTimeMillis = this.r.currentTimeMillis();
        String str = ((zzfp) this.e.get()).zza;
        String str2 = new zzfve(str, adFormat).c;
        zzeav zzeavVarA = zzfuyVar.a.a();
        zzeavVarA.b("action", "cache_resize");
        zzeavVarA.b("cs_ts", Long.toString(jCurrentTimeMillis));
        zzeavVarA.b("orig_ma", Integer.toString(i2));
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzeavVarA.b("ad_unit_id", str);
        zzeavVarA.b("pid", str2);
        zzeavVarA.b("pv", "1");
        zzeavVarA.c();
    }

    public abstract kt4 h(Context context);

    public long i() {
        throw null;
    }

    public abstract com.google.android.gms.ads.internal.client.zzdx j(Object obj);

    public final void k() {
        AtomicBoolean atomicBoolean = this.m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.g.get() || t() >= ((zzfp) this.e.get()).zzd) {
                atomicBoolean.set(false);
            } else {
                this.n.submit(new xi4(this, 5));
            }
        }
    }

    public final void p(int i) {
        Preconditions.checkArgument(i >= 5);
        zzfur zzfurVar = this.k;
        synchronized (zzfurVar) {
            Preconditions.checkArgument(i > 0);
            zzfurVar.d = i;
        }
    }

    public final void b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.G)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.l);
        }
    }

    public final void c(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.p.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new yi4(this, zzeVar));
        }
        this.m.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.e;
        int i2 = ((zzfp) atomicReference.get()).zzb;
        String str = ((zzfp) atomicReference.get()).zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i2).length() + 26 + 61);
        rl3.m(i2, "Preloading ", ", for adUnitId:", str, sb);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(string);
        this.g.set(false);
        zzfui zzfuiVar = this.f;
        if (zzfuiVar != null) {
            zzfuiVar.a(this);
        }
        String str2 = ((zzfp) atomicReference.get()).zza;
        AdFormat adFormatQ = q();
        zzfuy zzfuyVar = this.q;
        long jCurrentTimeMillis = this.r.currentTimeMillis();
        int iS = s();
        int iT = t();
        String strG = g();
        zzeav zzeavVarA = zzfuyVar.a.a();
        zzeavVarA.b("action", "pftla");
        zzeavVarA.b("pftlat_ts", Long.toString(jCurrentTimeMillis));
        zzeavVarA.b("pftlaec", Integer.toString(zzeVar.zza));
        zzeavVarA.b("ad_format", adFormatQ == null ? "unknown" : adFormatQ.name().toLowerCase(Locale.ENGLISH));
        zzeavVarA.b("max_ads", Integer.toString(iS));
        zzeavVarA.b("cache_size", Integer.toString(iT));
        zzeavVarA.b("ad_unit_id", str2);
        zzeavVarA.b("pid", this.l);
        zzeavVarA.b("pv", strG);
        zzeavVarA.c();
    }

    public final void d(boolean z) {
        zzfur zzfurVar = this.k;
        zzfui zzfuiVar = this.f;
        if (zzfuiVar != null) {
            if (z) {
                zzfurVar.c();
            }
            zzfuiVar.a(this);
        } else {
            if (zzfurVar.d()) {
                return;
            }
            if (z) {
                zzfurVar.c();
            }
            this.n.schedule(new xi4(this), zzfurVar.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z;
        int i;
        int i2;
        Queue queue = this.j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z = false;
                i = 0;
                while (true) {
                    boolean z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfvh zzfvhVar = (zzfvh) it.next();
                    if (zzfvhVar.c.currentTimeMillis() < zzfvhVar.b + zzfvhVar.d) {
                        z2 = false;
                    }
                    if (z2) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z = true;
                }
                i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfui zzfuiVar = this.f;
        if (zzfuiVar != null && i > 0) {
            zzfuiVar.d(this, i2);
        }
        if (z) {
            f();
        }
    }

    public final void f() {
        if (this.p.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new xi4(this, 1));
        }
        this.n.execute(new xi4(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.l) ? "2" : "1";
    }

    public final boolean l() {
        boolean zIsEmpty;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O)).booleanValue()) {
            this.k.a();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H)).booleanValue() && this.f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.j;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    public final void n() {
        this.g.set(true);
        this.p.set(true);
        zzfui zzfuiVar = this.f;
        if (zzfuiVar != null) {
            zzfuiVar.d(this, 0);
        } else {
            this.n.submit(new xi4(this));
        }
    }

    public final String o() {
        zzfvh zzfvhVar;
        Queue queue = this.j;
        synchronized (queue) {
            zzfvhVar = (zzfvh) queue.peek();
        }
        Object obj = zzfvhVar == null ? null : zzfvhVar.a;
        com.google.android.gms.ads.internal.client.zzdx zzdxVarJ = obj == null ? null : j(obj);
        if (zzdxVarJ instanceof zzddv) {
            return ((zzddv) zzdxVarJ).d;
        }
        return null;
    }

    public final AdFormat q() {
        return AdFormat.getAdFormat(((zzfp) this.e.get()).zzb);
    }

    public final String r() {
        return ((zzfp) this.e.get()).zza;
    }

    public final int s() {
        return ((zzfp) this.e.get()).zzd;
    }

    public final int t() {
        int size;
        Queue queue = this.j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long jCurrentTimeMillis;
        long j;
        if (!this.g.get() || this.m.get() || t() >= s()) {
            return false;
        }
        zzfur zzfurVar = this.k;
        synchronized (zzfurVar) {
            jCurrentTimeMillis = zzfurVar.f.currentTimeMillis();
            j = zzfurVar.e;
        }
        return jCurrentTimeMillis >= j && !zzfurVar.d();
    }

    public zzfvw(String str, ClientApi clientApi, Context context, int i, zzfnf zzfnfVar, zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfpz zzfpzVar, zzfur zzfurVar, Clock clock, zzfui zzfuiVar) {
        Queue priorityQueue;
        this.l = str;
        this.a = clientApi;
        this.b = context;
        this.c = i;
        this.d = zzfnfVar;
        AtomicReference atomicReference = new AtomicReference(zzfpVar);
        this.e = atomicReference;
        int iMax = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.h0)).booleanValue()) {
            priorityQueue = new zzfvz();
        } else {
            priorityQueue = new PriorityQueue(iMax, sl3.h);
        }
        this.j = priorityQueue;
        this.g = new AtomicBoolean(true);
        this.m = new AtomicBoolean(false);
        this.n = scheduledExecutorService;
        this.o = zzfpzVar;
        this.k = zzfurVar;
        this.p = new AtomicBoolean(true);
        this.r = clock;
        zzfve zzfveVar = new zzfve(zzfpVar.zza, AdFormat.getAdFormat(((zzfp) atomicReference.get()).zzb));
        zzfveVar.c = str;
        this.s = new vi4(zzfveVar);
        this.f = zzfuiVar;
    }

    public final Object m() {
        final zzfvh zzfvhVar;
        final boolean z;
        final zzfvh zzfvhVar2;
        zzfui zzfuiVar;
        final int iT = t();
        Queue queue = this.j;
        synchronized (queue) {
            try {
                zzfvhVar = (zzfvh) queue.poll();
                boolean z2 = false;
                if (zzfvhVar != null && queue.isEmpty()) {
                    z2 = true;
                }
                z = z2;
                if (zzfvhVar != null && !queue.isEmpty()) {
                    zzfvhVar2 = (zzfvh) queue.peek();
                } else {
                    zzfvhVar2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Z)).booleanValue() && (zzfuiVar = this.f) != null) {
            zzfuiVar.b(this);
        }
        final long jCurrentTimeMillis = this.r.currentTimeMillis();
        final int iS = s();
        final int iT2 = t();
        this.n.submit(new Runnable() { // from class: zi4
            @Override // java.lang.Runnable
            public final void run() {
                zzfvh zzfvhVar3;
                zzfvw zzfvwVar = this.a;
                zzfur zzfurVar = zzfvwVar.k;
                if (((Boolean) zzba.zzc().a(zzbjr.Q)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(zzbjr.P)).booleanValue() || iT == 1) {
                        zzfurVar.a();
                    }
                }
                zzfvh zzfvhVar4 = zzfvhVar;
                if (zzfvhVar4 != null && (zzfvhVar3 = zzfvhVar2) != null) {
                    AdFormat adFormat = AdFormat.getAdFormat(((zzfp) zzfvwVar.e.get()).zzb);
                    zzdx zzdxVarJ = zzfvwVar.j(zzfvhVar4.a);
                    String str = !(zzdxVarJ instanceof zzddv) ? null : ((zzddv) zzdxVarJ).d;
                    if (adFormat != null && str != null && zzfvhVar3.b < zzfvhVar4.b) {
                        zzfvwVar.q.g("poll_ad", "psvroc_ts", jCurrentTimeMillis, iS, iT2, str, zzfvwVar.s, zzfvwVar.g());
                    }
                }
                zzfui zzfuiVar2 = zzfvwVar.f;
                if (zzfuiVar2 == null) {
                    long jI = zzfvwVar.i();
                    if (jI < 0) {
                        jI = ((Long) zzba.zzc().a(zzbjr.U)).longValue();
                    }
                    if (jI > 0) {
                        zzfvwVar.n.schedule(new xi4(zzfvwVar), jI, TimeUnit.MILLISECONDS);
                    } else {
                        zzfvwVar.v();
                    }
                } else if (!((Boolean) zzba.zzc().a(zzbjr.Z)).booleanValue()) {
                    zzfuiVar2.b(zzfvwVar);
                }
                if (z) {
                    zzfvwVar.f();
                }
            }
        });
        if (zzfvhVar == null) {
            return null;
        }
        return zzfvhVar.a;
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.m;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (this.g.get() && t() < ((zzfp) this.e.get()).zzd) {
            w();
        } else {
            atomicBoolean.set(false);
        }
    }

    public final void w() {
        kt4 kt4VarH;
        Activity activityD = com.google.android.gms.ads.internal.zzt.zzg().d();
        if (activityD == null) {
            String strValueOf = String.valueOf(((zzfp) this.e.get()).zza);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            kt4VarH = h(this.b);
        } else {
            kt4VarH = h(activityD);
        }
        kt4VarH.addListener(new ku4(0, kt4VarH, new tc4(this, 24)), this.n);
    }

    public zzfvw(String str, ClientApi clientApi, Context context, int i, zzfnf zzfnfVar, zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfpz zzfpzVar, zzfur zzfurVar, Clock clock, zzfui zzfuiVar) {
        this(str, clientApi, context, i, zzfnfVar, zzfpVar, scheduledExecutorService, zzfpzVar, zzfurVar, clock, zzfuiVar);
        this.i = zzceVar;
    }

    public zzfvw(ClientApi clientApi, Context context, int i, zzfnf zzfnfVar, zzfp zzfpVar, zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfpz zzfpzVar, zzfur zzfurVar, Clock clock) {
        this("none", clientApi, context, i, zzfnfVar, zzfpVar, scheduledExecutorService, zzfpzVar, zzfurVar, clock, null);
        this.h = zzcbVar;
    }
}
