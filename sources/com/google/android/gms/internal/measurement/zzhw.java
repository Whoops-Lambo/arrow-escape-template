package com.google.android.gms.internal.measurement;

import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhw extends zzadu implements zzafd {
    private static final zzhw zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzaef zzj = to3.e;

    static {
        zzhw zzhwVar = new zzhw();
        zzk = zzhwVar;
        zzadu.u(zzhw.class, zzhwVar);
    }

    public static zzhv M() {
        return (zzhv) zzk.q();
    }

    public final String A() {
        return this.zze;
    }

    public final boolean B() {
        return (this.zzb & 2) != 0;
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzb & 4) != 0;
    }

    public final long E() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zzb & 8) != 0;
    }

    public final float H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 16) != 0;
    }

    public final double J() {
        return this.zzi;
    }

    public final zzaef K() {
        return this.zzj;
    }

    public final int L() {
        return this.zzj.size();
    }

    public final /* synthetic */ void P() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void S(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void U(zzhw zzhwVar) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = rl3.j(zzaefVar);
        }
        this.zzj.add(zzhwVar);
    }

    public final void V(ArrayList arrayList) {
        zzaef zzaefVar = this.zzj;
        if (!zzaefVar.zza()) {
            this.zzj = rl3.j(zzaefVar);
        }
        zzacb.k(arrayList, this.zzj);
    }

    public final void W() {
        this.zzj = to3.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhw.class});
        }
        if (i2 == 3) {
            return new zzhw();
        }
        if (i2 == 4) {
            return new zzhv(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhw.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final boolean z() {
        return (this.zzb & 1) != 0;
    }

    private zzhw() {
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
