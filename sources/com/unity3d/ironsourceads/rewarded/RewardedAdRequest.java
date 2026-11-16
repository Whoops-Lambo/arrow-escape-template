package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C4706da;
import com.ironsource.Dc;
import com.ironsource.Jd;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class RewardedAdRequest {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final Bundle c;

    @NotNull
    private final Jd d;

    @NotNull
    private final String e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @Nullable
        private Bundle c;

        @NotNull
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.a);
            return new RewardedAdRequest(this.a, this.b, this.c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.a;
        }

        public Builder(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle bundle) {
            bundle.getClass();
            this.c = bundle;
            return this;
        }
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.e;
    }

    @NotNull
    public final String getAdm() {
        return this.b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public final Jd getProviderName$mediationsdk_release() {
        return this.d;
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new Dc(str);
        String strB = C4706da.b();
        strB.getClass();
        this.e = strB;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, e80 e80Var) {
        this(str, str2, bundle);
    }
}
