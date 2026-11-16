package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzah extends zzb implements zzai {
    @Override // com.google.android.gms.internal.games_v2.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzam zzamVar = (zzam) zzc.a(parcel, zzam.CREATOR);
            zzc.d(parcel);
            N1(zzamVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        zzc.d(parcel);
        h(status);
        return true;
    }

    public zzah() {
        super("com.google.android.gms.games.internal.recall.IRecallCallbacks");
    }
}
