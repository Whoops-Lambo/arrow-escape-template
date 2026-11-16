package com.google.android.gms.internal.measurement;

import defpackage.tq3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzai implements zzao, zzak {
    public final String a;
    public final HashMap b = new HashMap();

    public abstract zzao b(zzg zzgVar, List list);

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao zzt() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.a) : zzak.d(this, new zzas(str), zzgVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void c(String str, zzao zzaoVar) {
        HashMap map = this.b;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(zzaiVar.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new tq3(this.b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return this.b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.e9;
    }

    public zzai(String str) {
        this.a = str;
    }
}
