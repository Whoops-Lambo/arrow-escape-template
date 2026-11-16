package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbb extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal == 1) {
            zzh.a(2, "AND", arrayList);
            zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
            if (!zzaoVarB.zze().booleanValue()) {
                return zzaoVarB;
            }
            return zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
        }
        if (iOrdinal == 47) {
            zzh.a(1, "NOT", arrayList);
            return new zzaf(Boolean.valueOf(!zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            b(str);
            throw null;
        }
        zzh.a(2, "OR", arrayList);
        zzao zzaoVarB2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
        if (zzaoVarB2.zze().booleanValue()) {
            return zzaoVarB2;
        }
        return zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
    }

    public zzbb() {
        this.a.add(zzbk.AND);
        this.a.add(zzbk.NOT);
        this.a.add(zzbk.OR);
    }
}
