package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "MostRecentGameInfoEntityCreator")
@SafeParcelable.Reserved({1000})
public final class MostRecentGameInfoEntity extends com.google.android.gms.games.internal.zzg implements zza {

    @NonNull
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getGameId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getGameName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getActivityTimestampMillis", id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "getGameIconImageUri", id = 4)
    private final Uri zzd;

    @SafeParcelable.Field(getter = "getGameHiResImageUri", id = 5)
    private final Uri zze;

    @SafeParcelable.Field(getter = "getGameFeaturedImageUri", id = 6)
    private final Uri zzf;

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public static boolean zzh(zza zzaVar, Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        zza zzaVar2 = (zza) obj;
        return Objects.equal(zzaVar2.zza(), zzaVar.zza()) && Objects.equal(zzaVar2.zzb(), zzaVar.zzb()) && Objects.equal(Long.valueOf(zzaVar2.zzc()), Long.valueOf(zzaVar.zzc())) && Objects.equal(zzaVar2.zzd(), zzaVar.zzd()) && Objects.equal(zzaVar2.zze(), zzaVar.zze()) && Objects.equal(zzaVar2.zzf(), zzaVar.zzf());
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    @NonNull
    public final Uri zzf() {
        return this.zzf;
    }

    public MostRecentGameInfoEntity(zza zzaVar) {
        this.zza = zzaVar.zza();
        this.zzb = zzaVar.zzb();
        this.zzc = zzaVar.zzc();
        this.zzd = zzaVar.zzd();
        this.zze = zzaVar.zze();
        this.zzf = zzaVar.zzf();
    }

    public static int zzg(zza zzaVar) {
        return Objects.hashCode(zzaVar.zza(), zzaVar.zzb(), Long.valueOf(zzaVar.zzc()), zzaVar.zzd(), zzaVar.zze(), zzaVar.zzf());
    }

    public static String zzi(zza zzaVar) {
        return Objects.toStringHelper(zzaVar).add("GameId", zzaVar.zza()).add("GameName", zzaVar.zzb()).add("ActivityTimestampMillis", Long.valueOf(zzaVar.zzc())).add("GameIconUri", zzaVar.zzd()).add("GameHiResUri", zzaVar.zze()).add("GameFeaturedUri", zzaVar.zzf()).toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return zzh(this, obj);
    }

    public final int hashCode() {
        return zzg(this);
    }

    @NonNull
    public final String toString() {
        return zzi(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public MostRecentGameInfoEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) Uri uri, @SafeParcelable.Param(id = 5) Uri uri2, @SafeParcelable.Param(id = 6) Uri uri3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = uri;
        this.zze = uri2;
        this.zzf = uri3;
    }
}
