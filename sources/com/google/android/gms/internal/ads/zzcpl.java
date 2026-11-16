package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcpl implements zzipf {
    public final zzcox a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = this.a.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.nd)).booleanValue()) {
            return com.google.android.gms.ads.internal.util.client.zzf.zzf(contextA);
        }
        return null;
    }

    public zzcpl(zzcox zzcoxVar) {
        this.a = zzcoxVar;
    }
}
