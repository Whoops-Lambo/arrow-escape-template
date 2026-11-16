package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.em3;
import defpackage.p05;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzkp extends zzbm implements zzkq {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzbn.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.d(parcel);
        TaskCompletionSource taskCompletionSource = ((p05) this).a;
        if (!status.isSuccess()) {
            TaskUtil.setResultOrApiException(status, (Object) null, (TaskCompletionSource<Object>) taskCompletionSource);
            return true;
        }
        try {
            zzadf zzadfVar = zzadf.b;
            int i2 = em3.a;
            TaskUtil.setResultOrApiException(status, zzno.B(bArrCreateByteArray, zzadf.c), (TaskCompletionSource<zzno>) taskCompletionSource);
            return true;
        } catch (zzaeh e) {
            taskCompletionSource.setException(e);
            return true;
        }
    }

    public zzkp() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }
}
