package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.n95;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzs implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        n95 n95Var = new n95((TaskCompletionSource) obj2);
        zzh zzhVar = (zzh) ((zzw) obj).getService();
        zzhVar.getClass();
        Parcel parcelR = zza.r();
        int i = zzc.a;
        parcelR.writeStrongBinder(n95Var.asBinder());
        zzhVar.z1(6, parcelR);
    }
}
