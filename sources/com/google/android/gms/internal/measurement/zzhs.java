package com.google.android.gms.internal.measurement;

import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhs extends zzadu implements zzafd {
    private static final zzhs zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private zzaef zze = to3.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        zzhs zzhsVar = new zzhs();
        zzm = zzhsVar;
        zzadu.u(zzhs.class, zzhsVar);
    }

    public static zzhr Q() {
        return (zzhr) zzm.q();
    }

    public final void A() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = rl3.j(zzaefVar);
    }

    public final List B() {
        return this.zze;
    }

    public final int C() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhw D(int i) {
        return (zzhw) this.zze.get(i);
    }

    public final String E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final long H() {
        return this.zzg;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final long J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final int L() {
        return this.zzi;
    }

    public final boolean M() {
        return (this.zzb & 32) != 0;
    }

    public final long N() {
        return this.zzk;
    }

    public final boolean O() {
        return (this.zzb & 64) != 0;
    }

    public final long P() {
        return this.zzl;
    }

    public final void U() {
        this.zze = to3.e;
    }

    public final /* synthetic */ void X(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void a0(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzhs();
        }
        if (i2 == 4) {
            return new zzhr(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzn;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhs.class) {
            try {
                zzadqVar = zzn;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzm);
                    zzn = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    private zzhs() {
    }

    public final /* synthetic */ void R(int i, zzhw zzhwVar) {
        A();
        this.zze.set(i, zzhwVar);
    }

    public final /* synthetic */ void S(zzhw zzhwVar) {
        zzhwVar.getClass();
        A();
        this.zze.add(zzhwVar);
    }

    public final /* synthetic */ void T(Iterable iterable) {
        A();
        zzacb.k(iterable, this.zze);
    }

    public final /* synthetic */ void V(int i) {
        A();
        this.zze.remove(i);
    }

    public final /* synthetic */ void W(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }
}
