package com.facebook.bolts;

import defpackage.ov1;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final ExecutorService h;
    public static final c i;
    public final ReentrantLock a;
    public final Condition b;
    public boolean c;
    public boolean d;
    public Object e;
    public Exception f;
    public ArrayList g;

    static {
        d dVar = d.d;
        h = dVar.a;
        i = dVar.c;
        a aVar = b.b.a;
        new h((Boolean) null);
        new h(Boolean.TRUE);
        new h(Boolean.FALSE);
        new h(0);
    }

    public final void a(final e eVar) {
        ArrayList arrayList;
        final c cVar = i;
        cVar.getClass();
        final com.facebook.ads.a aVar = new com.facebook.ads.a(2);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z = this.c;
                reentrantLock.unlock();
                if (!z && (arrayList = this.g) != null) {
                    arrayList.add(new e() { // from class: com.facebook.bolts.g
                        @Override // com.facebook.bolts.e
                        public final Object then(h hVar) {
                            com.facebook.ads.a aVar2 = aVar;
                            e eVar2 = eVar;
                            Executor executor = cVar;
                            executor.getClass();
                            ExecutorService executorService = h.h;
                            try {
                                executor.execute(new ov1(28, aVar2, eVar2, hVar));
                                return null;
                            } catch (Exception e) {
                                aVar2.N(new f(e));
                                return null;
                            }
                        }
                    });
                }
                reentrantLock.unlock();
                if (z) {
                    try {
                        cVar.execute(new ov1(28, aVar, eVar, this));
                    } catch (Exception e) {
                        aVar.N(new f(e));
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Exception b() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.g;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    try {
                        ((e) obj).then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.g = null;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean d() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.signalAll();
            c();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean e(Object obj) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = obj;
            this.b.signalAll();
            c();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public h(Boolean bool) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.g = new ArrayList();
        e(bool);
    }

    public h() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.g = new ArrayList();
    }

    public h(int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.g = new ArrayList();
        d();
    }
}
