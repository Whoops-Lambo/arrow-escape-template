package com.google.android.gms.fido.fido2;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.h65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzk implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        h65 h65Var = new h65((TaskCompletionSource) obj2, 3);
        com.google.android.gms.internal.fido.zzn zznVar = (com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService();
        Parcel parcelR = zznVar.r();
        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.a;
        parcelR.writeStrongBinder(h65Var);
        parcelR.writeInt(0);
        zznVar.z1(2, parcelR);
    }
}
