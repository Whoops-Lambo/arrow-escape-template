package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import defpackage.ep4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzki extends zzb implements zzkj {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        zzc.b(parcel);
        Status statusB = zzgy.b(i2);
        boolean zIsSuccess = statusB.isSuccess();
        BaseImplementation.ResultHolder resultHolder = ((ep4) this).a;
        if (zIsSuccess) {
            resultHolder.setResult(statusB);
            return true;
        }
        resultHolder.setFailedResult(statusB);
        return true;
    }

    public zzki() {
        super("com.google.android.gms.nearby.internal.connection.IResultListener");
    }
}
