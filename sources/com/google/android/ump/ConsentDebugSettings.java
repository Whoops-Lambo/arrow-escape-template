package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ConsentDebugSettings {
    public final boolean a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public final Context b;
        public boolean d;
        public final ArrayList a = new ArrayList();
        public int c = 0;

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z) {
            this.d = z;
            return this;
        }

        public Builder(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z = true;
            if (!zzdb.a()) {
                if (!this.a.contains(zzct.a(this.b)) && !this.d) {
                    z = false;
                }
            }
            return new ConsentDebugSettings(z, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public int getDebugGeography() {
        return this.b;
    }

    public boolean isTestDevice() {
        return this.a;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z, Builder builder) {
        this.a = z;
        this.b = builder.c;
    }
}
