package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzug extends zzalt<zzug, zza> implements zzamx {
    private static final zzug zzc;
    private static volatile zzani<zzug> zzd;
    private int zze;
    private zzuj zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzug, zza> implements zzamx {
        private zza() {
            super(zzug.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzalt.m(zzug.class, zzugVar);
    }

    public static zzug v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzug) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void x(zzug zzugVar, zzuj zzujVar) {
        zzugVar.zzf = zzujVar;
        zzugVar.zze |= 1;
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    public final zzuj A() {
        zzuj zzujVar = this.zzf;
        return zzujVar == null ? zzuj.y() : zzujVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (c0.a[i - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzug> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzug.class) {
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

    private zzug() {
    }
}
