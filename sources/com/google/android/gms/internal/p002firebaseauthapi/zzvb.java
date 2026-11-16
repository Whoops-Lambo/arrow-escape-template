package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzvb extends zzalt<zzvb, zza> implements zzamx {
    private static final zzvb zzc;
    private static volatile zzani<zzvb> zzd;
    private int zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvb, zza> implements zzamx {
        private zza() {
            super(zzvb.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvb zzvbVar = new zzvb();
        zzc = zzvbVar;
        zzalt.m(zzvb.class, zzvbVar);
    }

    public static zzvb v(zzakb zzakbVar, zzalf zzalfVar) {
        return (zzvb) zzalt.g(zzc, zzakbVar, zzalfVar);
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (j0.a[i - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzvb> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvb.class) {
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
        return this.zze;
    }

    public final int x() {
        return this.zzf;
    }

    private zzvb() {
    }
}
