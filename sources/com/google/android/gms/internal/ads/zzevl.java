package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzevl implements zzfdv {
    public final Context a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new zzevm(ContextCompat.a(this.a, "com.google.android.gms.permission.AD_ID") == 0));
    }

    public zzevl(Context context) {
        this.a = context;
    }
}
