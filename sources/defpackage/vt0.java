package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vt0 {
    public final ut0 a;
    public final int[] b;

    public final vt0 a(vt0 vt0Var) {
        ut0 ut0Var = vt0Var.a;
        ut0 ut0Var2 = this.a;
        if (!ut0Var2.equals(ut0Var)) {
            d.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        int[] iArr = this.b;
        if (iArr[0] == 0) {
            return vt0Var;
        }
        int[] iArr2 = vt0Var.b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new vt0(ut0Var2, iArr3);
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.b;
            int i = iArr[(iArr.length - 1) - iB];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || i != 1) {
                    ut0 ut0Var = this.a;
                    if (i == 0) {
                        ut0Var.getClass();
                        e32.a();
                        return null;
                    }
                    int i2 = ut0Var.b[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }

    public vt0(ut0 ut0Var, int[] iArr) {
        if (iArr.length != 0) {
            this.a = ut0Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.b = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.b = iArr;
            return;
        }
        e32.a();
        throw null;
    }
}
