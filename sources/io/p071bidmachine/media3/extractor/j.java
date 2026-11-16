package io.p071bidmachine.media3.extractor;

import defpackage.d;
import io.p071bidmachine.media3.common.g;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.common.z;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {
    public final g b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    @Override // io.p071bidmachine.media3.extractor.n
    public final void advancePeekPosition(int i) {
        c(i, false);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final void resetPeekPosition() {
        this.f = 0;
    }

    static {
        z.a("media3.extractor");
    }

    public final void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, x.h(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final void f(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final long getLength() {
        return this.c;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final long getPeekPosition() {
        return this.d + ((long) this.f);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final long getPosition() {
        return this.d;
    }

    @Override // io.p071bidmachine.media3.common.g
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        j jVar;
        int i3 = this.g;
        int iE = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            f(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            jVar = this;
            iE = jVar.e(bArr, i, i2, 0, true);
        } else {
            jVar = this;
        }
        if (iE != -1) {
            jVar.d += (long) iE;
        }
        return iE;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            f(iMin);
        }
        int iE = iMin;
        while (iE < i2 && iE != -1) {
            iE = e(bArr, i, i2, iE, z);
        }
        if (iE != -1) {
            this.d += (long) iE;
        }
        return iE != -1;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final int skip(int i) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin = Math.min(this.g, i);
        f(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            jVar = this;
            iMin = jVar.e(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            jVar = this;
        }
        if (iMin != -1) {
            jVar.d += (long) iMin;
        }
        return iMin;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final void skipFully(int i) {
        int iMin = Math.min(this.g, i);
        f(iMin);
        int iE = iMin;
        while (iE < i && iE != -1) {
            byte[] bArr = this.a;
            iE = e(bArr, -iE, Math.min(i, bArr.length + iE), iE, false);
        }
        if (iE != -1) {
            this.d += (long) iE;
        }
    }

    public j(g gVar, long j, long j2) {
        this.b = gVar;
        this.d = j;
        this.c = j2;
    }

    public final boolean c(int i, boolean z) {
        d(i);
        int iE = this.g - this.f;
        while (iE < i) {
            j jVar = this;
            int i2 = i;
            boolean z2 = z;
            iE = jVar.e(this.e, this.f, i2, iE, z2);
            if (iE == -1) {
                return false;
            }
            jVar.g = jVar.f + iE;
            this = jVar;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final int e(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i4 = this.b.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                d.s();
                return 0;
            }
            return i3 + i4;
        }
        throw new InterruptedIOException();
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final int peek(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        d(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            jVar = this;
            iMin = jVar.e(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.g += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(jVar.e, jVar.f, bArr, i, iMin);
        jVar.f += iMin;
        return iMin;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        if (!c(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final void peekFully(byte[] bArr, int i, int i2) {
        peekFully(bArr, i, i2, false);
    }

    @Override // io.p071bidmachine.media3.extractor.n
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        readFully(bArr, i, i2, false);
    }
}
