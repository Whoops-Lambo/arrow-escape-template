package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zza extends zzb {
    @Override // com.google.android.gms.games.multiplayer.zzb, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza */
    public final ParticipantEntity createFromParcel(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.zzp(DowngradeableSafeParcel.getUnparcelClientVersion()) && !DowngradeableSafeParcel.canUnparcelSafely(ParticipantEntity.class.getCanonicalName())) {
            return new ParticipantEntity();
        }
        return super.createFromParcel(parcel);
    }
}
