package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.dt3;
import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxt extends zzalt<zzxt, zzb> implements zzamx {
    private static final zzxt zzc;
    private static volatile zzani<zzxt> zzd;
    private int zze;
    private zzalx<zza> zzf = dt3.e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt<zza, C0300zza> implements zzamx {
        private static final zza zzc;
        private static volatile zzani<zza> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C0300zza extends zzalt.zza<zza, C0300zza> implements zzamx {
            private C0300zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0300zza(int i) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzalt.m(zza.class, zzaVar);
        }

        public static C0300zza y() {
            return (C0300zza) zzc.p();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
        public final Object k(int i) {
            zzani zzcVar;
            switch (e1.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0300zza(0);
                case 3:
                    return new ht3(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzani<zza> zzaniVar = zzd;
                    if (zzaniVar != null) {
                        return zzaniVar;
                    }
                    synchronized (zza.class) {
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

        private zza() {
        }

        public static /* synthetic */ void x(zza zzaVar, String str) {
            Objects.requireNonNull(str);
            zzaVar.zze = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb extends zzalt.zza<zzxt, zzb> implements zzamx {
        private zzb() {
            super(zzxt.zzc);
        }

        public /* synthetic */ zzb(int i) {
            this();
        }
    }

    static {
        zzxt zzxtVar = new zzxt();
        zzc = zzxtVar;
        zzalt.m(zzxt.class, zzxtVar);
    }

    public static void v(zzxt zzxtVar, zza zzaVar) {
        zzalx<zza> zzalxVar = zzxtVar.zzf;
        if (!zzalxVar.zzc()) {
            zzxtVar.zzf = zzalxVar.zza(zzalxVar.size() << 1);
        }
        zzxtVar.zzf.add(zzaVar);
    }

    public static zzb w() {
        return (zzb) zzc.p();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (e1.a[i - 1]) {
            case 1:
                return new zzxt();
            case 2:
                return new zzb(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzani<zzxt> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxt.class) {
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

    private zzxt() {
    }
}
