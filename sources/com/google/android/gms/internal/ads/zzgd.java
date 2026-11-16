package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgd extends zzgf {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public final zzge b(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzge zzgeVar = (zzge) arrayList.get(i2);
            if (zzgeVar.a == i) {
                return zzgeVar;
            }
        }
        return null;
    }

    public final zzgd c(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzgd zzgdVar = (zzgd) arrayList.get(i2);
            if (zzgdVar.a == i) {
                return zzgdVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    public final String toString() {
        String strA = zzgf.a(this.a);
        String string = Arrays.toString(this.c.toArray());
        String string2 = Arrays.toString(this.d.toArray());
        int length = strA.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        q63.y(sb, strA, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public zzgd(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
}
