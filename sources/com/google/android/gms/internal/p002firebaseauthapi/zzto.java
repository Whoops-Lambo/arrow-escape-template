package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzto extends zzalt<zzto, zza> implements zzamx {
    private static final zzto zzc;
    private static volatile zzani<zzto> zzd;
    private int zze;
    private int zzf;
    private zztu zzg;
    private zzwg zzh;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzto, zza> implements zzamx {
        private zza() {
            super(zzto.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzto zztoVar = new zzto();
        zzc = zztoVar;
        zzalt.m(zzto.class, zztoVar);
    }

    public static zzani C() {
        return (zzani) zzc.k(7);
    }

    public static zzto v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzto) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zzto zztoVar, zztu zztuVar) {
        zztoVar.zzg = zztuVar;
        zztoVar.zze |= 1;
    }

    public static /* synthetic */ void x(zzto zztoVar, zzwg zzwgVar) {
        zztoVar.zzh = zzwgVar;
        zztoVar.zze |= 2;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final zztu A() {
        zztu zztuVar = this.zzg;
        return zztuVar == null ? zztu.z() : zztuVar;
    }

    public final zzwg B() {
        zzwg zzwgVar = this.zzh;
        return zzwgVar == null ? zzwg.B() : zzwgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (w.a[i - 1]) {
            case 1:
                return new zzto();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zzto> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzto.class) {
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

    private zzto() {
    }
}
