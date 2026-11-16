package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzun extends zzcq {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = zzfq.b;
    public int n;
    public long o;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long a(long j) {
        return Math.max(0L, j - zzfq.v(this.b.a, this.j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) throws zzco {
        if (!zzfq.d(zzclVar.c)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? zzcl.e : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void g() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void i() {
        this.m = zzfq.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.l);
            this.o += (long) (iMin / this.b.d);
            this.l -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.l <= 0) {
                int i2 = i - iMin;
                int length = (this.n + i2) - this.m.length;
                ByteBuffer byteBufferE = e(length);
                int i3 = this.n;
                String str = zzfq.a;
                int iMax = Math.max(0, Math.min(length, i3));
                byteBufferE.put(this.m, 0, iMax);
                int iMax2 = Math.max(0, Math.min(length - iMax, i2));
                byteBuffer.limit(byteBuffer.position() + iMax2);
                byteBufferE.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i4 = i2 - iMax2;
                int i5 = this.n - iMax;
                this.n = i5;
                byte[] bArr = this.m;
                System.arraycopy(bArr, iMax, bArr, 0, i5);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                byteBufferE.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int i;
        if (super.zzg() && (i = this.n) > 0) {
            e(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (super.zzg() && this.n == 0) {
            return true;
        }
        return false;
    }
}
