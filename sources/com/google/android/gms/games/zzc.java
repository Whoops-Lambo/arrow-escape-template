package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public final class zzc extends zzg implements CurrentPlayerInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ CurrentPlayerInfo freeze() {
        return new zza(this);
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
        return zzu(this.zza.zzL, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzb.zza(new zza(this), parcel, i);
    }

    public final boolean zza() {
        String str = this.zza.zzL;
        return hasColumn(str) && !hasNull(str);
    }

    public zzc(DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(@Nullable Object obj) {
        return zza.zzb(this, obj);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zza.zza(this);
    }

    public final String toString() {
        return zza.zzc(this);
    }
}
