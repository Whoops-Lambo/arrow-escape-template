package com.google.android.gms.identitycredentials.provider;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface ICredentialProviderService extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzb implements ICredentialProviderService {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zza implements ICredentialProviderService {
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean r(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
                }
                zzb.z1(parcel);
                m1();
                return true;
            }
            if (i == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
                }
                zzb.z1(parcel);
                I0();
                return true;
            }
            if (i == 3) {
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    strongBinder3.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks");
                }
                zzb.z1(parcel);
                B0();
                return true;
            }
            if (i == 4) {
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    strongBinder4.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
                }
                zzb.z1(parcel);
                x2();
                return true;
            }
            if (i != 5) {
                return false;
            }
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                strongBinder5.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks");
            }
            zzb.z1(parcel);
            r2();
            return true;
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
        }
    }

    void B0();

    void I0();

    void m1();

    void r2();

    void x2();
}
