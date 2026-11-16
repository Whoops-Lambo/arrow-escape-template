package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzvh extends zzalt<zzvh, zza> implements zzamx {
    private static final zzvh zzc;
    private static volatile zzani<zzvh> zzd;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvh, zza> implements zzamx {
        private zza() {
            super(zzvh.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzalt.m(zzvh.class, zzvhVar);
    }

    public static void v(zzakb zzakbVar, zzalf zzalfVar) {
    }

    public static zzvh w() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (l0.a[i - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0000", null);
            case 4:
                return zzc;
            case 5:
                zzani<zzvh> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvh.class) {
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

    private zzvh() {
    }
}
