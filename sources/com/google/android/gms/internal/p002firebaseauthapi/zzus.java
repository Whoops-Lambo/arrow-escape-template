package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import defpackage.lr3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzus extends zzalt<zzus, zza> implements zzamx {
    private static final zzus zzc;
    private static volatile zzani<zzus> zzd;
    private int zze;
    private zzakb zzf = zzakb.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzus, zza> implements zzamx {
        private zza() {
            super(zzus.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzalt.m(zzus.class, zzusVar);
    }

    public static zzani A() {
        return (zzani) zzc.k(7);
    }

    public static zzus v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzus) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static zza x() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (g0.a[i - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzus> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzus.class) {
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
        return this.zze;
    }

    public final zzakb z() {
        return this.zzf;
    }

    private zzus() {
    }

    public static /* synthetic */ void w(zzus zzusVar, lr3 lr3Var) {
        Objects.requireNonNull(lr3Var);
        zzusVar.zzf = lr3Var;
    }
}
