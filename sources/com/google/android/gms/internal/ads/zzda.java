package com.google.android.gms.internal.ads;

import defpackage.ar4;
import defpackage.bs4;
import defpackage.pq4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzda {
    public static final pq4 a;

    static {
        bs4 bs4Var = bs4.a;
        bs4Var.getClass();
        a = new pq4(bs4Var);
        ar4 ar4Var = zzgzb.b;
        new zzda(w.e);
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzda(w wVar) {
        ar4 ar4Var = zzgzb.b;
        Object[] array = (wVar == null ? zzhab.a(wVar.listIterator(0)) : wVar).toArray();
        int length = array.length;
        zzhau.a(length, array);
        Arrays.sort(array, a);
        zzgzb.D(length, array);
    }
}
