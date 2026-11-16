package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzvy extends zzalt<zzvy, zza> implements zzamx {
    private static final zzvy zzc;
    private static volatile zzani<zzvy> zzd;
    private int zze;
    private int zzf;
    private zzakb zzg = zzakb.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzvy, zza> implements zzamx {
        private zza() {
            super(zzvy.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzvy zzvyVar = new zzvy();
        zzc = zzvyVar;
        zzalt.m(zzvy.class, zzvyVar);
    }

    public static zza u() {
        return (zza) zzc.p();
    }

    public static zzvy z() {
        return zzc;
    }

    public final zzwb A() {
        zzwb zzwbVar;
        int i = this.zze;
        if (i == 0) {
            zzwbVar = zzwb.UNKNOWN_CURVE;
        } else if (i == 2) {
            zzwbVar = zzwb.NIST_P256;
        } else if (i == 3) {
            zzwbVar = zzwb.NIST_P384;
        } else if (i != 4) {
            zzwbVar = i != 5 ? null : zzwb.CURVE25519;
        } else {
            zzwbVar = zzwb.NIST_P521;
        }
        return zzwbVar == null ? zzwb.UNRECOGNIZED : zzwbVar;
    }

    public final zzwh B() {
        zzwh zzwhVarA = zzwh.a(this.zzf);
        return zzwhVarA == null ? zzwh.UNRECOGNIZED : zzwhVarA;
    }

    public final zzakb C() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (r0.a[i - 1]) {
            case 1:
                return new zzvy();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzvy> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzvy.class) {
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

    private zzvy() {
    }

    public static /* synthetic */ void v(zzvy zzvyVar, zzakb zzakbVar) {
        Objects.requireNonNull(zzakbVar);
        zzvyVar.zzg = zzakbVar;
    }
}
