package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzu extends zzb implements zzv {
    @Override // com.google.android.gms.internal.games_v2.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        zzs zzsVar = (zzs) zzc.a(parcel, zzs.CREATOR);
        zzc.d(parcel);
        m0(status, zzsVar);
        return true;
    }

    public zzu() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }
}
