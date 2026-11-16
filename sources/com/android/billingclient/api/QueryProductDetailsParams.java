package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzbw zza;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private com.google.android.gms.internal.play_billing.zzbw zza;

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                d.r("Product list cannot be empty.");
                return null;
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() <= 1) {
                this.zza = com.google.android.gms.internal.play_billing.zzbw.x(list);
                return this;
            }
            d.r("All products should be of the same product type.");
            return null;
        }

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.zza != null) {
                return new QueryProductDetailsParams(this, null);
            }
            d.r("Product list must be set to a non empty list.");
            return null;
        }

        public /* synthetic */ Builder(zzeb zzebVar) {
        }

        private Builder() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Product {
        private final String zza;
        private final String zzb;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Builder {
            private String zza;
            private String zzb;

            @NonNull
            public Product build() {
                String str = this.zzb;
                if ("first_party".equals(str)) {
                    d.r("Serialized doc id must be provided for first party products.");
                    return null;
                }
                if (this.zza == null) {
                    d.r("Product id must be provided.");
                    return null;
                }
                if (str != null) {
                    return new Product(this, null);
                }
                d.r("Product type must be provided.");
                return null;
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            public /* synthetic */ Builder(zzeb zzebVar) {
            }

            private Builder() {
                throw null;
            }
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final String zza() {
            return this.zza;
        }

        @NonNull
        public final String zzb() {
            return this.zzb;
        }

        public /* synthetic */ Product(Builder builder, zzeb zzebVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzbw zza() {
        return this.zza;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzeb zzebVar) {
        this.zza = builder.zza;
    }
}
