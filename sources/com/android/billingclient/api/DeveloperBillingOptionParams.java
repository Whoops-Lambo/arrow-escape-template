package com.android.billingclient.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@zzl
public final class DeveloperBillingOptionParams {
    private final Uri zza;
    private final int zzb;
    private final int zzc;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @zzl
    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;

        @NonNull
        @zzl
        public DeveloperBillingOptionParams build() {
            zzdi zzdiVar = null;
            if (this.zzc == 0) {
                d.r("Billing program is required.");
                return null;
            }
            Uri uri = this.zza;
            if (uri == null || uri.getScheme() != null) {
                return new DeveloperBillingOptionParams(this.zza, this.zzb, this.zzc, zzdiVar);
            }
            d.r("URI must have a scheme.");
            return null;
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.zzc = i;
            return this;
        }

        @NonNull
        public Builder setLaunchMode(int i) {
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setLinkUri(@NonNull Uri uri) {
            this.zza = uri;
            return this;
        }

        private Builder() {
        }

        public /* synthetic */ Builder(zzdi zzdiVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @zzl
    public @interface LaunchMode {
        public static final int CALLER_WILL_LAUNCH_LINK = 2;
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public int getBillingProgram() {
        return this.zzc;
    }

    public int getLaunchMode() {
        return this.zzb;
    }

    @Nullable
    public Uri getLinkUri() {
        return this.zza;
    }

    public /* synthetic */ DeveloperBillingOptionParams(Uri uri, int i, int i2, zzdi zzdiVar) {
        this.zza = uri;
        this.zzb = i;
        this.zzc = i2;
    }
}
