package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ax4;
import defpackage.rk3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzq implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        zzp zzpVar = (zzp) ((ax4) obj).getService();
        rk3 rk3Var = new rk3((TaskCompletionSource) obj2, 1);
        Parcel parcelR = zzpVar.r();
        zzc.c(parcelR, rk3Var);
        parcelR.writeString(null);
        zzpVar.z1(3, parcelR);
    }
}
