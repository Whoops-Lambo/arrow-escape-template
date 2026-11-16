package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public interface ExperienceEvent extends Freezable<ExperienceEvent>, Parcelable {
    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    String zza();

    @NonNull
    Game zzb();

    @NonNull
    String zzc();

    @NonNull
    String zzd();

    @NonNull
    Uri zze();

    long zzf();

    long zzg();

    long zzh();

    int zzi();

    int zzj();
}
