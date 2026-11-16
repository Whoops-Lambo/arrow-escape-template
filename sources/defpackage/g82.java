package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g82 {
    public final byte[] a;
    public int b;
    public int c;
    public n32 d;
    public boolean e;
    public g82 f;
    public g82 g;

    public final int a() {
        return this.c - this.b;
    }

    public final byte b(int i) {
        return this.a[this.b + i];
    }

    public final g82 c() {
        g82 g82Var = this.f;
        g82 g82Var2 = this.g;
        if (g82Var2 != null) {
            g82Var2.getClass();
            g82Var2.f = this.f;
        }
        g82 g82Var3 = this.f;
        if (g82Var3 != null) {
            g82Var3.getClass();
            g82Var3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return g82Var;
    }

    public final g82 e() {
        n32 n32Var = this.d;
        if (n32Var == null) {
            g82 g82Var = n82.a;
            n32Var = new n32();
            this.d = n32Var;
        }
        int i = this.b;
        int i2 = this.c;
        n32.b.incrementAndGet(n32Var);
        return new g82(this.a, i, i2, n32Var);
    }

    public g82() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final void d(g82 g82Var) {
        g82Var.getClass();
        g82Var.g = this;
        g82Var.f = this.f;
        g82 g82Var2 = this.f;
        if (g82Var2 != null) {
            g82Var2.g = g82Var;
        }
        this.f = g82Var;
    }

    public final void f(g82 g82Var, int i) {
        g82Var.getClass();
        if (g82Var.e) {
            if (g82Var.c + i > 8192) {
                n32 n32Var = g82Var.d;
                if (n32Var != null && n32Var.a > 0) {
                    e32.a();
                    return;
                }
                int i2 = g82Var.c;
                int i3 = g82Var.b;
                if ((i2 + i) - i3 <= 8192) {
                    byte[] bArr = g82Var.a;
                    n8.Q(bArr, 0, i3, bArr, i2);
                    g82Var.c -= g82Var.b;
                    g82Var.b = 0;
                } else {
                    e32.a();
                    return;
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = g82Var.a;
            int i4 = g82Var.c;
            int i5 = this.b;
            n8.Q(bArr2, i4, i5, bArr3, i5 + i);
            g82Var.c += i;
            this.b += i;
            return;
        }
        e32.i("only owner can write");
    }

    public g82(byte[] bArr, int i, int i2, n32 n32Var) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = n32Var;
        this.e = false;
    }
}
