package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwj extends zzalt<zzwj, zza> implements zzamx {
    private static final zzwj zzc;
    private static volatile zzani<zzwj> zzd;
    private int zze;
    private zzwm zzf;
    private int zzg;
    private int zzh;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzwj, zza> implements zzamx {
        private zza() {
            super(zzwj.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzalt.m(zzwj.class, zzwjVar);
    }

    public static zzwj B() {
        return zzc;
    }

    public static zzwj v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzwj) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void x(zzwj zzwjVar, zzwm zzwmVar) {
        zzwjVar.zzf = zzwmVar;
        zzwjVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.p();
    }

    public final zzwm C() {
        zzwm zzwmVar = this.zzf;
        return zzwmVar == null ? zzwm.A() : zzwmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (u0.a[i - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zzwj> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzwj.class) {
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
        return this.zzg;
    }

    public final int y() {
        return this.zzh;
    }

    private zzwj() {
    }
}
