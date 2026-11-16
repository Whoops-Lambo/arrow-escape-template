package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class x21 implements Serializable {
    public static final x21 c = new x21(new int[0]);
    public final int[] a;
    public final int b;

    public x21(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        x21 x21Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x21) && (i2 = this.b) == (i = (x21Var = (x21) obj).b)) {
            for (int i3 = 0; i3 < i2; i3++) {
                fs1.i(i3, i2);
                int i4 = this.a[i3];
                fs1.i(i3, i);
                if (i4 == x21Var.a[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public Object readResolve() {
        return this.b == 0 ? c : this;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return i < length ? new x21(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
