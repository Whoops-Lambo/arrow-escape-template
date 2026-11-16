package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import defpackage.bd5;
import defpackage.e32;
import defpackage.ec5;
import defpackage.fc5;
import defpackage.kc5;
import defpackage.lc5;
import defpackage.m93;
import defpackage.nc5;
import defpackage.ql3;
import defpackage.sb5;
import defpackage.sc5;
import defpackage.sk3;
import defpackage.ub5;
import defpackage.zb5;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzxz implements zzyi, zzzd {
    public static final String h = new String();
    public final Level a;
    public final long b;
    public zb5 c;
    public zzyc d;
    public zzyq e;
    public zzaaf f;
    public Object[] g;

    public abstract zzabl c();

    public abstract zzxs e();

    public abstract ub5 f();

    public zzxz(Level level) {
        sk3.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        zzabr.a(level, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.a = level;
        this.b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi a(Throwable th) {
        zzyl zzylVar = zzxx.a;
        zzabr.a(zzylVar, "metadata key");
        if (th != null) {
            k(zzylVar, th);
        }
        return f();
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final void b(String str, Object[] objArr) {
        zb5 zb5Var;
        if (this.d == null) {
            sk3.a.a().getClass();
            this.d = zzyc.a;
        }
        zzyd zzydVarB = this.d;
        if (zzydVarB != zzyc.a) {
            zb5 zb5Var2 = this.c;
            if (zb5Var2 != null && zb5Var2.b > 0) {
                zzabr.a(zzydVarB, "logSiteKey");
                int i = zb5Var2.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (zzxx.f.equals(zb5Var2.b(i2))) {
                        Object objC = zb5Var2.c(i2);
                        zzydVarB = objC instanceof zzyj ? ((zzyj) objC).b() : new sc5(zzydVarB, objC);
                    }
                }
            }
        } else {
            zzydVarB = null;
        }
        boolean zD = d(zzydVarB);
        zzyq zzyqVar = this.e;
        if (zzyqVar != null) {
            nc5 nc5Var = (nc5) nc5.c.b(zzydVarB, this.c);
            AtomicInteger atomicInteger = nc5Var.b;
            AtomicBoolean atomicBoolean = nc5Var.a;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            int i3 = -1;
            if (zzyqVar != zzyq.a && atomicBoolean.compareAndSet(false, true)) {
                try {
                    zzyqVar.a();
                    atomicBoolean.set(false);
                    atomicInteger.addAndGet(-iIncrementAndGet);
                    i3 = (-1) + iIncrementAndGet;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            if (zD && i3 > 0 && (zb5Var = this.c) != null) {
                zb5Var.e(zzxx.e, Integer.valueOf(i3));
            }
            zD &= i3 >= 0;
        }
        if (zD) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (int i4 = 0; i4 < objArrCopyOf.length; i4++) {
                Object obj = objArrCopyOf[i4];
                if (obj instanceof zzxu) {
                    objArrCopyOf[i4] = ((zzxu) obj).zza();
                }
            }
            if (str != h) {
                this.f = new zzaaf(c(), str);
            }
            zzabe zzabeVarB = sk3.a.c().b();
            if (!zzabeVarB.a.isEmpty()) {
                zzzj zzzjVarJ = j();
                zzyl zzylVar = zzxx.h;
                zzabe zzabeVar = (zzabe) zzzjVarJ.d(zzylVar);
                if (zzabeVar != null) {
                    ql3 ql3Var = zzabeVar.a;
                    if (!ql3Var.isEmpty()) {
                        ql3 ql3Var2 = zzabeVarB.a;
                        if (!ql3Var2.isEmpty()) {
                            zzabeVar = new zzabe(new ql3(ql3Var2, ql3Var));
                        }
                        zzabeVarB = zzabeVar;
                    }
                }
                k(zzylVar, zzabeVarB);
            }
            zzzf zzzfVar = e().a;
            try {
                zzabt zzabtVar = (zzabt) zzabt.b.get();
                int i5 = zzabtVar.a + 1;
                zzabtVar.a = i5;
                if (i5 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i5 <= 100) {
                        zzzfVar.c(this);
                    } else {
                        zzxi.a("unbounded recursion in log statement", this);
                    }
                    zzabtVar.close();
                } catch (Throwable th2) {
                    try {
                        zzabtVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (RuntimeException e) {
                try {
                    zzzfVar.d(e, this);
                } catch (zzzg e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    String message = e3.getMessage();
                    StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(message);
                    zzxi.a(sb.toString(), this);
                    try {
                        e3.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Type inference failed for: r13v9, types: [kc5] */
    public boolean d(zzyd zzydVar) {
        StackTraceElement[] stackTraceElementArr;
        int iF;
        int i;
        k kVar;
        ?? lc5Var;
        ?? r13;
        kc5 kc5Var;
        kc5 kc5Var2;
        zb5 zb5Var = this.c;
        if (zb5Var != null) {
            if (zzydVar != null) {
                int i2 = l.d;
                if (zb5Var.d(zzxx.d) != null) {
                    m93.b();
                    return false;
                }
                zb5 zb5Var2 = this.c;
                sb5 sb5Var = k.d;
                Integer num = (Integer) zb5Var2.d(zzxx.b);
                if (num == null) {
                    lc5Var = 0;
                } else {
                    kVar = (k) k.d.b(zzydVar, zb5Var2);
                    if (kVar.c.incrementAndGet() < num.intValue()) {
                        lc5Var = kVar;
                        lc5Var = zzyq.a;
                    }
                }
                lc5Var = kVar;
                zb5 zb5Var3 = this.c;
                sb5 sb5Var2 = m.d;
                Integer num2 = (Integer) zb5Var3.d(zzxx.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r13 = 0;
                } else {
                    r13 = (m) m.d.b(zzydVar, zb5Var3);
                    int iNextInt = ((Random) m.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r13.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r13 = zzyq.a;
                    }
                }
                if (lc5Var == 0) {
                    lc5Var = r13;
                } else if (r13 != 0 && lc5Var != (kc5Var = zzyq.a) && r13 != (kc5Var2 = zzyq.b)) {
                    if (r13 == kc5Var || lc5Var == kc5Var2) {
                        lc5Var = r13;
                    } else {
                        lc5Var = new lc5(lc5Var, r13);
                    }
                }
                this.e = lc5Var;
                if (lc5Var == zzyq.a) {
                    return false;
                }
            }
            zb5 zb5Var4 = this.c;
            zzyl zzylVar = zzxx.i;
            zzyv zzyvVar = (zzyv) zb5Var4.d(zzylVar);
            if (zzyvVar != null) {
                zb5 zb5Var5 = this.c;
                if (zb5Var5 != null && (iF = zb5Var5.f(zzylVar)) >= 0) {
                    int i3 = iF + iF;
                    int i4 = i3 + 2;
                    while (true) {
                        i = zb5Var5.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        Object obj = zb5Var5.a[i4];
                        if (!obj.equals(zzylVar)) {
                            Object[] objArr = zb5Var5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    zb5Var5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        zb5Var5.a[i3] = null;
                        i3++;
                    }
                }
                zzzj zzzjVarJ = j();
                zzyl zzylVar2 = zzxx.a;
                Throwable th = (Throwable) zzzjVarJ.d(zzylVar2);
                int i5 = zzyvVar.a;
                String[] strArr = zzabq.a;
                if (i5 <= 0 && i5 != -1) {
                    defpackage.d.r("invalid maximum depth: 0");
                    return false;
                }
                zzabq.b.getClass();
                if (!(i5 == -1 || i5 > 0)) {
                    defpackage.d.r("maxDepth must be > 0 or -1");
                    return false;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = zzxz.class.getName();
                int i6 = 3;
                boolean z = false;
                while (true) {
                    if (i6 >= stackTrace.length) {
                        i6 = -1;
                        break;
                    }
                    if (stackTrace[i6].getClassName().equals(name)) {
                        z = true;
                    } else if (z) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i6;
                    if (i5 <= 0 || i5 >= length) {
                        i5 = length;
                    }
                    StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i5];
                    System.arraycopy(stackTrace, i6, stackTraceElementArr2, 0, i5);
                    stackTraceElementArr = stackTraceElementArr2;
                }
                k(zzylVar2, new zzyg(th, zzyvVar, stackTraceElementArr));
                return true;
            }
        }
        return true;
    }

    public final zzyc g() {
        zzyc zzycVar = this.d;
        if (zzycVar != null) {
            return zzycVar;
        }
        e32.i("cannot request log site information prior to postProcess()");
        return null;
    }

    public final Object[] h() {
        if (!(this.f != null)) {
            e32.i("cannot get arguments unless a template context exists");
            return null;
        }
        Object[] objArr = this.g;
        if (objArr != null) {
            return objArr;
        }
        e32.i("cannot get arguments before calling log()");
        return null;
    }

    public final Object i() {
        if (!(this.f == null)) {
            e32.i("cannot get literal argument if a template context exists");
            return null;
        }
        Object[] objArr = this.g;
        if (objArr != null) {
            return objArr[0];
        }
        e32.i("cannot get literal argument before calling log()");
        return null;
    }

    public final zzzj j() {
        zb5 zb5Var = this.c;
        return zb5Var != null ? zb5Var : bd5.a;
    }

    public final void k(zzyl zzylVar, Object obj) {
        if (this.c == null) {
            zb5 zb5Var = new zb5();
            zb5Var.a = new Object[8];
            zb5Var.b = 0;
            this.c = zb5Var;
        }
        this.c.e(zzylVar, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi zzn() {
        ec5 ec5Var = zzyc.a;
        fc5 fc5Var = new fc5();
        if (this.d == null) {
            this.d = fc5Var;
        }
        return f();
    }
}
