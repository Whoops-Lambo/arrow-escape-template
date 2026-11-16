package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public final String a;

    public static boolean a(int i, int i2, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i > 0 && i2 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i);
            int i3 = 0;
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                long jOptLong = jSONArray.optLong(i4, 0L);
                if (jOptLong > jCurrentTimeMillis) {
                    i3++;
                    copyOnWriteArrayList.add(Long.valueOf(jOptLong));
                }
            }
            if (i3 >= i2) {
                return true;
            }
        }
        return false;
    }

    public a(String str) {
        this.a = str;
    }
}
