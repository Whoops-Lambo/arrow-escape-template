package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Un {
    public static final Un a = new Un();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C4531y c4531y, ArrayList arrayList, fy fyVar) throws Fn {
        Tn tn;
        C4582zn c4582zn;
        Fn e;
        if (fyVar instanceof Tn) {
            tn = (Tn) fyVar;
            int i = tn.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn.d = i - Integer.MIN_VALUE;
            } else {
                tn = new Tn(this, fyVar);
            }
        } else {
            tn = new Tn(this, fyVar);
        }
        Object obj = tn.b;
        int i2 = tn.d;
        if (i2 == 0) {
            wz2.a0(obj);
            H h = c4531y.b;
            C4582zn c4582zn2 = new C4582zn(h);
            Rn rn = new Rn(c4531y.b.a.b.getVastVideo(), c4582zn2, c4531y.a.c);
            try {
                Map mapA = AbstractC4446um.a(h);
                C4111im c4111im = C4111im.a;
                C4111im.b("VastParseStart", mapA, EnumC4223mm.SDK);
                tn.a = c4582zn2;
                tn.d = 1;
                Object objA = rn.a(str, arrayList, tn);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
                c4582zn = c4582zn2;
                obj = objA;
            } catch (Fn e2) {
                c4582zn = c4582zn2;
                e = e2;
                short s = e.a;
                Map mapA2 = AbstractC4446um.a(c4582zn.a);
                mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                C4111im c4111im2 = C4111im.a;
                C4111im.b("VastParseFailure", mapA2, EnumC4223mm.SDK);
                throw e;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4582zn = tn.a;
            try {
                wz2.a0(obj);
            } catch (Fn e3) {
                e = e3;
                short s2 = e.a;
                Map mapA3 = AbstractC4446um.a(c4582zn.a);
                mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s2));
                C4111im c4111im3 = C4111im.a;
                C4111im.b("VastParseFailure", mapA3, EnumC4223mm.SDK);
                throw e;
            }
        }
        Map mapA4 = AbstractC4446um.a(c4582zn.a);
        C4111im c4111im4 = C4111im.a;
        C4111im.b("VastParseSuccess", mapA4, EnumC4223mm.SDK);
        return obj;
    }
}
