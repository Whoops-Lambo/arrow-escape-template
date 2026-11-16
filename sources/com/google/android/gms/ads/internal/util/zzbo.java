package com.google.android.gms.ads.internal.util;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzbo extends IInterface {
    boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException;
}
