package io.p071bidmachine.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.jc1;
import io.p071bidmachine.media3.common.audio.e;
import io.p071bidmachine.media3.common.audio.f;
import io.p071bidmachine.media3.common.audio.h;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends h {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    public final float i = 0.2f;
    public final long m = SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US;
    public final int k = 10;
    public final short j = 1024;

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void e() {
        this.o = false;
        byte[] bArr = x.c;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final e b(e eVar) throws f {
        if (eVar.c == 2) {
            return eVar.a == -1 ? e.e : eVar;
        }
        throw new f(eVar);
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void d() {
        if (this.u > 0) {
            h(true);
            this.r = 0;
        }
    }

    public final int g(int i) {
        int length = ((((int) ((this.m * ((long) this.b.a)) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        a.i(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (iMin / i2) * i2;
    }

    public final void h(boolean z) {
        int length;
        int iG;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    i(i, 3);
                    length = i;
                } else {
                    a.i(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    i(length, 0);
                }
                iG = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iG2 = g(length2) + (this.s.length / 2);
                i(iG2, 2);
                iG = iG2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iG = g(length);
                i(iG, 1);
            }
            a.h("bytesConsumed is not aligned to frame size: %s" + length, length % this.n == 0);
            a.i(i >= iG);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            int i3 = this.r;
            int i4 = this.n;
            this.r = (iG / i4) + i3;
            this.q += (long) ((length - iG) / i4);
        }
    }

    public final void i(int i, int i2) {
        if (i == 0) {
            return;
        }
        a.c(this.u >= i);
        int i3 = this.t;
        if (i2 == 2) {
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.v;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.v;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.s, 0, this.v, length3, i - length3);
            }
        }
        a.b("sizeToOutput is not aligned to frame size: " + i, i % this.n == 0);
        a.i(this.t < this.s.length);
        byte[] bArr5 = this.v;
        a.b("byteOutput size is not aligned to frame size " + i, i % this.n == 0);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                int i11 = this.k;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = -128;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        f(i).put(bArr5, 0, i).flip();
    }

    public c0() {
        byte[] bArr = x.c;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // io.p071bidmachine.media3.common.audio.h
    public final void c() {
        if (isActive()) {
            e eVar = this.b;
            int i = eVar.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * ((long) eVar.a)) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // io.p071bidmachine.media3.common.audio.h, io.p071bidmachine.media3.common.audio.g
    public final boolean isActive() {
        if (super.isActive() && this.o) {
            return true;
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueInput(ByteBuffer byteBuffer) {
        boolean z;
        int iLimit;
        boolean z2;
        boolean z3;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            boolean z4 = true;
            if (i != 0) {
                if (i == 1) {
                    if (this.t < this.s.length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a.i(z);
                    int iLimit2 = byteBuffer.limit();
                    int iPosition2 = byteBuffer.position() + 1;
                    while (true) {
                        if (iPosition2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > s) {
                                int i2 = this.n;
                                iLimit = (iPosition2 / i2) * i2;
                                break;
                            }
                            iPosition2 += 2;
                        } else {
                            iLimit = byteBuffer.limit();
                            break;
                        }
                    }
                    int iPosition3 = iLimit - byteBuffer.position();
                    int length = this.t;
                    int i3 = this.u;
                    int length2 = length + i3;
                    byte[] bArr = this.s;
                    if (length2 < bArr.length) {
                        length = bArr.length;
                    } else {
                        length2 = i3 - (bArr.length - length);
                    }
                    int i4 = length - length2;
                    if (iLimit < iLimit2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int iMin = Math.min(iPosition3, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.s, length2, iMin);
                    int i5 = this.u + iMin;
                    this.u = i5;
                    if (i5 <= this.s.length) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a.i(z3);
                    if (!z2 || iPosition3 >= i4) {
                        z4 = false;
                    }
                    h(z4);
                    if (z4) {
                        this.p = 0;
                        this.r = 0;
                    }
                    byteBuffer.limit(iLimit2);
                } else {
                    y.b();
                    return;
                }
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.s.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > s) {
                            int i6 = this.n;
                            iPosition = jc1.e(iLimit4, i6, i6, i6);
                            break;
                        }
                        iLimit4 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    f(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }
}
