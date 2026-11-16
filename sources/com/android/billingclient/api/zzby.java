package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzby extends com.google.android.gms.internal.play_billing.zzy {
    final ExternalOfferReportingDetailsListener zza;
    final zzcz zzb;
    final int zzc;

    @Override // com.google.android.gms.internal.play_billing.zzz
    public final void zza(Bundle bundle) throws RemoteException {
        zzjk zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            BillingResult billingResult = zzdc.zzh;
            zzczVar.zzb(zzcy.zzb(zzjd.NULL_BUNDLE_FROM_CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL, 24, billingResult, null, zzjkVar), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iA = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        BillingResult billingResultZza = zzdc.zza(iA, com.google.android.gms.internal.play_billing.zzc.f(bundle, "BillingClient"));
        if (iA != 0) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iA);
            this.zzb.zzb(zzcy.zzb(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 24, billingResultZza, null, zzjkVar), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.i("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            zzcz zzczVar2 = this.zzb;
            BillingResult billingResult2 = zzdc.zzh;
            zzczVar2.zzb(zzcy.zzb(zzjd.ERROR_DECODING_EXTERNAL_OFFER_REPORTING_DETAILS, 24, billingResult2, null, zzjkVar), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }

    public /* synthetic */ zzby(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzczVar;
        this.zzc = i;
    }
}
