package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zze extends zzf {
    @Override // com.google.android.gms.games.zzf, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza */
    public final GameEntity createFromParcel(Parcel parcel) {
        Uri uri;
        Uri uri2;
        boolean z;
        if (!GamesDowngradeableSafeParcel.zzp(DowngradeableSafeParcel.getUnparcelClientVersion()) && !DowngradeableSafeParcel.canUnparcelSafely(GameEntity.class.getCanonicalName())) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Uri uri3 = null;
            if (string7 == null) {
                uri = null;
            } else {
                uri = Uri.parse(string7);
            }
            String string8 = parcel.readString();
            if (string8 == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(string8);
            }
            String string9 = parcel.readString();
            if (string9 != null) {
                uri3 = Uri.parse(string9);
            }
            Uri uri4 = uri3;
            boolean z2 = true;
            if (parcel.readInt() <= 0) {
                z2 = false;
            }
            if (parcel.readInt() > 0) {
                z = true;
            } else {
                z = false;
            }
            return new GameEntity(string, string2, string3, string4, string5, string6, uri, uri2, uri4, z2, z, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false, false);
        }
        return super.createFromParcel(parcel);
    }
}
