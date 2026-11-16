package com.google.android.gms.internal.measurement;

import defpackage.fo3;
import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzii extends zzadu implements zzafd {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb;
    private zzaee zze;
    private zzaef zzf;
    private zzaef zzg;

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.u(zzii.class, zziiVar);
    }

    public static zzih I() {
        return (zzih) zzh.q();
    }

    public static zzii J() {
        return zzh;
    }

    public final int A() {
        return this.zzb.size();
    }

    public final List B() {
        return this.zze;
    }

    public final int C() {
        return this.zze.size();
    }

    public final zzaef D() {
        return this.zzf;
    }

    public final int E() {
        return this.zzf.size();
    }

    public final zzaef F() {
        return this.zzg;
    }

    public final int H() {
        return this.zzg.size();
    }

    public final void K(Iterable iterable) {
        zzaee zzaeeVar = this.zzb;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzb = zzaeeVar.zzg(size + size);
        }
        zzacb.k(iterable, this.zzb);
    }

    public final void L() {
        this.zzb = fo3.e;
    }

    public final void M(List list) {
        zzaee zzaeeVar = this.zze;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zze = zzaeeVar.zzg(size + size);
        }
        zzacb.k(list, this.zze);
    }

    public final void N() {
        this.zze = fo3.e;
    }

    public final void O(ArrayList arrayList) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = rl3.j(zzaefVar);
        }
        zzacb.k(arrayList, this.zzf);
    }

    public final void P() {
        this.zzf = to3.e;
    }

    public final void Q(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = rl3.j(zzaefVar);
        }
        zzacb.k(iterable, this.zzg);
    }

    public final void R() {
        this.zzg = to3.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i2 == 3) {
            return new zzii();
        }
        if (i2 == 4) {
            return new zzih(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzii.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final List z() {
        return this.zzb;
    }

    private zzii() {
        fo3 fo3Var = fo3.e;
        this.zzb = fo3Var;
        this.zze = fo3Var;
        to3 to3Var = to3.e;
        this.zzf = to3Var;
        this.zzg = to3Var;
    }
}
