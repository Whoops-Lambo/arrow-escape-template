package com.google.android.play.core.review;

import io.p071bidmachine.Framework;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzj {
    private static final Map zza;

    static {
        new HashSet(Arrays.asList("native", Framework.UNITY));
        zza = new HashMap();
        new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");
    }

    public static synchronized Map zza() {
        Map map;
        map = zza;
        map.put("java", 20002);
        return map;
    }
}
