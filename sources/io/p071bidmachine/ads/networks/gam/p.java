package io.p071bidmachine.ads.networks.gam;

import android.util.Pair;
import defpackage.l83;
import io.p071bidmachine.ads.networks.gam.versions.v21_0_0.b;
import io.p071bidmachine.utils.version.a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p {
    public static final ArrayList a = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(19, new a(21, 0, 0), 0));
        arrayList.add(new b(19, new a(22, 0, 0), 1));
        arrayList.add(new b(21, new a(23, 0, 0), 2));
        Collections.sort(arrayList, new l83(7));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b bVar = (b) arrayList.get(i);
            a aVar = null;
            b bVar2 = i < size + (-1) ? (b) arrayList.get(i + 1) : null;
            a aVar2 = bVar.b;
            if (bVar2 != null) {
                aVar = bVar2.b;
            }
            a.add(new Pair(new io.p071bidmachine.utils.version.b(aVar2, aVar, true, false), bVar));
            i++;
        }
    }
}
