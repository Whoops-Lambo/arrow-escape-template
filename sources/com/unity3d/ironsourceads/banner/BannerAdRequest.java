package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4706da;
import com.ironsource.Dc;
import com.ironsource.Jd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BannerAdRequest {

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final AdSize d;

    @Nullable
    private final Bundle e;

    @NotNull
    private final Jd f;

    @NotNull
    private final String g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @NotNull
        private final Context a;

        @NotNull
        private final String b;

        @NotNull
        private final String c;

        @NotNull
        private final AdSize d;

        @Nullable
        private Bundle e;

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.b + ", size: " + this.d.getSizeDescription());
            return new BannerAdRequest(this.a, this.b, this.c, this.d, this.e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.c;
        }

        @NotNull
        public final Context getContext() {
            return this.a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.d;
        }

        public Builder(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull AdSize adSize) {
            context.getClass();
            str.getClass();
            str2.getClass();
            adSize.getClass();
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = adSize;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            bundle.getClass();
            this.e = bundle;
            return this;
        }
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.g;
    }

    @NotNull
    public final String getAdm() {
        return this.c;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.b;
    }

    @NotNull
    public final Jd getProviderName$mediationsdk_release() {
        return this.f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = adSize;
        this.e = bundle;
        this.f = new Dc(str);
        String strB = C4706da.b();
        strB.getClass();
        this.g = strB;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, e80 e80Var) {
        this(context, str, str2, adSize, bundle);
    }
}
