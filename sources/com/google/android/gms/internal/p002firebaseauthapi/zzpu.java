package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.nw4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpu<P> {
    public static final zzaau b = zzaau.a(new byte[0]);
    public final Map a;

    public final Iterable a(byte[] bArr) {
        List list;
        zzaau zzaauVar = b;
        Map map = this.a;
        List list2 = (List) map.get(zzaauVar);
        if (bArr.length >= 5) {
            list = (List) map.get(new zzaau(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new nw4(this, list, list2, 1);
    }

    public zzpu(HashMap map) {
        this.a = map;
    }
}
