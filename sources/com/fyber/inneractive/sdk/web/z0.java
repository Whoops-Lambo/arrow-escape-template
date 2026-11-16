package com.fyber.inneractive.sdk.web;

import android.util.LruCache;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class z0 extends LruCache {
    public z0() {
        super(1048576);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        c1 c1Var = (c1) obj2;
        int iA = 0;
        for (String str2 : c1Var.b.keySet()) {
            if (str2 != null && (str = (String) c1Var.b.get(str2)) != null) {
                iA = q63.a(str2.length(), iA, str);
            }
        }
        return iA + c1Var.a.length;
    }
}
