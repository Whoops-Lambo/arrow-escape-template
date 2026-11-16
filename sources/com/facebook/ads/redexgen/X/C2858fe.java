package com.facebook.ads.redexgen.X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2858fe extends LinkedHashMap<String, C2857fd> {
    public C2858fe(int i, float f, boolean z) {
        super(i, f, z);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C2857fd> entry) {
        return size() > 10;
    }
}
