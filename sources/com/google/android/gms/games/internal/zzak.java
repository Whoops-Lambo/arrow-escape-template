package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzak extends com.google.android.gms.internal.games_v2.zzb implements zzal {
    public zzak() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1001) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzaf zzafVarZzb = zzb();
        parcel2.writeNoException();
        int i3 = com.google.android.gms.internal.games_v2.zzc.a;
        parcel2.writeInt(1);
        zzafVarZzb.writeToParcel(parcel2, 1);
        return true;
    }
}
