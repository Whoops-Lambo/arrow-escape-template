package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwm extends zzalt<zzwm, zza> implements zzamx {
    private static final zzwm zzc;
    private static volatile zzani<zzwm> zzd;
    private int zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzwm, zza> implements zzamx {
        private zza() {
            super(zzwm.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzwm zzwmVar = new zzwm();
        zzc = zzwmVar;
        zzalt.m(zzwm.class, zzwmVar);
    }

    public static zzwm A() {
        return zzc;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (v0.a[i - 1]) {
            case 1:
                return new zzwm();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzwm> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzwm.class) {
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

    public final zzwh x() {
        zzwh zzwhVarA = zzwh.a(this.zze);
        return zzwhVarA == null ? zzwh.UNRECOGNIZED : zzwhVarA;
    }

    private zzwm() {
    }
}
