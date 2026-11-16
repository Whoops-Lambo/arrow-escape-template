package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzce extends com.google.android.gms.internal.play_billing.zzal {
    final ExternalOfferAvailabilityListener zza;
    final zzcz zzb;
    final int zzc;

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void zza(Bundle bundle) throws RemoteException {
        zzjk zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            BillingResult billingResult = zzdc.zzh;
            zzczVar.zzb(zzcy.zzb(zzjd.NULL_BUNDLE_FROM_IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL, 23, billingResult, null, zzjkVar), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iA = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iA, com.google.android.gms.internal.play_billing.zzc.f(bundle, "BillingClient"));
        if (iA != 0) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iA);
            this.zzb.zzb(zzcy.zzb(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 23, billingResultZza, null, zzjkVar), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }

    public /* synthetic */ zzce(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzczVar;
        this.zzc = i;
    }
}
