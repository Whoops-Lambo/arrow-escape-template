package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwu extends zzalt<zzwu, zza> implements zzamx {
    private static final zzwu zzc;
    private static volatile zzani<zzwu> zzd;
    private int zze;
    private zzwx zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzwu, zza> implements zzamx {
        private zza() {
            super(zzwu.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzwu zzwuVar = new zzwu();
        zzc = zzwuVar;
        zzalt.m(zzwu.class, zzwuVar);
    }

    public static zzwu u(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzwu) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void v(zzwu zzwuVar, zzwx zzwxVar) {
        zzwuVar.zzf = zzwxVar;
        zzwuVar.zze |= 1;
    }

    public static zza w() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (w0.a[i - 1]) {
            case 1:
                return new zzwu();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzwu> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzwu.class) {
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

    public final zzwx y() {
        zzwx zzwxVar = this.zzf;
        return zzwxVar == null ? zzwx.C() : zzwxVar;
    }

    private zzwu() {
    }
}
