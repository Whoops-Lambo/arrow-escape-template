package io.p071bidmachine.media3.exoplayer.audio;

import io.p071bidmachine.media3.common.audio.e;
import io.p071bidmachine.media3.common.audio.f;
import io.p071bidmachine.media3.common.audio.h;
import io.p071bidmachine.media3.common.util.x;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends h {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // io.p071bidmachine.media3.common.audio.h
    public final e b(e eVar) throws f {
        int i = eVar.c;
        if (i != 2 && i != 4) {
            throw new f(eVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? e.e : eVar;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void c() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void d() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void e() {
        this.m = x.c;
    }

    @Override // io.p071bidmachine.media3.common.audio.h, io.p071bidmachine.media3.common.audio.g
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            f(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // io.p071bidmachine.media3.common.audio.h, io.p071bidmachine.media3.common.audio.g
    public final boolean isEnded() {
        if (super.isEnded() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.l);
            this.o += (long) (iMin / this.b.d);
            this.l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.l > 0) {
                return;
            }
            int i2 = i - iMin;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer byteBufferF = f(length);
            int iH = x.h(length, 0, this.n);
            byteBufferF.put(this.m, 0, iH);
            int iH2 = x.h(length - iH, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iH2);
            byteBufferF.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iH2;
            int i4 = this.n - iH;
            this.n = i4;
            byte[] bArr = this.m;
            System.arraycopy(bArr, iH, bArr, 0, i4);
            byteBuffer.get(this.m, this.n, i3);
            this.n += i3;
            byteBufferF.flip();
        }
    }
}
