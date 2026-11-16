package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzx extends IInterface {
    void zzb(@Nullable zzg zzgVar) throws RemoteException;

    void zzc(@Nullable Intent intent) throws RemoteException;

    void zzd(Status status) throws RemoteException;
}
