package com.google.android.gms.internal.ads;

import android.os.Looper;
import defpackage.ch2;
import defpackage.dh4;
import defpackage.fc4;
import defpackage.tj;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeg {
    public final Thread a;
    public final zzea b;
    public final zzec c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public final void b(Object obj) {
        if (this.i) {
            zzgvz.f(Thread.currentThread() == this.a);
        }
        CopyOnWriteArraySet<fc4> copyOnWriteArraySet = this.d;
        for (fc4 fc4Var : copyOnWriteArraySet) {
            if (fc4Var.a.equals(obj)) {
                fc4Var.d = true;
                zzec zzecVar = this.c;
                if (zzecVar != null && fc4Var.c) {
                    fc4Var.c = false;
                    zzecVar.g(fc4Var.a, fc4Var.b.b());
                }
                copyOnWriteArraySet.remove(fc4Var);
            }
        }
    }

    public final void c(int i, zzeb zzebVar) {
        int i2 = 1;
        if (this.i) {
            zzgvz.f(Thread.currentThread() == this.a);
        }
        this.f.add(new tj(new CopyOnWriteArraySet(this.d), i, zzebVar, i2));
    }

    public final void d() {
        if (this.i) {
            zzgvz.f(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            zzea zzeaVar = this.b;
            zzeaVar.getClass();
            if (!zzeaVar.zzb(1)) {
                zzeaVar.j(zzeaVar.g(1));
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void e() {
        if (this.i) {
            zzgvz.f(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        CopyOnWriteArraySet<fc4> copyOnWriteArraySet = this.d;
        for (fc4 fc4Var : copyOnWriteArraySet) {
            zzec zzecVar = this.c;
            fc4Var.d = true;
            if (zzecVar != null && fc4Var.c) {
                fc4Var.c = false;
                zzecVar.g(fc4Var.a, fc4Var.b.b());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public zzeg(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, zzdp zzdpVar, zzec zzecVar, boolean z) {
        dh4 dh4VarA;
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = zzecVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper != null && zzdpVar != null && zzecVar != null) {
            dh4VarA = zzdpVar.a(looper, new ch2(this, 1));
        } else {
            dh4VarA = null;
        }
        this.b = dh4VarA;
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new fc4(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzeg(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
