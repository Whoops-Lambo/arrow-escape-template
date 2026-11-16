package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzan extends zzai implements zzak {
    public final ArrayList c;
    public final ArrayList d;
    public final zzg e;

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        zzat zzatVar;
        zzg zzgVarC = this.e.c();
        zzaw zzawVar = zzgVarC.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            zzatVar = zzao.e9;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                zzgVarC.f((String) arrayList.get(i2), zzgVar.b.b(zzgVar, (zzao) list.get(i2)));
            } else {
                zzgVarC.f((String) arrayList.get(i2), zzatVar);
            }
            i2++;
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            zzao zzaoVar = (zzao) obj;
            zzao zzaoVarB = zzawVar.b(zzgVarC, zzaoVar);
            if (zzaoVarB instanceof zzap) {
                zzaoVarB = zzawVar.b(zzgVarC, zzaoVar);
            }
            if (zzaoVarB instanceof zzag) {
                return ((zzag) zzaoVarB).a;
            }
        }
        return zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzan(this);
    }

    public zzan(String str, ArrayList arrayList, List list, zzg zzgVar) {
        super(str);
        this.c = new ArrayList();
        this.e = zzgVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.c.add(((zzao) obj).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    public zzan(zzan zzanVar) {
        super(zzanVar.a);
        ArrayList arrayList = new ArrayList(zzanVar.c.size());
        this.c = arrayList;
        arrayList.addAll(zzanVar.c);
        ArrayList arrayList2 = new ArrayList(zzanVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(zzanVar.d);
        this.e = zzanVar.e;
    }
}
