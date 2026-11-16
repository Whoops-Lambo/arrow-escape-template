package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefn implements zzipf {
    public final zzcox a;
    public final zzcpn b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context contextA = this.a.a();
        VersionInfoParcel versionInfoParcelA = this.b.a();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzefm(contextA, versionInfoParcelA, o24Var);
    }

    public zzefn(zzcox zzcoxVar, zzcpn zzcpnVar) {
        this.a = zzcoxVar;
        this.b = zzcpnVar;
    }
}
