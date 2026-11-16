package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.bx3;
import defpackage.pv1;
import defpackage.x24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingResult {
    private int zza;
    private int zzb;
    private String zzc;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private int zza;
        private int zzb = 0;
        private String zzc = "";

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            billingResult.zzc = this.zzc;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        @zzq
        public Builder setOnPurchasesUpdatedSubResponseCode(int i) {
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        private Builder() {
        }

        public /* synthetic */ Builder(zzdb zzdbVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzc;
    }

    @zzq
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        int i = this.zza;
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        x24 x24Var = bx3.c;
        Integer numValueOf = Integer.valueOf(i);
        return pv1.o("Response Code: ", (!x24Var.containsKey(numValueOf) ? bx3.RESPONSE_CODE_UNSPECIFIED : (bx3) x24Var.get(numValueOf)).toString(), ", Debug Message: ", this.zzc);
    }
}
