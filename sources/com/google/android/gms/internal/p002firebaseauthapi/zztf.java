package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import defpackage.lr3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zztf extends zzalt<zztf, zza> implements zzamx {
    private static final zztf zzc;
    private static volatile zzani<zztf> zzd;
    private int zze;
    private int zzf;
    private zzakb zzg = zzakb.b;
    private zztl zzh;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zztf, zza> implements zzamx {
        private zza() {
            super(zztf.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzalt.m(zztf.class, zztfVar);
    }

    public static zzani C() {
        return (zzani) zzc.k(7);
    }

    public static zztf v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zztf) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zztf zztfVar, zztl zztlVar) {
        zztfVar.zzh = zztlVar;
        zztfVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final zztl A() {
        zztl zztlVar = this.zzh;
        return zztlVar == null ? zztl.y() : zztlVar;
    }

    public final zzakb B() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (t.a[i - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zztf> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zztf.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzalt.zzc();
                            zzd = zzcVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int u() {
        return this.zzf;
    }

    private zztf() {
    }

    public static /* synthetic */ void x(zztf zztfVar, lr3 lr3Var) {
        Objects.requireNonNull(lr3Var);
        zztfVar.zzg = lr3Var;
    }
}
