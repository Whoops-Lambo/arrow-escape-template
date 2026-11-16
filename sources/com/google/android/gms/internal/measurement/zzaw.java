package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaw {
    public final HashMap a = new HashMap();
    public final zzbi b = new zzbi();

    public final void a(zzav zzavVar) {
        ArrayList arrayList = zzavVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.a.put(Integer.valueOf(((zzbk) obj).a).toString(), zzavVar);
        }
    }

    public zzaw() {
        a(new zzau());
        a(new zzax());
        a(new zzay());
        a(new zzbb());
        a(new zzbg());
        a(new zzbh());
        a(new zzbj());
    }

    public final zzao b(zzg zzgVar, zzao zzaoVar) {
        zzav zzavVar;
        zzh.k(zzgVar);
        if (zzaoVar instanceof zzap) {
            zzap zzapVar = (zzap) zzaoVar;
            ArrayList arrayList = zzapVar.b;
            String str = zzapVar.a;
            HashMap map = this.a;
            if (map.containsKey(str)) {
                zzavVar = (zzav) map.get(str);
            } else {
                zzavVar = this.b;
            }
            return zzavVar.a(str, zzgVar, arrayList);
        }
        return zzaoVar;
    }
}
