package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface IHsdpPrewarmServiceCallback extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzbfg implements IHsdpPrewarmServiceCallback {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zzbff implements IHsdpPrewarmServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel parcelZzda = zzda();
                zzbfh.c(parcelZzda, bundle);
                zzdd(2, parcelZzda);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException {
                Parcel parcelZzda = zzda();
                zzbfh.c(parcelZzda, bundle);
                zzdd(1, parcelZzda);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbfg
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Bundle bundle = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
                zzbfh.f(parcel);
                onPrewarmCompleted(bundle);
            } else {
                if (i != 2) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
                zzbfh.f(parcel);
                onError(bundle2);
            }
            return true;
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        }

        @NonNull
        public static IHsdpPrewarmServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            return iInterfaceQueryLocalInterface instanceof IHsdpPrewarmServiceCallback ? (IHsdpPrewarmServiceCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void onError(@NonNull Bundle bundle) throws RemoteException;

    void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException;
}
