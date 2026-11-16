package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4251nm {
    public static final Db a;
    public static int b;
    public static Integer c;

    static {
        Db dbA;
        Context context = AbstractC4221mk.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            dbA = Cb.a(context, "imtelemetrydboverflow");
        } else {
            dbA = null;
        }
        a = dbA;
        b = -1;
    }

    public static int a() {
        if (b == -1) {
            Db db = a;
            b = db != null ? db.a.getInt("count", 0) : 0;
        }
        return b;
    }
}
