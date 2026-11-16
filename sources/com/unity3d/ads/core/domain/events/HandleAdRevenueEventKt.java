package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toProto", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;", "Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HandleAdRevenueEventKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRevenueOrigin.values().length];
            try {
                iArr[AdRevenueOrigin.AUTOMATIC_COLLECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueEventRequestOuterClass.AdRevenueOrigin toProto(AdRevenueOrigin adRevenueOrigin) {
        if (WhenMappings.$EnumSwitchMapping$0[adRevenueOrigin.ordinal()] == 1) {
            return AdRevenueEventRequestOuterClass.AdRevenueOrigin.AD_REVENUE_ORIGIN_AUTOMATIC_COLLECTION;
        }
        e.b();
        return null;
    }
}
