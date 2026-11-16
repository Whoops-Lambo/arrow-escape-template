package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Cb {
    public static Db a(Context context, String str) {
        context.getClass();
        str.getClass();
        String strA = a(str);
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db db = (Db) concurrentHashMap.get(strA);
        if (db == null) {
            db = new Db(context, strA);
            Db db2 = (Db) concurrentHashMap.putIfAbsent(strA, db);
            if (db2 != null) {
                return db2;
            }
        }
        return db;
    }

    public static String a(String str) {
        str.getClass();
        return "com.im.keyValueStore.".concat(str);
    }
}
