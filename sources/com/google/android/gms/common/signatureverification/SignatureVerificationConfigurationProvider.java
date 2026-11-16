package com.google.android.gms.common.signatureverification;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@KeepForSdk
public class SignatureVerificationConfigurationProvider {
    private static final SignatureVerificationConfiguration zza = zzd.zzc();

    @NonNull
    public static SignatureVerificationConfiguration zza() {
        return zza;
    }

    private SignatureVerificationConfigurationProvider() {
    }
}
