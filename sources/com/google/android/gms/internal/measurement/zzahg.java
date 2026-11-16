package com.google.android.gms.internal.measurement;

import defpackage.s45;
import defpackage.xr1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzahg implements zzahf {
    public static final s45 a;
    public static final s45 b;
    public static final s45 c;

    static {
        xr1 xr1Var = zzagr.c.a;
        a = new s45("45761323", xr1Var, "");
        b = new s45("45762029", xr1Var, "");
        c = new s45("45762030", xr1Var, "");
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zza() {
        return (String) a.get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzb() {
        return (String) b.get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzc() {
        return (String) c.get();
    }
}
