package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzz {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.b.clone();
            zzao zzaoVarB = ((zzan) treeMap.get(num)).b(zzgVar, Collections.singletonList(zzlVar));
            int iG = zzaoVarB instanceof zzah ? zzh.g(((zzah) zzaoVarB).a.doubleValue()) : -1;
            if (iG == 2 || iG == -1) {
                zzabVar.b = zzaaVarClone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzao zzaoVarB2 = ((zzan) treeMap2.get((Integer) it.next())).b(zzgVar, Collections.singletonList(zzlVar));
            if (zzaoVarB2 instanceof zzah) {
                zzh.g(((zzah) zzaoVarB2).a.doubleValue());
            }
        }
    }
}
