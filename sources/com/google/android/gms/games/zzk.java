package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzk extends zzl {
    @Override // com.google.android.gms.games.zzl, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza */
    public final PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri;
        if (!GamesDowngradeableSafeParcel.zzp(DowngradeableSafeParcel.getUnparcelClientVersion()) && !DowngradeableSafeParcel.canUnparcelSafely(PlayerEntity.class.getCanonicalName())) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Uri uri2 = null;
            if (string3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(string3);
            }
            if (string4 != null) {
                uri2 = Uri.parse(string4);
            }
            return new PlayerEntity(string, string2, uri, uri2, j, -1, -1L, null, null, null, null, null, true, false, string5, string6, null, null, null, null, -1L, null, null, false, null);
        }
        return super.createFromParcel(parcel);
    }
}
