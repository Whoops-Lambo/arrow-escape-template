package com.google.android.gms.internal.ads;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipn {
    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        defpackage.d.w("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void b(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        e32.i(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
