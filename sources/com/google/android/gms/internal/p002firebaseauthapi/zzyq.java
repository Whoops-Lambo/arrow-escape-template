package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzyq extends zzalt<zzyq, zza> implements zzamx {
    private static final zzyq zzc;
    private static volatile zzani<zzyq> zzd;
    private int zze;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzyq, zza> implements zzamx {
        private zza() {
            super(zzyq.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzyq zzyqVar = new zzyq();
        zzc = zzyqVar;
        zzalt.m(zzyq.class, zzyqVar);
    }

    public static zza w() {
        return (zza) zzc.p();
    }

    public static zzyq y() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (m1.a[i - 1]) {
            case 1:
                return new zzyq();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzani<zzyq> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzyq.class) {
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

    private zzyq() {
    }
}
