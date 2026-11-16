package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.kc2;
import defpackage.li2;
import defpackage.lp1;
import defpackage.np1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Bo extends G2 {
    public final cz b;
    public final Co c;
    public final lp1 d;
    public final Z9 e;
    public final ArrayList f;
    public final ArrayList g;
    public InterfaceC3991ed h;
    public C4177l4 i;
    public ViewGroup j;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (b(r0) == r5) goto L25;
     */
    @Override // com.inmobi.media.G2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.fy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C4281oo
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.oo r0 = (com.inmobi.media.C4281oo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.inmobi.media.oo r0 = new com.inmobi.media.oo
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.wz2.a0(r9)
            goto L7d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r2
        L31:
            com.inmobi.media.Bo r1 = r0.a
            defpackage.wz2.a0(r9)
            goto L6e
        L37:
            defpackage.wz2.a0(r9)
            com.inmobi.media.Z9 r9 = r8.e
            if (r9 == 0) goto L59
            com.inmobi.media.Co r1 = r8.c
            java.util.ArrayList r1 = r1.c
            int r1 = r1.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r1)
        L59:
            ba0 r9 = defpackage.xc0.a
            cw0 r9 = defpackage.wg1.a
            com.inmobi.media.po r1 = new com.inmobi.media.po
            r1.<init>(r8, r2)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.tb5.E(r9, r1, r0)
            if (r9 != r5) goto L6d
            goto L7c
        L6d:
            r1 = r8
        L6e:
            com.inmobi.media.ed r9 = (com.inmobi.media.InterfaceC3991ed) r9
            r1.h = r9
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r5) goto L7d
        L7c:
            return r5
        L7d:
            az2 r8 = defpackage.az2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bo.a(fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        C4337qo c4337qo;
        Bo bo;
        Z9 z9;
        if (fyVar instanceof C4337qo) {
            c4337qo = (C4337qo) fyVar;
            int i = c4337qo.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4337qo.d = i - Integer.MIN_VALUE;
            } else {
                c4337qo = new C4337qo(this, fyVar);
            }
        } else {
            c4337qo = new C4337qo(this, fyVar);
        }
        Object objJ = c4337qo.b;
        int i2 = c4337qo.d;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(objJ);
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bo = c4337qo.a;
                wz2.a0(objJ);
            }
            bo.j = (ViewGroup) objJ;
            z9 = this.e;
            if (z9 != null) {
                z9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return az2.a;
        }
        wz2.a0(objJ);
        Z9 z10 = this.e;
        if (z10 != null) {
            z10.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
        }
        c4337qo.d = 1;
        ArrayList arrayList = this.c.c;
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Bn bn = (Bn) obj;
            if (URLUtil.isHttpUrl(bn.c) || URLUtil.isHttpsUrl(bn.c)) {
                arrayList2.add(obj);
            }
        }
        objJ = kc2.j(new Io(arrayList2, ((double) Vn.a(this.c.a)) / 1000.0d, this.c.d, null), c4337qo);
        if (objJ != dzVar) {
        }
        return dzVar;
        List list = (List) objJ;
        ArrayList arrayList3 = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Bn) it.next()).c);
        }
        InterfaceC3991ed interfaceC3991ed = this.h;
        if (interfaceC3991ed == null) {
            s71.D("mediaPlayer");
            throw null;
        }
        c4337qo.a = this;
        c4337qo.d = 2;
        objJ = ((Te) interfaceC3991ed).a(arrayList3, c4337qo);
        if (objJ != dzVar) {
            bo = this;
            bo.j = (ViewGroup) objJ;
            z9 = this.e;
            if (z9 != null) {
                z9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return az2.a;
        }
        return dzVar;
    }

    public final void c() {
        lp1 lp1Var;
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.c.b.isEmpty()) {
            return;
        }
        Z9 z10 = this.e;
        if (z10 != null) {
            z10.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        C4177l4 c4177l4 = this.i;
        if (c4177l4 != null && (lp1Var = c4177l4.d) != null) {
            li2 li2VarT = tb5.t(this.b, null, null, new C4392so(lp1Var, null, this), 3);
            ArrayList arrayList = this.f;
            arrayList.getClass();
            arrayList.add(li2VarT);
        }
        Z9 z11 = this.e;
        if (z11 != null) {
            z11.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bo(Context context, cz czVar, Co co, lp1 lp1Var, Z9 z9) {
        super(context);
        context.getClass();
        czVar.getClass();
        co.getClass();
        lp1Var.getClass();
        this.b = czVar;
        this.c = co;
        this.d = lp1Var;
        this.e = z9;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // com.inmobi.media.G2
    public final Object a(FrameLayout frameLayout, C4158kd c4158kd) throws Throwable {
        ba0 ba0Var = xc0.a;
        Object objE = tb5.E(wg1.a, new C4253no(this, frameLayout, null), c4158kd);
        return objE == dz.a ? objE : az2.a;
    }

    @Override // com.inmobi.media.G2
    public final void a(np1 np1Var) {
        np1Var.getClass();
        li2 li2VarT = tb5.t(this.b, null, null, new C4197lo(np1Var, null, this), 3);
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(li2VarT);
    }

    @Override // com.inmobi.media.G2
    public final void a() {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3991ed interfaceC3991ed = this.h;
        if (interfaceC3991ed != null) {
            ((Te) interfaceC3991ed).a();
        }
        AbstractC4318q5.a(this.g);
        C4177l4 c4177l4 = this.i;
        if (c4177l4 != null) {
            c4177l4.a();
        }
    }

    @Override // com.inmobi.media.G2
    public final void b() {
        AbstractC4318q5.a(this.b, new C4225mo(this, null));
        InterfaceC3991ed interfaceC3991ed = this.h;
        if (interfaceC3991ed != null) {
            Te te = (Te) interfaceC3991ed;
            te.l.c();
            Dp dp = te.m;
            InterfaceC4417tl interfaceC4417tl = dp.h;
            if (interfaceC4417tl != null) {
                interfaceC4417tl.b();
            }
            dp.d.set(false);
            Oh oh = (Oh) dp.i.d.getValue();
            oh.f.set(true);
            AbstractC4097i7.a(oh.e);
            oh.e = null;
            AbstractC4318q5.a(dp.e);
            AbstractC4318q5.a(te.d);
            AbstractC4318q5.a(this.f);
            return;
        }
        s71.D("mediaPlayer");
        throw null;
    }
}
