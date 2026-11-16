package com.bytedance.adsdk.ahm;

import android.os.Handler;
import android.os.Looper;
import defpackage.e32;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class twf<T> {
    public static Executor kgy = Executors.newCachedThreadPool();
    private final Set<nu<T>> ahm;
    private volatile at<T> ct;
    private final Set<nu<Throwable>> rz;
    private final Handler uq;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kgy(Throwable th) {
        ArrayList arrayList = new ArrayList(this.rz);
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nu) obj).kgy(th);
        }
    }

    public synchronized twf<T> ahm(nu<T> nuVar) {
        this.ahm.remove(nuVar);
        return this;
    }

    public synchronized twf<T> rz(nu<Throwable> nuVar) {
        try {
            at<T> atVar = this.ct;
            if (atVar != null && atVar.ahm() != null) {
                nuVar.kgy(atVar.ahm());
            }
            this.rz.add(nuVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized twf<T> uq(nu<Throwable> nuVar) {
        this.rz.remove(nuVar);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy<T> extends FutureTask<at<T>> {
        private twf<T> kgy;

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.kgy.kgy((at) get());
                } catch (InterruptedException | ExecutionException e) {
                    this.kgy.kgy(new at(e));
                }
            } finally {
                this.kgy = null;
            }
        }

        public kgy(twf<T> twfVar, Callable<at<T>> callable) {
            super(callable);
            this.kgy = twfVar;
        }
    }

    public twf(Callable<at<T>> callable, boolean z) {
        this.ahm = new LinkedHashSet(1);
        this.rz = new LinkedHashSet(1);
        this.uq = new Handler(Looper.getMainLooper());
        this.ct = null;
        if (z) {
            try {
                kgy((at) callable.call());
                return;
            } catch (Throwable th) {
                kgy((at) new at<>(th));
                return;
            }
        }
        kgy.execute(new kgy(this, callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(at<T> atVar) {
        if (this.ct == null) {
            this.ct = atVar;
            kgy();
        } else {
            e32.i("A task may only be set once.");
        }
    }

    public synchronized twf<T> kgy(nu<T> nuVar) {
        try {
            at<T> atVar = this.ct;
            if (atVar != null && atVar.kgy() != null) {
                nuVar.kgy(atVar.kgy());
            }
            this.ahm.add(nuVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void kgy() {
        this.uq.post(new Runnable() { // from class: com.bytedance.adsdk.ahm.twf.1
            @Override // java.lang.Runnable
            public void run() {
                at atVar = twf.this.ct;
                if (atVar == null) {
                    return;
                }
                Object objKgy = atVar.kgy();
                twf twfVar = twf.this;
                if (objKgy != null) {
                    twfVar.kgy(atVar.kgy());
                } else {
                    twfVar.kgy(atVar.ahm());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kgy(T t) {
        ArrayList arrayList = new ArrayList(this.ahm);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nu) obj).kgy(t);
        }
    }

    public twf(Callable<at<T>> callable) {
        this(callable, false);
    }
}
