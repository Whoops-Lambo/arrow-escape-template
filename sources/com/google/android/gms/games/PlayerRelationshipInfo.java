package com.google.android.gms.games;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.Freezable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface PlayerRelationshipInfo extends Freezable<PlayerRelationshipInfo>, Parcelable {
    int getFriendStatus();

    @Nullable
    String zza();

    @Nullable
    String zzb();

    @Nullable
    String zzc();
}
