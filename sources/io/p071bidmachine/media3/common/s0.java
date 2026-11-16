package io.p071bidmachine.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import defpackage.pv1;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 {
    public final int a;
    public final String b;
    public final int c;
    public final n[] d;
    public int e;

    static {
        x.G(0);
        x.G(1);
    }

    public final int a(n nVar) {
        int i = 0;
        while (true) {
            n[] nVarArr = this.d;
            if (i >= nVarArr.length) {
                return -1;
            }
            if (nVar == nVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (this.b.equals(s0Var.b) && Arrays.equals(this.d, s0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2, String str3, int i) {
        StringBuilder sbR = pv1.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i);
        sbR.append(")");
        a.o("TrackGroup", "", new IllegalStateException(sbR.toString()));
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }

    public s0(String str, n... nVarArr) {
        boolean z;
        if (nVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.b = str;
        this.d = nVarArr;
        this.a = nVarArr.length;
        int i = f0.i(nVarArr[0].n);
        this.c = i == -1 ? f0.i(nVarArr[0].m) : i;
        String str2 = nVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = nVarArr[0].f | 16384;
        for (int i3 = 1; i3 < nVarArr.length; i3++) {
            String str3 = nVarArr[i3].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", nVarArr[0].d, nVarArr[i3].d, i3);
                return;
            } else {
                if (i2 != (nVarArr[i3].f | 16384)) {
                    b("role flags", Integer.toBinaryString(nVarArr[0].f), Integer.toBinaryString(nVarArr[i3].f), i3);
                    return;
                }
            }
        }
    }
}
