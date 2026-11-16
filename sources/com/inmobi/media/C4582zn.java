package com.inmobi.media;

import defpackage.eu;
import defpackage.kk2;
import defpackage.s71;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4582zn {
    public final H a;

    public C4582zn(H h) {
        h.getClass();
        this.a = h;
    }

    public static void a(HashMap map, List list, Z9 z9) {
        map.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (s71.b(((C4493wf) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String strI = ((C4493wf) obj2).a;
            strI.getClass();
            for (Map.Entry entry : map.entrySet()) {
                strI = kk2.I(strI, (String) entry.getKey(), (String) entry.getValue(), false);
            }
            arrayList2.add(strI);
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            String str = (String) obj3;
            X3 x3 = X3.a;
            Sh sh = Sh.REGULAR;
            str.getClass();
            sh.getClass();
            Vh.a(sh, new O3(str, z9, null));
        }
    }
}
