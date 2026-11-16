package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhau {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            b(i2, objArr[i2]);
        }
    }

    public static void b(int i, Object obj) {
        if (obj != null) {
            return;
        }
        defpackage.d.w(pv1.l(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }
}
