package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzv extends com.google.android.gms.internal.games_v2.zza implements IInterface {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void zzd(zzx zzxVar, zzr zzrVar, List list, List list2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.c(parcelZza, zzxVar);
        com.google.android.gms.internal.games_v2.zzc.b(parcelZza, zzrVar);
        parcelZza.writeTypedList(list);
        parcelZza.writeTypedList(list2);
        zzc(3, parcelZza);
    }

    public final void zze(zzx zzxVar, zzr zzrVar, zzi zziVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.c(parcelZza, zzxVar);
        com.google.android.gms.internal.games_v2.zzc.b(parcelZza, zzrVar);
        com.google.android.gms.internal.games_v2.zzc.b(parcelZza, zziVar);
        zzc(4, parcelZza);
    }
}
