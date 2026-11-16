package com.facebook.appevents;

import android.content.Context;
import defpackage.e32;
import defpackage.lz;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l {
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0011, B:8:0x0017, B:15:0x0036, B:17:0x003c, B:24:0x005e, B:23:0x005b, B:14:0x0033, B:11:0x002f, B:20:0x0057), top: B:39:0x0011, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x003c, please report this as an issue */
    public static String a(Context context) {
        String str;
        context.getClass();
        if (o.a() == null) {
            synchronized (o.c()) {
                if (o.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!lz.a.contains(o.class)) {
                        try {
                            o.f = string;
                        } catch (Throwable th) {
                            lz.a(o.class, th);
                        }
                        if (o.a() == null) {
                            str = "XZ" + UUID.randomUUID();
                            if (!lz.a.contains(o.class)) {
                                o.f = str;
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", o.a()).apply();
                        }
                    } else if (o.a() == null) {
                        str = "XZ" + UUID.randomUUID();
                        if (!lz.a.contains(o.class)) {
                            try {
                                o.f = str;
                            } catch (Throwable th2) {
                                lz.a(o.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", o.a()).apply();
                    }
                }
            }
        }
        String strA = o.a();
        if (strA != null) {
            return strA;
        }
        e32.i("Required value was null.");
        return null;
    }
}
