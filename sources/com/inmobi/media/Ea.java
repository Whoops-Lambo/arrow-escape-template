package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Ea {
    public static Db a;

    public static final Db a() {
        Db dbA;
        if (a == null) {
            Context context = AbstractC4221mk.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                dbA = Cb.a(context, "CrashSession-store");
            } else {
                dbA = null;
            }
            a = dbA;
        }
        return a;
    }
}
