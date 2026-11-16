package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ui2 {
    public static final ui2 e = new ui2(kq2.b, 0, 0, 0);
    public final int a;
    public final kq2 b;
    public final int c;
    public final int d;

    public final ui2 a(int i) {
        int i2;
        kq2 ig2Var = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = dx0.b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            ig2Var.getClass();
            i4 += i7;
            ig2Var = new ig2(ig2Var, i6, i7);
        }
        int i8 = this.c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        ui2 ui2Var = new ui2(ig2Var, i3, i9, i4 + i2);
        return i9 == 2078 ? ui2Var.b(i + 1) : ui2Var;
    }

    public final ui2 e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = dx0.d[i3][i];
        kq2 kq2Var = this.b;
        kq2Var.getClass();
        return new ui2(new ig2(new ig2(kq2Var, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final ui2 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        kq2 kq2Var = this.b;
        kq2Var.getClass();
        return new ui2(new ti(kq2Var, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(ui2 ui2Var) {
        int i;
        int i2 = this.d + (dx0.b[this.a][ui2Var.a] >> 16);
        int i3 = ui2Var.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= ui2Var.d;
    }

    public final ui2 d(int i, int i2) {
        int i3 = this.d;
        kq2 ig2Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = dx0.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            ig2Var.getClass();
            i3 += i7;
            ig2Var = new ig2(ig2Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        ig2Var.getClass();
        return new ui2(new ig2(ig2Var, i2, i8), i, 0, i3 + i8);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", dx0.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }

    public ui2(kq2 kq2Var, int i, int i2, int i3) {
        this.b = kq2Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
