package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface IHsdpDeepLinkServiceWrapper extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzbfg implements IHsdpDeepLinkServiceWrapper {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zzbff implements IHsdpDeepLinkServiceWrapper {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException {
                Parcel parcelZzda = zzda();
                zzbfh.e(parcelZzda, iObjectWrapper);
                parcelZzda.writeString(str);
                zzdc(2, parcelZzda);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException {
                Parcel parcelZzda = zzda();
                zzbfh.e(parcelZzda, iObjectWrapper);
                parcelZzda.writeString(str);
                parcelZzda.writeString(str2);
                zzbfh.c(parcelZzda, bundle);
                parcelZzda.writeInt(z ? 1 : 0);
                zzbfh.e(parcelZzda, iHsdpServiceCallback);
                zzdc(3, parcelZzda);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException {
                Parcel parcelZzda = zzda();
                zzbfh.e(parcelZzda, iObjectWrapper);
                parcelZzda.writeTypedList(list);
                zzbfh.e(parcelZzda, iHsdpPrewarmServiceCallback);
                zzdc(1, parcelZzda);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbfg
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallbackAsInterface = IHsdpPrewarmServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbfh.f(parcel);
                prewarm(iObjectWrapperR, arrayListCreateTypedArrayList, iHsdpPrewarmServiceCallbackAsInterface);
            } else if (i == 2) {
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                String string = parcel.readString();
                zzbfh.f(parcel);
                endSession(iObjectWrapperR2, string);
            } else {
                if (i != 3) {
                    return false;
                }
                IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Bundle bundle = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
                boolean z = parcel.readInt() != 0;
                IHsdpServiceCallback iHsdpServiceCallbackAsInterface = IHsdpServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbfh.f(parcel);
                open(iObjectWrapperR3, string2, string3, bundle, z, iHsdpServiceCallbackAsInterface);
            }
            parcel2.writeNoException();
            return true;
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        }

        @NonNull
        public static IHsdpDeepLinkServiceWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            return iInterfaceQueryLocalInterface instanceof IHsdpDeepLinkServiceWrapper ? (IHsdpDeepLinkServiceWrapper) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException;

    void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException;

    void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException;
}
