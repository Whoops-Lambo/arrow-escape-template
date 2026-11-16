package com.google.android.ump;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ConsentRequestParameters {
    public final boolean a;
    public final String b;
    public final ConsentDebugSettings c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public boolean a;
        public String b;
        public ConsentDebugSettings c;
        public String d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.a = z;
            return this;
        }
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.b;
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }
}
