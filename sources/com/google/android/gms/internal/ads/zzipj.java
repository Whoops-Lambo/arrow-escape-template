package com.google.android.gms.internal.ads;

import defpackage.b05;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipj extends b05 {
    public static final /* synthetic */ int b = 0;

    static {
        zzipg.a(Collections.EMPTY_MAP);
    }

    public static zzipi a(int i) {
        return new zzipi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzipo) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
