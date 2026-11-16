package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.net.Uri;
import defpackage.n75;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzry {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern b;
    public static final Pattern c;
    public static final AtomicBoolean d;
    public static HashMap e;
    public static final HashMap f;
    public static final HashMap g;
    public static final HashMap h;
    public static final HashMap i;
    public static Object j;
    public static final String[] k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        d = new AtomicBoolean();
        f = new HashMap();
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        k = new String[0];
    }

    public static void a(ContentResolver contentResolver) {
        HashMap map = e;
        AtomicBoolean atomicBoolean = d;
        if (map == null) {
            atomicBoolean.set(false);
            e = new HashMap();
            j = new Object();
            contentResolver.registerContentObserver(a, true, new n75(null));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            e.clear();
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j = new Object();
        }
    }

    public static void b(Object obj, String str) {
        synchronized (zzry.class) {
            try {
                if (obj == j) {
                    e.put("gms:nearby:requires_gms_check", str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
