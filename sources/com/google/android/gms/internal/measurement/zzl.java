package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzl extends zzal {
    public final zzab b;

    public zzl(zzab zzabVar) {
        this.b = zzabVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        Object obj = null;
        zzab zzabVar = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    zzh.a(0, "getEventName", arrayList);
                    return new zzas(zzabVar.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    zzh.a(0, "getTimestamp", arrayList);
                    return new zzah(Double.valueOf(zzabVar.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    zzh.a(1, "getParamValue", arrayList);
                    String strZzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    HashMap map = zzabVar.b.c;
                    if (map.containsKey(strZzc)) {
                        obj = map.get(strZzc);
                    }
                    return zzi.a(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    zzh.a(0, "getParams", arrayList);
                    HashMap map2 = zzabVar.b.c;
                    zzal zzalVar = new zzal();
                    for (String str2 : map2.keySet()) {
                        zzalVar.c(str2, zzi.a(map2.get(str2)));
                    }
                    return zzalVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    zzh.a(2, "setParamValue", arrayList);
                    String strZzc2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                    zzaa zzaaVar = zzabVar.b;
                    Object objI = zzh.i(zzaoVarB);
                    HashMap map3 = zzaaVar.c;
                    if (objI == null) {
                        map3.remove(strZzc2);
                        return zzaoVarB;
                    }
                    map3.put(strZzc2, zzaa.b(map3.get(strZzc2), objI, strZzc2));
                    return zzaoVarB;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    zzh.a(1, "setEventName", arrayList);
                    zzao zzaoVarB2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
                    if (!zzao.e9.equals(zzaoVarB2) && !zzao.f9.equals(zzaoVarB2)) {
                        zzabVar.b.a = zzaoVarB2.zzc();
                        return new zzas(zzaoVarB2.zzc());
                    }
                    defpackage.d.r("Illegal event name");
                    return null;
                }
                break;
        }
        return super.a(str, zzgVar, arrayList);
    }
}
