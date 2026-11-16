package com.google.android.gms.internal.measurement;

import defpackage.n30;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzak {
    void c(String str, zzao zzaoVar);

    boolean zzj(String str);

    zzao zzk(String str);

    static zzao d(zzak zzakVar, zzas zzasVar, zzg zzgVar, ArrayList arrayList) {
        String str = zzasVar.a;
        if (zzakVar.zzj(str)) {
            zzao zzaoVarZzk = zzakVar.zzk(str);
            if (zzaoVarZzk instanceof zzai) {
                return ((zzai) zzaoVarZzk).b(zzgVar, arrayList);
            }
            defpackage.d.r(n30.m(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            zzh.a(1, "hasOwnProperty", arrayList);
            return zzakVar.zzj(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc()) ? zzao.j9 : zzao.k9;
        }
        defpackage.d.r(n30.y("Object has no function ", str));
        return null;
    }
}
