package com.android.billingclient.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@zzo
public final class LaunchExternalLinkParams {
    private final Uri zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @zzo
    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;
        private int zzd = 0;

        @NonNull
        @zzo
        public LaunchExternalLinkParams build() {
            int i = this.zzc;
            if (i == 0) {
                d.r("Link type is required.");
                return null;
            }
            int i2 = this.zzb;
            if (i2 == 0) {
                d.r("Launch mode is required.");
                return null;
            }
            if (i2 != 1 && i == 2) {
                d.r("App downloads must launch in an external browser or app.");
                return null;
            }
            if (this.zzd == 0) {
                d.r("Billing program is required.");
                return null;
            }
            Uri uri = this.zza;
            if (uri == null) {
                d.r("URI must be set.");
                return null;
            }
            if (uri.getScheme() != null) {
                return new LaunchExternalLinkParams(this.zza, this.zzb, this.zzc, this.zzd, null);
            }
            d.r("URI must have a scheme.");
            return null;
        }

        @NonNull
        @zzo
        public Builder setBillingProgram(int i) {
            this.zzd = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLaunchMode(int i) {
            this.zzb = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkType(int i) {
            this.zzc = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkUri(@NonNull Uri uri) {
            this.zza = uri;
            return this;
        }

        private Builder() {
        }

        public /* synthetic */ Builder(zzdr zzdrVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {

        @zzo
        public static final int CALLER_WILL_LAUNCH_LINK = 2;

        @zzo
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;

        @zzo
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkType {

        @zzp
        public static final int LINK_TO_APP_DOWNLOAD = 2;

        @zzo
        public static final int LINK_TO_DIGITAL_CONTENT_OFFER = 1;

        @zzo
        public static final int LINK_TYPE_UNSPECIFIED = 0;
    }

    @NonNull
    @zzo
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @zzo
    public int getBillingProgram() {
        return this.zzd;
    }

    @zzo
    public int getLaunchMode() {
        return this.zzb;
    }

    @zzo
    public int getLinkType() {
        return this.zzc;
    }

    @NonNull
    @zzo
    public Uri getLinkUri() {
        return this.zza;
    }

    public /* synthetic */ LaunchExternalLinkParams(Uri uri, int i, int i2, int i3, zzdr zzdrVar) {
        this.zza = uri;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
    }
}
