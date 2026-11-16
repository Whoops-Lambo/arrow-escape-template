package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class QueryPurchasesParams {
    private final String zza;
    private final boolean zzb;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private String zza;
        private boolean zzb = false;

        @NonNull
        public QueryPurchasesParams build() {
            String str = this.zza;
            zzed zzedVar = null;
            if (str == null) {
                d.r("Product type must be set");
                return null;
            }
            if (!this.zzb || str.equals("subs")) {
                return new QueryPurchasesParams(this, zzedVar);
            }
            d.r("includeSuspendedSubscriptions is only supported for subscription purchases");
            return null;
        }

        @NonNull
        public Builder includeSuspendedSubscriptions(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        private Builder() {
        }

        public /* synthetic */ Builder(zzed zzedVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getIncludeSuspendedSubscriptions() {
        return this.zzb;
    }

    @NonNull
    public final String zza() {
        return this.zza;
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzed zzedVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }
}
