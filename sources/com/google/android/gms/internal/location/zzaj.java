package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaj extends zzb implements zzak {
    @Override // com.google.android.gms.internal.location.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i == 1) {
            parcel.readInt();
            parcel.createStringArray();
            f2();
            return true;
        }
        if (i == 2) {
            parcel.readInt();
            parcel.createStringArray();
            H0();
            return true;
        }
        if (i != 3) {
            return false;
        }
        parcel.readInt();
        zzd();
        return true;
    }

    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }
}
