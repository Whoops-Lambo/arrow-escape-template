package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4015f9 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", AbstractC4249nk.a());
            C4533y1 c4533y1 = Lm.a;
            Boolean bool = c4533y1 != null ? c4533y1.c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C4552yk.a.getClass();
            HashMap map2 = new HashMap();
            if (C4552yk.e && (str = C4552yk.d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e) {
            e.getMessage();
            return map;
        }
    }
}
