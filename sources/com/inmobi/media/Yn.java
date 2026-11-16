package com.inmobi.media;

import defpackage.dk2;
import defpackage.eu;
import defpackage.kk2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Yn {
    public final AtomicInteger a;
    public final Md b;
    public final Xn c;

    public Yn(C4501wn c4501wn, C3951d0 c3951d0, C4449up c4449up) {
        int i;
        int iA;
        c4501wn.getClass();
        c3951d0.getClass();
        c4449up.getClass();
        this.a = new AtomicInteger(0);
        this.b = new Md(c3951d0, c4501wn.a, c4501wn.b, 24);
        ArrayList arrayList = c4501wn.d;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C4493wf c4493wf = (C4493wf) obj;
            if (!(c4493wf instanceof C4291p6)) {
                String str = c4493wf.b;
                str.getClass();
                if (!str.equals("Impression") && !str.equals("click")) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = c4501wn.d;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            if (obj2 instanceof C4291p6) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(eu.f(arrayList4, 10));
        int size3 = arrayList4.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList4.get(i4);
            i4++;
            C4291p6 c4291p6 = (C4291p6) obj3;
            int i5 = c4501wn.c;
            c4291p6.getClass();
            boolean zC = kk2.C(c4291p6.c, "%", false);
            String str2 = c4291p6.c;
            if (zC) {
                try {
                    i = Integer.parseInt(dk2.Q(str2));
                } catch (Exception unused) {
                    i = 0;
                }
                iA = (i5 * i) / 100;
            } else {
                iA = Vn.a(str2);
            }
            arrayList5.add(new C4235n6(c4291p6.a, iA));
        }
        this.c = new Xn(this.b, new Zn(c4449up, arrayList2, arrayList5));
    }
}
