package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzjd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzdh {
    public static BillingResult zza(Bundle bundle, String str, int i, zzcz zzczVar, int i2) {
        if (!bundle.containsKey("BILLING_RESULT")) {
            com.google.android.gms.internal.play_billing.zzc.h(str, "delegateToBackendAsync does not contain a billing result in the response");
            BillingResult billingResult = zzdc.zzh;
            zzde.zza(zzjd.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE, billingResult, zzczVar, i, i2);
            return billingResult;
        }
        try {
            byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
            if (byteArray == null) {
                throw new Exception("Billing result is null");
            }
            com.google.android.gms.internal.play_billing.zzdw zzdwVarQ = com.google.android.gms.internal.play_billing.zzdw.q(byteArray);
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(zzdwVarQ.p());
            builderNewBuilder.setDebugMessage(zzdwVarQ.r());
            BillingResult billingResultBuild = builderNewBuilder.build();
            if (billingResultBuild.getResponseCode() != 0) {
                zzde.zza(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, billingResultBuild, zzczVar, i, i2);
                return billingResultBuild;
            }
            if (bundle.containsKey("RESPONSE_DATA")) {
                return billingResultBuild;
            }
            com.google.android.gms.internal.play_billing.zzc.h(str, "delegateToBackendAsync returned a bundle with neither an error nor response data");
            zzjd zzjdVar = zzjd.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult2 = zzdc.zzh;
            zzde.zza(zzjdVar, billingResult2, zzczVar, i, i2);
            return billingResult2;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.i(str, "Failed parsing BillingResult.", e);
            BillingResult billingResult3 = zzdc.zzh;
            zzde.zzb(zzjd.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT, billingResult3, zzczVar, i, i2, zzcy.zza(e));
            return billingResult3;
        }
    }
}
