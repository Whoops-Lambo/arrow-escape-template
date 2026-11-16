package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import defpackage.t95;
import defpackage.xb5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzwt implements zzxv {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final zzyd c = new zzyd();
    public final zzus d = new zzus();
    public Looper e;
    public zzbf f;
    public zzqn g;
    public zzaca h;

    public void l() {
    }

    public abstract void m(zziu zziuVar);

    public void n() {
    }

    public abstract void o();

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void a(zzxu zzxuVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(zzxuVar);
        if (!arrayList.isEmpty()) {
            c(zzxuVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void b(Handler handler, zzye zzyeVar) {
        zzyd zzydVar = this.c;
        zzydVar.getClass();
        zzydVar.b.add(new xb5(handler, zzyeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void c(zzxu zzxuVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzxuVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        n();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void d(zzxu zzxuVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzxuVar);
        if (zIsEmpty) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void e(zzye zzyeVar) {
        CopyOnWriteArrayList<xb5> copyOnWriteArrayList = this.c.b;
        for (xb5 xb5Var : copyOnWriteArrayList) {
            if (xb5Var.b == zzyeVar) {
                copyOnWriteArrayList.remove(xb5Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void g(zzut zzutVar) {
        CopyOnWriteArrayList<t95> copyOnWriteArrayList = this.d.b;
        for (t95 t95Var : copyOnWriteArrayList) {
            if (t95Var.a == zzutVar) {
                copyOnWriteArrayList.remove(t95Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void h(Handler handler, zzut zzutVar) {
        zzus zzusVar = this.d;
        zzusVar.getClass();
        zzusVar.b.add(new t95(zzutVar));
    }

    public final void p(zzbf zzbfVar) {
        this.f = zzbfVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxu) arrayList.get(i)).a(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void j(zzxu zzxuVar, zzqn zzqnVar, zzaca zzacaVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzgvz.a(z);
        this.g = zzqnVar;
        this.h = zzacaVar;
        zzbf zzbfVar = this.f;
        this.a.add(zzxuVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(zzxuVar);
            m(zzacaVar.zze());
        } else if (zzbfVar != null) {
            d(zzxuVar);
            zzxuVar.a(this, zzbfVar);
        }
    }
}
