package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvp extends zzalt<zzvp, zza> implements zzamx {
    private static final zzvp zzc;
    private static volatile zzani<zzvp> zzd;
    private int zze;
    private zzvy zzf;
    private zzvj zzg;
    private int zzh;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvp, zza> implements zzamx {
        private zza() {
            super(zzvp.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvp zzvpVar = new zzvp();
        zzc = zzvpVar;
        zzalt.m(zzvp.class, zzvpVar);
    }

    public static zzvp B() {
        return zzc;
    }

    public static /* synthetic */ void v(zzvp zzvpVar, zzvj zzvjVar) {
        zzvpVar.zzg = zzvjVar;
        zzvpVar.zze |= 2;
    }

    public static /* synthetic */ void x(zzvp zzvpVar, zzvy zzvyVar) {
        zzvpVar.zzf = zzvyVar;
        zzvpVar.zze |= 1;
    }

    public static zza z() {
        return (zza) zzc.p();
    }

    public final zzvy C() {
        zzvy zzvyVar = this.zzf;
        return zzvyVar == null ? zzvy.z() : zzvyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (o0.a[i - 1]) {
            case 1:
                return new zzvp();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzani<zzvp> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvp.class) {
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

    public final zzvk u() {
        zzvk zzvkVar;
        int i = this.zzh;
        if (i == 0) {
            zzvkVar = zzvk.UNKNOWN_FORMAT;
        } else if (i == 1) {
            zzvkVar = zzvk.UNCOMPRESSED;
        } else if (i != 2) {
            zzvkVar = i != 3 ? null : zzvk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            zzvkVar = zzvk.COMPRESSED;
        }
        return zzvkVar == null ? zzvk.UNRECOGNIZED : zzvkVar;
    }

    public final zzvj y() {
        zzvj zzvjVar = this.zzg;
        return zzvjVar == null ? zzvj.x() : zzvjVar;
    }

    private zzvp() {
    }
}
