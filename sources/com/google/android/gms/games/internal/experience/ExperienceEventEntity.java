package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "ExperienceEventEntityCreator")
@SafeParcelable.Reserved({1000})
public final class ExperienceEventEntity extends zzg implements ExperienceEvent {

    @NonNull
    public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getExperienceId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getGame", id = 2)
    private final GameEntity zzb;

    @SafeParcelable.Field(getter = "getDisplayTitle", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDisplayDescription", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getIconImageUrl", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getIconImageUri", id = 6)
    private final Uri zzf;

    @SafeParcelable.Field(getter = "getCreatedTimestamp", id = 7)
    private final long zzg;

    @SafeParcelable.Field(getter = "getXpEarned", id = 8)
    private final long zzh;

    @SafeParcelable.Field(getter = "getCurrentXp", id = 9)
    private final long zzi;

    @SafeParcelable.Field(getter = "getType", id = 10)
    private final int zzj;

    @SafeParcelable.Field(getter = "getNewLevel", id = 11)
    private final int zzk;

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ ExperienceEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExperienceEvent experienceEvent = (ExperienceEvent) obj;
        return Objects.equal(experienceEvent.zza(), this.zza) && Objects.equal(experienceEvent.zzb(), this.zzb) && Objects.equal(experienceEvent.zzc(), this.zzc) && Objects.equal(experienceEvent.zzd(), this.zzd) && Objects.equal(experienceEvent.getIconImageUrl(), getIconImageUrl()) && Objects.equal(experienceEvent.zze(), this.zzf) && Objects.equal(Long.valueOf(experienceEvent.zzf()), Long.valueOf(this.zzg)) && Objects.equal(Long.valueOf(experienceEvent.zzg()), Long.valueOf(this.zzh)) && Objects.equal(Long.valueOf(experienceEvent.zzh()), Long.valueOf(this.zzi)) && Objects.equal(Integer.valueOf(experienceEvent.zzi()), Integer.valueOf(this.zzj)) && Objects.equal(Integer.valueOf(experienceEvent.zzj()), Integer.valueOf(this.zzk));
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public String getIconImageUrl() {
        return this.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, getIconImageUrl(), this.zzf, Long.valueOf(this.zzg), Long.valueOf(this.zzh), Long.valueOf(this.zzi), Integer.valueOf(this.zzj), Integer.valueOf(this.zzk));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Game zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    @NonNull
    public final Uri zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzh() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzj() {
        return this.zzk;
    }

    @SafeParcelable.Constructor
    public ExperienceEventEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) GameEntity gameEntity, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) long j, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 11) int i2) {
        this.zza = str;
        this.zzb = gameEntity;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = j3;
        this.zzj = i;
        this.zzk = i2;
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("ExperienceId", this.zza).add("Game", this.zzb).add("DisplayTitle", this.zzc).add("DisplayDescription", this.zzd).add("IconImageUrl", getIconImageUrl()).add("IconImageUri", this.zzf).add("CreatedTimestamp", Long.valueOf(this.zzg)).add("XpEarned", Long.valueOf(this.zzh)).add("CurrentXp", Long.valueOf(this.zzi)).add("Type", Integer.valueOf(this.zzj)).add("NewLevel", Integer.valueOf(this.zzk)).toString();
    }
}
