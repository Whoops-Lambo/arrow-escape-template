package io.p071bidmachine.media3.common;

import defpackage.pv1;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final b c = new b(new a[0]);
    public static final a d;
    public final int a;
    public final a[] b;

    public final int hashCode() {
        return Arrays.hashCode(this.b) + pv1.c(this.a, 29791, 1, 961);
    }

    static {
        a aVar = new a(-1, -1, new int[0], new y[0], new long[0], new String[0]);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        d = new a(0, aVar.b, iArrCopyOf, (y[]) Arrays.copyOf(aVar.d, 0), jArrCopyOf, (String[]) Arrays.copyOf(aVar.g, 0));
        x.G(1);
        x.G(2);
        x.G(3);
        x.G(4);
    }

    public final a a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Arrays.equals(this.b, bVar.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i >= aVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            aVarArr[i].getClass();
            for (int i2 = 0; i2 < aVarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = aVarArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(aVarArr[i].f[i2]);
                sb.append(')');
                if (i2 < aVarArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < aVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public b(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }
}
