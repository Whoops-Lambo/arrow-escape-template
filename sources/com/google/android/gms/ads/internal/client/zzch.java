package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzcdm;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzch extends IInterface {
    void zze(List list, zzcb zzcbVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    @Nullable
    zzcdm zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    @Nullable
    zzbhk zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    @Nullable
    zzbu zzk(String str) throws RemoteException;

    void zzl(zzbwg zzbwgVar) throws RemoteException;

    boolean zzm(String str, zzfp zzfpVar, @Nullable zzce zzceVar) throws RemoteException;

    boolean zzn(int i, String str) throws RemoteException;

    @Nullable
    zzbu zzo(String str) throws RemoteException;

    @Nullable
    zzbhk zzp(String str) throws RemoteException;

    @Nullable
    zzcdm zzq(String str) throws RemoteException;

    @Nullable
    zzfp zzr(int i, String str) throws RemoteException;

    Bundle zzs(int i) throws RemoteException;

    int zzt(int i, String str) throws RemoteException;

    boolean zzu(int i, String str) throws RemoteException;

    void zzv(int i) throws RemoteException;
}
