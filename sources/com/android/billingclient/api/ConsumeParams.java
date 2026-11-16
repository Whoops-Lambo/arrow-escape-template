package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ConsumeParams {
    private String zza;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private String zza;

        @NonNull
        public ConsumeParams build() {
            String str = this.zza;
            zzdd zzddVar = null;
            if (str == null) {
                d.r("Purchase token must be set");
                return null;
            }
            ConsumeParams consumeParams = new ConsumeParams(zzddVar);
            consumeParams.zza = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzdd zzddVar) {
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

    public /* synthetic */ ConsumeParams(zzdd zzddVar) {
    }

    private ConsumeParams() {
        throw null;
    }
}
