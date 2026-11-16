package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.zzr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "ProfileSettingsEntityCreator")
@SafeParcelable.Reserved({1000})
public class ProfileSettingsEntity extends com.google.android.gms.games.internal.zzg implements zzr {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status zza;

    @SafeParcelable.Field(getter = "getGamerTag", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "isGamerTagExplicitlySet", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "isProfileVisible", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isVisibilityExplicitlySet", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getStockProfileImage", id = 6)
    private final StockProfileImageEntity zzf;

    @SafeParcelable.Field(getter = "isProfileDiscoverable", id = 7)
    private final boolean zzg;

    @SafeParcelable.Field(getter = "isAutoSignInEnabled", id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getHttpErrorCode", id = 9)
    private final int zzi;

    @SafeParcelable.Field(getter = "isSettingsChangesProhibited", id = 10)
    private final boolean zzj;

    @SafeParcelable.Field(getter = "allowFriendInvites", id = 11)
    private final boolean zzk;

    @SafeParcelable.Field(getter = "getProfileVisibility", id = 12)
    private final int zzl;

    @SafeParcelable.Field(getter = "getGlobalFriendsListVisibility", id = 13)
    private final int zzm;

    @SafeParcelable.Field(getter = "isAlwaysAutoSignIn", id = 14)
    private final boolean zzn;

    @SafeParcelable.Field(getter = "getProfilelessRecallSummary", id = 15)
    private final zzh zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getGameStreaksEnabled", id = 16)
    private final Boolean zzp;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzr zzrVar = (zzr) obj;
        return Objects.equal(this.zzb, zzrVar.zzc()) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzrVar.zze())) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzrVar.zza())) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(zzrVar.zzb())) && Objects.equal(this.zza, zzrVar.getStatus()) && Objects.equal(this.zzf, zzrVar.zzd()) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(zzrVar.zzf())) && Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(zzrVar.zzg())) && this.zzi == zzrVar.zzj() && this.zzj == zzrVar.zzh() && this.zzk == zzrVar.zzi() && this.zzl == zzrVar.zzk() && this.zzm == zzrVar.zzl() && this.zzn == zzrVar.zzm() && Objects.equal(this.zzp, zzrVar.zzo()) && Objects.equal(this.zzo, zzrVar.zzn());
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public final Status getStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zza, this.zzf, Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(this.zzi), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), Boolean.valueOf(this.zzn), this.zzo, this.zzp);
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.zzr
    @NonNull
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.zzr
    @NonNull
    public final StockProfileImage zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzi() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.zzr
    public final int zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.zzr
    public final int zzk() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.zzr
    public final int zzl() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.zzr
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.zzr
    @Nullable
    public final zzh zzn() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.zzr
    @Nullable
    public final Boolean zzo() {
        return this.zzp;
    }

    @SafeParcelable.Constructor
    public ProfileSettingsEntity(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) StockProfileImageEntity stockProfileImageEntity, @SafeParcelable.Param(id = 7) boolean z4, @SafeParcelable.Param(id = 8) boolean z5, @SafeParcelable.Param(id = 9) int i, @SafeParcelable.Param(id = 10) boolean z6, @SafeParcelable.Param(id = 11) boolean z7, @SafeParcelable.Param(id = 12) int i2, @SafeParcelable.Param(id = 13) int i3, @SafeParcelable.Param(id = 14) boolean z8, @SafeParcelable.Param(id = 15) zzh zzhVar, @Nullable @SafeParcelable.Param(id = 16) Boolean bool) {
        this.zza = status;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = z3;
        this.zzf = stockProfileImageEntity;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = i;
        this.zzj = z6;
        this.zzk = z7;
        this.zzl = i2;
        this.zzm = i3;
        this.zzn = z8;
        this.zzo = zzhVar;
        this.zzp = bool;
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("GamerTag", this.zzb).add("IsGamerTagExplicitlySet", Boolean.valueOf(this.zzc)).add("IsProfileVisible", Boolean.valueOf(this.zzd)).add("IsVisibilityExplicitlySet", Boolean.valueOf(this.zze)).add("Status", this.zza).add("StockProfileImage", this.zzf).add("IsProfileDiscoverable", Boolean.valueOf(this.zzg)).add("AutoSignIn", Boolean.valueOf(this.zzh)).add("httpErrorCode", Integer.valueOf(this.zzi)).add("IsSettingsChangesProhibited", Boolean.valueOf(this.zzj)).add("AllowFriendInvites", Boolean.valueOf(this.zzk)).add("ProfileVisibility", Integer.valueOf(this.zzl)).add("global_friends_list_visibility", Integer.valueOf(this.zzm)).add("always_auto_sign_in", Boolean.valueOf(this.zzn)).add("profileless_recall_summary", this.zzo).add("games_streaks_enabled", this.zzp).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeInt(parcel, 12, this.zzl);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 16, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
