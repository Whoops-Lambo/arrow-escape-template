package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzexr implements zzipf {
    public final zzipo a;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzexp zzb() {
        VersionInfoParcel versionInfoParcelA = ((zzcpn) this.a).a();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzexp(versionInfoParcelA, o24Var);
    }

    public zzexr(zzcpn zzcpnVar) {
        this.a = zzcpnVar;
    }
}
