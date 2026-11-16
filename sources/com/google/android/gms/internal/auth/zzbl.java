package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.dz3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzbl implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        dz3 dz3Var = new dz3((TaskCompletionSource) obj2, 0);
        zzbh zzbhVar = (zzbh) ((zzbe) obj).getService();
        Parcel parcelR = zzbhVar.r();
        zzc.c(parcelR, dz3Var);
        parcelR.writeInt(0);
        zzbhVar.z1(1, parcelR);
    }
}
