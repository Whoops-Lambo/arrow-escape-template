package androidx.datastore.core;

import defpackage.bp0;
import defpackage.cm2;
import defpackage.dr0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.kk2;
import defpackage.n30;
import defpackage.nq2;
import defpackage.pp1;
import defpackage.sy;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zp;
import defpackage.zr0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public final sy a;
    public final File b;
    public final zp c;
    public final String d;
    public final String e;
    public final String f;
    public final pp1 g;
    public final cm2 h;
    public final cm2 i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r1 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            r12.r = r11;
            r12.s = r3;
            r12.u = 1;
            r0 = defpackage.ns1.i(r3, r12);
            r1 = defpackage.dz.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (r0 == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0072). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(java.io.FileOutputStream r11, defpackage.fy r12) throws java.io.IOException {
            /*
                boolean r0 = r12 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r12
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.t
                int r1 = r0.u
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L2a
                long r3 = r0.s
                java.io.FileOutputStream r11 = r0.r
                defpackage.wz2.a0(r12)
                r12 = r0
                goto L72
            L2a:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r11)
                r11 = 0
                return r11
            L31:
                defpackage.wz2.a0(r12)
                r3 = 10
                r12 = r0
            L37:
                r0 = 60000(0xea60, double:2.9644E-319)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L77
                java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L52
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L52
                r0.getClass()     // Catch: java.io.IOException -> L52
                goto L8a
            L52:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L76
                java.lang.String r5 = "Resource deadlock would occur"
                r6 = 0
                boolean r1 = defpackage.dk2.O(r1, r5, r6)
                if (r1 != r2) goto L76
                r12.r = r11
                r12.s = r3
                r12.u = r2
                java.lang.Object r0 = defpackage.ns1.i(r3, r12)
                dz r1 = defpackage.dz.a
                if (r0 != r1) goto L72
                r0 = r1
                goto L8a
            L72:
                r0 = 2
                long r3 = r3 * r0
                goto L37
            L76:
                throw r0
            L77:
                java.nio.channels.FileChannel r5 = r11.getChannel()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
                r0.getClass()
            L8a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.a(java.io.FileOutputStream, fy):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [zr0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [pp1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [pp1] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [pp1] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [pp1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object a(zr0 zr0Var, fy fyVar) throws Throwable {
        ?? multiProcessCoordinator$tryLock$1;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (fyVar instanceof MultiProcessCoordinator$tryLock$1) {
            MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$2 = (MultiProcessCoordinator$tryLock$1) fyVar;
            int i = multiProcessCoordinator$tryLock$2.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$tryLock$2.x = i - Integer.MIN_VALUE;
                multiProcessCoordinator$tryLock$1 = multiProcessCoordinator$tryLock$2;
            } else {
                multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(this, fyVar);
            }
        } else {
            multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(this, fyVar);
        }
        Object objInvoke = multiProcessCoordinator$tryLock$1.v;
        ?? r5 = multiProcessCoordinator$tryLock$1.x;
        try {
            if (r5 == 0) {
                wz2.a0(objInvoke);
                pp1 pp1Var = this.g;
                boolean zF = pp1Var.f();
                dz dzVar = dz.a;
                try {
                    if (zF) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !kk2.L(message2, this.f, false)) && ((message = e.getMessage()) == null || !kk2.L(message, "Resource deadlock would occur", false))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                multiProcessCoordinator$tryLock$1.r = pp1Var;
                                multiProcessCoordinator$tryLock$1.s = fileInputStream2;
                                multiProcessCoordinator$tryLock$1.t = fileLockTryLock;
                                multiProcessCoordinator$tryLock$1.u = zF;
                                multiProcessCoordinator$tryLock$1.x = 2;
                                objInvoke = zr0Var.invoke(boolValueOf, multiProcessCoordinator$tryLock$1);
                                if (objInvoke != dzVar) {
                                    fileLock = fileLockTryLock;
                                    multiProcessCoordinator$tryLock$1 = pp1Var;
                                    r1 = zF;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    nq2.e(fileInputStream, null);
                                    if (r1 != 0) {
                                        multiProcessCoordinator$tryLock$1.g(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        multiProcessCoordinator$tryLock$1.r = pp1Var;
                        multiProcessCoordinator$tryLock$1.u = zF;
                        multiProcessCoordinator$tryLock$1.x = 1;
                        objInvoke = zr0Var.invoke(bool, multiProcessCoordinator$tryLock$1);
                        if (objInvoke != dzVar) {
                            r3 = pp1Var;
                            r4 = zF;
                            if (r4 != 0) {
                                r3.g(null);
                            }
                            return objInvoke;
                        }
                    }
                    return dzVar;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = pp1Var;
                    r1 = zF;
                }
            } else if (r5 == 1) {
                r1 = multiProcessCoordinator$tryLock$1.u;
                r2 = multiProcessCoordinator$tryLock$1.r;
                try {
                    wz2.a0(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.g(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (r5 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = multiProcessCoordinator$tryLock$1.u;
                fileLock = multiProcessCoordinator$tryLock$1.t;
                fileInputStream = multiProcessCoordinator$tryLock$1.s;
                pp1 pp1Var2 = multiProcessCoordinator$tryLock$1.r;
                try {
                    wz2.a0(objInvoke);
                    r1 = z;
                    multiProcessCoordinator$tryLock$1 = pp1Var2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        nq2.e(fileInputStream, null);
                        if (r1 != 0) {
                            multiProcessCoordinator$tryLock$1.g(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    nq2.e(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = multiProcessCoordinator$tryLock$1;
        if (r1 != 0) {
            r2.g(null);
        }
        throw th;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final bp0 b() {
        return this.c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object c(fy fyVar) {
        if (this.i.isInitialized()) {
            return new Integer(SharedCounter.b.nativeGetCounterValue(g().a));
        }
        return tb5.E(this.a, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), fyVar);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object d(dy dyVar) {
        if (this.i.isInitialized()) {
            return new Integer(SharedCounter.b.nativeIncrementAndGetCounterValue(g().a));
        }
        return tb5.E(this.a, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), dyVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00bd, blocks: (B:41:0x00b9, B:55:0x00d9, B:56:0x00dc), top: B:75:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9 A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:41:0x00b9, B:55:0x00d9, B:56:0x00dc), top: B:75:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wr0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, wr0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object e(wr0 wr0Var, fy fyVar) throws Throwable {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        pp1 pp1Var;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        Object obj;
        Object obj2;
        ?? r1;
        java.io.Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Object obj3;
        Object obj4;
        if (fyVar instanceof MultiProcessCoordinator$lock$1) {
            multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) fyVar;
            int i = multiProcessCoordinator$lock$1.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProcessCoordinator$lock$1.w = i - Integer.MIN_VALUE;
            } else {
                multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, fyVar);
            }
        } else {
            multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, fyVar);
        }
        Object obj5 = multiProcessCoordinator$lock$1.u;
        int i2 = multiProcessCoordinator$lock$1.w;
        dz dzVar = dz.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        wz2.a0(obj5);
                        multiProcessCoordinator$lock$1.r = this;
                        multiProcessCoordinator$lock$1.s = wr0Var;
                        pp1Var = this.g;
                        multiProcessCoordinator$lock$1.t = pp1Var;
                        multiProcessCoordinator$lock$1.w = 1;
                        if (pp1Var.e(multiProcessCoordinator$lock$1) != dzVar) {
                        }
                        r9 = wr0Var;
                        obj5 = pp1Var;
                        return dzVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                e32.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) multiProcessCoordinator$lock$1.t;
                            closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.s;
                            Mutex mutex = (Mutex) multiProcessCoordinator$lock$1.r;
                            try {
                                wz2.a0(obj5);
                                obj3 = mutex;
                                obj4 = obj5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    nq2.e(closeable, null);
                                    ((pp1) obj3).g(null);
                                    return obj4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj5 = obj3;
                                    ((pp1) obj5).g(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.t;
                        obj2 = (Mutex) multiProcessCoordinator$lock$1.s;
                        wr0 wr0Var2 = (wr0) multiProcessCoordinator$lock$1.r;
                        try {
                            wz2.a0(obj5);
                            r1 = wr0Var2;
                            obj2 = obj2;
                            obj = obj5;
                            fileLock2 = (FileLock) obj;
                            try {
                                multiProcessCoordinator$lock$1.r = obj2;
                                multiProcessCoordinator$lock$1.s = closeable;
                                multiProcessCoordinator$lock$1.t = fileLock2;
                                multiProcessCoordinator$lock$1.w = 3;
                                objInvoke = r1.invoke(multiProcessCoordinator$lock$1);
                                if (objInvoke != dzVar) {
                                    obj3 = obj2;
                                    fileLock = fileLock2;
                                    obj4 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    nq2.e(closeable, null);
                                    ((pp1) obj3).g(null);
                                    return obj4;
                                }
                                r9 = wr0Var;
                                obj5 = pp1Var;
                                return dzVar;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    Mutex mutex2 = (Mutex) multiProcessCoordinator$lock$1.t;
                    wr0 wr0Var3 = (wr0) multiProcessCoordinator$lock$1.s;
                    MultiProcessCoordinator multiProcessCoordinator = (MultiProcessCoordinator) multiProcessCoordinator$lock$1.r;
                    wz2.a0(obj5);
                    obj5 = mutex2;
                    this = multiProcessCoordinator;
                    r9 = wr0Var3;
                    multiProcessCoordinator$lock$1.r = r9;
                    multiProcessCoordinator$lock$1.s = obj5;
                    multiProcessCoordinator$lock$1.t = fileOutputStream;
                    multiProcessCoordinator$lock$1.w = 2;
                    Object objA = Companion.a(fileOutputStream, multiProcessCoordinator$lock$1);
                    if (objA != dzVar) {
                        Object obj6 = obj5;
                        obj = objA;
                        obj2 = obj6;
                        r1 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) obj;
                        multiProcessCoordinator$lock$1.r = obj2;
                        multiProcessCoordinator$lock$1.s = closeable;
                        multiProcessCoordinator$lock$1.t = fileLock2;
                        multiProcessCoordinator$lock$1.w = 3;
                        objInvoke = r1.invoke(multiProcessCoordinator$lock$1);
                        if (objInvoke != dzVar) {
                            obj3 = obj2;
                            fileLock = fileLock2;
                            obj4 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            nq2.e(closeable, null);
                            ((pp1) obj3).g(null);
                            return obj4;
                        }
                    }
                    r9 = wr0Var;
                    obj5 = pp1Var;
                    return dzVar;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = wr0Var;
                obj5 = pp1Var;
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                ((pp1) obj5).g(null);
                throw th;
            }
        } catch (Throwable th8) {
            obj5 = multiProcessCoordinator$lock$1;
            try {
                throw th8;
            } catch (Throwable th9) {
                nq2.e(wr0Var, th8);
                throw th9;
            }
        }
    }

    public final SharedCounter g() {
        return (SharedCounter) this.i.getValue();
    }

    public MultiProcessCoordinator(sy syVar, File file) {
        syVar.getClass();
        file.getClass();
        this.a = syVar;
        this.b = file;
        Object obj = MulticastFileObserver.b;
        this.c = ep0.g(new MulticastFileObserver$Companion$observe$1(file, null));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new pp1();
        this.h = new cm2(new MultiProcessCoordinator$lockFile$2(this));
        this.i = new cm2(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    public static final void f(MultiProcessCoordinator multiProcessCoordinator, File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                dr0.h(n30.j(file, "Unable to create parent directories of "));
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
