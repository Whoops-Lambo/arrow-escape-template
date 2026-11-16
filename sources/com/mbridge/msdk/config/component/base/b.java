package com.mbridge.msdk.config.component.base;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private volatile c a;
    private final Map<?, ?> b;
    private final com.mbridge.msdk.config.dynamic.binddata.wrapper.a c;
    private final String d;
    private final int e;

    public void a(c cVar) {
        this.a = cVar;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public Map<?, ?> d() {
        return this.b;
    }

    public b(c cVar, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, int i) {
        Map<?, ?> mapUnmodifiableMap;
        this.a = cVar;
        if (map != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        this.b = mapUnmodifiableMap;
        this.c = aVar;
        this.d = str;
        this.e = i;
    }

    public String a() {
        return this.d;
    }
}
