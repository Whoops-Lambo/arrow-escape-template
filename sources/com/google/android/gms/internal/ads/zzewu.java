package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewu implements zzfdv {
    public final Context a;
    public final zzher b;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.We)).booleanValue()) {
            return zzheh.a(new zzewv(null, false));
        }
        ContentResolver contentResolver = this.a.getContentResolver();
        if (contentResolver == null) {
            return zzheh.a(new zzewv(null, false));
        }
        return this.b.submit(new ps0(contentResolver, 13));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 61;
    }

    public zzewu(Context context, zzher zzherVar) {
        this.b = zzherVar;
        this.a = context;
    }
}
