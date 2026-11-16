package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public final class PlayerRef extends zzg implements Player {
    private final com.google.android.gms.games.internal.player.zzd zza;
    private final PlayerLevelInfo zzb;
    private final com.google.android.gms.games.internal.player.zzc zzc;
    private final zzq zzd;
    private final zzc zze;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* synthetic */ Player freeze() {
        return new PlayerEntity(this);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri getBannerImageLandscapeUri() {
        return parseUri(this.zza.zzC);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return getString(this.zza.zzD);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri getBannerImagePortraitUri() {
        return parseUri(this.zza.zzE);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getBannerImagePortraitUrl() {
        return getString(this.zza.zzF);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        zzc zzcVar = this.zze;
        if (zzcVar.zza()) {
            return zzcVar;
        }
        return null;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getDisplayName() {
        return getString(this.zza.zzc);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri getHiResImageUri() {
        return parseUri(this.zza.zzf);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getHiResImageUrl() {
        return getString(this.zza.zzg);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final Uri getIconImageUri() {
        return parseUri(this.zza.zzd);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getIconImageUrl() {
        return getString(this.zza.zze);
    }

    @Override // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        String str = this.zza.zzj;
        if (!hasColumn(str) || hasNull(str)) {
            return -1L;
        }
        return getLong(str);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getPlayerId() {
        return getString(this.zza.zza);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final PlayerRelationshipInfo getRelationshipInfo() {
        zzq zzqVar = this.zzd;
        if (zzqVar.getFriendStatus() == -1 && zzqVar.zza() == null && zzqVar.zzb() == null) {
            return null;
        }
        return zzqVar;
    }

    @Override // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return getLong(this.zza.zzh);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String getTitle() {
        return getString(this.zza.zzr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        new PlayerEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final String zza() {
        return zzj(this.zza.zzb, null);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzb() {
        return getString(this.zza.zzA);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return getString(this.zza.zzB);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return getBoolean(this.zza.zzz);
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return getInteger(this.zza.zzi);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return getBoolean(this.zza.zzs);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        String str = this.zza.zzM;
        return hasColumn(str) && getBoolean(str);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final com.google.android.gms.games.internal.player.zza zzh() {
        if (hasNull(this.zza.zzt)) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    public final long zzi() {
        String str = this.zza.zzG;
        if (!hasColumn(str) || hasNull(str)) {
            return -1L;
        }
        return getLong(str);
    }

    public PlayerRef(@NonNull DataHolder dataHolder, int i, @NonNull String str) {
        PlayerLevel playerLevel;
        super(dataHolder, i);
        com.google.android.gms.games.internal.player.zzd zzdVar = new com.google.android.gms.games.internal.player.zzd(null);
        this.zza = zzdVar;
        this.zzc = new com.google.android.gms.games.internal.player.zzc(dataHolder, i, zzdVar);
        this.zzd = new zzq(dataHolder, i, zzdVar);
        this.zze = new zzc(dataHolder, i, zzdVar);
        if (!hasNull(zzdVar.zzk) && getLong(zzdVar.zzk) != -1) {
            int integer = getInteger(zzdVar.zzl);
            int integer2 = getInteger(zzdVar.zzo);
            PlayerLevel playerLevel2 = new PlayerLevel(integer, getLong(zzdVar.zzm), getLong(zzdVar.zzn));
            if (integer != integer2) {
                playerLevel = new PlayerLevel(integer2, getLong(zzdVar.zzn), getLong(zzdVar.zzp));
            } else {
                playerLevel = playerLevel2;
            }
            this.zzb = new PlayerLevelInfo(getLong(zzdVar.zzk), getLong(zzdVar.zzq), playerLevel2, playerLevel);
            return;
        }
        this.zzb = null;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(@Nullable Object obj) {
        return PlayerEntity.zzk(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        if (getHiResImageUri() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        if (getIconImageUri() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return PlayerEntity.zzj(this);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.zzl(this);
    }

    @Override // com.google.android.gms.games.Player
    public final void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    public final void getTitle(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer(this.zza.zzr, charArrayBuffer);
    }
}
