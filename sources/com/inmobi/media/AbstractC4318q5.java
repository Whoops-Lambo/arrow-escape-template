package com.inmobi.media;

import defpackage.ba0;
import defpackage.c91;
import defpackage.cz;
import defpackage.e91;
import defpackage.kc2;
import defpackage.lp1;
import defpackage.nl0;
import defpackage.nl2;
import defpackage.qb5;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wy;
import defpackage.xc0;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4318q5 {
    public static final cz a(cz czVar, wy wyVar) {
        nl2 nl2VarA;
        czVar.getClass();
        c91 c91Var = (c91) czVar.getA().get(nl0.i);
        if (c91Var != null) {
            nl2VarA = new nl2(c91Var);
        } else {
            nl2VarA = tb5.a();
        }
        ba0 ba0Var = xc0.a;
        return kc2.a(qb5.l(nl2VarA, wg1.a.f).plus(wyVar));
    }

    public static final cz a(cz czVar) {
        czVar.getClass();
        return kc2.a(czVar.getA().plus(new e91((c91) czVar.getA().get(nl0.i))));
    }

    public static final c91 a(cz czVar, zr0 zr0Var) {
        czVar.getClass();
        zr0Var.getClass();
        ba0 ba0Var = xc0.a;
        return tb5.t(czVar, wg1.a, null, zr0Var, 2);
    }

    public static final void a(lp1 lp1Var, cz czVar, AbstractC3908bd abstractC3908bd) {
        lp1Var.getClass();
        czVar.getClass();
        tb5.t(czVar, null, null, new C4290p5(lp1Var, abstractC3908bd, null), 3);
    }

    public static final void a(defpackage.qo qoVar, Object obj) {
        qoVar.getClass();
        if (qoVar.isActive()) {
            try {
                qoVar.resumeWith(obj);
            } catch (Exception unused) {
            }
        }
    }

    public static final void a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c91) it.next()).cancel(null);
        }
        list.clear();
    }
}
