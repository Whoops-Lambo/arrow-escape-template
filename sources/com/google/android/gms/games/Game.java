package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface Game extends Freezable<Game>, Parcelable {
    boolean areSnapshotsEnabled();

    int getAchievementTotalCount();

    @NonNull
    String getApplicationId();

    @NonNull
    String getDescription();

    void getDescription(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    String getDeveloperName();

    void getDeveloperName(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    String getDisplayName();

    void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    Uri getFeaturedImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @NonNull
    Uri getHiResImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @NonNull
    Uri getIconImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    int getLeaderboardCount();

    @NonNull
    String getPrimaryCategory();

    @NonNull
    String getSecondaryCategory();

    @NonNull
    String getThemeColor();

    boolean hasGamepadSupport();

    boolean zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    @NonNull
    String zzf();

    @Deprecated
    boolean zzg();

    @Deprecated
    boolean zzh();
}
