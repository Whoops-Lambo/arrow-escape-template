package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyn extends zzalt<zzyn, zza> implements zzamx {
    private static final zzyn zzc;
    private static volatile zzani<zzyn> zzd;
    private int zze;
    private int zzf;
    private zzyq zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzyn, zza> implements zzamx {
        private zza() {
            super(zzyn.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzyn zzynVar = new zzyn();
        zzc = zzynVar;
        zzalt.m(zzyn.class, zzynVar);
    }

    public static zzyn v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzyn) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static /* synthetic */ void w(zzyn zzynVar, zzyq zzyqVar) {
        zzynVar.zzg = zzyqVar;
        zzynVar.zze |= 1;
    }

    public static zza x() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (l1.a[i - 1]) {
            case 1:
                return new zzyn();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzyn> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzyn.class) {
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

    public final zzyq z() {
        zzyq zzyqVar = this.zzg;
        return zzyqVar == null ? zzyq.y() : zzyqVar;
    }

    private zzyn() {
    }
}
