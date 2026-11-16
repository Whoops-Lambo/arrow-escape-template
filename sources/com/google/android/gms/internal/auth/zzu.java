package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ax4;
import defpackage.xc5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzu implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        xc5 xc5Var = new xc5((TaskCompletionSource) obj2);
        zzp zzpVar = (zzp) ((ax4) obj).getService();
        Parcel parcelR = zzpVar.r();
        zzc.c(parcelR, xc5Var);
        parcelR.writeInt(0);
        zzpVar.z1(4, parcelR);
    }
}
