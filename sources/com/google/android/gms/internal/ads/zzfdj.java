package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdj implements zzfdv {
    public final zzher a;
    public final Context b;
    public final VersionInfoParcel c;
    public final String d;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 28));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 35;
    }

    public zzfdj(zzher zzherVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.a = zzherVar;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = str;
    }
}
