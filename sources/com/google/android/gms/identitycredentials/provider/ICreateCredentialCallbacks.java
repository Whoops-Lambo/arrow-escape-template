package com.google.android.gms.identitycredentials.provider;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface ICreateCredentialCallbacks extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzb implements ICreateCredentialCallbacks {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zza implements ICreateCredentialCallbacks {
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean r(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                zzb.z1(parcel);
                onSuccess();
            } else if (i == 2) {
                parcel.readString();
                parcel.readString();
                zzb.z1(parcel);
                onFailure();
            } else {
                if (i != 3) {
                    return false;
                }
                zzb.z1(parcel);
                L();
            }
            parcel2.writeNoException();
            return true;
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
        }
    }

    void L();

    void onFailure();

    void onSuccess();
}
