package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import defpackage.cq4;
import defpackage.pp4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzkl extends zzb implements zzkm {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzlm zzlmVar = (zzlm) zzc.a(parcel, zzlm.CREATOR);
        zzc.b(parcel);
        Status statusB = zzgy.b(zzlmVar.a);
        boolean zIsSuccess = statusB.isSuccess();
        BaseImplementation.ResultHolder resultHolder = ((cq4) this).a;
        if (zIsSuccess) {
            resultHolder.setResult(new pp4(statusB));
            return true;
        }
        resultHolder.setFailedResult(statusB);
        return true;
    }

    public zzkl() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }
}
