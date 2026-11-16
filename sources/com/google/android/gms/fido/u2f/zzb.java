package com.google.android.gms.fido.u2f;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zzw;
import com.google.android.gms.internal.fido.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.l14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzb implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        l14 l14Var = new l14((TaskCompletionSource) obj2, 1);
        zzw zzwVar = (zzw) ((zzy) obj).getService();
        Parcel parcelR = zzwVar.r();
        ClassLoader classLoader = zzc.a;
        parcelR.writeStrongBinder(l14Var);
        parcelR.writeInt(0);
        zzwVar.z1(2, parcelR);
    }
}
