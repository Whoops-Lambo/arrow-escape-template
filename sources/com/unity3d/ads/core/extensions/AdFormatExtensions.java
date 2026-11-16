package com.unity3d.ads.core.extensions;

import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProtoAdFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lcom/unity3d/ads/AdFormat;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdFormatExtensions {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(@NotNull AdFormat adFormat) {
        adFormat.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
                    }
                    e.b();
                    return null;
                }
                return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
            }
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
    }
}
