package com.google.android.gms.internal.ads;

import defpackage.ak1;
import defpackage.e32;
import defpackage.h50;
import defpackage.lr4;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxf implements Comparator {
    public final boolean a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[RETURN] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 496612959;
        zzaxj zzaxjVar = (zzaxj) obj;
        zzaxj zzaxjVar2 = (zzaxj) obj2;
        int i10 = zzaxjVar.g;
        if (i10 != zzaxjVar2.g) {
            e32.a();
            return 0;
        }
        int i11 = i9 ^ iB;
        try {
            if (i10 == 0) {
                throw null;
            }
            int i12 = i10 + i11;
            boolean z = this.a;
            switch (i12) {
                case 1:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (zzaxjVar.l() != zzaxjVar2.l()) {
                        return 1;
                    }
                    return 0;
                case 2:
                    return Long.compare(zzaxjVar.m(), zzaxjVar2.m());
                case 3:
                    zzawn zzawnVarN = zzaxjVar.n();
                    zzawn zzawnVarN2 = zzaxjVar2.n();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        length = zzawnVarN.a.length;
                        if (i13 < length && i14 < zzawnVarN2.a.length) {
                            int iCompare = Integer.compare(zzawn.f(zzawnVarN.b(i13)), zzawn.f(zzawnVarN2.b(i14)));
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            i13++;
                            i14++;
                        }
                    }
                    return Integer.compare(length, zzawnVarN2.a.length);
                case 4:
                    return new lr4(this).compare(zzaxjVar.o(), zzaxjVar2.o());
                case 5:
                    if (!z) {
                        throw new IllegalArgumentException();
                    }
                    if (zzaxjVar.p() != zzaxjVar2.p()) {
                        return 1;
                    }
                    return 0;
                case 6:
                    return Double.compare(zzaxjVar.q(), zzaxjVar2.q());
                default:
                    return 0;
            }
        } catch (zzaxg e) {
            ak1.l(zzawl.a("CEiv6BFfPnitUE+D"), e);
            return 0;
        }
    }

    public zzaxf(boolean z) {
        this.a = z;
    }
}
