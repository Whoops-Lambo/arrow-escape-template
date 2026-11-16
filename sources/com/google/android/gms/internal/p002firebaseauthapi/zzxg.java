package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzxg extends zzalt<zzxg, zzb> implements zzamx {
    private static final zzxg zzc;
    private static volatile zzani<zzxg> zzd;
    private String zze = "";
    private zzakb zzf = zzakb.b;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum zza implements zzalv {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public final int a;

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            zzalw.c();
            throw null;
        }

        zza(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb extends zzalt.zza<zzxg, zzb> implements zzamx {
        private zzb() {
            super(zzxg.zzc);
        }

        public /* synthetic */ zzb(int i) {
            this();
        }
    }

    static {
        zzxg zzxgVar = new zzxg();
        zzc = zzxgVar;
        zzalt.m(zzxg.class, zzxgVar);
    }

    public static zzxg A() {
        return zzc;
    }

    public static zzb u() {
        return (zzb) zzc.p();
    }

    public final zzakb B() {
        return this.zzf;
    }

    public final String C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (a1.a[i - 1]) {
            case 1:
                return new zzxg();
            case 2:
                return new zzb(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzxg> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzxg.class) {
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

    public final zza y() {
        zza zzaVar;
        int i = this.zzg;
        if (i == 0) {
            zzaVar = zza.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzaVar = zza.SYMMETRIC;
        } else if (i == 2) {
            zzaVar = zza.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzaVar = i != 4 ? null : zza.REMOTE;
        } else {
            zzaVar = zza.ASYMMETRIC_PUBLIC;
        }
        return zzaVar == null ? zza.UNRECOGNIZED : zzaVar;
    }

    private zzxg() {
    }

    public static /* synthetic */ void v(zzxg zzxgVar, zzakb zzakbVar) {
        Objects.requireNonNull(zzakbVar);
        zzxgVar.zzf = zzakbVar;
    }

    public static /* synthetic */ void x(zzxg zzxgVar, String str) {
        Objects.requireNonNull(str);
        zzxgVar.zze = str;
    }
}
