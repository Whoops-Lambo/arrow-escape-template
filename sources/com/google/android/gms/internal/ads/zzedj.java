package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedj implements zzdlk {
    public final Bundle a = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final synchronized void zza(String str) {
        this.a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final synchronized void zzb(String str) {
        this.a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final synchronized void zzc(String str, String str2) {
        this.a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzf() {
    }

    @VisibleForTesting
    public zzedj() {
    }
}
