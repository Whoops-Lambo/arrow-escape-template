package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ta5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zzt implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        ta5 ta5Var = new ta5((TaskCompletionSource) obj2, 1);
        zzg zzgVar = (zzg) ((zzf) obj).getService();
        Parcel parcelR = zzgVar.r();
        zzc.c(parcelR, ta5Var);
        zzgVar.z1(2, parcelR);
    }
}
