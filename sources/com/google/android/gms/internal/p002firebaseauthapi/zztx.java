package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zztx extends zzalt<zztx, zza> implements zzamx {
    private static final zztx zzc;
    private static volatile zzani<zztx> zzd;
    private int zze;
    private zzua zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zztx, zza> implements zzamx {
        private zza() {
            super(zztx.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzalt.m(zztx.class, zztxVar);
    }

    public static /* synthetic */ void w(zztx zztxVar, zzua zzuaVar) {
        zztxVar.zzf = zzuaVar;
        zztxVar.zze |= 1;
    }

    public static zza x() {
        return (zza) zzc.p();
    }

    public static zztx z() {
        return zzc;
    }

    public final zzua A() {
        zzua zzuaVar = this.zzf;
        return zzuaVar == null ? zzua.y() : zzuaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (z.a[i - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zztx> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zztx.class) {
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

    private zztx() {
    }
}
