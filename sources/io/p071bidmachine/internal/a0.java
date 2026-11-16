package io.p071bidmachine.internal;

import defpackage.cm2;
import defpackage.cz;
import defpackage.dh1;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fc2;
import defpackage.fh1;
import defpackage.fy;
import defpackage.hg0;
import defpackage.kc2;
import defpackage.qe1;
import defpackage.r6;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.uy;
import defpackage.wz2;
import io.p071bidmachine.ads.networks.adaptiverendering.h;
import io.p071bidmachine.protobuf.rendering.Rendering;
import io.p071bidmachine.rendering.model.a;
import io.p071bidmachine.rendering.model.a1;
import io.p071bidmachine.rendering.model.b;
import io.p071bidmachine.rendering.model.d;
import io.p071bidmachine.rendering.model.f;
import io.p071bidmachine.rendering.model.g;
import io.p071bidmachine.rendering.model.i0;
import io.p071bidmachine.rendering.model.t0;
import io.p071bidmachine.util.cache.n;
import io.p071bidmachine.util.l;
import io.p071bidmachine.util.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements h0 {
    public final uy a;
    public final sr0 b;
    public final cm2 c;

    public a0(sr0 sr0Var) {
        uy uyVarA = l.c.a();
        uyVarA.getClass();
        this.a = uyVarA;
        this.b = sr0Var;
        this.c = new cm2(new r6(this, 25));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(a aVar, n nVar, fy fyVar) {
        y yVar;
        g gVar;
        if (fyVar instanceof y) {
            yVar = (y) fyVar;
            int i = yVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.t = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, fyVar);
            }
        } else {
            yVar = new y(this, fyVar);
        }
        Object objB = yVar.r;
        int i2 = yVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objB);
            fc2 fc2Var = new fc2();
            io.p071bidmachine.rendering.internal.adform.countdown.a aVar2 = aVar.b;
            if (aVar2 != null) {
                t0 t0Var = (t0) aVar2.b;
                a1 a1Var = (t0Var instanceof a1 ? t0Var : null) != null ? (a1) t0Var : null;
                if (a1Var != null) {
                    fc2Var.addAll(a1Var.a);
                }
            }
            String str = aVar.c;
            if (str != null) {
                if (!p.B(str)) {
                    str = null;
                }
                if (str != null) {
                    fc2Var.add(str);
                }
            }
            f fVar = aVar.f.a;
            if (fVar != null && (gVar = fVar.b) != null) {
                i0 i0Var = (gVar instanceof i0 ? gVar : null) != null ? (i0) gVar : null;
                if (i0Var != null) {
                    t0 t0Var2 = (t0) ((io.p071bidmachine.rendering.internal.adform.countdown.a) i0Var.a.b).b;
                    a1 a1Var2 = (t0Var2 instanceof a1 ? t0Var2 : null) != null ? (a1) t0Var2 : null;
                    if (a1Var2 != null) {
                        fc2Var.addAll(a1Var2.a);
                    }
                }
            }
            fc2 fc2VarF = kc2.f(fc2Var);
            ArrayList arrayList = new ArrayList(eu.f(fc2VarF, 10));
            Iterator it = fc2VarF.iterator();
            while (((dh1) it).hasNext()) {
                arrayList.add(tb5.c((cz) this.c.getValue(), null, new z(nVar, (String) ((dh1) it).next(), dyVar, 0), 3));
            }
            yVar.t = 1;
            objB = eu.b(arrayList, yVar);
            dz dzVar = dz.a;
            if (objB == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objB);
        }
        return du.Y((Iterable) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(b bVar, fy fyVar) {
        v vVar;
        n nVar;
        fh1 fh1Var;
        if (fyVar instanceof v) {
            vVar = (v) fyVar;
            int i = vVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.t = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, fyVar);
            }
        } else {
            vVar = new v(this, fyVar);
        }
        Object objC = vVar.r;
        int i2 = vVar.t;
        List list = null;
        if (i2 == 0) {
            wz2.a0(objC);
            sr0 sr0Var = this.b;
            if (sr0Var != null && (nVar = (n) sr0Var.invoke()) != null) {
                vVar.t = 1;
                objC = c(bVar, nVar, vVar);
                dz dzVar = dz.a;
                if (objC == dzVar) {
                    return dzVar;
                }
            }
            fh1Var = new fh1();
            if (list != null && !list.isEmpty()) {
                fh1Var.put("adaptive_resources_cache", list);
            }
            return fh1Var.d();
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objC);
        list = (List) objC;
        fh1Var = new fh1();
        if (list != null) {
            fh1Var.put("adaptive_resources_cache", list);
        }
        return fh1Var.d();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r10 == r4) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cd -> B:30:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(io.p071bidmachine.rendering.model.b r8, io.p071bidmachine.util.cache.n r9, defpackage.fy r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.internal.a0.c(io.bidmachine.rendering.model.b, io.bidmachine.util.cache.n, fy):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(d dVar, n nVar, fy fyVar) {
        x xVar;
        qe1 qe1VarK;
        d dVar2;
        qe1 qe1Var;
        Object obj;
        n nVar2;
        qe1 qe1Var2;
        List list;
        List list2;
        if (fyVar instanceof x) {
            xVar = (x) fyVar;
            int i = xVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.z = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, fyVar);
            }
        } else {
            xVar = new x(this, fyVar);
        }
        Object objF = xVar.x;
        int i2 = xVar.z;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                qe1 qe1Var3 = xVar.w;
                qe1Var = xVar.v;
                qe1Var2 = xVar.u;
                nVar2 = xVar.t;
                dVar2 = (d) xVar.s;
                a0 a0Var = (a0) xVar.r;
                wz2.a0(objF);
                qe1VarK = qe1Var3;
                this = a0Var;
                obj = objF;
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) xVar.s;
                list2 = (List) xVar.r;
                wz2.a0(objF);
            }
            list.addAll((Collection) objF);
            return eu.d(list2);
        }
        wz2.a0(objF);
        qe1VarK = eu.k();
        List list3 = dVar.c;
        int i3 = dVar.a;
        xVar.r = this;
        xVar.s = dVar;
        xVar.t = nVar;
        xVar.u = qe1VarK;
        xVar.v = qe1VarK;
        xVar.w = qe1VarK;
        xVar.z = 1;
        Object objF2 = f(list3, i3, nVar, xVar);
        if (objF2 != dzVar) {
            dVar2 = dVar;
            qe1Var = qe1VarK;
            obj = objF2;
            nVar2 = nVar;
            qe1Var2 = qe1Var;
        }
        return dzVar;
        qe1VarK.addAll((Collection) obj);
        List list4 = dVar2.d;
        int i4 = dVar2.a;
        xVar.r = qe1Var2;
        xVar.s = qe1Var;
        xVar.t = null;
        xVar.u = null;
        xVar.v = null;
        xVar.w = null;
        xVar.z = 2;
        objF = this.f(list4, i4, nVar2, xVar);
        if (objF != dzVar) {
            list = qe1Var;
            list2 = qe1Var2;
            list.addAll((Collection) objF);
            return eu.d(list2);
        }
        return dzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.p071bidmachine.internal.h0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object getCacheParams(io.p071bidmachine.unified.a aVar, fy fyVar) {
        u uVar;
        b bVar;
        if (fyVar instanceof u) {
            uVar = (u) fyVar;
            int i = uVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.t = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, fyVar);
            }
        } else {
            uVar = new u(this, fyVar);
        }
        Object objB = uVar.r;
        int i2 = uVar.t;
        try {
            if (i2 == 0) {
                wz2.a0(objB);
                aVar.getClass();
                Object objD = aVar.d("rendering_configuration", null);
                if (objD != null) {
                    if (((objD instanceof Rendering ? objD : null) != null ? (Rendering) objD : null) != null && (bVar = new h(aVar, null).c) != null) {
                        uVar.t = 1;
                        objB = b(bVar, uVar);
                        Object obj = dz.a;
                        if (objB == obj) {
                            return obj;
                        }
                    }
                }
                return hg0.a;
            }
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objB);
            Map map = (Map) objB;
            if (map != null) {
                return map;
            }
        } catch (Exception unused) {
        }
        return hg0.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2 A[LOOP:0: B:23:0x009c->B:25:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.List r25, int r26, io.p071bidmachine.util.cache.n r27, defpackage.fy r28) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.internal.a0.f(java.util.List, int, io.bidmachine.util.cache.n, fy):java.lang.Object");
    }
}
