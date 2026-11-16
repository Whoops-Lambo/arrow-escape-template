package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqk implements zzago {
    public final zzaql a;
    public final zzey b;
    public final zzey c;
    public final zzet d;
    public zzagr e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        this.h = false;
        this.a.zza();
        this.f = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) throws EOFException, InterruptedIOException {
        zzey zzeyVar;
        zzagf zzagfVar;
        int i = 0;
        while (true) {
            zzeyVar = this.c;
            zzagfVar = (zzagf) zzagpVar;
            zzagfVar.d(zzeyVar.a, 0, 10, false);
            zzeyVar.E(0);
            if (zzeyVar.O() != 4801587) {
                break;
            }
            zzeyVar.G(3);
            int iG = zzeyVar.g();
            i += iG + 10;
            zzagfVar.k(iG, false);
        }
        zzagfVar.f = 0;
        zzagfVar.k(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzagfVar.d(zzeyVar.a, 0, 2, false);
            zzeyVar.E(0);
            if ((zzeyVar.L() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzagfVar.d(zzeyVar.a, 0, 4, false);
                zzet zzetVar = this.d;
                zzetVar.d(14);
                int iH = zzetVar.h(13);
                if (iH <= 6) {
                    i4++;
                    zzagfVar.f = 0;
                    zzagfVar.k(i4, false);
                } else {
                    zzagfVar.k(iH - 6, false);
                    i3 += iH;
                }
            } else {
                i4++;
                zzagfVar.f = 0;
                zzagfVar.k(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) throws zzat {
        this.e.getClass();
        zzey zzeyVar = this.b;
        int i = zzagpVar.i(zzeyVar.a, 0, 2048);
        if (!this.i) {
            this.e.j(new zzahq(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (i == -1) {
            return -1;
        }
        zzeyVar.E(0);
        zzeyVar.C(i);
        boolean z = this.h;
        zzaql zzaqlVar = this.a;
        if (!z) {
            zzaqlVar.u = this.f;
            this.h = true;
        }
        zzaqlVar.b(zzeyVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.e = zzagrVar;
        this.a.c(zzagrVar, new zzasd(Integer.MIN_VALUE, 0, 1));
        zzagrVar.zzw();
    }

    public zzaqk(int i) {
        this.a = new zzaql(true, null, 0, "audio/mp4a-latm");
        this.b = new zzey(2048);
        this.g = -1L;
        zzey zzeyVar = new zzey(10);
        this.c = zzeyVar;
        byte[] bArr = zzeyVar.a;
        this.d = new zzet(bArr, bArr.length);
    }

    public zzaqk() {
        throw null;
    }
}
