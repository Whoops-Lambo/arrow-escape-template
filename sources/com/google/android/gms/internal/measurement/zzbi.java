package com.google.android.gms.internal.measurement;

import defpackage.n30;
import defpackage.pv1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !zzgVar.d(str)) {
            defpackage.d.r(n30.y("Command not found: ", str));
            return null;
        }
        zzao zzaoVarG = zzgVar.g(str);
        if (zzaoVarG instanceof zzai) {
            return ((zzai) zzaoVarG).b(zzgVar, arrayList);
        }
        defpackage.d.r(pv1.n("Function ", str, " is not defined"));
        return null;
    }
}
