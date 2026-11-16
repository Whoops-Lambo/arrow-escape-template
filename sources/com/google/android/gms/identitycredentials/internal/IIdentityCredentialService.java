package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface IIdentityCredentialService extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Stub extends zzb implements IIdentityCredentialService {
        public static final /* synthetic */ int a = 0;

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean r(int i, Parcel parcel, Parcel parcel2) {
            throw null;
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Proxy extends zza implements IIdentityCredentialService {
            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void D(InternalIdentityCredentialClient$signalCredentialState$1$callback$1 internalIdentityCredentialClient$signalCredentialState$1$callback$1, SignalCredentialStateRequest signalCredentialStateRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.b);
                zzc.c(parcelObtain, internalIdentityCredentialClient$signalCredentialState$1$callback$1);
                zzc.b(parcelObtain, signalCredentialStateRequest);
                zzc.b(parcelObtain, apiMetadata);
                r(10, parcelObtain);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void a0(InternalIdentityCredentialClient$createCredential$1$callback$1 internalIdentityCredentialClient$createCredential$1$callback$1, CreateCredentialRequest createCredentialRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.b);
                zzc.c(parcelObtain, internalIdentityCredentialClient$createCredential$1$callback$1);
                zzc.b(parcelObtain, createCredentialRequest);
                zzc.b(parcelObtain, apiMetadata);
                r(6, parcelObtain);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void k1(InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.b);
                zzc.c(parcelObtain, internalIdentityCredentialClient$getCredential$1$callback$1);
                zzc.b(parcelObtain, getCredentialRequest);
                zzc.b(parcelObtain, apiMetadata);
                r(1, parcelObtain);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public final void p3(InternalIdentityCredentialClient$clearCredentialState$1$callback$1 internalIdentityCredentialClient$clearCredentialState$1$callback$1, ClearCredentialStateRequest clearCredentialStateRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.b);
                zzc.c(parcelObtain, internalIdentityCredentialClient$clearCredentialState$1$callback$1);
                zzc.b(parcelObtain, clearCredentialStateRequest);
                zzc.b(parcelObtain, apiMetadata);
                r(9, parcelObtain);
            }
        }
    }

    void D(InternalIdentityCredentialClient$signalCredentialState$1$callback$1 internalIdentityCredentialClient$signalCredentialState$1$callback$1, SignalCredentialStateRequest signalCredentialStateRequest, ApiMetadata apiMetadata);

    void a0(InternalIdentityCredentialClient$createCredential$1$callback$1 internalIdentityCredentialClient$createCredential$1$callback$1, CreateCredentialRequest createCredentialRequest, ApiMetadata apiMetadata);

    void k1(InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1, GetCredentialRequest getCredentialRequest, ApiMetadata apiMetadata);

    void p3(InternalIdentityCredentialClient$clearCredentialState$1$callback$1 internalIdentityCredentialClient$clearCredentialState$1$callback$1, ClearCredentialStateRequest clearCredentialStateRequest, ApiMetadata apiMetadata);
}
