package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import defpackage.dt1;
import defpackage.pv1;
import defpackage.qh1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4446um {
    public static final Map a(H h) {
        String creativeType;
        h.getClass();
        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("plId", Long.valueOf(h.a.a.a)), new dt1("plType", h.a.a.h), new dt1("adType", "native"), new dt1("markupType", h.c), new dt1("creativeId", pv1.n("\"", h.e, "\"")), new dt1("impressionId", pv1.n("\"", h.m.b, "\"")), new dt1("isRewarded", Boolean.valueOf(h.b.a)));
        MetaInfo metaInfo = h.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            linkedHashMapZ.put("creativeType", creativeType);
        }
        String str = h.i;
        if (str != null) {
            linkedHashMapZ.put("metadataBlob", str);
        }
        return linkedHashMapZ;
    }

    public static final Map a(C4341r1 c4341r1) {
        c4341r1.getClass();
        return qh1.Z(new dt1("plId", Long.valueOf(c4341r1.a.a)), new dt1("plType", c4341r1.a.h), new dt1("adType", "native"));
    }
}
