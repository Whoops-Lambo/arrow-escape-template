package io.p071bidmachine.util.cache;

import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.af0;
import defpackage.az2;
import defpackage.cf;
import defpackage.cm2;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.er;
import defpackage.eu;
import defpackage.fy;
import defpackage.j52;
import defpackage.k52;
import defpackage.mc2;
import defpackage.n30;
import defpackage.pp1;
import defpackage.pv1;
import defpackage.tb5;
import defpackage.uf0;
import defpackage.ul2;
import defpackage.uy;
import defpackage.vk3;
import defpackage.wz2;
import defpackage.xe0;
import defpackage.xp;
import defpackage.ya0;
import defpackage.zr0;
import defpackage.zz0;
import io.p071bidmachine.media3.exoplayer.video.q;
import io.p071bidmachine.rendering.a;
import io.p071bidmachine.rendering.internal.controller.i;
import io.p071bidmachine.util.file.b;
import io.p071bidmachine.util.l;
import io.p071bidmachine.util.r;
import io.p071bidmachine.utils.log.c;
import java.io.File;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public static final a l;
    public final File a;
    public final cf b;
    public final b c;
    public final l d;
    public final c e;
    public final cm2 f;
    public volatile a g;
    public final cm2 h;
    public final pp1 i;
    public final Object j;
    public final LinkedHashMap k;

    static {
        mc2 mc2Var = new mc2(true, true, true);
        uf0 uf0Var = xe0.b;
        l = new a(mc2Var, new q(vk3.t(10, af0.SECONDS), vk3.t(10, af0.MINUTES)), new io.p071bidmachine.media3.exoplayer.offline.b(20, new b(new d(500L, 0.8d), new d(5242880L, 0.4d)), eu.y(new c(0.1d, 0.0d, 1.0d, new d(xe0.e(vk3.t(3, af0.DAYS)), 1.0d), new d(0L, 0.0d), new d(0L, 0.0d), new d(0L, 0.0d)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(n nVar, List list, fy fyVar) {
        l lVar;
        if (fyVar instanceof l) {
            lVar = (l) fyVar;
            int i = lVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.t = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(nVar, fyVar);
            }
        } else {
            lVar = new l(nVar, fyVar);
        }
        Object objE = lVar.r;
        int i2 = lVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarA = nVar.d.a();
            xp xpVar = new xp(list, nVar, dyVar, 26);
            lVar.t = 1;
            objE = tb5.E(uyVarA, xpVar, lVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objE);
        }
        return ((k52) objE).a;
    }

    public static final p b(n nVar) {
        return (p) nVar.h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(io.p071bidmachine.util.download.c cVar, xp xpVar, fy fyVar) {
        f fVar;
        String str;
        zr0 zr0Var;
        io.p071bidmachine.util.download.b bVar;
        io.p071bidmachine.util.download.b bVar2;
        if (fyVar instanceof f) {
            fVar = (f) fyVar;
            int i = fVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.v = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, fyVar);
            }
        } else {
            fVar = new f(this, fyVar);
        }
        Object obj = fVar.t;
        int i2 = fVar.v;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = fVar.s;
                zr0 zr0Var2 = (zr0) fVar.r;
                wz2.a0(obj);
                zr0Var = zr0Var2;
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = (io.p071bidmachine.util.download.b) fVar.r;
                wz2.a0(obj);
            }
            bVar = bVar2;
            return bVar.b;
        }
        wz2.a0(obj);
        String str2 = cVar.a;
        ya0 ya0Var = cVar.b;
        fVar.r = xpVar;
        fVar.s = str2;
        fVar.v = 1;
        Object objM = ya0Var.m(fVar);
        if (objM != dzVar) {
            str = str2;
            obj = objM;
            zr0Var = xpVar;
        }
        return dzVar;
        Object obj2 = ((k52) obj).a;
        boolean z = obj2 instanceof j52;
        if (z) {
            Throwable thB = k52.b(obj2);
            if (thB == null) {
                thB = new Exception(n30.y("Unknown error while download ", str));
            }
            return new j52(thB);
        }
        if (z) {
            obj2 = null;
        }
        bVar = (io.p071bidmachine.util.download.b) obj2;
        if (bVar == null || !bVar.b.exists()) {
            return new j52(new Exception(pv1.n("Download task (", str, ") completed, but file not found")));
        }
        if (zr0Var != null) {
            fVar.r = bVar;
            fVar.s = null;
            fVar.v = 2;
            if (zr0Var.invoke(bVar, fVar) != dzVar) {
                bVar2 = bVar;
                bVar = bVar2;
            }
            return dzVar;
        }
        return bVar.b;
    }

    public final Object d(a aVar, ul2 ul2Var) {
        Object objE = tb5.E(this.d.a(), new zz0(this.i, new j(aVar, this, null), null), ul2Var);
        return objE == dz.a ? objE : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, fy fyVar) {
        k kVar;
        if (fyVar instanceof k) {
            kVar = (k) fyVar;
            int i = kVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.t = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, fyVar);
            }
        } else {
            kVar = new k(this, fyVar);
        }
        Object objE = kVar.r;
        int i2 = kVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarA = this.d.a();
            xp xpVar = new xp(this, list, dyVar, 24);
            kVar.t = 1;
            objE = tb5.E(uyVarA, xpVar, kVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objE);
        }
        return ((k52) objE).a;
    }

    public n(File file, cf cfVar, b bVar, l lVar, c cVar) {
        bVar.getClass();
        lVar.getClass();
        this.a = file;
        this.b = cfVar;
        this.c = bVar;
        this.d = lVar;
        this.e = cVar;
        this.f = new cm2(new a(this, 3));
        this.g = l;
        this.h = new cm2(new a(this, 1));
        this.i = new pp1();
        this.j = new Object();
        this.k = new LinkedHashMap();
    }

    public final File f(String str) {
        byte[] bArrDigest;
        String string;
        str.getClass();
        byte[] bytes = str.getBytes(er.a);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (Throwable unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null) {
            string = null;
        } else {
            string = new BigInteger(bArrDigest).abs().toString(36);
        }
        if (string == null) {
            return null;
        }
        return new File(this.a, string);
    }

    public final void g(File file, Object obj) {
        file.getClass();
        obj.getClass();
        this.e.c("MediaFileCacheManager", new r(1, file, obj));
        synchronized (this.j) {
            try {
                Set linkedHashSet = (Set) this.k.get(file.getPath());
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    LinkedHashMap linkedHashMap = this.k;
                    String path = file.getPath();
                    path.getClass();
                    linkedHashMap.put(path, linkedHashSet);
                }
                linkedHashSet.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.c("MediaFileCacheManager", new a(this, 2));
    }

    public final void h(Object obj) {
        obj.getClass();
        this.e.c("MediaFileCacheManager", new i(obj, 12));
        synchronized (this.j) {
            try {
                for (String str : du.z0(this.k.keySet())) {
                    Set set = (Set) this.k.get(str);
                    if (set != null) {
                        set.remove(obj);
                    }
                    if (set != null && set.isEmpty()) {
                        this.k.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.c("MediaFileCacheManager", new a(this, 2));
    }
}
