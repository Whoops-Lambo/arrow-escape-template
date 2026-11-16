package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C4699d3;
import com.ironsource.C5097z7;
import com.ironsource.Ha;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.dt1;
import defpackage.e80;
import defpackage.nj;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    @NotNull
    private final Ha a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Config {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final LevelPlayAdSize a;

        @Nullable
        private final Double b;

        @Nullable
        private final String c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {

            @Nullable
            private LevelPlayAdSize a;

            @Nullable
            private Double b;

            @Nullable
            private String c;

            @NotNull
            public final Config build() {
                return new Config(this.a, this.b, this.c);
            }

            @NotNull
            public final Builder setAdSize(@NotNull LevelPlayAdSize levelPlayAdSize) {
                levelPlayAdSize.getClass();
                this.a = levelPlayAdSize;
                return this;
            }

            @NotNull
            public final Builder setBidFloor(double d) {
                this.b = Double.valueOf(d);
                return this;
            }

            @NotNull
            public final Builder setPlacementName(@NotNull String str) {
                str.getClass();
                this.c = str;
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Companion {
            @NotNull
            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            public /* synthetic */ Companion(e80 e80Var) {
                this();
            }

            private Companion() {
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return s71.b(this.a, config.a) && s71.b(this.b, config.b) && s71.b(this.c, config.c);
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, e80 e80Var) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                str = config.c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        @Nullable
        public final LevelPlayAdSize component1() {
            return this.a;
        }

        @Nullable
        public final Double component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final Config copy(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        @Nullable
        public final LevelPlayAdSize getAdSize() {
            return this.a;
        }

        @Nullable
        public final Double getBidFloor() {
            return this.b;
        }

        @Nullable
        public final String getPlacementName() {
            return this.c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.b;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            LevelPlayAdSize levelPlayAdSize = this.a;
            Double d = this.b;
            String str = this.c;
            StringBuilder sb = new StringBuilder("Config(adSize=");
            sb.append(levelPlayAdSize);
            sb.append(", bidFloor=");
            sb.append(d);
            sb.append(", placementName=");
            return nj.q(sb, str, ")");
        }

        public Config(@Nullable LevelPlayAdSize levelPlayAdSize, @Nullable Double d, @Nullable String str) {
            this.a = levelPlayAdSize;
            this.b = d;
            this.c = str;
        }

        public Config() {
            this(null, null, null, 7, null);
        }
    }

    public final void destroy() {
        this.a.b();
    }

    @NotNull
    public final String getAdId() {
        String string = this.a.c().toString();
        string.getClass();
        return string;
    }

    @NotNull
    public final LevelPlayAdSize getAdSize() {
        return this.a.d();
    }

    @NotNull
    public final String getAdUnitId() {
        return this.a.e();
    }

    @Nullable
    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.a.f();
    }

    @NotNull
    public final String getPlacementName() {
        return this.a.g();
    }

    public final void loadAd() {
        this.a.i();
    }

    public final void pauseAutoRefresh() {
        this.a.j();
    }

    public final void resumeAutoRefresh() {
        this.a.k();
    }

    public final void setBannerListener(@Nullable LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.a.a(levelPlayBannerAdViewListener);
    }

    public final void setImpressionDataListener(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        this.a.a(levelPlayImpressionDataListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str, @NotNull Config config) {
        super(context);
        context.getClass();
        str.getClass();
        config.getClass();
        IronLog.API.info("adUnitId: " + str + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.a = a(str, config);
    }

    private final Ha a(String str, Config config) {
        Context context = getContext();
        context.getClass();
        C4699d3 c4699d3A = a(context);
        addView(c4699d3A);
        return new Ha(C5097z7.a.a(), str, c4699d3A, config, null, null, 48, null);
    }

    private final C4699d3 a(Context context) {
        C4699d3 c4699d3 = new C4699d3(context);
        c4699d3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c4699d3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, e80 e80Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        IronLog.API.info("context: ".concat(context.getClass().getSimpleName()));
        dt1 dt1VarA = Ha.o.a(context, attributeSet);
        this.a = a((String) dt1VarA.a, (Config) dt1VarA.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context, @NotNull String str) {
        this(context, str, Config.Companion.empty());
        context.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
