package com.google.android.gms.internal.auth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdc {
    public static final AtomicInteger b;
    public final Object a;

    static {
        new AtomicReference();
        int i = zzcu.a;
        b = new AtomicInteger();
    }

    public /* synthetic */ zzdc(zzcz zzczVar, Object obj) {
        if (zzczVar.a != null) {
            this.a = obj;
        } else {
            defpackage.d.r("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
    }
}
