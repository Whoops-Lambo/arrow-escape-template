package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcp implements zzfdv {
    public final Context a;
    public final zzher b;
    public final zzfmj c;
    public final VersionInfoParcel d;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.b.submit(new ps0(this, 26));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 53;
    }

    public zzfcp(Context context, zzher zzherVar, zzfmj zzfmjVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = zzherVar;
        this.c = zzfmjVar;
        this.d = versionInfoParcel;
    }
}
