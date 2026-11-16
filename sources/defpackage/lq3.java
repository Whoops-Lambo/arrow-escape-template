package defpackage;

import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lq3 {
    public final kq3 a;
    public final zzaia b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public lq3(int i, kq3 kq3Var, zzaia zzaiaVar, boolean z) {
        int i2 = kq3Var.d;
        this.a = kq3Var;
        this.f = z;
        int iA = kq3Var.a();
        boolean z2 = true;
        if (iA != 1) {
            if (iA == 2) {
                iA = 2;
            } else {
                z2 = false;
            }
        }
        zzgvz.a(z2);
        int i3 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        this.e = zzfq.w(i2, ((long) kq3Var.b) * 1000000, kq3Var.c, RoundingMode.DOWN);
        this.b = zzaiaVar;
        this.d = iA == 2 ? 1650720768 | i3 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final zzahp a(long j) {
        if (this.l == 0) {
            zzahs zzahsVar = new zzahs(0L, this.m);
            return new zzahp(zzahsVar, zzahsVar);
        }
        int i = (int) (j / (this.e / ((long) this.g)));
        int iR = zzfq.r(this.o, i, true, true);
        if (this.o[iR] == i) {
            zzahs zzahsVarB = b(iR);
            return new zzahp(zzahsVarB, zzahsVarB);
        }
        zzahs zzahsVarB2 = b(iR);
        int i2 = iR + 1;
        return i2 < this.n.length ? new zzahp(zzahsVarB2, b(i2)) : new zzahp(zzahsVarB2, zzahsVarB2);
    }

    public final zzahs b(int i) {
        return new zzahs((this.e / ((long) this.g)) * ((long) this.o[i]), this.n[i]);
    }
}
