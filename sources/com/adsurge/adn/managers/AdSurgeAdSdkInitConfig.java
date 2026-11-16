package com.adsurge.adn.managers;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AdSurgeAdSdkInitConfig {
    public Context a;
    public String b;
    public Boolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public Context a;
        public String b;
        public boolean c;

        public AdSurgeAdSdkInitConfig build() {
            return new AdSurgeAdSdkInitConfig(this);
        }

        public Builder setAppId(@NonNull String str) {
            this.b = str;
            return this;
        }

        public Builder setContext(@NonNull Context context) {
            this.a = context;
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.c = z;
            return this;
        }
    }

    public String getAppId() {
        return this.b;
    }

    public Context getContext() {
        return this.a;
    }

    public Boolean getTestMode() {
        return this.c;
    }

    public AdSurgeAdSdkInitConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = Boolean.valueOf(builder.c);
    }
}
