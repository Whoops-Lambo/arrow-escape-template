package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzti extends zzalt<zzti, zza> implements zzamx {
    private static final zzti zzc;
    private static volatile zzani<zzti> zzd;
    private int zze;
    private int zzf;
    private zztl zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzti, zza> implements zzamx {
        private zza() {
            super(zzti.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzalt.m(zzti.class, zztiVar);
    }

    public static zzti v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzti) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void x(zzti zztiVar, zztl zztlVar) {
        zztiVar.zzg = zztlVar;
        zztiVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final zztl A() {
        zztl zztlVar = this.zzg;
        return zztlVar == null ? zztl.y() : zztlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (u.a[i - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzti> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzti.class) {
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

    private zzti() {
    }
}
