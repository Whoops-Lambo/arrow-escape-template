package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.m45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzm implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        zzg zzgVar = (zzg) ((zzd) obj).getService();
        com.google.android.gms.appset.zza zzaVar = new com.google.android.gms.appset.zza(null, null);
        m45 m45Var = new m45((TaskCompletionSource) obj2);
        zzgVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = zzc.a;
        parcelObtain.writeInt(1);
        zzaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(m45Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            zzgVar.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
