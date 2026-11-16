package io.p071bidmachine.media3.exoplayer.audio;

import io.p071bidmachine.media3.common.audio.e;
import io.p071bidmachine.media3.common.audio.f;
import io.p071bidmachine.media3.common.audio.h;
import io.p071bidmachine.media3.common.util.x;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q extends h {
    public int[] i;
    public int[] j;

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void e() {
        this.j = null;
        this.i = null;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final e b(e eVar) throws f {
        int i = eVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return e.e;
        }
        int i2 = eVar.b;
        if (i != 2 && i != 4) {
            throw new f(eVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new f("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", eVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new e(eVar.a, iArr.length, i) : e.e;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void c() {
        this.j = this.i;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                int iR = (x.r(this.b.c) * i) + iPosition;
                int i2 = this.b.c;
                if (i2 == 2) {
                    byteBufferF.putShort(byteBuffer.getShort(iR));
                } else {
                    if (i2 != 4) {
                        io.p071bidmachine.ads.networks.adaptiverendering.e.e(this.b.c, "Unexpected encoding: ");
                        return;
                    }
                    byteBufferF.putFloat(byteBuffer.getFloat(iR));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
