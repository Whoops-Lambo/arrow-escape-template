package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import defpackage.dv3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdx extends zzb implements zzdy {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(TemporaryExposureKey.CREATOR);
        zzc.b(parcel);
        TaskUtil.trySetResultOrApiException(status, arrayListCreateTypedArrayList, ((dv3) this).a);
        return true;
    }

    public zzdx() {
        super("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
    }
}
