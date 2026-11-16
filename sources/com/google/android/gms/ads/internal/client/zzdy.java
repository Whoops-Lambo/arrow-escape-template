package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdy extends zzbff implements zzea {
    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zzda());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw null;
    }

    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() throws RemoteException {
        zzed zzebVar;
        Parcel parcelZzdb = zzdb(11, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelZzdb.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        zzdc(13, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcelZzda = zzda();
        ClassLoader classLoader = zzbfh.a;
        parcelZzda.writeInt(z ? 1 : 0);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzedVar);
        zzdc(8, parcelZzda);
    }
}
