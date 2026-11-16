package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
enum zzdf {
    GET_BILLING_CONFIG("getBillingConfig", 29),
    IS_BILLING_PROGRAM_AVAILABLE_ASYNC("isIndirectBillingProgramAvailable", 33),
    CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC("createIndirectBillingReportingDetails", 35);

    private final String zze;
    private final int zzf;

    public final String zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    zzdf(String str, int i) {
        this.zze = str;
        this.zzf = i;
    }
}
