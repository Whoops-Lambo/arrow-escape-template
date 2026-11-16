package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@ShowFirstParty
public interface StockProfileImage extends Freezable<StockProfileImage>, Parcelable {
    @NonNull
    String getImageUrl();

    @NonNull
    Uri zza();

    @NonNull
    String zzb();
}
