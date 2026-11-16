package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4723e9 {
    private final E0 a;

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + com.safedk.android.analytics.brandsafety.m.ad + str2);
        this.a.a(B0.INIT_STARTED, map);
    }

    public C4723e9(E0 e0) {
        this.a = e0;
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.a.a(B0.INIT_ENDED, map);
    }

    public void a() {
        this.a.a(B0.INIT_SUCCESS, null);
    }

    public void a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.a.a(B0.INIT_FAILED, map);
    }
}
