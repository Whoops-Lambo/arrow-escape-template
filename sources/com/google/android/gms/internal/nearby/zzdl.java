package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.fr3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdl extends zzb implements zzdm {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        int i2 = parcel.readInt();
        zzc.b(parcel);
        TaskUtil.trySetResultOrApiException(status, Integer.valueOf(i2), ((fr3) this).a);
        return true;
    }

    public zzdl() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IIntCallback");
    }
}
