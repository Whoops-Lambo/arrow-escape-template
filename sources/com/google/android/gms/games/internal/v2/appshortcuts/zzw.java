package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzw extends com.google.android.gms.internal.games_v2.zzb implements zzx {
    @Override // com.google.android.gms.internal.games_v2.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) com.google.android.gms.internal.games_v2.zzc.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
            zzd(status);
        } else if (i == 2) {
            zzg zzgVar = (zzg) com.google.android.gms.internal.games_v2.zzc.a(parcel, zzg.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
            zzb(zzgVar);
        } else {
            if (i != 3) {
                return false;
            }
            Intent intent = (Intent) com.google.android.gms.internal.games_v2.zzc.a(parcel, Intent.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.d(parcel);
            zzc(intent);
        }
        return true;
    }

    public zzw() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }
}
