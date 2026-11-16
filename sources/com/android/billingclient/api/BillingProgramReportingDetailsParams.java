package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@zzh
public final class BillingProgramReportingDetailsParams {
    private final int billingProgram;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @zzh
    public static final class Builder {
        private int billingProgram;

        @NonNull
        @zzh
        public BillingProgramReportingDetailsParams build() {
            if (this.billingProgram != 0) {
                return new BillingProgramReportingDetailsParams(this);
            }
            d.r("Billing program is not specified.");
            return null;
        }

        @NonNull
        @zzh
        public Builder setBillingProgram(int i) {
            this.billingProgram = i;
            return this;
        }

        private Builder() {
            this.billingProgram = 0;
        }
    }

    @NonNull
    @zzh
    public static Builder newBuilder() {
        return new Builder();
    }

    @zzh
    public int getBillingProgram() {
        return this.billingProgram;
    }

    private BillingProgramReportingDetailsParams(Builder builder) {
        this.billingProgram = builder.billingProgram;
    }
}
