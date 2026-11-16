package com.google.android.gms.fido.fido2;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.h05;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzd implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        h05 h05Var = new h05((TaskCompletionSource) obj2, 0);
        zzs zzsVar = (zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService();
        Parcel parcelR = zzsVar.r();
        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.a;
        parcelR.writeStrongBinder(h05Var);
        zzsVar.z1(3, parcelR);
    }
}
