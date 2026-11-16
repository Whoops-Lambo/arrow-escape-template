package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbwg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzcy extends IInterface {
    void zze() throws RemoteException;

    void zzf(float f) throws RemoteException;

    void zzg(String str) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzj(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    float zzk() throws RemoteException;

    boolean zzl() throws RemoteException;

    String zzm() throws RemoteException;

    void zzn(@Nullable String str) throws RemoteException;

    void zzo(zzbwg zzbwgVar) throws RemoteException;

    void zzp(zzbta zzbtaVar) throws RemoteException;

    List zzq() throws RemoteException;

    void zzr(zzfr zzfrVar) throws RemoteException;

    void zzs() throws RemoteException;

    void zzt(zzdk zzdkVar) throws RemoteException;

    void zzu(boolean z) throws RemoteException;

    void zzv(String str) throws RemoteException;

    void zzw() throws RemoteException;
}
