package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import defpackage.iw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzde extends zzb implements zzdf {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        ExposureSummary exposureSummary = (ExposureSummary) zzc.a(parcel, ExposureSummary.CREATOR);
        zzc.b(parcel);
        TaskUtil.trySetResultOrApiException(status, exposureSummary, ((iw3) this).a);
        return true;
    }

    public zzde() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }
}
