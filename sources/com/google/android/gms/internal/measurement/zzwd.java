package com.google.android.gms.internal.measurement;

import defpackage.bb5;
import defpackage.ia5;
import defpackage.ma5;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwd extends ia5 implements ma5 {
    public static final zzvr g = new zzvr();
    public final Exception f;

    public zzwd(UUID uuid, String str, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.f = zzvrVar;
    }

    @Override // defpackage.ma5
    public final bb5 F(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        if (z) {
            AtomicReference atomicReference = zzvy.a;
        }
        return new bb5(str, this, zzwlVar, z, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws e(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.a;
        return F(str, zzwlVar, true, zzwqVar);
    }

    @Override // defpackage.ma5
    public final Exception zzf() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return j.e;
    }
}
