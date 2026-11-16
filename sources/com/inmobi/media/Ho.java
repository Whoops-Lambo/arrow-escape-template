package com.inmobi.media;

import defpackage.dt1;
import defpackage.uu;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ho implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dt1 dt1Var = (dt1) obj;
        String str = ((Bn) dt1Var.a).c;
        Object obj3 = dt1Var.b;
        System.out.println((Object) (str + " " + obj3));
        dt1 dt1Var2 = (dt1) obj2;
        String str2 = ((Bn) dt1Var2.a).c;
        Object obj4 = dt1Var2.b;
        System.out.println((Object) (str2 + " " + obj4));
        return uu.k((Double) obj3, (Double) obj4);
    }
}
