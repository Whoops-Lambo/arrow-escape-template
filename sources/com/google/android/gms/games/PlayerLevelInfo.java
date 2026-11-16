package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PlayerLevelInfoCreator")
@SafeParcelable.Reserved({1000})
public final class PlayerLevelInfo extends com.google.android.gms.games.internal.zzg {

    @NonNull
    public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new zzn();

    @SafeParcelable.Field(getter = "getCurrentXpTotal", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getLastLevelUpTimestamp", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getCurrentLevel", id = 3)
    private final PlayerLevel zzc;

    @SafeParcelable.Field(getter = "getNextLevel", id = 4)
    private final PlayerLevel zzd;

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return Objects.equal(Long.valueOf(this.zza), Long.valueOf(playerLevelInfo.zza)) && Objects.equal(Long.valueOf(this.zzb), Long.valueOf(playerLevelInfo.zzb)) && Objects.equal(this.zzc, playerLevelInfo.zzc) && Objects.equal(this.zzd, playerLevelInfo.zzd);
    }

    @NonNull
    public PlayerLevel getCurrentLevel() {
        return this.zzc;
    }

    public long getCurrentXpTotal() {
        return this.zza;
    }

    public long getLastLevelUpTimestamp() {
        return this.zzb;
    }

    @NonNull
    public PlayerLevel getNextLevel() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public boolean isMaxLevel() {
        return this.zzc.equals(this.zzd);
    }

    @SafeParcelable.Constructor
    public PlayerLevelInfo(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @NonNull @SafeParcelable.Param(id = 3) PlayerLevel playerLevel, @NonNull @SafeParcelable.Param(id = 4) PlayerLevel playerLevel2) {
        boolean z;
        if (j != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Preconditions.checkNotNull(playerLevel);
        Preconditions.checkNotNull(playerLevel2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = playerLevel;
        this.zzd = playerLevel2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getCurrentXpTotal());
        SafeParcelWriter.writeLong(parcel, 2, getLastLevelUpTimestamp());
        SafeParcelWriter.writeParcelable(parcel, 3, getCurrentLevel(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getNextLevel(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
