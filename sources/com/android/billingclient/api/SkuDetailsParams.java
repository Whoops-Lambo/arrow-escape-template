package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SkuDetailsParams {
    private String zza;
    private List zzb;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        private String zza;
        private List zzb;

        @NonNull
        public SkuDetailsParams build() {
            String str = this.zza;
            if (str == null) {
                d.r("SKU type must be set");
                return null;
            }
            if (this.zzb == null) {
                d.r("SKU list must be set");
                return null;
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.zza = str;
            skuDetailsParams.zzb = this.zzb;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.zzb = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzee zzeeVar) {
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
    public String getSkuType() {
        return this.zza;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.zzb;
    }
}
