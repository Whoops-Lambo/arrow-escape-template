package com.google.android.gms.internal.measurement;

import defpackage.cr4;
import defpackage.qq4;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzha extends zzadu implements zzafd {
    private static final zzha zzp;
    private static volatile zzafj zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private zzaew zzm;
    private zzaew zzn;
    private String zzo;

    static {
        zzha zzhaVar = new zzha();
        zzp = zzhaVar;
        zzadu.u(zzha.class, zzhaVar);
    }

    public static zzgx f0() {
        return (zzgx) zzp.q();
    }

    public static zzha g0() {
        return zzp;
    }

    public final /* synthetic */ void A(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void B(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void C() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void H() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final zzaew J() {
        zzaew zzaewVar = this.zzm;
        if (!zzaewVar.a) {
            this.zzm = zzaewVar.f();
        }
        return this.zzm;
    }

    public final zzaew K() {
        zzaew zzaewVar = this.zzn;
        if (!zzaewVar.a) {
            this.zzn = zzaewVar.f();
        }
        return this.zzn;
    }

    public final /* synthetic */ void L(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean N() {
        return (this.zzb & 1) != 0;
    }

    public final String O() {
        return this.zze;
    }

    public final boolean P() {
        return (this.zzb & 2) != 0;
    }

    public final String Q() {
        return this.zzf;
    }

    public final boolean R() {
        return (this.zzb & 4) != 0;
    }

    public final String S() {
        return this.zzg;
    }

    public final boolean T() {
        return (this.zzb & 8) != 0;
    }

    public final long U() {
        return this.zzh;
    }

    public final boolean V() {
        return (this.zzb & 16) != 0;
    }

    public final String W() {
        return this.zzi;
    }

    public final boolean X() {
        return (this.zzb & 32) != 0;
    }

    public final String Y() {
        return this.zzj;
    }

    public final boolean Z() {
        return (this.zzb & 64) != 0;
    }

    public final String a0() {
        return this.zzk;
    }

    public final boolean b0() {
        return (this.zzb & 128) != 0;
    }

    public final long c0() {
        return this.zzl;
    }

    public final boolean d0() {
        return (this.zzb & 256) != 0;
    }

    public final String e0() {
        return this.zzo;
    }

    public final /* synthetic */ void h0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void i0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void j0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void l0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", qq4.a, "zzn", cr4.a, "zzo"});
        }
        if (i2 == 3) {
            return new zzha();
        }
        if (i2 == 4) {
            return new zzgx(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzq;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzha.class) {
            try {
                zzadqVar = zzq;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzp);
                    zzq = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final /* synthetic */ void z() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    private zzha() {
        zzaew zzaewVar = zzaew.b;
        this.zzm = zzaewVar;
        this.zzn = zzaewVar;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }
}
