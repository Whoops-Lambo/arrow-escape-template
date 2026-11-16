package com.google.android.gms.internal.ads;

import defpackage.nw4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpy {
    public static final zzidx b = zzidx.a(new byte[0]);
    public final Map a;

    public final Iterable a(byte[] bArr) {
        List list;
        zzidx zzidxVar = b;
        Map map = this.a;
        List list2 = (List) map.get(zzidxVar);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new zzidx(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new nw4(this, list, list2, 0);
    }
}
