package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyc extends zzalt<zzyc, zza> implements zzamx {
    private static final zzyc zzc;
    private static volatile zzani<zzyc> zzd;
    private int zze;
    private int zzf;
    private zzyf zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzyc, zza> implements zzamx {
        private zza() {
            super(zzyc.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzyc zzycVar = new zzyc();
        zzc = zzycVar;
        zzalt.m(zzyc.class, zzycVar);
    }

    public static zzani A() {
        return (zzani) zzc.k(7);
    }

    public static zzyc v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzyc) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zzyc zzycVar, zzyf zzyfVar) {
        zzycVar.zzg = zzyfVar;
        zzycVar.zze |= 1;
    }

    public static zza x() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (h1.a[i - 1]) {
            case 1:
                return new zzyc();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzyc> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzyc.class) {
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

    public final zzyf z() {
        zzyf zzyfVar = this.zzg;
        return zzyfVar == null ? zzyf.A() : zzyfVar;
    }

    private zzyc() {
    }
}
