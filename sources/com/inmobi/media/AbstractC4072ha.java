package com.inmobi.media;

import android.content.Context;
import defpackage.cm2;
import defpackage.gd1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4072ha {
    public static final gd1 a = new cm2(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(12));
    public static final String b = "ha";

    public static String a() {
        Db db = (Db) a.getValue();
        String string = db != null ? db.a.getString("cip", null) : null;
        b.getClass();
        return string;
    }

    public static final Db b() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        return Cb.a(context, "inmobi_store");
    }

    public static void a(String str) {
        Db db = (Db) a.getValue();
        if (db != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            db.a("cip", str, false);
        }
        b.getClass();
    }
}
