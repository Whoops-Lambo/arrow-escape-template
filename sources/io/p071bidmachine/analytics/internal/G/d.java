package io.p071bidmachine.analytics.internal.G;

import defpackage.er;
import defpackage.hg0;
import io.p071bidmachine.analytics.internal.I.g;
import io.p071bidmachine.analytics.internal.p078g.h;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final c a(io.p071bidmachine.analytics.internal.p078g.d dVar) {
        byte[] bytes;
        byte[] bytes2;
        JSONObject jSONObjectA;
        String string;
        if (dVar.a().isEmpty()) {
            bytes = new byte[0];
        } else {
            bytes = g.a(dVar.a()).toString().getBytes(er.a);
        }
        byte[] bArr = bytes;
        String strC = dVar.c();
        String strD = dVar.d();
        String strE = dVar.e();
        long jF = dVar.f();
        h hVarB = dVar.b();
        if (hVarB == null || (jSONObjectA = g.a(hVarB)) == null || (string = jSONObjectA.toString()) == null || (bytes2 = string.getBytes(er.a)) == null) {
            bytes2 = new byte[0];
        }
        return new c(strC, strD, strE, jF, bArr, bytes2);
    }

    public static final io.p071bidmachine.analytics.internal.p078g.d a(c cVar) {
        Map mapA;
        if (cVar.a().length == 0) {
            mapA = hg0.a;
        } else {
            mapA = g.a(new JSONObject(new String(cVar.a(), er.a)));
        }
        return new io.p071bidmachine.analytics.internal.p078g.d(cVar.c(), cVar.d(), cVar.e(), cVar.f(), mapA, cVar.b().length == 0 ? null : g.a(new JSONObject(new String(cVar.b(), er.a))));
    }
}
