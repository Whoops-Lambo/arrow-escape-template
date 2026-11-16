package com.google.android.gms.internal.measurement;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaf implements zzao {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.a == ((zzaf) obj).a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new zzas(Boolean.toString(z));
        }
        defpackage.d.r(pv1.w(Boolean.toString(z), UserDetailsUtils.UserDetailsLiterals.DOT, str, " is not a function."));
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzaf(Boolean.valueOf(this.a));
    }

    public zzaf(Boolean bool) {
        boolean zBooleanValue;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        this.a = zBooleanValue;
    }
}
