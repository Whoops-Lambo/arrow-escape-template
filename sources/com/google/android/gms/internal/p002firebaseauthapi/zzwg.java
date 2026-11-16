package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwg extends zzalt<zzwg, zza> implements zzamx {
    private static final zzwg zzc;
    private static volatile zzani<zzwg> zzd;
    private int zze;
    private int zzf;
    private zzwm zzg;
    private zzakb zzh = zzakb.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzwg, zza> implements zzamx {
        private zza() {
            super(zzwg.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzalt.m(zzwg.class, zzwgVar);
    }

    public static zzwg B() {
        return zzc;
    }

    public static zzani u() {
        return (zzani) zzc.k(7);
    }

    public static zzwg w(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzwg) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void y(zzwg zzwgVar, zzwm zzwmVar) {
        zzwgVar.zzg = zzwmVar;
        zzwgVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.p();
    }

    public final zzwm C() {
        zzwm zzwmVar = this.zzg;
        return zzwmVar == null ? zzwm.A() : zzwmVar;
    }

    public final zzakb D() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (t0.a[i - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zzwg> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzwg.class) {
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

    public final int v() {
        return this.zzf;
    }

    private zzwg() {
    }

    public static /* synthetic */ void x(zzwg zzwgVar, zzakb zzakbVar) {
        Objects.requireNonNull(zzakbVar);
        zzwgVar.zzh = zzakbVar;
    }
}
