package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.e32;
import defpackage.jc1;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzuj extends zzcq {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    public zzuj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void i() {
        this.j = false;
        byte[] bArr = zzfq.b;
        this.n = bArr;
        this.q = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) throws zzco {
        if (zzclVar.c == 2) {
            return zzclVar.a == -1 ? zzcl.e : zzclVar;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void g() {
        if (this.p > 0) {
            j(true);
            this.m = 0;
        }
    }

    public final void j(boolean z) {
        int i;
        int length;
        int i2 = this.p;
        int length2 = this.n.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.m == 0) {
            if (z) {
                l(i2, 3);
                length = i2;
            } else {
                zzgvz.f(i2 >= (length2 >> 1));
                length = this.n.length >> 1;
                l(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iK = k(i4) + (this.n.length >> 1);
                l(iK, 2);
                int i5 = i3 + i4;
                i = iK;
                length = i5;
            } else {
                int iK2 = k(i4);
                l(iK2, 1);
                i = iK2;
                length = i4;
            }
        }
        if (length % this.i != 0) {
            e32.i(zzgwq.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            return;
        }
        zzgvz.f(i2 >= i);
        this.p -= length;
        int i6 = this.o + length;
        this.o = i6;
        this.o = i6 % this.n.length;
        int i7 = this.m;
        int i8 = this.i;
        this.m = (i / i8) + i7;
        this.l += (long) ((length - i) / i8);
    }

    public final int k(int i) {
        int length = ((((int) ((SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US * ((long) this.b.a)) / 1000000)) - this.m) * this.i) - (this.n.length >> 1);
        zzgvz.f(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (iMin / i2) * i2;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        zzgvz.a(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            int length = bArr.length;
            byte[] bArr2 = this.q;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, bArr2, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, bArr2, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, bArr2, 0, i8);
                    System.arraycopy(this.n, 0, this.q, i8, i7);
                }
            }
        } else {
            int i9 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i9 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int i10 = length2 - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, i10);
                System.arraycopy(this.n, 0, this.q, i10, i - i10);
            }
        }
        zzgvz.c(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        zzgvz.f(this.o < this.n.length);
        byte[] bArr5 = this.q;
        zzgvz.c(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                int i12 = i11 + 1;
                byte b = bArr5[i12];
                int i13 = bArr5[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = b << 8;
                if (i2 == 0) {
                    i3 = ((((i11 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i11) / (i - 1)) / 1000);
                    }
                }
                int i15 = ((i14 | i13) * i3) / 100;
                if (i15 >= 32767) {
                    bArr5[i11] = -1;
                    bArr5[i12] = 127;
                } else if (i15 <= -32768) {
                    bArr5[i11] = 0;
                    bArr5[i12] = -128;
                } else {
                    bArr5[i11] = (byte) (i15 & 255);
                    bArr5[i12] = (byte) (i15 >> 8);
                }
            }
        }
        e(i).put(bArr5, 0, i).flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(ByteBuffer byteBuffer) {
        boolean z;
        int iLimit;
        int i;
        boolean z2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            boolean z3 = true;
            if (this.k != 0) {
                if (this.o < this.n.length) {
                    z = true;
                } else {
                    z = false;
                }
                zzgvz.f(z);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 < byteBuffer.limit()) {
                        if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                            int i2 = this.i;
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
                int i3 = this.o;
                int i4 = this.p;
                int i5 = i3 + i4;
                int length = this.n.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.n, i5, iMin);
                int i6 = this.p + iMin;
                this.p = i6;
                if (i6 <= this.n.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzgvz.f(z2);
                if (iLimit >= iLimit2 || iPosition3 >= i) {
                    z3 = false;
                }
                j(z3);
                if (z3) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                            int i7 = this.i;
                            iPosition = jc1.e(iLimit4, i7, i7, i7);
                            break;
                        }
                        iLimit4 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    e(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void h() {
        if (zzc()) {
            zzcl zzclVar = this.b;
            int i = zzclVar.b;
            int i2 = i + i;
            this.i = i2;
            int i3 = ((((int) ((SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US * ((long) zzclVar.a)) / 1000000)) / 2) / i2) * i2;
            int i4 = i3 + i3;
            if (this.n.length != i4) {
                this.n = new byte[i4];
                this.q = new byte[i4];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (super.zzc() && this.j) {
            return true;
        }
        return false;
    }
}
