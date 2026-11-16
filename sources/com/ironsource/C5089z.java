package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C5089z implements InterfaceC4864m7 {

    @NotNull
    private final Q8 a;

    public C5089z(@NotNull Q8 q8) {
        q8.getClass();
        this.a = q8;
    }

    @Override // com.ironsource.InterfaceC4864m7
    public void a(@NotNull Map<String, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(R6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        map.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(R6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.REWARDED)));
        map.put(R6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(R6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.BANNER)));
        map.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(R6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.NATIVE_AD)));
        map.put("nativeAd", linkedHashMap4);
    }
}
