package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.dt3;
import defpackage.ht3;
import defpackage.or3;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxq extends zzalt<zzxq, zzb> implements zzamx {
    private static final zzxq zzc;
    private static volatile zzani<zzxq> zzd;
    private int zze;
    private zzalx<zza> zzf = dt3.e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt<zza, C0299zza> implements zzamx {
        private static final zza zzc;
        private static volatile zzani<zza> zzd;
        private int zze;
        private zzxg zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* JADX INFO: renamed from: com.google.android.gms.internal.firebase-auth-api.zzxq$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C0299zza extends zzalt.zza<zza, C0299zza> implements zzamx {
            private C0299zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0299zza(int i) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzalt.m(zza.class, zzaVar);
        }

        public static C0299zza C() {
            return (C0299zza) zzc.p();
        }

        public static /* synthetic */ void x(zza zzaVar, zzxg zzxgVar) {
            zzaVar.zzf = zzxgVar;
            zzaVar.zze |= 1;
        }

        public final zzxg A() {
            zzxg zzxgVar = this.zzf;
            return zzxgVar == null ? zzxg.A() : zzxgVar;
        }

        public final zzxh B() {
            zzxh zzxhVar;
            int i = this.zzg;
            if (i == 0) {
                zzxhVar = zzxh.UNKNOWN_STATUS;
            } else if (i == 1) {
                zzxhVar = zzxh.ENABLED;
            } else if (i != 2) {
                zzxhVar = i != 3 ? null : zzxh.DESTROYED;
            } else {
                zzxhVar = zzxh.DISABLED;
            }
            return zzxhVar == null ? zzxh.UNRECOGNIZED : zzxhVar;
        }

        public final zzyi E() {
            zzyi zzyiVarA = zzyi.a(this.zzi);
            return zzyiVarA == null ? zzyi.UNRECOGNIZED : zzyiVarA;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
        public final Object k(int i) {
            zzani zzcVar;
            switch (d1.a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0299zza(0);
                case 3:
                    return new ht3(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final boolean u() {
            return (this.zze & 1) != 0;
        }

        public final int v() {
            return this.zzh;
        }

        private zza() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb extends zzalt.zza<zzxq, zzb> implements zzamx {
        private zzb() {
            super(zzxq.zzc);
        }

        public /* synthetic */ zzb(int i) {
            this();
        }
    }

    static {
        zzxq zzxqVar = new zzxq();
        zzc = zzxqVar;
        zzalt.m(zzxq.class, zzxqVar);
    }

    public static zzb A() {
        return (zzb) zzc.p();
    }

    public static zzxq v(ByteArrayInputStream byteArrayInputStream, zzalf zzalfVar) throws zzamd {
        zzalt zzaltVarH = zzalt.h(zzc, new or3(byteArrayInputStream), zzalfVar);
        zzalt.n(zzaltVarH);
        return (zzxq) zzaltVarH;
    }

    public static zzxq w(byte[] bArr, zzalf zzalfVar) {
        return (zzxq) zzalt.i(zzc, bArr, zzalfVar);
    }

    public static void y(zzxq zzxqVar, zza zzaVar) {
        zzalx<zza> zzalxVar = zzxqVar.zzf;
        if (!zzalxVar.zzc()) {
            zzxqVar.zzf = zzalxVar.zza(zzalxVar.size() << 1);
        }
        zzxqVar.zzf.add(zzaVar);
    }

    public final zzalx C() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (d1.a[i - 1]) {
            case 1:
                return new zzxq();
            case 2:
                return new zzb(0);
            case 3:
                return new ht3(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzani<zzxq> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxq.class) {
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
        return this.zzf.size();
    }

    public final int z() {
        return this.zze;
    }

    private zzxq() {
    }
}
