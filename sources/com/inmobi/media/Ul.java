package com.inmobi.media;

import android.content.Context;
import defpackage.pv1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ul {
    public static String b(String str) {
        return pv1.n("synapse_", str, "_failure_count");
    }

    public static String c(String str) {
        return pv1.n("synapse_", str, "_last_run_at");
    }

    public static void a(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        a(context).a(a(str), str2, false);
    }

    public static Db a(Context context) {
        ConcurrentHashMap concurrentHashMap = Db.b;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return Cb.a(applicationContext, "synapse_signal_store");
    }

    public static String a(String str) {
        return pv1.n("synapse_", str, "_config_fp");
    }
}
