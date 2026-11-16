package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zy extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(zy.class, "workerCtl$volatile");
    public final u83 a;
    public final m32 b;
    public az c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ bz h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public final no2 f() {
        int iE = e(2);
        bz bzVar = this.h;
        ju0 ju0Var = bzVar.f;
        ju0 ju0Var2 = bzVar.e;
        if (iE == 0) {
            no2 no2Var = (no2) ju0Var2.d();
            return no2Var != null ? no2Var : (no2) ju0Var.d();
        }
        no2 no2Var2 = (no2) ju0Var.d();
        return no2Var2 != null ? no2Var2 : (no2) ju0Var2.d();
    }

    public zy(bz bzVar, int i2) {
        this.h = bzVar;
        setDaemon(true);
        setContextClassLoader(bz.class.getClassLoader());
        this.a = new u83();
        this.b = new m32();
        this.c = az.d;
        this.nextParkedWorker = bz.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        g(i2);
    }

    public final no2 a(boolean z) {
        no2 no2VarF;
        no2 no2VarF2;
        long j;
        az azVar = this.c;
        bz bzVar = this.h;
        no2 no2Var = null;
        u83 u83Var = this.a;
        az azVar2 = az.a;
        if (azVar != azVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = bz.i;
            do {
                j = atomicLongFieldUpdater.get(bzVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    u83Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u83.b;
                        no2 no2Var2 = (no2) atomicReferenceFieldUpdater.get(u83Var);
                        if (no2Var2 == null || !no2Var2.b) {
                            int i2 = u83.d.get(u83Var);
                            int i3 = u83.c.get(u83Var);
                            while (i2 != i3 && u83.e.get(u83Var) != 0) {
                                i3--;
                                no2 no2VarC = u83Var.c(i3, true);
                                if (no2VarC != null) {
                                    no2Var = no2VarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(u83Var, no2Var2, null)) {
                                no2Var = no2Var2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(u83Var) == no2Var2);
                    }
                    if (no2Var != null) {
                        return no2Var;
                    }
                    no2 no2Var3 = (no2) bzVar.f.d();
                    return no2Var3 == null ? j(1) : no2Var3;
                }
            } while (!bz.i.compareAndSet(bzVar, j, j - 4398046511104L));
            this.c = azVar2;
        }
        if (z) {
            boolean z2 = e(bzVar.a * 2) == 0;
            if (z2 && (no2VarF2 = f()) != null) {
                return no2VarF2;
            }
            u83Var.getClass();
            no2 no2VarB = (no2) u83.b.getAndSet(u83Var, null);
            if (no2VarB == null) {
                no2VarB = u83Var.b();
            }
            if (no2VarB != null) {
                return no2VarB;
            }
            if (!z2 && (no2VarF = f()) != null) {
                return no2VarF;
            }
        } else {
            no2 no2VarF3 = f();
            if (no2VarF3 != null) {
                return no2VarF3;
            }
        }
        return j(3);
    }

    public final int c() {
        return this.indexInArray;
    }

    public final Object d() {
        return this.nextParkedWorker;
    }

    public final int e(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final void g(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(az azVar) {
        az azVar2 = this.c;
        boolean z = azVar2 == az.a;
        if (z) {
            bz.i.addAndGet(this.h, 4398046511104L);
        }
        if (azVar2 != azVar) {
            this.c = azVar;
        }
        return z;
    }

    public final no2 j(int i2) {
        long j;
        no2 no2VarC;
        long j2;
        long j3;
        no2 no2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = bz.i;
        bz bzVar = this.h;
        int i3 = (int) (atomicLongFieldUpdater.get(bzVar) & 2097151);
        no2 no2Var2 = null;
        if (i3 < 2) {
            return null;
        }
        int iE = e(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iE++;
            if (iE > i3) {
                iE = 1;
            }
            zy zyVar = (zy) bzVar.g.b(iE);
            if (zyVar != null && zyVar != this) {
                u83 u83Var = zyVar.a;
                if (i2 != 3) {
                    u83Var.getClass();
                    int i5 = u83.d.get(u83Var);
                    int i6 = u83.c.get(u83Var);
                    boolean z = i2 == 1;
                    while (true) {
                        if (i5 != i6) {
                            j = 0;
                            if (!z || u83.e.get(u83Var) != 0) {
                                int i7 = i5 + 1;
                                no2VarC = u83Var.c(i5, z);
                                if (no2VarC != null) {
                                    break;
                                }
                                i5 = i7;
                            }
                        } else {
                            j = 0;
                        }
                        no2VarC = no2Var2;
                        break;
                    }
                } else {
                    no2VarC = u83Var.b();
                    j = 0;
                }
                m32 m32Var = this.b;
                if (no2VarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u83.b;
                        no2 no2Var3 = (no2) atomicReferenceFieldUpdater.get(u83Var);
                        if (no2Var3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((no2Var3.b ? 1 : 2) & i2) != 0) {
                                po2.f.getClass();
                                u83 u83Var2 = u83Var;
                                long jNanoTime = System.nanoTime() - no2Var3.a;
                                long j4 = po2.b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    no2Var = null;
                                    break;
                                }
                                do {
                                    no2Var = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(u83Var2, no2Var3, null)) {
                                        m32Var.a = no2Var3;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(u83Var2) == no2Var3);
                                u83Var = u83Var2;
                                no2Var2 = null;
                            }
                        }
                        j3 = -2;
                        no2Var = no2Var2;
                        break;
                    }
                } else {
                    m32Var.a = no2VarC;
                    no2Var = no2Var2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    no2 no2Var4 = (no2) m32Var.a;
                    m32Var.a = no2Var;
                    return no2Var4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            no2Var2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (bz.j.get(this.h) != 1) {
                    az azVar = this.c;
                    az azVar2 = az.e;
                    if (azVar == azVar2) {
                        break loop0;
                    }
                    no2 no2VarA = a(this.g);
                    if (no2VarA != null) {
                        this.e = 0L;
                        bz bzVar = this.h;
                        this.d = 0L;
                        if (this.c == az.c) {
                            this.c = az.b;
                        }
                        if (!no2VarA.b) {
                            try {
                                no2VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (i(az.b) && !bzVar.t() && !bzVar.r(bz.i.get(bzVar))) {
                            bzVar.t();
                        }
                        try {
                            no2VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        bz.i.addAndGet(bzVar, -2097152L);
                        if (this.c == azVar2) {
                            break;
                        }
                        this.c = az.d;
                        break;
                    }
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        tx txVar = bz.k;
                        if (obj != txVar) {
                            i.set(this, -1);
                            while (this.nextParkedWorker != bz.k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                bz bzVar2 = this.h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = bz.j;
                                if (atomicIntegerFieldUpdater2.get(bzVar2) == 1) {
                                    break;
                                }
                                az azVar3 = this.c;
                                az azVar4 = az.e;
                                if (azVar3 == azVar4) {
                                    break;
                                }
                                i(az.c);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    j = 2097151;
                                    this.d = System.nanoTime() + this.h.c;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.h.c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    bz bzVar3 = this.h;
                                    synchronized (bzVar3.g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bzVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = bz.i;
                                                if (((int) (atomicLongFieldUpdater.get(bzVar3) & j)) > bzVar3.a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        g(0);
                                                        bzVar3.o(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bzVar3) & j);
                                                        if (andDecrement != i2) {
                                                            Object objB = bzVar3.g.b(andDecrement);
                                                            objB.getClass();
                                                            zy zyVar = (zy) objB;
                                                            bzVar3.g.c(i2, zyVar);
                                                            zyVar.g(i2);
                                                            bzVar3.o(zyVar, andDecrement, i2);
                                                        }
                                                        bzVar3.g.c(andDecrement, null);
                                                        this.c = azVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            bz bzVar4 = this.h;
                            if (this.nextParkedWorker == txVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = bz.h;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(bzVar4);
                                    long j3 = (j2 + CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) & (-2097152);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = bzVar4.g.b((int) (j2 & 2097151));
                                    bz bzVar5 = bzVar4;
                                    if (bz.h.compareAndSet(bzVar5, j2, j3 | ((long) i3))) {
                                        break;
                                    } else {
                                        bzVar4 = bzVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            i(az.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        i(az.e);
    }
}
