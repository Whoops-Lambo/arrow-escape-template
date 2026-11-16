package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbto;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbh zzbhVar) throws RemoteException;

    void zzg(zzbob zzbobVar) throws RemoteException;

    void zzh(zzboe zzboeVar) throws RemoteException;

    void zzi(String str, zzbok zzbokVar, @Nullable zzboh zzbohVar) throws RemoteException;

    void zzj(zzbmv zzbmvVar) throws RemoteException;

    void zzk(zzboo zzbooVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbor zzborVar) throws RemoteException;

    void zzn(zzbtf zzbtfVar) throws RemoteException;

    void zzo(zzbto zzbtoVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}
