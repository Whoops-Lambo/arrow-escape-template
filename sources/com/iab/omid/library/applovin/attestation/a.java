package com.iab.omid.library.applovin.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
