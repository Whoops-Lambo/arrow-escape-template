package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzvm extends zzalt<zzvm, zza> implements zzamx {
    private static final zzvm zzc;
    private static volatile zzani<zzvm> zzd;
    private int zze;
    private zzvp zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvm, zza> implements zzamx {
        private zza() {
            super(zzvm.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvm zzvmVar = new zzvm();
        zzc = zzvmVar;
        zzalt.m(zzvm.class, zzvmVar);
    }

    public static zza u() {
        return (zza) zzc.p();
    }

    public static zzvm v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzvm) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zzvm zzvmVar, zzvp zzvpVar) {
        zzvmVar.zzf = zzvpVar;
        zzvmVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (n0.a[i - 1]) {
            case 1:
                return new zzvm();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzvm> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvm.class) {
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

    public final zzvp y() {
        zzvp zzvpVar = this.zzf;
        return zzvpVar == null ? zzvp.B() : zzvpVar;
    }

    private zzvm() {
    }
}
