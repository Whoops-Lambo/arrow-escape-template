package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {
    Context a;
    String b;
    String c;
    String d;
    String e;
    Map<String, Object> f;

    public void a(Map<String, Object> map) {
        Map<String, Object> mapB;
        if (map != null) {
            Object obj = map.get(com.mbridge.msdk.config.component.common.util.c.c("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(com.mbridge.msdk.config.component.common.util.c.c("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(com.mbridge.msdk.config.component.common.util.c.c("159"));
            if (obj3 instanceof Map) {
                mapB = (Map) obj3;
            } else {
                mapB = obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b() : null;
            }
            b(mapB);
            if (mapB != null && !mapB.isEmpty()) {
                c(String.valueOf(mapB.get(com.mbridge.msdk.config.component.common.util.c.c("160"))));
            }
            Object obj4 = map.get(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.b;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public Map<String, Object> b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.c;
    }

    public void b(Map<String, Object> map) {
        this.f = map;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context;
    }

    public void a(String str) {
        this.e = str;
    }
}
