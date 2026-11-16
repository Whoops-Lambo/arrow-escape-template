package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzk extends zzai {
    public final zzab c;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.c = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        zzh.a(3, this.a, list);
        String strZzc = zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.b;
        long jH = (long) zzh.h(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        zzao zzaoVarB = zzawVar.b(zzgVar, (zzao) list.get(2));
        HashMap mapJ = zzaoVarB instanceof zzal ? zzh.j((zzal) zzaoVarB) : new HashMap();
        zzab zzabVar = this.c;
        zzabVar.getClass();
        HashMap map = new HashMap();
        for (String str : mapJ.keySet()) {
            HashMap map2 = zzabVar.a.c;
            map.put(str, zzaa.b(map2.containsKey(str) ? map2.get(str) : null, mapJ.get(str), str));
        }
        zzabVar.c.add(new zzaa(strZzc, jH, map));
        return zzao.e9;
    }
}
