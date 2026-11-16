package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzexp implements zzfdv {
    public final zzher a;
    public final VersionInfoParcel b;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 15));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 54;
    }

    public zzexp(VersionInfoParcel versionInfoParcel, zzher zzherVar) {
        this.b = versionInfoParcel;
        this.a = zzherVar;
    }
}
