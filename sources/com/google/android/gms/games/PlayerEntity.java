package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.ironsource.C4788i2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@RetainForClient
@SafeParcelable.Class(creator = "PlayerEntityCreator", creatorIsFinal = false)
@SafeParcelable.Reserved({1000})
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new zzk();

    @SafeParcelable.Field(getter = "getPlayerId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getIconImageUri", id = 3)
    private final Uri zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getHiResImageUri", id = 4)
    private final Uri zzd;

    @SafeParcelable.Field(getter = "getRetrievedTimestamp", id = 5)
    private final long zze;

    @SafeParcelable.Field(getter = "isInCircles", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getLastPlayedWithTimestamp", id = 7)
    private final long zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getIconImageUrl", id = 8)
    private final String zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getHiResImageUrl", id = 9)
    private final String zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", id = 14)
    private final String zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getMostRecentGameInfo", id = 15)
    private final MostRecentGameInfoEntity zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getLevelInfo", id = 16)
    private final PlayerLevelInfo zzl;

    @SafeParcelable.Field(getter = "isProfileVisible", id = 18)
    private final boolean zzm;

    @SafeParcelable.Field(getter = "hasDebugAccess", id = 19)
    private final boolean zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getGamerTag", id = 20)
    private final String zzo;

    @SafeParcelable.Field(getter = "getName", id = 21)
    private final String zzp;

    @Nullable
    @SafeParcelable.Field(getter = "getBannerImageLandscapeUri", id = 22)
    private final Uri zzq;

    @Nullable
    @SafeParcelable.Field(getter = "getBannerImageLandscapeUrl", id = 23)
    private final String zzr;

    @Nullable
    @SafeParcelable.Field(getter = "getBannerImagePortraitUri", id = 24)
    private final Uri zzs;

    @Nullable
    @SafeParcelable.Field(getter = "getBannerImagePortraitUrl", id = 25)
    private final String zzt;

    @SafeParcelable.Field(defaultValue = C4788i2.f, getter = "getTotalUnlockedAchievement", id = 29)
    private final long zzu;

    @Nullable
    @SafeParcelable.Field(getter = "getRelationshipInfo", id = 33)
    private final zzo zzv;

    @Nullable
    @SafeParcelable.Field(getter = "getCurrentPlayerInfo", id = 35)
    private final zza zzw;

    @SafeParcelable.Field(getter = "isAlwaysAutoSignIn", id = 36)
    private final boolean zzx;

    @Nullable
    @SafeParcelable.Field(getter = "getGamePlayerId", id = 37)
    private final String zzy;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public static boolean zzk(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return Objects.equal(player2.getPlayerId(), player.getPlayerId()) && Objects.equal(player2.getDisplayName(), player.getDisplayName()) && Objects.equal(Boolean.valueOf(player2.zzd()), Boolean.valueOf(player.zzd())) && Objects.equal(player2.getIconImageUri(), player.getIconImageUri()) && Objects.equal(player2.getHiResImageUri(), player.getHiResImageUri()) && Objects.equal(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && Objects.equal(player2.getTitle(), player.getTitle()) && Objects.equal(player2.getLevelInfo(), player.getLevelInfo()) && Objects.equal(player2.zzb(), player.zzb()) && Objects.equal(player2.zzc(), player.zzc()) && Objects.equal(player2.getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && Objects.equal(player2.getBannerImagePortraitUri(), player.getBannerImagePortraitUri()) && Objects.equal(Long.valueOf(player2.zzi()), Long.valueOf(player.zzi())) && Objects.equal(player2.getCurrentPlayerInfo(), player.getCurrentPlayerInfo()) && Objects.equal(player2.getRelationshipInfo(), player.getRelationshipInfo()) && Objects.equal(Boolean.valueOf(player2.zzg()), Boolean.valueOf(player.zzg())) && Objects.equal(player2.zza(), player.zza());
    }

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ Player freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public Uri getBannerImageLandscapeUri() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public String getBannerImageLandscapeUrl() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public Uri getBannerImagePortraitUri() {
        return this.zzs;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public String getBannerImagePortraitUrl() {
        return this.zzt;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzw;
    }

    @Override // com.google.android.gms.games.Player
    public void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public Uri getHiResImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public String getHiResImageUrl() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public Uri getIconImageUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public String getIconImageUrl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public PlayerLevelInfo getLevelInfo() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getPlayerId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzv;
    }

    @Override // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.Player
    public void getTitle(@NonNull CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzj, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final String zza() {
        return this.zzy;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final String zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public final String zzc() {
        return this.zzp;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzd() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.Player
    public final int zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean zzg() {
        return this.zzx;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public final com.google.android.gms.games.internal.player.zza zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.Player
    public final long zzi() {
        return this.zzu;
    }

    public PlayerEntity(@NonNull Player player) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity;
        zzo zzoVar;
        boolean z;
        String playerId = player.getPlayerId();
        this.zza = playerId;
        String displayName = player.getDisplayName();
        this.zzb = displayName;
        this.zzc = player.getIconImageUri();
        this.zzh = player.getIconImageUrl();
        this.zzd = player.getHiResImageUri();
        this.zzi = player.getHiResImageUrl();
        long retrievedTimestamp = player.getRetrievedTimestamp();
        this.zze = retrievedTimestamp;
        this.zzf = player.zze();
        this.zzg = player.getLastPlayedWithTimestamp();
        this.zzj = player.getTitle();
        this.zzm = player.zzf();
        com.google.android.gms.games.internal.player.zza zzaVarZzh = player.zzh();
        if (zzaVarZzh == null) {
            mostRecentGameInfoEntity = null;
        } else {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(zzaVarZzh);
        }
        this.zzk = mostRecentGameInfoEntity;
        this.zzl = player.getLevelInfo();
        this.zzn = player.zzd();
        this.zzo = player.zzb();
        this.zzp = player.zzc();
        this.zzq = player.getBannerImageLandscapeUri();
        this.zzr = player.getBannerImageLandscapeUrl();
        this.zzs = player.getBannerImagePortraitUri();
        this.zzt = player.getBannerImagePortraitUrl();
        this.zzu = player.zzi();
        PlayerRelationshipInfo relationshipInfo = player.getRelationshipInfo();
        if (relationshipInfo == null) {
            zzoVar = null;
        } else {
            zzoVar = new zzo(relationshipInfo.freeze());
        }
        this.zzv = zzoVar;
        CurrentPlayerInfo currentPlayerInfo = player.getCurrentPlayerInfo();
        this.zzw = currentPlayerInfo != null ? (zza) currentPlayerInfo.freeze() : null;
        this.zzx = player.zzg();
        this.zzy = player.zza();
        Asserts.checkNotNull(playerId);
        Asserts.checkNotNull(displayName);
        if (retrievedTimestamp > 0) {
            z = true;
        } else {
            z = false;
        }
        Asserts.checkState(z);
    }

    public static int zzj(Player player) {
        return Objects.hashCode(player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzd()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.zzb(), player.zzc(), player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri(), Long.valueOf(player.zzi()), player.getRelationshipInfo(), player.getCurrentPlayerInfo(), Boolean.valueOf(player.zzg()), player.zza());
    }

    public static String zzl(Player player) {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(player).add("PlayerId", player.getPlayerId()).add("DisplayName", player.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(player.zzd())).add("IconImageUri", player.getIconImageUri()).add("IconImageUrl", player.getIconImageUrl()).add("HiResImageUri", player.getHiResImageUri()).add("HiResImageUrl", player.getHiResImageUrl()).add("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).add("Title", player.getTitle()).add("LevelInfo", player.getLevelInfo()).add("GamerTag", player.zzb()).add("Name", player.zzc()).add("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", player.getCurrentPlayerInfo()).add("TotalUnlockedAchievement", Long.valueOf(player.zzi()));
        if (player.zzg()) {
            toStringHelperAdd.add("AlwaysAutoSignIn", Boolean.valueOf(player.zzg()));
        }
        if (player.getRelationshipInfo() != null) {
            toStringHelperAdd.add("RelationshipInfo", player.getRelationshipInfo());
        }
        if (player.zza() != null) {
            toStringHelperAdd.add("GamePlayerId", player.zza());
        }
        return toStringHelperAdd.toString();
    }

    public boolean equals(@Nullable Object obj) {
        return zzk(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
        if (getHiResImageUri() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.games.Player
    public boolean hasIconImage() {
        if (getIconImageUri() != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return zzj(this);
    }

    @NonNull
    public String toString() {
        return zzl(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String string;
        if (shouldDowngrade()) {
            parcel.writeString(this.zza);
            parcel.writeString(this.zzb);
            Uri uri = this.zzc;
            String string2 = null;
            if (uri == null) {
                string = null;
            } else {
                string = uri.toString();
            }
            parcel.writeString(string);
            Uri uri2 = this.zzd;
            if (uri2 != null) {
                string2 = uri2.toString();
            }
            parcel.writeString(string2);
            parcel.writeLong(this.zze);
            return;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getPlayerId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getIconImageUri(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getHiResImageUri(), i, false);
        SafeParcelWriter.writeLong(parcel, 5, getRetrievedTimestamp());
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeLong(parcel, 7, getLastPlayedWithTimestamp());
        SafeParcelWriter.writeString(parcel, 8, getIconImageUrl(), false);
        SafeParcelWriter.writeString(parcel, 9, getHiResImageUrl(), false);
        SafeParcelWriter.writeString(parcel, 14, getTitle(), false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 16, getLevelInfo(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzn);
        SafeParcelWriter.writeString(parcel, 20, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzp, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getBannerImageLandscapeUri(), i, false);
        SafeParcelWriter.writeString(parcel, 23, getBannerImageLandscapeUrl(), false);
        SafeParcelWriter.writeParcelable(parcel, 24, getBannerImagePortraitUri(), i, false);
        SafeParcelWriter.writeString(parcel, 25, getBannerImagePortraitUrl(), false);
        SafeParcelWriter.writeLong(parcel, 29, this.zzu);
        SafeParcelWriter.writeParcelable(parcel, 33, getRelationshipInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 35, getCurrentPlayerInfo(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzx);
        SafeParcelWriter.writeString(parcel, 37, this.zzy, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.Player
    @NonNull
    public String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.Player
    @Nullable
    public String getTitle() {
        return this.zzj;
    }

    @SafeParcelable.Constructor
    public PlayerEntity(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) Uri uri, @Nullable @SafeParcelable.Param(id = 4) Uri uri2, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) int i, @SafeParcelable.Param(id = 7) long j2, @Nullable @SafeParcelable.Param(id = 8) String str3, @Nullable @SafeParcelable.Param(id = 9) String str4, @Nullable @SafeParcelable.Param(id = 14) String str5, @Nullable @SafeParcelable.Param(id = 15) MostRecentGameInfoEntity mostRecentGameInfoEntity, @Nullable @SafeParcelable.Param(id = 16) PlayerLevelInfo playerLevelInfo, @SafeParcelable.Param(id = 18) boolean z, @SafeParcelable.Param(id = 19) boolean z2, @Nullable @SafeParcelable.Param(id = 20) String str6, @SafeParcelable.Param(id = 21) String str7, @Nullable @SafeParcelable.Param(id = 22) Uri uri3, @Nullable @SafeParcelable.Param(id = 23) String str8, @Nullable @SafeParcelable.Param(id = 24) Uri uri4, @Nullable @SafeParcelable.Param(id = 25) String str9, @SafeParcelable.Param(id = 29) long j3, @Nullable @SafeParcelable.Param(id = 33) zzo zzoVar, @Nullable @SafeParcelable.Param(id = 35) zza zzaVar, @SafeParcelable.Param(id = 36) boolean z3, @Nullable @SafeParcelable.Param(id = 37) String str10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzh = str3;
        this.zzd = uri2;
        this.zzi = str4;
        this.zze = j;
        this.zzf = i;
        this.zzg = j2;
        this.zzj = str5;
        this.zzm = z;
        this.zzk = mostRecentGameInfoEntity;
        this.zzl = playerLevelInfo;
        this.zzn = z2;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = uri3;
        this.zzr = str8;
        this.zzs = uri4;
        this.zzt = str9;
        this.zzu = j3;
        this.zzv = zzoVar;
        this.zzw = zzaVar;
        this.zzx = z3;
        this.zzy = str10;
    }
}
