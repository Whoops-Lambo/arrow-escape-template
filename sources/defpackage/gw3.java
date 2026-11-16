package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gw3 extends FilterInputStream {
    public final /* synthetic */ int a = 0;
    public long b;
    public long c;

    public gw3(InputStream inputStream, long j) {
        super(inputStream);
        this.c = -1L;
        inputStream.getClass();
        zzgvz.b("limit must be non-negative", j >= 0);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.c = this.b;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                int i3 = super.read(bArr, i, i2);
                if (i3 != -1) {
                    this.c += (long) i3;
                }
                return i3;
            default:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i4 != -1) {
                    this.b -= (long) i4;
                }
                return i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.b = this.c;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.a) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public gw3(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.c++;
                }
                return i;
            default:
                if (this.b == 0) {
                    return -1;
                }
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 != -1) {
                    this.b--;
                }
                return i2;
        }
    }
}
