package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import defpackage.lr3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzud extends zzalt<zzud, zza> implements zzamx {
    private static final zzud zzc;
    private static volatile zzani<zzud> zzd;
    private int zze;
    private int zzf;
    private zzuj zzg;
    private zzakb zzh = zzakb.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzud, zza> implements zzamx {
        private zza() {
            super(zzud.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzud zzudVar = new zzud();
        zzc = zzudVar;
        zzalt.m(zzud.class, zzudVar);
    }

    public static zzani C() {
        return (zzani) zzc.k(7);
    }

    public static zzud v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzud) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zzud zzudVar, zzuj zzujVar) {
        zzudVar.zzg = zzujVar;
        zzudVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final zzuj A() {
        zzuj zzujVar = this.zzg;
        return zzujVar == null ? zzuj.y() : zzujVar;
    }

    public final zzakb B() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (b0.a[i - 1]) {
            case 1:
                return new zzud();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zzud> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzud.class) {
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

    private zzud() {
    }

    public static /* synthetic */ void x(zzud zzudVar, lr3 lr3Var) {
        Objects.requireNonNull(lr3Var);
        zzudVar.zzh = lr3Var;
    }
}
