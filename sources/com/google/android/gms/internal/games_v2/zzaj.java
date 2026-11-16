package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.he4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaj extends zza implements zzal {
    @Override // com.google.android.gms.internal.games_v2.zzal
    public final void d2(he4 he4Var) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzc.a;
        parcelZza.writeStrongBinder(he4Var);
        parcelZza.writeString("unusedServerClientId");
        zzc(2, parcelZza);
    }
}
