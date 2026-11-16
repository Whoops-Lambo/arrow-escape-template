package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public interface InternalClientFlags {

    @NonNull
    @KeepForSdk
    public static final InternalClientFlags DEFAULT = new zzah();

    @NonNull
    public static final InternalClientFlags zza = new zzai();

    @KeepForSdk
    boolean catchNetworkCallbackTooManyRequestsException();

    @KeepForSdk
    boolean enableGoogleSignatureVerifierUidShortCircuit();

    @KeepForSdk
    boolean isPhoneRefinedFoldableAndTabletLogic();

    @KeepForSdk
    boolean providerinstallerDynamiteLoadingDisabled();

    @KeepForSdk
    boolean skipClientThrottlingDryrun();

    @KeepForSdk
    boolean useApiExceptionOnMissingFeature();

    boolean zza();
}
