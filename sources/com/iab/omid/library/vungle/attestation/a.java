package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    private final Map<String, String> a;

    public Map<String, String> a() {
        return this.a;
    }

    public a(Map<String, String> map) {
        Map<String, String> mapUnmodifiableMap;
        if (map == null) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
        }
        this.a = mapUnmodifiableMap;
    }
}
