package com.unity3d.ads.core.data.model;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"REUSE_RELOADED_INVALIDATION_REASON", "", "REUSE_NO_FILL_INVALIDATION_REASON", "REUSE_ERROR_INVALIDATION_REASON", "REUSE_DURING_RELOAD_INVALIDATION_REASON", "getInvalidationReason", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdRefreshStateKt {

    @NotNull
    private static final String REUSE_DURING_RELOAD_INVALIDATION_REASON = "reuse_during_reload";

    @NotNull
    private static final String REUSE_ERROR_INVALIDATION_REASON = "reuse_error";

    @NotNull
    private static final String REUSE_NO_FILL_INVALIDATION_REASON = "reuse_no_fill";

    @NotNull
    private static final String REUSE_RELOADED_INVALIDATION_REASON = "reuse_reloaded";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRefreshState.values().length];
            try {
                iArr[AdRefreshState.REUSE_RELOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdRefreshState.REUSE_NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdRefreshState.REUSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdRefreshState.REUSE_DURING_RELOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getInvalidationReason(@NotNull AdRefreshState adRefreshState) {
        adRefreshState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[adRefreshState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return REUSE_DURING_RELOAD_INVALIDATION_REASON;
                    }
                    e.b();
                    return null;
                }
                return REUSE_ERROR_INVALIDATION_REASON;
            }
            return REUSE_NO_FILL_INVALIDATION_REASON;
        }
        return REUSE_RELOADED_INVALIDATION_REASON;
    }
}
