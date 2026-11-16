package com.google.android.gms.common;

import androidx.annotation.Nullable;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzv {
    private String zza = null;

    @Nullable
    private Boolean zzb = null;

    @Nullable
    private Boolean zzc = null;

    public final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            e32.i("allowTestKeys must be set");
            return null;
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        e32.i("isGoogleOrPlatformOnly must be set");
        return null;
    }

    private zzv() {
    }

    public final zzv zzb(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public final zzv zzc(boolean z) {
        this.zzc = Boolean.valueOf(z);
        return this;
    }

    public /* synthetic */ zzv(byte[] bArr) {
    }
}
