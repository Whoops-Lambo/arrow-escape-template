package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AcknowledgePurchaseParams {
    private String zza;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private String zza;

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.zza;
            zza zzaVar = null;
            if (str == null) {
                d.r("Purchase token must be set");
                return null;
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(zzaVar);
            acknowledgePurchaseParams.zza = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zza zzaVar) {
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
    public String getPurchaseToken() {
        return this.zza;
    }

    public /* synthetic */ AcknowledgePurchaseParams(zza zzaVar) {
    }

    private AcknowledgePurchaseParams() {
        throw null;
    }
}
