package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzi {
    public static zzao a(Object obj) {
        if (obj == null) {
            return zzao.f9;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                defpackage.d.r("Invalid value type");
                return null;
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.l(zzaeVar.i(), a(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            zzao zzaoVarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzalVar.c((String) string, zzaoVarA);
            }
        }
        return zzalVar;
    }

    public static zzao b(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.e9;
        }
        int I = zzjeVar.I() - 1;
        if (I == 1) {
            return zzjeVar.B() ? new zzas(zzjeVar.C()) : zzao.l9;
        }
        if (I == 2) {
            return zzjeVar.F() ? new zzah(Double.valueOf(zzjeVar.H())) : new zzah(null);
        }
        if (I == 3) {
            return zzjeVar.D() ? new zzaf(Boolean.valueOf(zzjeVar.E())) : new zzaf(null);
        }
        if (I != 4) {
            defpackage.d.r("Unknown type found. Cannot convert entity");
            return null;
        }
        List listZ = zzjeVar.z();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(b((zzje) it.next()));
        }
        return new zzap(zzjeVar.A(), arrayList);
    }
}
