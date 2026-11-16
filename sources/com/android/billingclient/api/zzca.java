package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzca extends com.google.android.gms.internal.play_billing.zzaf {
    final BillingConfigResponseListener zza;
    final zzcz zzb;
    final int zzc;

    @Override // com.google.android.gms.internal.play_billing.zzag
    public final void zza(Bundle bundle) throws RemoteException {
        zzjk zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
        if (bundle == null) {
            zzcz zzczVar = this.zzb;
            BillingResult billingResult = zzdc.zzh;
            zzczVar.zzb(zzcy.zzb(zzjd.NULL_BUNDLE_FROM_GET_BILLING_CONFIG_SERVICE_CALL, 13, billingResult, null, zzjkVar), this.zzc);
            this.zza.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iA = com.google.android.gms.internal.play_billing.zzc.a(bundle, "BillingClient");
        String strF = com.google.android.gms.internal.play_billing.zzc.f(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iA);
        builderNewBuilder.setDebugMessage(strF);
        if (iA != 0) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "getBillingConfig() failed. Response code: " + iA);
            BillingResult billingResultBuild = builderNewBuilder.build();
            this.zzb.zzb(zzcy.zzb(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, 13, billingResultBuild, null, zzjkVar), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzc.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            this.zzb.zzb(zzcy.zzb(zzjd.MISSING_BILLING_CONFIG_IN_GET_BILLING_CONFIG_RESPONSE, 13, billingResultBuild2, null, zzjkVar), this.zzc);
            this.zza.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            this.zza.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzc.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            zzcz zzczVar2 = this.zzb;
            BillingResult billingResult2 = zzdc.zzh;
            zzczVar2.zzb(zzcy.zzb(zzjd.ERROR_DECODING_BILLING_CONFIG_DATA, 13, billingResult2, null, zzjkVar), this.zzc);
            this.zza.onBillingConfigResponse(billingResult2, null);
        }
    }

    public /* synthetic */ zzca(BillingConfigResponseListener billingConfigResponseListener, zzcz zzczVar, int i, zzch zzchVar) {
        this.zza = billingConfigResponseListener;
        this.zzb = zzczVar;
        this.zzc = i;
    }
}
