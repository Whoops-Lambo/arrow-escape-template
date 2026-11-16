package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4855lg {
    private final E0 a;

    public void a(Map<String, Object> map, long j, String str) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }

    public void b(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    public C4855lg(E0 e0) {
        this.a = e0;
    }

    public void b(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void b(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.a.a(B0.COLLECT_TOKENS_COMPLETED, map);
    }

    public void a() {
        a(new HashMap());
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "timeout=" + j);
        a(map);
    }

    public void a(Map<String, Object> map) {
        this.a.a(B0.COLLECT_TOKEN, map);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.a.a(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.a.a(B0.COLLECT_TOKENS_FAILED, map);
    }
}
