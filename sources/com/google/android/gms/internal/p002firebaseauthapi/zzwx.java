package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ht3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwx extends zzalt<zzwx, zza> implements zzamx {
    private static final zzwx zzc;
    private static volatile zzani<zzwx> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza extends zzalt.zza<zzwx, zza> implements zzamx {
        private zza() {
            super(zzwx.zzc);
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    static {
        zzwx zzwxVar = new zzwx();
        zzc = zzwxVar;
        zzalt.m(zzwx.class, zzwxVar);
    }

    public static zza A() {
        return (zza) zzc.p();
    }

    public static zzwx C() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalt
    public final Object k(int i) {
        zzani zzcVar;
        switch (x0.a[i - 1]) {
            case 1:
                return new zzwx();
            case 2:
                return new zza(0);
            case 3:
                return new ht3(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzani<zzwx> zzaniVar = zzd;
                if (zzaniVar != null) {
                    return zzaniVar;
                }
                synchronized (zzwx.class) {
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

    public final zzwp u() {
        zzwp zzwpVar;
        int i = this.zzg;
        if (i == 0) {
            zzwpVar = zzwp.AEAD_UNKNOWN;
        } else if (i == 1) {
            zzwpVar = zzwp.AES_128_GCM;
        } else if (i != 2) {
            zzwpVar = i != 3 ? null : zzwp.CHACHA20_POLY1305;
        } else {
            zzwpVar = zzwp.AES_256_GCM;
        }
        return zzwpVar == null ? zzwp.UNRECOGNIZED : zzwpVar;
    }

    public final zzws y() {
        zzws zzwsVar;
        int i = this.zzf;
        if (i == 0) {
            zzwsVar = zzws.KDF_UNKNOWN;
        } else if (i == 1) {
            zzwsVar = zzws.HKDF_SHA256;
        } else if (i != 2) {
            zzwsVar = i != 3 ? null : zzws.HKDF_SHA512;
        } else {
            zzwsVar = zzws.HKDF_SHA384;
        }
        return zzwsVar == null ? zzws.UNRECOGNIZED : zzwsVar;
    }

    public final zzwr z() {
        zzwr zzwrVar;
        switch (this.zze) {
            case 0:
                zzwrVar = zzwr.KEM_UNKNOWN;
                break;
            case 1:
                zzwrVar = zzwr.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                zzwrVar = zzwr.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                zzwrVar = zzwr.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                zzwrVar = zzwr.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                zzwrVar = zzwr.X_WING;
                break;
            case 6:
                zzwrVar = zzwr.ML_KEM768;
                break;
            case 7:
                zzwrVar = zzwr.ML_KEM1024;
                break;
            default:
                zzwrVar = null;
                break;
        }
        return zzwrVar == null ? zzwr.UNRECOGNIZED : zzwrVar;
    }

    private zzwx() {
    }
}
