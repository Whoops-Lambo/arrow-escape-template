package com.google.android.gms.games;

import android.annotation.SuppressLint;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ParcelCreator"})
public final class GameRef extends zzg implements Game {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean areSnapshotsEnabled() {
        return getInteger("snapshots_enabled") > 0;
    }

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* synthetic */ Game freeze() {
        return new GameEntity(this);
    }

    @Override // com.google.android.gms.games.Game
    public final int getAchievementTotalCount() {
        return getInteger("achievement_total_count");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getApplicationId() {
        return getString("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getDescription() {
        return getString("game_description");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getDeveloperName() {
        return getString("developer_name");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getDisplayName() {
        return getString("display_name");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final Uri getFeaturedImageUri() {
        return parseUri("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getFeaturedImageUrl() {
        return getString("featured_image_url");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final Uri getHiResImageUri() {
        return parseUri("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getHiResImageUrl() {
        return getString("game_hi_res_image_url");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final Uri getIconImageUri() {
        return parseUri("game_icon_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public String getIconImageUrl() {
        return getString("game_icon_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public final int getLeaderboardCount() {
        return getInteger("leaderboard_count");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getPrimaryCategory() {
        return getString("primary_category");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getSecondaryCategory() {
        return getString("secondary_category");
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String getThemeColor() {
        return getString("theme_color");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean hasGamepadSupport() {
        return getInteger("gamepad_support") > 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        new GameEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zza() {
        return getBoolean("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzb() {
        return getBoolean("muted");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzc() {
        return getBoolean("identity_sharing_confirmed");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzd() {
        if (!hasColumn("profileless_recall_enabled_v3") || hasNull("profileless_recall_enabled_v3")) {
            return false;
        }
        return getBoolean("profileless_recall_enabled_v3");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zze() {
        return getInteger("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    @NonNull
    public final String zzf() {
        return getString("package_name");
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzg() {
        return getInteger("real_time_support") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean zzh() {
        return getInteger("turn_based_support") > 0;
    }

    public GameRef(@NonNull DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(@Nullable Object obj) {
        return GameEntity.zzj(this, obj);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return GameEntity.zzi(this);
    }

    @NonNull
    public final String toString() {
        return GameEntity.zzk(this);
    }

    @Override // com.google.android.gms.games.Game
    public final void getDescription(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("game_description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final void getDeveloperName(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("developer_name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    public final void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("display_name", charArrayBuffer);
    }
}
