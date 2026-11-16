package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@zzl
public final class EnableBillingProgramParams {
    private final int zza;

    @Nullable
    private final DeveloperProvidedBillingListener zzb;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private int zza;

        @Nullable
        private DeveloperProvidedBillingListener zzb;

        @NonNull
        public EnableBillingProgramParams build() {
            return new EnableBillingProgramParams(this, null);
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.zza = i;
            return this;
        }

        @NonNull
        public Builder setDeveloperProvidedBillingListener(@Nullable DeveloperProvidedBillingListener developerProvidedBillingListener) {
            this.zzb = developerProvidedBillingListener;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public int getBillingProgram() {
        return this.zza;
    }

    @Nullable
    public DeveloperProvidedBillingListener getDeveloperProvidedBillingListener() {
        return this.zzb;
    }

    public /* synthetic */ EnableBillingProgramParams(Builder builder, zzdk zzdkVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }
}
