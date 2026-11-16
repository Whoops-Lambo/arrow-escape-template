package com.inmobi.media;

import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.wr0;
import defpackage.wz2;
import java.util.LinkedHashMap;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4297pc {
    public final Mutex[] a;
    public final LinkedHashMap b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, vq vqVar, fy fyVar) throws Throwable {
        C4241nc c4241nc;
        Mutex mutex;
        wr0 wr0Var;
        Mutex mutex2;
        Object obj;
        String str2;
        Mutex mutex3;
        if (fyVar instanceof C4241nc) {
            c4241nc = (C4241nc) fyVar;
            int i = c4241nc.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4241nc.f = i - Integer.MIN_VALUE;
            } else {
                c4241nc = new C4241nc(this, fyVar);
            }
        } else {
            c4241nc = new C4241nc(this, fyVar);
        }
        Object obj2 = c4241nc.d;
        int i2 = c4241nc.f;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj2);
                Mutex mutex4 = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                c4241nc.a = str;
                c4241nc.b = vqVar;
                c4241nc.c = mutex4;
                c4241nc.f = 1;
                pp1 pp1Var = (pp1) mutex4;
                Object objE = pp1Var.e(c4241nc);
                wr0Var = vqVar;
                mutex = pp1Var;
                if (objE != dzVar) {
                }
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = (Mutex) c4241nc.b;
                str2 = c4241nc.a;
                try {
                    wz2.a0(obj2);
                    mutex2 = mutex2;
                    this.b.put(str2, obj2);
                    obj = obj2;
                    mutex3 = mutex2;
                    ((pp1) mutex3).g(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    ((pp1) mutex2).g(null);
                    throw th;
                }
            }
            Mutex mutex5 = c4241nc.c;
            wr0 wr0Var2 = (wr0) c4241nc.b;
            String str3 = c4241nc.a;
            wz2.a0(obj2);
            mutex = mutex5;
            str = str3;
            wr0Var = wr0Var2;
            obj = this.b.get(str);
            mutex3 = mutex;
            if (obj == null) {
                c4241nc.a = str;
                c4241nc.b = mutex;
                c4241nc.c = null;
                c4241nc.f = 2;
                Object objInvoke = wr0Var.invoke(c4241nc);
                if (objInvoke != dzVar) {
                    str2 = str;
                    mutex2 = mutex;
                    obj2 = objInvoke;
                    this.b.put(str2, obj2);
                    obj = obj2;
                    mutex3 = mutex2;
                }
                return dzVar;
            }
            ((pp1) mutex3).g(null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            ((pp1) mutex2).g(null);
            throw th;
        }
    }

    public final String toString() {
        return this.b.toString();
    }

    public C4297pc() {
        Mutex[] mutexArr = new Mutex[16];
        for (int i = 0; i < 16; i++) {
            mutexArr[i] = new pp1();
        }
        this.a = mutexArr;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) {
        C4269oc c4269oc;
        String str2;
        Mutex mutex;
        if (fyVar instanceof C4269oc) {
            c4269oc = (C4269oc) fyVar;
            int i = c4269oc.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4269oc.e = i - Integer.MIN_VALUE;
            } else {
                c4269oc = new C4269oc(this, fyVar);
            }
        } else {
            c4269oc = new C4269oc(this, fyVar);
        }
        Object obj = c4269oc.c;
        int i2 = c4269oc.e;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
            c4269oc.a = str;
            c4269oc.b = mutex2;
            c4269oc.e = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(c4269oc);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            str2 = str;
            mutex = pp1Var;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = c4269oc.b;
            str2 = c4269oc.a;
            wz2.a0(obj);
        }
        try {
            this.b.remove(str2);
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }
}
