package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabv;
import com.google.android.gms.internal.ads.zzacg;
import com.google.android.gms.internal.ads.zzacl;
import com.google.android.gms.internal.ads.zzaco;
import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzajv;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfj;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzmi;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzus;
import com.google.android.gms.internal.ads.zzux;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxq;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzze;
import com.google.android.gms.internal.ads.zzzk;
import com.google.android.gms.internal.ads.zzzl;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yc5 implements zzxr, zzagr, zzacg, zzacl, zzzk {
    public static final Map I;
    public static final zzv J;
    public xw1 A;
    public zzahr B;
    public long C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public final Uri a;
    public final zzhw b;
    public final zzux c;
    public final zzyd d;
    public final zzus e;
    public final zzze f;
    public final zzabv g;
    public final long h;
    public final long i;
    public final zzaco j = new zzaco();
    public final zzyn k;
    public final zzdt l;
    public final rc5 m;
    public final rc5 n;
    public final Handler o;
    public final ArrayList p;
    public final qc5 q;
    public zzxq r;
    public zzajv s;
    public oc5[] t;
    public zzzl[] u;
    public uc5[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // com.google.android.gms.internal.ads.zzzo
    public final void a(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long r(boolean z) {
        zzzl zzzlVar;
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzzl[] zzzlVarArr = this.u;
            if (i >= zzzlVarArr.length) {
                return jMax;
            }
            if (z) {
                zzzlVar = zzzlVarArr[i];
                synchronized (zzzlVar) {
                    jMax = Math.max(jMax, zzzlVar.v);
                }
            } else {
                xw1 xw1Var = this.A;
                xw1Var.getClass();
                if (((boolean[]) xw1Var.e)[i]) {
                    zzzlVar = zzzlVarArr[i];
                    synchronized (zzzlVar) {
                    }
                    jMax = Math.max(jMax, zzzlVar.v);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void zzw() {
        this.w = true;
        this.o.post(this.m);
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        I = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.a = "icy";
        zztVar.e("application/x-icy");
        J = new zzv(zztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final zzaia b(int i, int i2) {
        return n(new uc5(i, false));
    }

    /* JADX WARN: Code duplicated, block: B:119:0x022c  */
    /* JADX WARN: Code duplicated, block: B:128:0x024a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0269  */
    /* JADX WARN: Code duplicated, block: B:144:0x0276  */
    /* JADX WARN: Code duplicated, block: B:148:0x0282  */
    /* JADX WARN: Code duplicated, block: B:150:0x0288  */
    /* JADX WARN: Code duplicated, block: B:152:0x0292 A[LOOP:9: B:151:0x0290->B:152:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x029b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a1 A[LOOP:10: B:154:0x029f->B:155:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:189:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x027e A[EDGE_INSN: B:196:0x027e->B:146:0x027e BREAK  A[LOOP:8: B:140:0x0264->B:145:0x027b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x027b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x0288, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x029b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.google.android.gms.internal.ads.zzxr
    public final long d(zzabk[] zzabkVarArr, boolean[] zArr, zzzm[] zzzmVarArr, boolean[] zArr2, long j) throws Throwable {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i;
        boolean z4;
        int length;
        boolean[] zArr3;
        int i2;
        int i3;
        oc5[] oc5VarArr;
        int i4;
        ?? r4;
        int i5;
        zzaco zzacoVar;
        int i6;
        int i7;
        oc5 oc5Var;
        boolean z5;
        boolean z6;
        boolean z7;
        zzabk zzabkVar;
        boolean z8;
        Object obj;
        Object obj2;
        zzabk[] zzabkVarArr2 = zzabkVarArr;
        s();
        xw1 xw1Var = this.A;
        zzzx zzzxVar = (zzzx) xw1Var.c;
        int i8 = zzzxVar.a;
        w wVar = zzzxVar.b;
        boolean[] zArr4 = (boolean[]) xw1Var.e;
        int i9 = this.F;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= zzabkVarArr2.length) {
                z = false;
                break;
            }
            zzabk zzabkVar2 = zzabkVarArr2[i10];
            if (zzabkVar2 != null) {
                int iIndexOf = wVar.indexOf(zzabkVar2.zza());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                if (Objects.equals(zzzxVar.a(iIndexOf).d[0].o, "application/x-itut-t35")) {
                    z = true;
                    break;
                }
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = zzabkVarArr2.length;
            z2 = z9;
            arrayList = this.p;
            if (i11 >= length2) {
                break;
            }
            ?? r14 = zzzmVarArr[i11];
            if (r14 != 0) {
                if (zzabkVarArr2[i11] == null || !zArr[i11]) {
                    obj2 = null;
                } else if (z) {
                    obj2 = null;
                    if (r14 instanceof jc5) {
                    }
                }
                if (r14 instanceof jc5) {
                    jc5 jc5Var = (jc5) r14;
                    arrayList.remove(jc5Var);
                    int i12 = jc5Var.a.a;
                    zzgvz.f(zArr4[i12]);
                    this.F--;
                    zArr4[i12] = z2;
                    int i13 = jc5Var.b.a;
                    zzgvz.f(zArr4[i13]);
                    this.F--;
                    zArr4[i13] = z2;
                } else {
                    int i14 = ((tc5) r14).a;
                    zzgvz.f(zArr4[i14]);
                    this.F--;
                    zArr4[i14] = z2;
                }
                zzzmVarArr[i11] = obj2;
            }
            i11++;
            z9 = z2;
        }
        qc5 qc5Var = this.q;
        boolean z10 = (!qc5Var.g ? !(j == 0 || this.z) : i9 == 0) ? z2 : true;
        boolean z11 = z2;
        boolean z12 = z11;
        ?? r15 = z11;
        while (r15 < zzabkVarArr2.length) {
            if (zzzmVarArr[r15] != 0 || (zzabkVar = zzabkVarArr2[r15]) == null) {
                z6 = z;
                z7 = z10;
            } else {
                z6 = z;
                zzgvz.f(zzabkVar.zze() == 1 ? true : z2);
                zzgvz.f(zzabkVar.zzf(z2 ? 1 : 0) == 0);
                int iIndexOf2 = wVar.indexOf(zzabkVar.zza());
                if (iIndexOf2 < 0) {
                    iIndexOf2 = -1;
                }
                zzgvz.f(!zArr4[iIndexOf2]);
                this.F++;
                zArr4[iIndexOf2] = true;
                boolean z13 = (zzabkVar.zzc().u ? 1 : 0) | (z12 ? 1 : 0);
                tc5 tc5Var = new tc5(this, iIndexOf2, zzabkVar.zzc().u);
                int i15 = iIndexOf2;
                if (Build.VERSION.SDK_INT < 37 || z6 || !zzas.b(zzabkVar.zzc().o)) {
                    z8 = z13;
                    obj = tc5Var;
                    break;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= i8) {
                        z13 = z13;
                        z8 = z13;
                        obj = tc5Var;
                        break;
                    }
                    zzv zzvVar = zzzxVar.a(i16).d[0];
                    byte[] bArr = zzdr.a;
                    zzabk zzabkVar3 = zzabkVar;
                    if (Objects.equals(zzvVar.o, "application/x-itut-t35")) {
                        z13 = z13;
                        Iterator it = zzvVar.r.iterator();
                        z13 = z13;
                        while (it.hasNext()) {
                            byte[] bArr2 = (byte[]) it.next();
                            Iterator it2 = it;
                            int length3 = bArr2.length;
                            byte[] bArr3 = zzdr.e;
                            boolean z14 = z13;
                            int length4 = bArr3.length;
                            int i17 = 5;
                            if (length3 >= 5) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= i17) {
                                        zzgvz.f(!zArr4[i16]);
                                        this.F++;
                                        zArr4[i16] = true;
                                        jc5 jc5Var2 = new jc5(tc5Var, new tc5(this, i16, false), zzabkVar3.zzc());
                                        arrayList.add(jc5Var2);
                                        obj = jc5Var2;
                                        z8 = z14;
                                        break;
                                    }
                                    int i19 = i18;
                                    if (bArr2[i18] != bArr3[i19]) {
                                        break;
                                    }
                                    i18 = i19 + 1;
                                    i17 = 5;
                                }
                            }
                            it = it2;
                            z13 = z14;
                        }
                    }
                    z13 = z13;
                    i16++;
                    zzabkVar = zzabkVar3;
                    z13 = z13;
                }
                zzzmVarArr[r15] = obj;
                zArr2[r15] = true;
                if (this.t[i15].d.get()) {
                    z7 = z10 | qc5Var.g;
                } else if (z10) {
                    z7 = z10;
                } else {
                    zzzl zzzlVar = this.u[i15];
                    z7 = (zzzlVar.p + zzzlVar.r == 0 || zzzlVar.p(j, true)) ? false : true;
                }
                z12 = z8;
            }
            z10 = z7;
            z = z6;
            wVar = wVar;
            z2 = false;
            zzabkVarArr2 = zzabkVarArr;
            r15++;
            z12 = z12;
        }
        if (this.F == 0) {
            qc5Var.e = false;
            qc5Var.f = false;
            int i20 = qc5Var.a;
            if (i20 == 2 || i20 == 3) {
                qc5Var.a = 3;
            } else {
                z3 = true;
                qc5Var.a = 1;
            }
            qc5Var.g = z3;
            i = 0;
            while (true) {
                if (i < i8) {
                    z4 = false;
                    break;
                }
                if (!zArr4[i] && ((boolean[]) this.A.d)[i]) {
                    z4 = true;
                    break;
                }
                i++;
            }
            this.A.a = z4;
            length = zArr4.length;
            zArr3 = new boolean[length];
            for (i2 = 0; i2 < length; i2++) {
                int i21 = zzzxVar.a(i2).c;
                zArr3[i2] = (i21 == 2 && i21 != 4) || zArr4[i2];
            }
            i3 = 0;
            while (true) {
                oc5VarArr = this.t;
                if (i3 < oc5VarArr.length) {
                    break;
                }
                oc5Var = oc5VarArr[i3];
                z5 = zArr3[i3];
                oc5Var.d.set(!z5);
                if (!z5) {
                    oc5Var.b.a();
                }
                i3++;
            }
            if (this.F == 0) {
                i5 = qc5Var.a;
                zzacoVar = this.j;
                if (i5 != 3) {
                    for (zzzl zzzlVar2 : this.u) {
                        zzzlVar2.a();
                    }
                    gm3 gm3Var = zzacoVar.b;
                    gm3Var.getClass();
                    gm3Var.a(false);
                    return j;
                }
                zzacoVar.c = null;
                for (zzzl zzzlVar3 : this.u) {
                    zzzlVar3.m(false);
                }
            } else if (z10) {
                long jH = h(j);
                for (i4 = 0; i4 < zzzmVarArr.length; i4++) {
                    r4 = zzzmVarArr[i4];
                    if (r4 != 0) {
                        zArr2[i4] = true;
                        if (r4 instanceof jc5) {
                            jc5 jc5Var3 = (jc5) r4;
                            jc5Var3.e.clear();
                            jc5Var3.g = null;
                            jc5Var3.h = -9223372036854775807L;
                            jc5Var3.i = false;
                            jc5Var3.j = false;
                            jc5Var3.d.c();
                        }
                    }
                }
                return jH;
            }
            return j;
        }
        if (qc5Var.f || !qc5Var.g) {
            qc5Var.f = z12;
        }
        z3 = true;
        qc5Var.g = z3;
        i = 0;
        while (true) {
            if (i < i8) {
                z4 = false;
                break;
            }
            if (!zArr4[i]) {
            }
            i++;
        }
        this.A.a = z4;
        length = zArr4.length;
        zArr3 = new boolean[length];
        while (i2 < length) {
            int i22 = zzzxVar.a(i2).c;
            zArr3[i2] = (i22 == 2 && i22 != 4) || zArr4[i2];
        }
        i3 = 0;
        while (true) {
            oc5VarArr = this.t;
            if (i3 < oc5VarArr.length) {
                break;
                break;
            }
            oc5Var = oc5VarArr[i3];
            z5 = zArr3[i3];
            oc5Var.d.set(!z5);
            if (!z5) {
                oc5Var.b.a();
            }
            i3++;
        }
        if (this.F == 0) {
            i5 = qc5Var.a;
            zzacoVar = this.j;
            if (i5 != 3) {
                while (i6 < r1) {
                    zzzlVar2.a();
                }
                gm3 gm3Var2 = zzacoVar.b;
                gm3Var2.getClass();
                gm3Var2.a(false);
                return j;
            }
            zzacoVar.c = null;
            while (i7 < r1) {
                zzzlVar3.m(false);
            }
        } else if (z10) {
            long jH2 = h(j);
            while (i4 < zzzmVarArr.length) {
                r4 = zzzmVarArr[i4];
                if (r4 != 0) {
                    zArr2[i4] = true;
                    if (r4 instanceof jc5) {
                        jc5 jc5Var4 = (jc5) r4;
                        jc5Var4.e.clear();
                        jc5Var4.g = null;
                        jc5Var4.h = -9223372036854775807L;
                        jc5Var4.i = false;
                        jc5Var4.j = false;
                        jc5Var4.d.c();
                    }
                }
            }
            return jH2;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean e(zzmi zzmiVar) {
        boolean z = this.x;
        int i = this.F;
        int i2 = this.q.a;
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        if (z && i <= 0) {
            return false;
        }
        boolean zA = this.l.a();
        if (this.j.b != null) {
            return zA;
        }
        p();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void f(zzxq zzxqVar, long j) {
        this.r = zzxqVar;
        this.l.a();
        p();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzxr
    public final void g(long j, boolean z) {
        long j2;
        long jK;
        int i;
        if (this.z) {
            return;
        }
        s();
        if (this.q.b()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.e;
        int length = this.u.length;
        int i2 = 0;
        while (i2 < length) {
            zzzl zzzlVar = this.u[i2];
            boolean z2 = zArr[i2];
            ad5 ad5Var = zzzlVar.a;
            synchronized (zzzlVar) {
                try {
                    int i3 = zzzlVar.o;
                    if (i3 != 0) {
                        long[] jArr = zzzlVar.m;
                        int i4 = zzzlVar.q;
                        if (j < jArr[i4]) {
                            j2 = j;
                        } else {
                            j2 = j;
                            int iJ = zzzlVar.j(i4, (!z2 || (i = zzzlVar.r) == i3) ? i3 : i + 1, j2, false);
                            jK = iJ != -1 ? zzzlVar.k(iJ) : -1L;
                        }
                    } else {
                        j2 = j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ad5Var.a(jK);
            i2++;
            j = j2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxr
    public final long h(long j) throws Throwable {
        boolean z;
        boolean z2;
        boolean zP;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            jc5 jc5Var = (jc5) obj;
            jc5Var.e.clear();
            jc5Var.g = null;
            jc5Var.h = -9223372036854775807L;
            jc5Var.i = false;
            jc5Var.j = false;
            jc5Var.d.c();
        }
        s();
        boolean[] zArr = (boolean[]) this.A.d;
        long j2 = true != this.B.zzb() ? 0L : j;
        qc5 qc5Var = this.q;
        boolean zB = qc5Var.b();
        boolean z3 = qc5Var.b == j2;
        int i6 = this.E;
        if (qc5Var.b() || i6 == 7 || (!qc5Var.a() && (i3 = qc5Var.a) != 2 && i3 != 5)) {
            z = false;
            z2 = 0;
            break;
        }
        int length = this.u.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z2 = i4;
                z = true;
                break;
            }
            zzzl zzzlVar = this.u[i7];
            if (!this.t[i7].d.get()) {
                int i8 = zzzlVar.p;
                if (zzzlVar.r + i8 != 0 || !z3) {
                    if (this.z) {
                        synchronized (zzzlVar) {
                            synchronized (zzzlVar) {
                                zzzlVar.r = i4;
                                ad5 ad5Var = zzzlVar.a;
                                ad5Var.d = ad5Var.c;
                            }
                        }
                        int i9 = zzzlVar.p;
                        if (i8 < i9 || i8 > zzzlVar.o + i9 || (((i = zzzlVar.w) != -1 && i8 >= i) || ((i2 = zzzlVar.x) != -1 && i8 >= i2))) {
                            zP = false;
                        } else {
                            zzzlVar.s = Long.MIN_VALUE;
                            zzzlVar.r = i8 - i9;
                            zP = true;
                        }
                    } else {
                        zP = zzzlVar.p(j2, qc5Var.a());
                    }
                    if (!zP && (zArr[i7] || !this.y)) {
                        z = false;
                        z2 = 0;
                        break;
                    }
                }
            }
            i7++;
            i4 = 0;
        }
        qc5Var.e = z2;
        qc5Var.b = j2;
        if (qc5Var.b()) {
            qc5Var.c = j2;
        } else if (!z) {
            qc5Var.c = j2;
            qc5Var.f = z2;
            int i10 = qc5Var.a;
            qc5Var.a = (i10 == 2 || i10 == 3) ? 3 : 1;
        }
        if (!z && !zB) {
            if (qc5Var.a == 3) {
                for (zzzl zzzlVar2 : this.u) {
                    zzzlVar2.a();
                }
                gm3 gm3Var = this.j.b;
                gm3Var.getClass();
                gm3Var.a(false);
                return j2;
            }
            this.j.c = null;
            for (zzzl zzzlVar3 : this.u) {
                zzzlVar3.m(false);
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void j(zzahr zzahrVar) {
        this.o.post(new fj4(17, this, zzahrVar));
    }

    public final void k(pc5 pc5Var, long j) {
        if (this.C == -9223372036854775807L && this.B != null) {
            long jR = r(true);
            long j2 = jR == Long.MIN_VALUE ? 0L : jR + 10000;
            this.C = j2;
            this.f.q(j2, this.B, this.D);
        }
        pc5Var.getClass();
        new zzxj(pc5Var.j);
        zzxk zzxkVar = new zzxk();
        zzxp zzxpVar = new zzxp(-1, null, zzfq.t(pc5Var.i), zzfq.t(this.C));
        zzyd zzydVar = this.d;
        zzydVar.a(new yb5(zzydVar, zzxkVar, zzxpVar, 0));
        qc5 qc5Var = this.q;
        qc5Var.c = -9223372036854775807L;
        qc5Var.a = 4;
        zzxq zzxqVar = this.r;
        zzxqVar.getClass();
        zzxqVar.j(this);
    }

    public final zzaia n(uc5 uc5Var) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (uc5Var.equals(this.v[i])) {
                return this.u[i];
            }
        }
        if (this.w) {
            int i2 = uc5Var.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzeh.c("ProgressiveMediaPeriod", sb.toString());
            return new zzagl();
        }
        zzzl zzzlVar = new zzzl(this.g, this.c, this.e);
        oc5 oc5Var = new oc5(zzzlVar);
        zzzlVar.e = this;
        int i3 = length + 1;
        uc5[] uc5VarArr = (uc5[]) Arrays.copyOf(this.v, i3);
        uc5VarArr[length] = uc5Var;
        String str = zzfq.a;
        this.v = uc5VarArr;
        zzzl[] zzzlVarArr = (zzzl[]) Arrays.copyOf(this.u, i3);
        zzzlVarArr[length] = zzzlVar;
        this.u = zzzlVarArr;
        oc5[] oc5VarArr = (oc5[]) Arrays.copyOf(this.t, i3);
        oc5VarArr[length] = oc5Var;
        this.t = oc5VarArr;
        return oc5Var;
    }

    public final void o() {
        int i;
        char c;
        if (this.H || this.x || !this.w || this.B == null) {
            return;
        }
        for (zzzl zzzlVar : this.u) {
            if (zzzlVar.n() == null) {
                return;
            }
        }
        zzdt zzdtVar = this.l;
        synchronized (zzdtVar) {
            zzdtVar.a = false;
        }
        int length = this.u.length;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            char c2 = 1;
            if (i3 >= length) {
                break;
            }
            zzv zzvVarN = this.u[i3].n();
            zzvVarN.getClass();
            int iF = zzas.f(zzvVarN.o);
            if (iF == 1) {
                c = 3;
            } else if (iF == 2) {
                c = 4;
            } else if (iF != 3) {
                c = iF != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i2 == 1) {
                c2 = 3;
            } else if (i2 == 2) {
                c2 = 4;
            } else if (i2 != 3) {
                c2 = i2 != 4 ? (char) 0 : (char) 2;
            }
            if (c > c2) {
                i2 = iF;
            }
            if (c > c2) {
                i4 = i3;
            }
            i3++;
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv zzvVarN2 = this.u[i5].n();
            zzvVarN2.getClass();
            String str = zzvVarN2.o;
            boolean zA = zzas.a(str);
            boolean z = zA || zzas.b(str);
            zArr[i5] = z;
            this.y = z | this.y;
            this.z = this.i != -9223372036854775807L && length == 1 && zzas.c(str);
            zzajv zzajvVar = this.s;
            if (zzajvVar != null) {
                if (zA || this.v[i5].b) {
                    zzap zzapVar = zzvVarN2.l;
                    zzap zzapVar2 = zzapVar == null ? new zzap(zzajvVar) : zzapVar.b(zzajvVar);
                    zzt zztVar = new zzt(zzvVarN2);
                    zztVar.k = zzapVar2;
                    zzvVarN2 = new zzv(zztVar);
                }
                if (zA && zzvVarN2.h == -1 && zzvVarN2.i == -1 && (i = zzajvVar.a) != -1) {
                    zzt zztVar2 = new zzt(zzvVarN2);
                    zztVar2.h = i;
                    zzvVarN2 = new zzv(zztVar2);
                }
            }
            int iC = this.c.c(zzvVarN2);
            zzt zztVar3 = new zzt(zzvVarN2);
            zztVar3.O = iC;
            zzv zzvVar = new zzv(zztVar3);
            if (i5 != i4) {
                zzt zztVar4 = new zzt(zzvVar);
                zztVar4.l = Integer.toString(i4);
                zzvVar = new zzv(zztVar4);
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzvVar);
            zzzl zzzlVar2 = this.u[i5];
            synchronized (zzzlVar2) {
                if (zzzlVar2.t != Long.MIN_VALUE) {
                    zzzlVar2.t = Long.MIN_VALUE;
                    zzzlVar2.w = -1;
                    zzzlVar2.x = -1;
                }
            }
        }
        this.A = new xw1(new zzzx(zzbgVarArr), zArr);
        if (this.z && this.C == -9223372036854775807L) {
            this.C = this.i;
            this.B = new mc5(this, this.B);
        }
        this.f.q(this.C, this.B, this.D);
        this.x = true;
        zzxq zzxqVar = this.r;
        zzxqVar.getClass();
        zzxqVar.i(this);
    }

    public final void p() {
        int i;
        long j;
        qc5 qc5Var = this.q;
        boolean zB = qc5Var.b();
        long j2 = zB ? qc5Var.c : -9223372036854775807L;
        boolean z = this.x;
        long j3 = this.C;
        int iQ = q();
        if (!z || !qc5Var.b() || j3 == -9223372036854775807L || qc5Var.c <= j3) {
            qc5Var.d = iQ;
            qc5Var.c = -9223372036854775807L;
            i = 2;
        } else {
            qc5Var.c = -9223372036854775807L;
            i = 4;
        }
        qc5Var.a = i;
        if (qc5Var.a()) {
            return;
        }
        pc5 pc5Var = new pc5(this, this.a, this.b, this.k, this, this.l);
        if (this.x) {
            if (zB) {
                zzahr zzahrVar = this.B;
                zzahrVar.getClass();
                pc5Var.f.a = zzahrVar.a(j2).a.b;
                pc5Var.i = j2;
                pc5Var.h = true;
                pc5Var.l = false;
                for (zzzl zzzlVar : this.u) {
                    zzzlVar.s = j2;
                }
            } else {
                s();
                zzgvz.f(this.F > 0);
                long jMin = Long.MAX_VALUE;
                int i2 = 0;
                while (true) {
                    zzzl[] zzzlVarArr = this.u;
                    if (i2 >= zzzlVarArr.length) {
                        zzgvz.f(jMin != Long.MAX_VALUE);
                        break;
                    }
                    xw1 xw1Var = this.A;
                    if (((boolean[]) xw1Var.e)[i2] && (((boolean[]) xw1Var.d)[i2] || !xw1Var.a)) {
                        zzzl zzzlVar2 = zzzlVarArr[i2];
                        synchronized (zzzlVar2) {
                            j = zzzlVar2.v;
                        }
                        if (j == Long.MIN_VALUE) {
                            jMin = qc5Var.b;
                            break;
                        }
                        jMin = Math.min(jMin, j);
                    }
                    i2++;
                }
                zzahr zzahrVar2 = this.B;
                zzahrVar2.getClass();
                zzahs zzahsVar = zzahrVar2.a(jMin).a;
                long j4 = zzahsVar.b;
                long j5 = zzahsVar.a;
                pc5Var.f.a = j4;
                pc5Var.i = j5;
                pc5Var.h = true;
                pc5Var.l = false;
                for (zzzl zzzlVar3 : this.u) {
                    int i3 = zzzlVar3.o;
                    if (i3 > 0) {
                        zzzlVar3.z = false;
                        int i4 = i3 - 1;
                        zzzlVar3.F = zzzlVar3.m[zzzlVar3.l(i4)];
                        int i5 = 0;
                        while (i4 >= 0) {
                            if (Math.abs(zzzlVar3.m[zzzlVar3.l(i4)] - zzzlVar3.F) > 1000) {
                                break;
                            }
                            i5++;
                            i4--;
                        }
                        zzzlVar3.G = i5;
                        zzzlVar3.E = true;
                    } else {
                        zzzlVar3.E = false;
                        zzzlVar3.G = 0;
                    }
                }
            }
        }
        zzaco zzacoVar = this.j;
        zzacoVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        zzacoVar.c = null;
        gm3 gm3Var = new gm3(zzacoVar, looperMyLooper, pc5Var, this, SystemClock.elapsedRealtime());
        zzaco zzacoVar2 = gm3Var.h;
        zzgvz.f(zzacoVar2.b == null);
        zzacoVar2.b = gm3Var;
        gm3Var.c();
    }

    public final int q() {
        int i = 0;
        for (zzzl zzzlVar : this.u) {
            i += zzzlVar.p + zzzlVar.o;
        }
        return i;
    }

    public final void s() {
        zzgvz.f(this.x);
        this.A.getClass();
        this.B.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean zze() {
        boolean z;
        int i = this.q.a;
        if (i != 2 && i != 3) {
            return false;
        }
        zzdt zzdtVar = this.l;
        synchronized (zzdtVar) {
            z = zzdtVar.a;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzg() {
        for (zzzl zzzlVar : this.u) {
            zzzlVar.m(true);
            if (zzzlVar.g != null) {
                zzzlVar.g = null;
                zzzlVar.f = null;
            }
        }
        this.k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzm() throws IOException {
        IOException iOException;
        int i = this.E == 7 ? 6 : 3;
        zzaco zzacoVar = this.j;
        IOException iOException2 = zzacoVar.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        gm3 gm3Var = zzacoVar.b;
        if (gm3Var != null && (iOException = gm3Var.c) != null && gm3Var.d > i) {
            throw iOException;
        }
        if (this.q.a() && !this.x) {
            throw zzat.b("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzr() {
        this.q.h = true;
    }

    public yc5(Uri uri, zzhw zzhwVar, zzyn zzynVar, v95 v95Var, zzus zzusVar, zzyd zzydVar, zzze zzzeVar, zzabv zzabvVar, int i, long j) {
        this.a = uri;
        this.b = zzhwVar;
        this.c = v95Var;
        this.e = zzusVar;
        this.d = zzydVar;
        this.f = zzzeVar;
        this.g = zzabvVar;
        this.h = i;
        this.k = zzynVar;
        this.i = j;
        zzfj zzfjVar = zzdp.a;
        this.l = new zzdt();
        this.m = new rc5(this, 2);
        this.n = new rc5(this, 0);
        this.o = zzfq.p();
        this.v = new uc5[0];
        this.u = new zzzl[0];
        this.t = new oc5[0];
        this.p = new ArrayList();
        qc5 qc5Var = new qc5();
        qc5Var.a = 1;
        qc5Var.c = -9223372036854775807L;
        this.q = qc5Var;
        this.E = 1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxr
    public final long c(long j, zznq zznqVar) {
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        long j4;
        s();
        if (!this.B.zzb()) {
            return 0L;
        }
        zzahp zzahpVarA = this.B.a(j);
        zzahs zzahsVar = zzahpVarA.a;
        zzahs zzahsVar2 = zzahpVarA.b;
        long j5 = zznqVar.a;
        if (j5 == 0) {
            return j;
        }
        String str = zzfq.a;
        long j6 = j - j5;
        long j7 = j5 ^ j;
        boolean z4 = true;
        if ((j ^ j6) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (j7 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z | z2;
        long j8 = Long.MAX_VALUE;
        if (z5) {
            j2 = j6;
        } else {
            j2 = ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        long j9 = Long.MIN_VALUE;
        if (j2 == Long.MIN_VALUE) {
            if (j6 == Long.MIN_VALUE) {
                j6 = Long.MIN_VALUE;
                if (j2 == Long.MAX_VALUE) {
                    if (j6 != Long.MAX_VALUE) {
                        j2 = Long.MIN_VALUE;
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                }
            } else {
                j2 = Long.MIN_VALUE;
            }
        } else if (j2 == Long.MAX_VALUE) {
            if (j6 != Long.MAX_VALUE) {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = Long.MAX_VALUE;
            }
        }
        if (j == Long.MIN_VALUE) {
            if (j == Long.MIN_VALUE) {
            }
            j3 = zzahsVar.a;
            if (j2 > j3 && j3 <= j8) {
                z3 = true;
            } else {
                z3 = false;
            }
            j4 = zzahsVar2.a;
            if (j2 <= j4 || j4 > j8) {
                z4 = false;
            }
            if (!z3 && z4) {
                if (Math.abs(j3 - j) <= Math.abs(j4 - j)) {
                    return j3;
                }
                return j4;
            }
            if (!z3) {
                if (z4) {
                    return j4;
                }
                return j2;
            }
            return j3;
        }
        j9 = j;
        if (j == Long.MAX_VALUE) {
            int i = (j9 > Long.MAX_VALUE ? 1 : (j9 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j8 = j;
        }
        j3 = zzahsVar.a;
        if (j2 > j3) {
            z3 = false;
        } else {
            z3 = false;
        }
        j4 = zzahsVar2.a;
        if (j2 <= j4) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (!z3) {
        }
        if (!z3) {
            if (z4) {
                return j4;
            }
            return j2;
        }
        return j3;
    }

    public final void i(pc5 pc5Var, long j, boolean z) {
        pc5Var.getClass();
        new zzxj(pc5Var.j);
        zzxk zzxkVar = new zzxk();
        zzxp zzxpVar = new zzxp(-1, null, zzfq.t(pc5Var.i), zzfq.t(this.C));
        zzyd zzydVar = this.d;
        zzydVar.a(new yb5(zzydVar, zzxkVar, zzxpVar, 1));
        qc5 qc5Var = this.q;
        if (!z) {
            if (qc5Var.a == 3) {
                qc5Var.a = 1;
            }
        } else {
            qc5Var.getClass();
        }
        if (!z) {
            if (qc5Var.b()) {
                for (zzzl zzzlVar : this.u) {
                    zzzlVar.m(false);
                }
            }
            if (this.F > 0 && !qc5Var.a()) {
                zzxq zzxqVar = this.r;
                zzxqVar.getClass();
                zzxqVar.j(this);
            }
        }
    }

    public final void l(int i) {
        s();
        xw1 xw1Var = this.A;
        boolean[] zArr = (boolean[]) xw1Var.b;
        if (!zArr[i]) {
            zzv zzvVar = ((zzzx) xw1Var.c).a(i).d[0];
            zzxp zzxpVar = new zzxp(zzas.f(zzvVar.o), zzvVar, zzfq.t(this.q.b), -9223372036854775807L);
            zzyd zzydVar = this.d;
            zzydVar.a(new v35(9, zzydVar, zzxpVar));
            zArr[i] = true;
        }
    }

    public final void m(int i) {
        s();
        qc5 qc5Var = this.q;
        if (qc5Var.a == 5) {
            if ((this.y && !((boolean[]) this.A.d)[i]) || this.u[i].o(false)) {
                return;
            }
            qc5Var.c = 0L;
            qc5Var.e = true;
            qc5Var.b = 0L;
            qc5Var.d = 0;
            qc5Var.a = 1;
            for (zzzl zzzlVar : this.u) {
                zzzlVar.m(false);
            }
            zzxq zzxqVar = this.r;
            zzxqVar.getClass();
            zzxqVar.j(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzb() {
        long jR;
        boolean z;
        long j;
        s();
        qc5 qc5Var = this.q;
        if (qc5Var.a() || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (qc5Var.b()) {
            return qc5Var.c;
        }
        if (this.y) {
            int length = this.u.length;
            jR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                xw1 xw1Var = this.A;
                if (((boolean[]) xw1Var.d)[i] && ((boolean[]) xw1Var.e)[i]) {
                    zzzl zzzlVar = this.u[i];
                    synchronized (zzzlVar) {
                        z = zzzlVar.y;
                    }
                    if (z) {
                        continue;
                    } else {
                        zzzl zzzlVar2 = this.u[i];
                        synchronized (zzzlVar2) {
                            j = zzzlVar2.v;
                        }
                        jR = Math.min(jR, j);
                    }
                }
            }
        } else {
            jR = Long.MAX_VALUE;
        }
        if (jR == Long.MAX_VALUE) {
            jR = r(false);
        }
        if (jR == Long.MIN_VALUE) {
            return qc5Var.b;
        }
        return jR;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final zzzx zzn() {
        s();
        return (zzzx) this.A.c;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final long zzs() {
        int iQ = q();
        qc5 qc5Var = this.q;
        if (!qc5Var.h && qc5Var.f) {
            qc5Var.f = false;
        } else if (qc5Var.e) {
            if (qc5Var.a() || iQ > qc5Var.d) {
                qc5Var.e = false;
            } else {
                return -9223372036854775807L;
            }
        } else {
            return -9223372036854775807L;
        }
        return qc5Var.b;
    }
}
