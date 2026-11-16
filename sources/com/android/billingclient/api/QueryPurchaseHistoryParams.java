package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class QueryPurchaseHistoryParams {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private String zza;

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            d.r("Product type must be set");
            return null;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzec zzecVar) {
        }

        private Builder() {
            throw null;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzec zzecVar) {
    }
}
