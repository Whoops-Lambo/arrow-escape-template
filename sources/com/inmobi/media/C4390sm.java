package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.s71;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4390sm {
    public final C4397t1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4397t1 c4397t1 = this.a;
        if (c4397t1 != null) {
            linkedHashMap.put("adType", c4397t1.a.m());
        }
        C4397t1 c4397t2 = this.a;
        if (c4397t2 != null) {
            linkedHashMap.put("plId", Long.valueOf(c4397t2.a.l.a));
        }
        C4397t1 c4397t3 = this.a;
        if (c4397t3 != null && (str = c4397t3.a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        C4397t1 c4397t4 = this.a;
        if (c4397t4 != null) {
            AdSet adSetS = c4397t4.a.s();
            Boolean boolValueOf = adSetS != null ? Boolean.valueOf(adSetS.getIsRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str2 = this.c;
        if (str2 != null) {
            linkedHashMap.put("creativeId", str2);
        }
        String str3 = this.b;
        if (str3 != null) {
            linkedHashMap.put("creativeType", str3);
        }
        linkedHashMap.put("markupType", this.e);
        String str4 = this.f;
        if (str4 == null) {
            s71.D("triggerSource");
            throw null;
        }
        linkedHashMap.put("trigger", str4);
        C4397t1 c4397t5 = this.a;
        if (c4397t5 != null && c4397t5.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C4418tm c4418tm;
        AtomicBoolean atomicBoolean;
        C4397t1 c4397t1 = this.a;
        if (c4397t1 == null || (c4418tm = c4397t1.b) == null || (atomicBoolean = c4418tm.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", Y5.g());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C4111im c4111im = C4111im.a;
            C4111im.b("AdImpressionSuccessful", linkedHashMapA, EnumC4223mm.SDK);
        }
    }

    public final void c() {
        C4418tm c4418tm;
        AtomicBoolean atomicBoolean;
        C4397t1 c4397t1 = this.a;
        if (c4397t1 == null || (c4418tm = c4397t1.b) == null || (atomicBoolean = c4418tm.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", Y5.g());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C4111im c4111im = C4111im.a;
            C4111im.b("AdImpressionSuccessful", linkedHashMapA, EnumC4223mm.SDK);
        }
    }

    public C4390sm(C4397t1 c4397t1, String str, String str2, String str3, String str4) {
        str4.getClass();
        this.a = c4397t1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
