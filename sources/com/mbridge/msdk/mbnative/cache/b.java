package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<K, V> {
    public abstract V a(K k, int i);

    public abstract void a(K k, V v);

    public abstract void a(K k, V v, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public long a() {
        g gVarE = q63.e(i.b());
        if (gVarE == null) {
            gVarE = i.b().a();
        }
        return gVarE.c0() * 1000;
    }

    public long b() {
        g gVarE = q63.e(i.b());
        if (gVarE == null) {
            gVarE = i.b().a();
        }
        return gVarE.d0() * 1000;
    }

    public V b(K k, int i) {
        return null;
    }
}
