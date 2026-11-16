package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcl implements zzfdv {
    public final Bundle a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new zzfcm(this.a));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 30;
    }

    public zzfcl(Bundle bundle) {
        this.a = bundle;
    }
}
