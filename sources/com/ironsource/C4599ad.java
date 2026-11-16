package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4599ad {

    @NotNull
    private final E0 a;

    public final void b() {
        this.a.a(B0.PAUSE_AD, null);
    }

    public final void c() {
        this.a.a(B0.RESUME_AD, null);
    }

    public C4599ad(@NotNull E0 e0) {
        e0.getClass();
        this.a = e0;
    }

    public final void a(@NotNull LevelPlayReward levelPlayReward, @Nullable String str, @Nullable String str2) {
        levelPlayReward.getClass();
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_REWARD_NAME, levelPlayReward.getName());
        map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(levelPlayReward.getAmount()));
        if (str != null) {
            map.put("placement", str);
        }
        if (str2 != null) {
            map.put("reason", str2);
        }
        this.a.a(B0.OPERATIONAL_GET_REWARD, map);
    }

    public final void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.a.a(B0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j, int i, @NotNull String str) {
        str.getClass();
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        map.put("duration", Long.valueOf(j));
        this.a.a(B0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d) {
        E0 e0 = this.a;
        B0 b0 = B0.OPERATIONAL_SET_CONFIGURATIONS;
        Map<String, Object> mapSingletonMap = Collections.singletonMap(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        mapSingletonMap.getClass();
        e0.a(b0, mapSingletonMap);
    }

    public static /* synthetic */ void a(C4599ad c4599ad, LevelPlayReward levelPlayReward, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c4599ad.a(levelPlayReward, str, str2);
    }

    public final void a() {
        this.a.a(B0.OPERATIONAL_LOAD_AD, new HashMap());
    }
}
