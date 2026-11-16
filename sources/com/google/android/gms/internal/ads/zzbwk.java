package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbwk extends zzbff implements zzbwm {
    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void o0(zzcdf zzcdfVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() throws RemoteException {
        zzdc(4, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzi() throws RemoteException {
        zzdc(5, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzj() throws RemoteException {
        zzdc(6, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzs(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzv(String str) {
        throw null;
    }

    public zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzk() throws RemoteException {
        zzdc(8, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzn() throws RemoteException {
        zzdc(11, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzo() throws RemoteException {
        zzdc(13, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzq() throws RemoteException {
        zzdc(15, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzt() throws RemoteException {
        zzdc(18, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzu() throws RemoteException {
        zzdc(20, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzz() throws RemoteException {
        zzdc(25, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void B3(zzbnx zzbnxVar, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbnxVar);
        parcelZzda.writeString(str);
        zzdc(10, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void H(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(24, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void M3(int i, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeString(str);
        zzdc(22, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void p(zzcdj zzcdjVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzcdjVar);
        zzdc(16, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void p0(String str, String str2) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        parcelZzda.writeString(str2);
        zzdc(9, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void s(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(23, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(3, parcelZzda);
    }
}
