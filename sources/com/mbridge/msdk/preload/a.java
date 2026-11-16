package com.mbridge.msdk.preload;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public void b(Map<String, Object> map) {
    }

    public void a(Map<String, Object> map, int i) {
        try {
            com.mbridge.msdk.mbnative.service.a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.service.a.class.newInstance(), map, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void a(Map<String, Object> map) {
    }
}
