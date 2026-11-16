package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.n45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzm implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        n45 n45Var = new n45((TaskCompletionSource) obj2);
        zzh zzhVar = (zzh) ((zzw) obj).getService();
        zzhVar.getClass();
        Parcel parcelR = zza.r();
        int i = zzc.a;
        parcelR.writeStrongBinder(n45Var.asBinder());
        zzhVar.z1(3, parcelR);
    }
}
