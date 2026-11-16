package io.p071bidmachine.media3.common.audio;

import io.p071bidmachine.media3.common.util.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements g {
    public int b;
    public float c;
    public float d;
    public e e;
    public e f;
    public e g;
    public e h;
    public boolean i;
    public i j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // io.p071bidmachine.media3.common.audio.g
    public final e a(e eVar) throws f {
        if (eVar.c != 2) {
            throw new f(eVar);
        }
        int i = this.b;
        if (i == -1) {
            i = eVar.a;
        }
        this.e = eVar;
        e eVar2 = new e(i, eVar.b, 2);
        this.f = eVar2;
        this.i = true;
        return eVar2;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final ByteBuffer getOutput() {
        i iVar = this.j;
        if (iVar != null) {
            int i = iVar.b;
            a.i(iVar.m >= 0);
            int i2 = iVar.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                a.i(iVar.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, iVar.m);
                int i3 = iMin * i;
                shortBuffer.put(iVar.l, 0, i3);
                int i4 = iVar.m - iMin;
                iVar.m = i4;
                short[] sArr = iVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += (long) i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = g.a;
        return byteBuffer;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final boolean isEnded() {
        if (this.p) {
            i iVar = this.j;
            if (iVar != null) {
                a.i(iVar.m >= 0);
                if (iVar.m * iVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueEndOfStream() {
        i iVar = this.j;
        if (iVar != null) {
            int i = iVar.k;
            float f = iVar.c;
            float f2 = iVar.d;
            double d = f / f2;
            double d2 = iVar.e * f2;
            int i2 = iVar.r;
            int i3 = iVar.m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + iVar.w) + ((double) iVar.o)) / d2) + 0.5d));
            iVar.w = 0.0d;
            short[] sArr = iVar.j;
            int i4 = iVar.h * 2;
            iVar.j = iVar.c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = iVar.b;
                if (i5 >= i4 * i6) {
                    break;
                }
                iVar.j[(i6 * i) + i5] = 0;
                i5++;
            }
            iVar.k = i4 + iVar.k;
            iVar.f();
            if (iVar.m > i3) {
                iVar.m = Math.max(i3, 0);
            }
            iVar.k = 0;
            iVar.r = 0;
            iVar.o = 0;
        }
        this.p = true;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        e eVar = e.e;
        this.e = eVar;
        this.f = eVar;
        this.g = eVar;
        this.h = eVar;
        ByteBuffer byteBuffer = g.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void flush() {
        if (isActive()) {
            e eVar = this.e;
            this.g = eVar;
            e eVar2 = this.f;
            this.h = eVar2;
            if (this.i) {
                this.j = new i(eVar.a, eVar.b, this.c, this.d, eVar2.a);
            } else {
                i iVar = this.j;
                if (iVar != null) {
                    iVar.k = 0;
                    iVar.m = 0;
                    iVar.o = 0;
                    iVar.p = 0;
                    iVar.q = 0;
                    iVar.r = 0;
                    iVar.s = 0;
                    iVar.t = 0;
                    iVar.u = 0;
                    iVar.v = 0;
                    iVar.w = 0.0d;
                }
            }
        }
        this.m = g.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueInput(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        i iVar = this.j;
        iVar.getClass();
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.n += (long) iRemaining;
        int iRemaining2 = shortBufferAsShortBuffer.remaining();
        int i = iVar.b;
        int i2 = iRemaining2 / i;
        short[] sArrC = iVar.c(iVar.j, iVar.k, i2);
        iVar.j = sArrC;
        shortBufferAsShortBuffer.get(sArrC, iVar.k * i, ((i2 * i) * 2) / 2);
        iVar.k += i2;
        iVar.f();
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }
}
