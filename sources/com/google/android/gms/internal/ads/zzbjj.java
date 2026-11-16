package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbjj {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a((zzbji) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        zzbjs.a(arrayList3, new zzblb("gad:dynamite_module:experiment_id", "", 4));
        zzbjs.a(arrayList3, zzblp.a);
        zzbjs.a(arrayList3, zzblp.b);
        zzbjs.a(arrayList3, zzblp.c);
        zzbjs.a(arrayList3, zzblp.d);
        zzbjs.a(arrayList3, zzblp.e);
        zzbjs.a(arrayList3, zzblp.u);
        zzbjs.a(arrayList3, zzblp.f);
        zzbjs.a(arrayList3, zzblp.m);
        zzbjs.a(arrayList3, zzblp.n);
        zzbjs.a(arrayList3, zzblp.o);
        zzbjs.a(arrayList3, zzblp.p);
        zzbjs.a(arrayList3, zzblp.q);
        zzbjs.a(arrayList3, zzblp.r);
        zzbjs.a(arrayList3, zzblp.s);
        zzbjs.a(arrayList3, zzblp.t);
        zzbjs.a(arrayList3, zzblp.g);
        zzbjs.a(arrayList3, zzblp.h);
        zzbjs.a(arrayList3, zzblp.i);
        zzbjs.a(arrayList3, zzblp.j);
        zzbjs.a(arrayList3, zzblp.k);
        zzbjs.a(arrayList3, zzblp.l);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayListA = a();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a((zzbji) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListA.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        zzbjs.a(arrayList2, zzbme.a);
        arrayListA.addAll(arrayList2);
        return arrayListA;
    }
}
