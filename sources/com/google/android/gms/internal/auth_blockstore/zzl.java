package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzl extends zzb implements zzm {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i == 1) {
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            zzb.z1(parcel);
            k0(status, bArrCreateByteArray);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) zzc.a(parcel, Status.CREATOR);
        RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) zzc.a(parcel, RetrieveBytesResponse.CREATOR);
        zzb.z1(parcel);
        R0(status2, retrieveBytesResponse);
        return true;
    }

    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }
}
