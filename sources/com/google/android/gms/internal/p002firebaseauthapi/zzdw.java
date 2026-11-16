package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.h50;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdw extends zzdo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzb e;
    public final zzc f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public Integer a;
        public Integer b;
        public Integer c;
        public Integer d;
        public zzc e;
        public zzb f;

        public final zzdw a() throws GeneralSecurityException {
            if (this.a == null) {
                e.d("AES key size is not set");
                return null;
            }
            if (this.b == null) {
                e.d("HMAC key size is not set");
                return null;
            }
            if (this.c == null) {
                e.d("iv size is not set");
                return null;
            }
            Integer num = this.d;
            if (num == null) {
                e.d("tag size is not set");
                return null;
            }
            if (this.e == null) {
                e.d("hash type is not set");
                return null;
            }
            if (this.f == null) {
                e.d("variant is not set");
                return null;
            }
            int iIntValue = num.intValue();
            zzc zzcVar = this.e;
            if (zzcVar == zzc.b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                }
            } else if (zzcVar == zzc.c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                }
            } else if (zzcVar == zzc.d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                }
            } else if (zzcVar == zzc.e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                }
            } else {
                if (zzcVar != zzc.f) {
                    e.d("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                    return null;
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                }
            }
            return new zzdw(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e);
        }

        public final void b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
        }

        public final void c(int i) throws InvalidAlgorithmParameterException {
            if (i < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
            }
            this.b = Integer.valueOf(i);
        }

        public final void d(int i) throws GeneralSecurityException {
            if (i < 12 || i > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
            }
            this.c = Integer.valueOf(i);
        }

        public final void e(int i) throws GeneralSecurityException {
            if (i < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
            }
            this.d = Integer.valueOf(i);
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = zzb.d;
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb {
        public static final zzb b = new zzb("TINK");
        public static final zzb c = new zzb("CRUNCHY");
        public static final zzb d = new zzb("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzb(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzc {
        public static final zzc b = new zzc("SHA1");
        public static final zzc c = new zzc("SHA224");
        public static final zzc d = new zzc("SHA256");
        public static final zzc e = new zzc("SHA384");
        public static final zzc f = new zzc("SHA512");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzc(String str) {
            this.a = str;
        }
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.e != zzb.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        return zzdwVar.a == this.a && zzdwVar.b == this.b && zzdwVar.c == this.c && zzdwVar.d == this.d && zzdwVar.e == this.e && zzdwVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(zzdw.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.e), ", hashType: ", String.valueOf(this.f), ", ");
        h50.s(this.c, this.d, "-byte IV, and ", "-byte tags, and ", sbR);
        sbR.append(this.a);
        sbR.append("-byte AES key, and ");
        sbR.append(this.b);
        sbR.append("-byte HMAC key)");
        return sbR.toString();
    }

    public zzdw(int i, int i2, int i3, int i4, zzb zzbVar, zzc zzcVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = zzbVar;
        this.f = zzcVar;
    }
}
