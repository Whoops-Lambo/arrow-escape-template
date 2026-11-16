package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ib5 {
    public final int[] a;
    public final gb5 b;
    public gb5 c;
    public int d;
    public int e;
    public int f;

    public final void a() {
        if (this.e == 0) {
            return;
        }
        HashMap map = this.c.d;
        int i = this.d;
        int[] iArr = this.a;
        gb5 gb5Var = (gb5) map.get(Integer.valueOf(iArr[i]));
        while (true) {
            int i2 = (gb5Var.b - gb5Var.a) + 1;
            int i3 = this.e;
            if (i2 > i3) {
                return;
            }
            int i4 = this.d + i2;
            this.d = i4;
            this.c = gb5Var;
            int i5 = i3 - i2;
            this.e = i5;
            if (i5 > 0) {
                gb5Var = (gb5) gb5Var.d.get(Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final void b() {
        gb5 gb5Var = this.c.c;
        if (gb5Var != null) {
            this.c = gb5Var;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        a();
    }

    public final void c(gb5 gb5Var, StringBuilder sb) {
        for (gb5 gb5Var2 : gb5Var.d.values()) {
            sb.append("  ");
            sb.append(gb5Var);
            sb.append(" -> ");
            sb.append(gb5Var2);
            sb.append(" [label=\"");
            int i = gb5Var2.a;
            int i2 = gb5Var2.b + 1;
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, i, Math.min(iArr.length, i2))));
            sb.append("\"]\n");
            c(gb5Var2, sb);
        }
    }

    public final boolean d(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        c(this.b, sb);
        sb.append("}");
        return sb.toString();
    }

    public ib5(int[] iArr) {
        this.a = iArr;
        gb5 gb5Var = new gb5(-1, -1);
        this.b = gb5Var;
        this.c = gb5Var;
    }
}
