package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;
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
public final class zzbo extends zzbff implements zzbq {
    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel parcelZzdb = zzdb(1, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder);
        }
        parcelZzdb.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbob zzbobVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzboe zzboeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbtf zzbtfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbto zzbtoVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbhVar);
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbok zzbokVar, zzboh zzbohVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzbfh.e(parcelZzda, zzbokVar);
        zzbfh.e(parcelZzda, zzbohVar);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbmv zzbmvVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzbmvVar);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzboo zzbooVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbooVar);
        zzbfh.c(parcelZzda, zzrVar);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbor zzborVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzborVar);
        zzdc(10, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, adManagerAdViewOptions);
        zzdc(15, parcelZzda);
    }
}
