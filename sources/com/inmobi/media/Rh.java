package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Rh {
    public final Db a;

    public Rh(Context context, String str) {
        context.getClass();
        str.getClass();
        ConcurrentHashMap concurrentHashMap = Db.b;
        this.a = Cb.a(context, str);
    }

    public final String a(String str) {
        str.getClass();
        Db db = this.a;
        db.getClass();
        return db.a.getString(str, null);
    }
}
