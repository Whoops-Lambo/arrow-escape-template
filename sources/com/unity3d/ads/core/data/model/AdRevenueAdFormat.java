package com.unity3d.ads.core.data.model;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import defpackage.e80;
import defpackage.ek2;
import defpackage.j52;
import defpackage.jh0;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", BrandSafetyUtils.o, AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL, "REWARDED", "NATIVE", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AdRevenueAdFormat {
    BANNER,
    MREC,
    INTERSTITIAL,
    REWARDED,
    NATIVE;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat$Companion;", "", "<init>", "()V", "fromString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "value", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @Nullable
        public final AdRevenueAdFormat fromString(@Nullable String value) {
            Object j52Var;
            if (value == null) {
                return null;
            }
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                j52Var = AdRevenueAdFormat.valueOf(upperCase);
            } catch (Throwable th) {
                j52Var = new j52(th);
            }
            return (AdRevenueAdFormat) (j52Var instanceof j52 ? null : j52Var);
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }
}
