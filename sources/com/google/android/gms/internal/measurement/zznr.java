package com.google.android.gms.internal.measurement;

import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznr extends zzadu implements zzafd {
    private static final zznr zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = to3.e;
    private String zzf = "";

    static {
        zznr zznrVar = new zznr();
        zzg = zznrVar;
        zzadu.u(zznr.class, zznrVar);
    }

    public static zznr A() {
        return zzg;
    }

    public final void B(String str) {
        zzaef zzaefVar = this.zze;
        if (!zzaefVar.zza()) {
            this.zze = rl3.j(zzaefVar);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zznr();
        }
        if (i2 == 4) {
            return new zznq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznr.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
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

    private zznr() {
    }
}
