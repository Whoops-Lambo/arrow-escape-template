package defpackage;

import com.google.android.gms.internal.ads.zzaco;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zzuq;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzzl;
import com.google.android.gms.internal.ads.zzzm;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tc5 implements zzzm {
    public final int a;
    public final boolean b;
    public final /* synthetic */ yc5 c;

    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    @Override // com.google.android.gms.internal.ads.zzzm
    public final int a(long j) {
        boolean z;
        int iJ;
        yc5 yc5Var = this.c;
        int i = this.a;
        qc5 qc5Var = yc5Var.q;
        if (qc5Var.c()) {
            return 0;
        }
        yc5Var.l(i);
        zzzl zzzlVar = yc5Var.u[i];
        boolean zA = qc5Var.a();
        synchronized (zzzlVar) {
            int i2 = zzzlVar.r;
            int iL = zzzlVar.l(i2);
            int i3 = zzzlVar.r;
            int i4 = zzzlVar.o;
            z = true;
            if ((i3 != i4) && j >= zzzlVar.m[iL]) {
                if (j <= zzzlVar.v || !zA) {
                    iJ = zzzlVar.j(iL, i4 - i2, j, true);
                    if (iJ == -1) {
                    }
                } else {
                    iJ = i4 - i2;
                }
            }
            iJ = 0;
        }
        synchronized (zzzlVar) {
            if (iJ >= 0) {
                try {
                    if (zzzlVar.r + iJ > zzzlVar.o) {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z = false;
            }
            zzgvz.a(z);
            zzzlVar.r += iJ;
        }
        if (iJ != 0) {
            return iJ;
        }
        yc5Var.m(i);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.zzzm
    public final int b(zzme zzmeVar, zzjc zzjcVar, int i) {
        boolean z;
        boolean z2;
        int i2;
        zzv zzvVar;
        int i3;
        boolean z3;
        int i4;
        yc5 yc5Var = this.c;
        int i5 = this.a;
        qc5 qc5Var = yc5Var.q;
        if (qc5Var.c()) {
            return -3;
        }
        yc5Var.l(i5);
        zzzl zzzlVar = yc5Var.u[i5];
        boolean zA = qc5Var.a();
        zzzlVar.getClass();
        boolean z4 = (i & 2) != 0;
        ip ipVar = zzzlVar.b;
        synchronized (zzzlVar) {
            try {
                int i6 = zzzlVar.p;
                int i7 = zzzlVar.r;
                int i8 = i6 + i7;
                int i9 = zzzlVar.w;
                if (i9 == -1 || i8 < i9) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                    z2 = true;
                }
                i2 = -4;
                if (i7 != zzzlVar.o ? z : false) {
                    if (((i9 != -1 || (i4 = zzzlVar.x) == -1 || i6 + i7 < i4) ? false : z) || z2) {
                        if (!zA) {
                            zzvVar = zzzlVar.B;
                            if (zzvVar != null) {
                            }
                            i3 = -3;
                        }
                        zzjcVar.a = 4;
                        zzjcVar.e = Long.MIN_VALUE;
                        i3 = -4;
                    } else {
                        zzv zzvVar2 = ((dd5) zzzlVar.c.i(i8)).a;
                        if (!z4 && zzvVar2 == zzzlVar.f) {
                            int iL = zzzlVar.l(zzzlVar.r);
                            if (zzzlVar.g != null) {
                                int i10 = zzzlVar.l[iL];
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if (z3) {
                                int i11 = zzzlVar.l[iL];
                                zzjcVar.a = i11;
                                if (zzzlVar.r == zzzlVar.o - 1 && (zA || zzzlVar.y)) {
                                    zzjcVar.a = 536870912 | i11;
                                }
                                zzjcVar.e = zzzlVar.m[iL];
                                ipVar.c = zzzlVar.k[iL];
                                ipVar.b = zzzlVar.j[iL];
                                ipVar.d = zzzlVar.n[iL];
                                i3 = -4;
                            } else {
                                i3 = -3;
                            }
                        }
                        zzzlVar.i(zzvVar2, zzmeVar);
                        i3 = -5;
                    }
                } else {
                    if (!zA && !zzzlVar.y && !z2) {
                        zzvVar = zzzlVar.B;
                        if (zzvVar != null || (!z4 && zzvVar == zzzlVar.f)) {
                            i3 = -3;
                        } else {
                            zzzlVar.i(zzvVar, zzmeVar);
                            i3 = -5;
                        }
                    }
                    zzjcVar.a = 4;
                    zzjcVar.e = Long.MIN_VALUE;
                    i3 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != -4) {
            i2 = i3;
        } else if (!zzjcVar.b(4)) {
            int i12 = i & 1;
            if ((i & 4) == 0) {
                ad5 ad5Var = zzzlVar.a;
                if (i12 != 0) {
                    ad5.c(ad5Var.d, zzjcVar, ipVar, ad5Var.b);
                } else {
                    ad5Var.d = ad5.c(ad5Var.d, zzjcVar, ipVar, ad5Var.b);
                    zzzlVar.r++;
                }
            } else if (i12 == 0) {
                zzzlVar.r++;
            }
        }
        if (i2 == -3) {
            yc5Var.m(i5);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final boolean zzc() {
        yc5 yc5Var = this.c;
        qc5 qc5Var = yc5Var.q;
        return !qc5Var.c() && yc5Var.u[this.a].o(qc5Var.a());
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzd() throws IOException {
        IOException iOException;
        int i = this.a;
        yc5 yc5Var = this.c;
        zzuq zzuqVar = yc5Var.u[i].g;
        if (zzuqVar != null) {
            throw zzuqVar.zza();
        }
        int i2 = yc5Var.E == 7 ? 6 : 3;
        zzaco zzacoVar = yc5Var.j;
        IOException iOException2 = zzacoVar.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        gm3 gm3Var = zzacoVar.b;
        if (gm3Var != null && (iOException = gm3Var.c) != null && gm3Var.d > i2) {
            throw iOException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zzg() {
        return this.b ? 4 : 0;
    }

    public /* synthetic */ tc5(yc5 yc5Var, int i, boolean z) {
        this.c = yc5Var;
        this.a = i;
        this.b = z;
    }
}
