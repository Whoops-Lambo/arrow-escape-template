package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.du;
import defpackage.eu;
import defpackage.qh1;
import defpackage.s71;
import defpackage.wr0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class X0 {
    public static void a(AdResponse adResponse, Z9 z9, wr0 wr0Var) {
        String creativeType;
        MetaInfo metaInfo;
        adResponse.getClass();
        wr0Var.getClass();
        AdSet adSet = (AdSet) du.d0(0, adResponse.getAdSets());
        if (dk2.y0(adResponse.getRequestId()).toString().length() != 0) {
            if (!adResponse.getAdSets().isEmpty()) {
                if (adSet != null) {
                    if (!adSet.getAds().isEmpty()) {
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) du.d0(0, adSet.getAds());
                        if (ad != null && (metaInfo = ad.getMetaInfo()) != null) {
                            creativeType = metaInfo.getCreativeType();
                        } else {
                            creativeType = null;
                        }
                        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
                        if (creativeType != null) {
                            linkedHashMapZ.put("creativeType", creativeType);
                        }
                        wr0Var.invoke(new C4498wk(linkedHashMapZ));
                        a(adSet.getAdSetId(), adSet.getIsRewarded());
                        a(adSet, z9);
                        return;
                    }
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4525xk((short) 54));
                }
                throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4525xk((short) 2364));
            }
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4525xk((short) 54));
        }
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2208))));
    }

    public static void a(String str, boolean z) {
        if (str.length() != 0) {
            return;
        }
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2231), new dt1("isRewarded", Boolean.valueOf(z)))));
    }

    public static void a(AdSet adSet, Z9 z9) {
        Objects.toString(adSet);
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            for (Object obj : adSet.getAds()) {
                int i2 = i + 1;
                if (i < 0) {
                    eu.G();
                    throw null;
                }
                com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i == 0) {
                    a(ad);
                } else {
                    try {
                        a(ad);
                    } catch (Z e) {
                        if (z9 != null) {
                            z9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i + ") - " + e);
                        }
                        linkedHashSet.add(ad);
                    }
                }
                i = i2;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2116), new dt1("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Objects.toString(ad);
        if (ad.getImpressionId().length() != 0) {
            String markupType = ad.getMarkupType();
            markupType.getClass();
            if ((markupType.equals(CreativeInfo.al) || markupType.equals("inmobiJson") || markupType.equals("htmlUrl")) && !s71.b(ad.getMarkupType(), "unknown")) {
                try {
                    ad.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
                }
            }
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(map));
    }
}
