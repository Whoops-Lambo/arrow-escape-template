package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface IRestoreCredentialService extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzb implements IRestoreCredentialService {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zza implements IRestoreCredentialService {
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public final void N2(GetRestoreCredentialRequest getRestoreCredentialRequest, InternalRestoreCredentialClient$getRestoreCredential$1$callback$1 internalRestoreCredentialClient$getRestoreCredential$1$callback$1) {
                Parcel parcelR = r();
                zzc.b(parcelR, getRestoreCredentialRequest);
                zzc.c(parcelR, internalRestoreCredentialClient$getRestoreCredential$1$callback$1);
                z1(2, parcelR);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public final void Q2(ClearRestoreCredentialRequest clearRestoreCredentialRequest, InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1 internalRestoreCredentialClient$clearRestoreCredential$1$callback$1) {
                Parcel parcelR = r();
                zzc.b(parcelR, clearRestoreCredentialRequest);
                zzc.c(parcelR, internalRestoreCredentialClient$clearRestoreCredential$1$callback$1);
                z1(4, parcelR);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public final void W0(CreateRestoreCredentialRequest createRestoreCredentialRequest, InternalRestoreCredentialClient$createRestoreCredential$1$callback$1 internalRestoreCredentialClient$createRestoreCredential$1$callback$1) {
                Parcel parcelR = r();
                zzc.b(parcelR, createRestoreCredentialRequest);
                zzc.c(parcelR, internalRestoreCredentialClient$createRestoreCredential$1$callback$1);
                z1(3, parcelR);
            }
        }
    }

    void N2(GetRestoreCredentialRequest getRestoreCredentialRequest, InternalRestoreCredentialClient$getRestoreCredential$1$callback$1 internalRestoreCredentialClient$getRestoreCredential$1$callback$1);

    void Q2(ClearRestoreCredentialRequest clearRestoreCredentialRequest, InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1 internalRestoreCredentialClient$clearRestoreCredential$1$callback$1);

    void W0(CreateRestoreCredentialRequest createRestoreCredentialRequest, InternalRestoreCredentialClient$createRestoreCredential$1$callback$1 internalRestoreCredentialClient$createRestoreCredential$1$callback$1);
}
