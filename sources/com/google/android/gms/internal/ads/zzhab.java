package com.google.android.gms.internal.ads;

import defpackage.af1;
import defpackage.bf1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhab {
    public static ArrayList a(zzhbp zzhbpVar) {
        ArrayList arrayList = new ArrayList();
        zzhbpVar.getClass();
        while (zzhbpVar.hasNext()) {
            arrayList.add(zzhbpVar.next());
        }
        return arrayList;
    }

    public static AbstractList b(List list, zzgvq zzgvqVar) {
        return list != null ? new af1(list, zzgvqVar) : new bf1(list, zzgvqVar);
    }
}
