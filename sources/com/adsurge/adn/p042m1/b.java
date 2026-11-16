package com.adsurge.adn.p042m1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements l {
    @Override // com.adsurge.adn.p042m1.l
    public l.a[] a(long j, int i) {
        long j2 = j / ((long) i);
        l.a[] aVarArr = new l.a[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 >= i3) {
                long j3 = ((long) i3) * j2;
                aVarArr[i3] = new l.a(j3, j - j3);
                return aVarArr;
            }
            aVarArr[i2] = new l.a(((long) i2) * j2, j2);
            i2++;
        }
    }
}
