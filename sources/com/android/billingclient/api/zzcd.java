package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcd extends com.google.android.gms.internal.play_billing.zzaj {
    final AlternativeBillingOnlyAvailabilityListener zza;
    final zzcz zzb;
    final int zzc;

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        zzjk zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            BillingResult billingResult = zzdc.zzh;
            zzczVar.zzb(zzcy.zzb(zzjd.NULL_BUNDLE_FROM_IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL, 14, billingResult, null, zzjkVar), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iA = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iA, com.google.android.gms.internal.play_billing.zzc.f(bundle, "BillingClient"));
        if (iA != 0) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iA);
            this.zzb.zzb(zzcy.zzb(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 14, billingResultZza, null, zzjkVar), this.zzc);
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }

    public /* synthetic */ zzcd(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzczVar;
        this.zzc = i;
    }
}
