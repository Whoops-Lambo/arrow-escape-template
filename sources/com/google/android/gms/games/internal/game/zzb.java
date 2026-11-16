package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzb extends zzc {
    @Override // com.google.android.gms.games.internal.game.zzc, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza */
    public final GameBadgeEntity createFromParcel(Parcel parcel) {
        Uri uri;
        if (!GamesDowngradeableSafeParcel.zzp(DowngradeableSafeParcel.getUnparcelClientVersion()) && !DowngradeableSafeParcel.canUnparcelSafely(GameBadgeEntity.class.getCanonicalName())) {
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (string3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(string3);
            }
            return new GameBadgeEntity(i, string, string2, uri);
        }
        return super.createFromParcel(parcel);
    }
}
