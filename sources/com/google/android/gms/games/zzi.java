package com.google.android.gms.games;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
public final class zzi implements Api.ApiOptions.Optional {
    public final int zze;
    public final ArrayList zzg;

    @Nullable
    public final String zzm;
    public final com.google.android.gms.games.internal.zzi zzn;
    public final boolean zza = false;
    public final boolean zzb = true;
    public final int zzc = 17;
    public final boolean zzd = false;

    @Nullable
    public final String zzf = null;
    public final boolean zzh = false;
    public final boolean zzi = false;
    public final boolean zzj = false;

    @Nullable
    public final String zzk = null;
    private final int zzp = 0;
    public final int zzl = 9;
    public final boolean zzo = false;

    public /* synthetic */ zzi(boolean z, boolean z2, int i, boolean z3, int i2, String str, ArrayList arrayList, boolean z4, boolean z5, boolean z6, String str2, int i3, int i4, String str3, com.google.android.gms.games.internal.zzi zziVar, boolean z7, byte[] bArr) {
        this.zze = i2;
        this.zzg = arrayList;
        this.zzm = str3;
        this.zzn = zziVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (this.zze == zziVar.zze && this.zzg.equals(zziVar.zzg) && TextUtils.equals(null, null) && Objects.equal(this.zzm, zziVar.zzm)) {
                return true;
            }
        }
        return false;
    }

    public static zzh zza() {
        return new zzh(null);
    }

    public final int hashCode() {
        int iHashCode = this.zzg.hashCode() + ((this.zze + 486741695) * 961);
        String str = this.zzm;
        return ((((iHashCode * 887503681) + 9) * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }
}
