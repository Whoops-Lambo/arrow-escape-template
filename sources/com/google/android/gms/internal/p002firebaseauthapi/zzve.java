package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import defpackage.lr3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzve extends zzalt<zzve, zza> implements zzamx {
    private static final zzve zzc;
    private static volatile zzani<zzve> zzd;
    private int zze;
    private zzakb zzf = zzakb.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzve, zza> implements zzamx {
        private zza() {
            super(zzve.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzalt.m(zzve.class, zzveVar);
    }

    public static zzani A() {
        return (zzani) zzc.k(7);
    }

    public static zzve v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzve) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static zza x() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (k0.a[i - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzve> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzve.class) {
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

    private zzve() {
    }

    public static /* synthetic */ void w(zzve zzveVar, lr3 lr3Var) {
        Objects.requireNonNull(lr3Var);
        zzveVar.zzf = lr3Var;
    }
}
