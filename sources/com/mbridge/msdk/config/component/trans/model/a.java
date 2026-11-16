package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.base.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {
    private String a;

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(com.mbridge.msdk.config.component.common.util.c.c("118"))) == null) {
            return;
        }
        a(String.valueOf(obj));
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }
}
