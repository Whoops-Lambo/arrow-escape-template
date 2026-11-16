package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzani implements zzahv {
    public final int a;
    public final zzhcn b;

    public final String toString() {
        zzhcn zzhcnVar = this.b;
        ArrayList arrayList = new ArrayList(zzhcnVar.b);
        for (int i = 0; i < zzhcnVar.b; i++) {
            arrayList.add(zzfq.a(zzhcnVar.a(i)));
        }
        String strA = zzfq.a(this.a);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(q63.a(strA.length() + 37, 1, string));
        sb.append("UnsupportedBrands{major=");
        sb.append(strA);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    public zzani(int i, int[] iArr) {
        zzhcn zzhcnVar;
        this.a = i;
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            zzhcnVar = new zzhcn(iArrCopyOf, iArrCopyOf.length);
        } else {
            zzhcnVar = zzhcn.c;
        }
        this.b = zzhcnVar;
    }
}
