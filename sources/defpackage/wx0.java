package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class wx0 {
    public static final xf1 a = zf1.b("io.ktor.client.plugins.HttpCallValidator");
    public static final ls b = new ls("HttpResponseValidator", px0.b, new l6(22));
    public static final fa c;

    static {
        ss2 ss2VarD;
        vr vrVarA = p32.a(Boolean.class);
        try {
            ss2VarD = p32.d(Boolean.TYPE);
        } catch (Throwable unused) {
            ss2VarD = null;
        }
        c = new fa("ExpectSuccessAttributeKey", new ns2(vrVarA, ss2VarD));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(List list, Throwable th, kz0 kz0Var, fy fyVar) {
        tx0 tx0Var;
        Iterator it;
        if (fyVar instanceof tx0) {
            tx0Var = (tx0) fyVar;
            int i = tx0Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                tx0Var.s = i - Integer.MIN_VALUE;
            } else {
                tx0Var = new tx0(fyVar);
            }
        } else {
            tx0Var = new tx0(fyVar);
        }
        Object obj = tx0Var.r;
        int i2 = tx0Var.s;
        if (i2 == 0) {
            wz2.a0(obj);
            a.h("Processing exception " + th + " for request " + kz0Var.getUrl());
            it = list.iterator();
        } else if (i2 != 1 && i2 != 2) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            wz2.a0(obj);
            it = null;
        }
        if (it.hasNext()) {
            if (it.next() == null) {
                e.b();
            } else {
                m93.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(List list, d01 d01Var, fy fyVar) {
        ux0 ux0Var;
        Iterator it;
        if (fyVar instanceof ux0) {
            ux0Var = (ux0) fyVar;
            int i = ux0Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                ux0Var.u = i - Integer.MIN_VALUE;
            } else {
                ux0Var = new ux0(fyVar);
            }
        } else {
            ux0Var = new ux0(fyVar);
        }
        Object obj = ux0Var.t;
        int i2 = ux0Var.u;
        if (i2 == 0) {
            wz2.a0(obj);
            a.h("Validating response for request " + d01Var.b().c().getUrl());
            it = list.iterator();
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = ux0Var.s;
            d01Var = ux0Var.r;
            wz2.a0(obj);
        }
        while (it.hasNext()) {
            zr0 zr0Var = (zr0) it.next();
            ux0Var.r = d01Var;
            ux0Var.s = it;
            ux0Var.u = 1;
            Object objInvoke = zr0Var.invoke(d01Var, ux0Var);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
        }
        return az2.a;
    }
}
