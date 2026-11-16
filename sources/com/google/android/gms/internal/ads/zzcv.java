package com.google.android.gms.internal.ads;

import defpackage.g64;
import defpackage.r54;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcv implements zzcp {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public zzcl e;
    public zzcl f;
    public zzcl g;
    public zzcl h;
    public boolean i;
    public g64 j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long a(long j) {
        if (this.n < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j2 = this.m;
        g64 g64Var = this.j;
        g64Var.getClass();
        long jZza = j2 - ((long) (g64Var.i.zza() * (g64Var.j * g64Var.b)));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? zzfq.w(j, j3, jZza, RoundingMode.DOWN) : zzfq.w(j, j3 * ((long) i2), jZza * ((long) i), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl c(zzcl zzclVar) throws zzco {
        int i = zzclVar.c;
        if (i != 2 && i != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = zzclVar.a;
        }
        this.e = zzclVar;
        zzcl zzclVar2 = new zzcl(i2, zzclVar.b, i);
        this.f = zzclVar2;
        this.i = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        g64 g64Var = this.j;
        if (g64Var != null) {
            int i = g64Var.j;
            int i2 = g64Var.o;
            int i3 = g64Var.k;
            float f = g64Var.c;
            float f2 = g64Var.d;
            int i4 = i3 + ((int) ((((((((double) (i - i2)) / ((double) (f / f2))) + ((double) i2)) + g64Var.q) + ((double) g64Var.l)) / ((double) (g64Var.e * f2))) + 0.5d));
            g64Var.q = 0.0d;
            int i5 = g64Var.h;
            int i6 = i5 + i5;
            r54 r54Var = g64Var.i;
            r54Var.c(i + i6);
            r54Var.g(i * g64Var.b, i6);
            g64Var.j += i6;
            g64Var.b();
            if (g64Var.k > i4) {
                g64Var.k = Math.max(i4, 0);
            }
            g64Var.j = 0;
            g64Var.o = 0;
            g64Var.l = 0;
        }
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        g64 g64Var = this.j;
        if (g64Var != null) {
            r54 r54Var = g64Var.i;
            int i = g64Var.b;
            zzgvz.f(g64Var.k >= 0);
            int iZza = r54Var.zza() * g64Var.k * i;
            if (iZza > 0) {
                if (this.k.capacity() < iZza) {
                    this.k = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                zzgvz.f(g64Var.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (r54Var.zza() * i), g64Var.k);
                r54Var.h(iMin, byteBuffer);
                g64Var.k -= iMin;
                System.arraycopy(r54Var.zzq(), iMin * i, r54Var.zzq(), 0, g64Var.k * i);
                this.k.flip();
                this.n += (long) iZza;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = zzcp.a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (this.o) {
            g64 g64Var = this.j;
            if (g64Var != null) {
                zzgvz.f(g64Var.k >= 0);
                if (g64Var.i.zza() * g64Var.k * g64Var.b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.c = 1.0f;
        this.d = 1.0f;
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcp.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    public zzcv() {
        zzcl zzclVar = zzcl.e;
        this.e = zzclVar;
        this.f = zzclVar;
        this.g = zzclVar;
        this.h = zzclVar;
        ByteBuffer byteBuffer = zzcp.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        g64 g64Var = this.j;
        g64Var.getClass();
        this.m += (long) byteBuffer.remaining();
        r54 r54Var = g64Var.i;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (r54Var.zza() * g64Var.b);
        r54Var.c(iZza);
        r54Var.f(iRemaining, byteBuffer);
        g64Var.j += iZza;
        g64Var.b();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void d(zzcn zzcnVar) {
        boolean z;
        if (zzc()) {
            zzcl zzclVar = this.e;
            this.g = zzclVar;
            zzcl zzclVar2 = this.f;
            this.h = zzclVar2;
            if (this.i) {
                int i = zzclVar.a;
                int i2 = zzclVar.b;
                float f = this.c;
                float f2 = this.d;
                int i3 = zzclVar2.a;
                if (zzclVar.c == 4) {
                    z = true;
                } else {
                    z = false;
                }
                this.j = new g64(i, i2, f, f2, i3, z);
            } else {
                g64 g64Var = this.j;
                if (g64Var != null) {
                    g64Var.j = 0;
                    g64Var.k = 0;
                    g64Var.l = 0;
                    g64Var.m = 0;
                    g64Var.n = 0;
                    g64Var.o = 0;
                    g64Var.p = 0;
                    g64Var.q = 0.0d;
                    g64Var.i.zzg();
                }
            }
        }
        this.l = zzcp.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
