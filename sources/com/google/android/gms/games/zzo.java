package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PlayerRelationshipInfoEntityCreator")
@SafeParcelable.Reserved({1000})
public final class zzo extends com.google.android.gms.games.internal.zzg implements PlayerRelationshipInfo {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getFriendStatus", id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getNickname", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getInvitationNickname", id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getNicknameAbuseReportToken", id = 4)
    private final String zzd;

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ PlayerRelationshipInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public static boolean zze(PlayerRelationshipInfo playerRelationshipInfo, Object obj) {
        if (!(obj instanceof PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == playerRelationshipInfo) {
            return true;
        }
        PlayerRelationshipInfo playerRelationshipInfo2 = (PlayerRelationshipInfo) obj;
        return playerRelationshipInfo2.getFriendStatus() == playerRelationshipInfo.getFriendStatus() && Objects.equal(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && Objects.equal(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && Objects.equal(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    @Nullable
    public final String zzc() {
        return this.zzd;
    }

    public zzo(PlayerRelationshipInfo playerRelationshipInfo) {
        this.zza = playerRelationshipInfo.getFriendStatus();
        this.zzb = playerRelationshipInfo.zza();
        this.zzc = playerRelationshipInfo.zzb();
        this.zzd = playerRelationshipInfo.zzc();
    }

    public static int zzd(PlayerRelationshipInfo playerRelationshipInfo) {
        return Objects.hashCode(Integer.valueOf(playerRelationshipInfo.getFriendStatus()), playerRelationshipInfo.zza(), playerRelationshipInfo.zzb(), playerRelationshipInfo.zzc());
    }

    public static String zzf(PlayerRelationshipInfo playerRelationshipInfo) {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(playerRelationshipInfo);
        stringHelper.add("FriendStatus", Integer.valueOf(playerRelationshipInfo.getFriendStatus()));
        if (playerRelationshipInfo.zza() != null) {
            stringHelper.add("Nickname", playerRelationshipInfo.zza());
        }
        if (playerRelationshipInfo.zzb() != null) {
            stringHelper.add("InvitationNickname", playerRelationshipInfo.zzb());
        }
        if (playerRelationshipInfo.zzc() != null) {
            stringHelper.add("NicknameAbuseReportToken", playerRelationshipInfo.zzb());
        }
        return stringHelper.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return zze(this, obj);
    }

    public final int hashCode() {
        return zzd(this);
    }

    public final String toString() {
        return zzf(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }
}
