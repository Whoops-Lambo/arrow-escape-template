package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.UserHandle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzo {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    @Nullable
    private final UserHandle zzf;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return Objects.equal(this.zza, zzoVar.zza) && Objects.equal(this.zzb, zzoVar.zzb) && Objects.equal(this.zzc, zzoVar.zzc) && this.zze == zzoVar.zze && Objects.equal(this.zzf, zzoVar.zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, 4225, Boolean.valueOf(this.zze), this.zzf);
    }

    public final String toString() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.zzc;
        Preconditions.checkNotNull(componentName);
        return componentName.flattenToString();
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final ComponentName zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Nullable
    public final UserHandle zze() {
        return this.zzf;
    }

    public zzo(String str, String str2, int i, boolean z, @Nullable UserHandle userHandle) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        Preconditions.checkNotEmpty(str2);
        this.zzb = str2;
        this.zzc = null;
        this.zzd = 4225;
        this.zze = z;
        this.zzf = userHandle;
    }

    public zzo(ComponentName componentName, int i, @Nullable UserHandle userHandle) {
        this.zza = null;
        this.zzb = null;
        Preconditions.checkNotNull(componentName);
        this.zzc = componentName;
        this.zzd = 4225;
        this.zze = false;
        this.zzf = null;
    }
}
