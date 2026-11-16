package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n12 extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ p12 c;

    public n12(p12 p12Var, m12 m12Var) {
        this.c = p12Var;
        this.a = p12Var.L(m12Var.b + 4);
        this.b = m12Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            d.w("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        p12 p12Var = this.c;
        p12Var.t(i4, i, i2, bArr);
        this.a = p12Var.L(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        p12 p12Var = this.c;
        RandomAccessFile randomAccessFile = p12Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int i = randomAccessFile.read();
        this.a = p12Var.L(this.a + 1);
        this.b--;
        return i;
    }
}
