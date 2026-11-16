package io.p071bidmachine.rendering.internal.repository;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.moloco.sdk.internal.ilrd.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b;
import defpackage.az2;
import defpackage.bm;
import defpackage.cm2;
import defpackage.cz;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.h50;
import defpackage.j52;
import defpackage.k52;
import defpackage.q6;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.uy;
import defpackage.wz2;
import defpackage.xp;
import io.p071bidmachine.rendering.c;
import io.p071bidmachine.rendering.d;
import io.p071bidmachine.rendering.internal.controller.i;
import io.p071bidmachine.rendering.internal.y;
import io.p071bidmachine.rendering.model.h;
import io.p071bidmachine.rendering.model.z0;
import io.p071bidmachine.util.e;
import io.p071bidmachine.util.o;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements d {
    public final sr0 a;
    public final cz b;
    public final y c;
    public final cm2 d;

    public static final Object a(m mVar, c cVar, e eVar, ul2 ul2Var) throws Throwable {
        Object objE = tb5.E((uy) mVar.c.a.getValue(), new a(cVar, eVar, null, 3), ul2Var);
        return objE == dz.a ? objE : az2.a;
    }

    public static final Object b(m mVar, c cVar, Object obj, ul2 ul2Var) throws Throwable {
        Object objE = tb5.E((uy) mVar.c.a.getValue(), new a(cVar, obj, null, 4), ul2Var);
        return objE == dz.a ? objE : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(h hVar, BitmapFactory.Options options, fy fyVar) throws Throwable {
        f fVar;
        if (fyVar instanceof f) {
            fVar = (f) fyVar;
            int i = fVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.t = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, fyVar);
            }
        } else {
            fVar = new f(this, fyVar);
        }
        Object objE = fVar.r;
        int i2 = fVar.t;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarA = this.c.a();
            q6 q6Var = new q6(this, hVar, options, null, 13);
            fVar.t = 1;
            objE = tb5.E(uyVarA, q6Var, fVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(z0 z0Var, fy fyVar) {
        e eVar;
        if (fyVar instanceof e) {
            eVar = (e) fyVar;
            int i = eVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.t = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, fyVar);
            }
        } else {
            eVar = new e(this, fyVar);
        }
        Object objE = eVar.r;
        int i2 = eVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            b bVar = new b(this, z0Var, dyVar, 17);
            eVar.t = 1;
            objE = tb5.E(uyVarB, bVar, eVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(z0 z0Var, Object obj, fy fyVar) throws Throwable {
        l lVar;
        if (fyVar instanceof l) {
            lVar = (l) fyVar;
            int i = lVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.t = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, fyVar);
            }
        } else {
            lVar = new l(this, fyVar);
        }
        Object obj2 = lVar.r;
        int i2 = lVar.t;
        Uri uri = null;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj2);
                return ((k52) obj2).a;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj2);
        List list = z0Var.b;
        int i3 = b.a[h50.C(z0Var.c)];
        if (i3 == 1) {
            lVar.t = 1;
            Object objG = g(list, obj, lVar);
            Object obj3 = dz.a;
            return objG == obj3 ? obj3 : objG;
        }
        if (i3 != 2) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        String str = (String) du.a0(list);
        str.getClass();
        try {
            uri = Uri.parse(o.c(str));
        } catch (Throwable unused) {
        }
        if (uri != null) {
            return uri;
        }
        try {
            throw new Exception("Can't parse video stream url - ".concat(str));
        } catch (Throwable th) {
            return new j52(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(z0 z0Var, Object obj, BitmapFactory.Options options, fy fyVar) throws Throwable {
        g gVar;
        if (fyVar instanceof g) {
            gVar = (g) fyVar;
            int i = gVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.t = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, fyVar);
            }
        } else {
            gVar = new g(this, fyVar);
        }
        Object objE = gVar.r;
        int i2 = gVar.t;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            a aVar = new a(this, z0Var, obj, options, null, 3);
            gVar.t = 1;
            objE = tb5.E(uyVarB, aVar, gVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, Object obj, fy fyVar) throws Throwable {
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
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            bm bmVar = new bm(this, list, obj, (dy) null);
            kVar.t = 1;
            objE = tb5.E(uyVarB, bmVar, kVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(com.facebook.appevents.h hVar, Object obj, fy fyVar) {
        c cVar;
        if (fyVar instanceof c) {
            cVar = (c) fyVar;
            int i = cVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.t = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, fyVar);
            }
        } else {
            cVar = new c(this, fyVar);
        }
        Object objE = cVar.r;
        int i2 = cVar.t;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            d dVar = new d(hVar, this, obj, null, 0);
            cVar.t = 1;
            objE = tb5.E(uyVarB, dVar, cVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(z0 z0Var, Object obj, fy fyVar) throws Throwable {
        h hVar;
        if (fyVar instanceof h) {
            hVar = (h) fyVar;
            int i = hVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.t = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, fyVar);
            }
        } else {
            hVar = new h(this, fyVar);
        }
        Object objE = hVar.r;
        int i2 = hVar.t;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            xp xpVar = new xp(this, z0Var, obj, (dy) null);
            hVar.t = 1;
            objE = tb5.E(uyVarB, xpVar, hVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(com.facebook.appevents.h hVar, Object obj, fy fyVar) {
        j jVar;
        if (fyVar instanceof j) {
            jVar = (j) fyVar;
            int i = jVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.t = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, fyVar);
            }
        } else {
            jVar = new j(this, fyVar);
        }
        Object objE = jVar.r;
        int i2 = jVar.t;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarB = this.c.b();
            d dVar = new d(hVar, this, obj, null, 1);
            jVar.t = 1;
            objE = tb5.E(uyVarB, dVar, jVar);
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

    public m(sr0 sr0Var, cz czVar, y yVar) {
        czVar.getClass();
        yVar.getClass();
        this.a = sr0Var;
        this.b = czVar;
        this.c = yVar;
        this.d = new cm2(new i(this, 3));
    }

    public final void j(z0 z0Var, Object obj, c cVar) {
        z0Var.getClass();
        obj.getClass();
        tb5.t(this.b, null, null, new i(this, z0Var, cVar, (dy) null), 3);
    }
}
