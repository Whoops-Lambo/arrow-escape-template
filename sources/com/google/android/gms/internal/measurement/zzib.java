package com.google.android.gms.internal.measurement;

import defpackage.am3;
import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = to3.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.u(zzib.class, zzibVar);
    }

    public static zzhz H() {
        return (zzhz) zzi.q();
    }

    public static zzhz I(zzib zzibVar) {
        zzadp zzadpVarQ = zzi.q();
        zzadpVarQ.o(zzibVar);
        return (zzhz) zzadpVarQ;
    }

    public final int A() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzid B(int i) {
        return (zzid) this.zze.get(i);
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zzg;
    }

    public final void M() {
        this.zze = to3.e;
    }

    public final void P() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = rl3.j(zzaefVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", am3.k});
        }
        if (i2 == 3) {
            return new zzib();
        }
        if (i2 == 4) {
            return new zzhz(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzib.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final List z() {
        return this.zze;
    }

    private zzib() {
    }

    public final /* synthetic */ void J(int i, zzid zzidVar) {
        P();
        this.zze.set(i, zzidVar);
    }

    public final /* synthetic */ void K(zzid zzidVar) {
        P();
        this.zze.add(zzidVar);
    }

    public final /* synthetic */ void L(ArrayList arrayList) {
        P();
        zzacb.k(arrayList, this.zze);
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }
}
