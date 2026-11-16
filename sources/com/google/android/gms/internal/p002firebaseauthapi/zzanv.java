package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzanv extends zzalt<zzanv, zza> implements zzamx {
    private static final zzanv zzc;
    private static volatile zzani<zzanv> zzd;
    private long zze;
    private int zzf;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzanv, zza> implements zzamx {
        public final void k(long j) {
            if (!this.b.t()) {
                j();
            }
            ((zzanv) this.b).zze = j;
        }

        public final void l(int i) {
            if (!this.b.t()) {
                j();
            }
            ((zzanv) this.b).zzf = i;
        }

        private zza() {
            super(zzanv.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzanv zzanvVar = new zzanv();
        zzc = zzanvVar;
        zzalt.m(zzanv.class, zzanvVar);
    }

    public static zza y() {
        return (zza) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (g.a[i - 1]) {
            case 1:
                return new zzanv();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzani<zzanv> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzanv.class) {
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

    public final long x() {
        return this.zze;
    }

    private zzanv() {
    }
}
