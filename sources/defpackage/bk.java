package defpackage;

import java.io.EOFException;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bk implements ih2, AutoCloseable, Flushable {
    public g82 a;
    public g82 b;
    public long c;

    public final int b(int i, int i2, byte[] bArr) {
        s71.e(bArr.length, i, i2);
        g82 g82Var = this.a;
        if (g82Var == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, g82Var.a());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = g82Var.a;
        int i4 = g82Var.b;
        n8.Q(bArr2, i, i4, bArr, i4 + i3);
        g82Var.b += i3;
        this.c -= (long) iMin;
        if (g82Var.a() == 0) {
            k();
        }
        return iMin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.ih2
    public final bk getBuffer() {
        return this;
    }

    public final void G(bk bkVar, long j) {
        g82 g82VarB;
        if (bkVar == this) {
            d.r("source == this");
            return;
        }
        s71.f(bkVar.c, j);
        while (j > 0) {
            g82 g82Var = bkVar.a;
            g82Var.getClass();
            int i = 0;
            if (j < g82Var.a()) {
                g82 g82Var2 = this.b;
                if (g82Var2 != null && g82Var2.e) {
                    long j2 = ((long) g82Var2.c) + j;
                    n32 n32Var = g82Var2.d;
                    if (j2 - ((long) ((n32Var == null || n32Var.a <= 0) ? g82Var2.b : 0)) <= 8192) {
                        g82 g82Var3 = bkVar.a;
                        g82Var3.getClass();
                        g82Var3.f(g82Var2, (int) j);
                        bkVar.c -= j;
                        this.c += j;
                        return;
                    }
                }
                g82 g82Var4 = bkVar.a;
                g82Var4.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > g82Var4.c - g82Var4.b) {
                    d.r("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    g82VarB = g82Var4.e();
                } else {
                    g82VarB = n82.b();
                    byte[] bArr = g82Var4.a;
                    byte[] bArr2 = g82VarB.a;
                    int i3 = g82Var4.b;
                    n8.Q(bArr, 0, i3, bArr2, i3 + i2);
                }
                g82VarB.c = g82VarB.b + i2;
                g82Var4.b += i2;
                g82 g82Var5 = g82Var4.g;
                if (g82Var5 != null) {
                    g82Var5.d(g82VarB);
                } else {
                    g82VarB.f = g82Var4;
                    g82Var4.g = g82VarB;
                }
                bkVar.a = g82VarB;
            }
            g82 g82Var6 = bkVar.a;
            g82Var6.getClass();
            long jA = g82Var6.a();
            g82 g82VarC = g82Var6.c();
            bkVar.a = g82VarC;
            if (g82VarC == null) {
                bkVar.b = null;
            }
            if (this.a == null) {
                this.a = g82Var6;
                this.b = g82Var6;
            } else {
                g82 g82Var7 = this.b;
                g82Var7.getClass();
                g82Var7.d(g82Var6);
                g82 g82Var8 = g82Var6.g;
                if (g82Var8 == null) {
                    e32.i("cannot compact");
                    return;
                }
                if (g82Var8.e) {
                    int i4 = g82Var6.c - g82Var6.b;
                    int i5 = 8192 - g82Var8.c;
                    g82Var8.getClass();
                    n32 n32Var2 = g82Var8.d;
                    if (n32Var2 == null || n32Var2.a <= 0) {
                        g82 g82Var9 = g82Var6.g;
                        g82Var9.getClass();
                        i = g82Var9.b;
                    }
                    if (i4 <= i5 + i) {
                        g82 g82Var10 = g82Var6.g;
                        g82Var10.getClass();
                        g82Var6.f(g82Var10, i4);
                        if (g82Var6.c() != null) {
                            e32.i("Check failed.");
                            return;
                        } else {
                            n82.a(g82Var6);
                            g82Var6 = g82Var10;
                        }
                    }
                }
                this.b = g82Var6;
                if (g82Var6.g == null) {
                    this.a = g82Var6;
                }
            }
            bkVar.c -= jA;
            this.c += jA;
            j -= jA;
        }
    }

    @Override // defpackage.b22
    public final long M(bk bkVar, long j) {
        if (j < 0) {
            ak1.n(pv1.m(j, "byteCount (", ") < 0"));
            return 0L;
        }
        long j2 = this.c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        bkVar.G(this, j);
        return j;
    }

    @Override // defpackage.ih2
    public final boolean exhausted() {
        return this.c == 0;
    }

    public final void k() {
        g82 g82Var = this.a;
        g82Var.getClass();
        g82 g82Var2 = g82Var.f;
        this.a = g82Var2;
        if (g82Var2 == null) {
            this.b = null;
        } else {
            g82Var2.g = null;
        }
        g82Var.f = null;
        n82.a(g82Var);
    }

    public final /* synthetic */ g82 r() {
        g82 g82Var = this.b;
        if (g82Var == null) {
            g82 g82VarB = n82.b();
            this.a = g82VarB;
            this.b = g82VarB;
            return g82VarB;
        }
        if (g82Var.c + 1 <= 8192 && g82Var.e) {
            return g82Var;
        }
        g82 g82VarB2 = n82.b();
        g82Var.d(g82VarB2);
        this.b = g82VarB2;
        return g82VarB2;
    }

    @Override // defpackage.ih2
    public final byte readByte() throws EOFException {
        g82 g82Var = this.a;
        if (g82Var == null) {
            throw new EOFException(jc1.m(this.c, ", required: 1)", new StringBuilder("Buffer doesn't contain required number of bytes (size: ")));
        }
        int iA = g82Var.a();
        if (iA == 0) {
            k();
            return readByte();
        }
        byte[] bArr = g82Var.a;
        int i = g82Var.b;
        g82Var.b = i + 1;
        byte b = bArr[i];
        this.c--;
        if (iA == 1) {
            k();
        }
        return b;
    }

    @Override // defpackage.ih2
    public final boolean request(long j) {
        if (j >= 0) {
            return this.c >= j;
        }
        ak1.n(pv1.m(j, "byteCount: ", " < 0"));
        return false;
    }

    @Override // defpackage.ih2
    public final void require(long j) throws EOFException {
        if (j < 0) {
            ak1.n(jc1.l(j, "byteCount: "));
            return;
        }
        if (this.c >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    public final void skip(long j) {
        if (j < 0) {
            ak1.n(pv1.m(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            g82 g82Var = this.a;
            if (g82Var == null) {
                throw new EOFException(pv1.m(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j2, g82Var.c - g82Var.b);
            long j3 = iMin;
            this.c -= j3;
            j2 -= j3;
            int i = g82Var.b + iMin;
            g82Var.b = i;
            if (i == g82Var.c) {
                k();
            }
        }
    }

    public final String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.c > 64 ? 1 : 0));
        int i = 0;
        for (g82 g82Var = this.a; g82Var != null; g82Var = g82Var.f) {
            int i2 = 0;
            while (i < iMin && i2 < g82Var.a()) {
                int i3 = i2 + 1;
                byte b = g82Var.b(i2);
                i++;
                char[] cArr = s71.c;
                sb.append(cArr[(b >> 4) & 15]);
                sb.append(cArr[b & 15]);
                i2 = i3;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    public final void K(byte b) {
        g82 g82VarR = r();
        byte[] bArr = g82VarR.a;
        int i = g82VarR.c;
        g82VarR.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    public final void d(bk bkVar, long j) {
        bkVar.getClass();
        if (j >= 0) {
            long j2 = this.c;
            if (j2 >= j) {
                bkVar.G(this, j);
                return;
            } else {
                bkVar.G(this, j2);
                throw new EOFException(jc1.m(this.c, " bytes were written.", h50.o(j, "Buffer exhausted before writing ", " bytes. Only ")));
            }
        }
        ak1.n(pv1.m(j, "byteCount (", ") < 0"));
    }

    public final long o(b22 b22Var) {
        b22Var.getClass();
        long j = 0;
        while (true) {
            long jM = b22Var.M(this, 8192L);
            if (jM != -1) {
                j += jM;
            } else {
                return j;
            }
        }
    }

    public final long q(bk bkVar) {
        bkVar.getClass();
        long j = this.c;
        if (j > 0) {
            bkVar.G(this, j);
        }
        return j;
    }

    public final void t(int i, byte[] bArr) {
        bArr.getClass();
        s71.e(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            g82 g82VarR = r();
            byte[] bArr2 = g82VarR.a;
            int iMin = Math.min(i - i2, bArr2.length - g82VarR.c) + i2;
            n8.Q(bArr, g82VarR.c, i2, bArr2, iMin);
            g82VarR.c = (iMin - i2) + g82VarR.c;
            i2 = iMin;
        }
        this.c += (long) i;
    }
}
