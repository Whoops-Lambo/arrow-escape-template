package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrl extends zzro {
    public final int a;
    public final int b;
    public final zzb c;
    public final zzc d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public Integer a;
        public Integer b;
        public zzc c;
        public zzb d;

        public final zzrl a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("key size is not set");
                return null;
            }
            if (this.b == null) {
                e.d("tag size is not set");
                return null;
            }
            if (this.c == null) {
                e.d("hash type is not set");
                return null;
            }
            if (this.d == null) {
                e.d("variant is not set");
                return null;
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
            }
            Integer num2 = this.b;
            int iIntValue = num2.intValue();
            zzc zzcVar = this.c;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (zzcVar == zzc.b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (zzcVar == zzc.c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                }
            } else if (zzcVar == zzc.d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (zzcVar == zzc.e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (zzcVar != zzc.f) {
                    e.d("unknown hash type; must be SHA256, SHA384 or SHA512");
                    return null;
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new zzrl(this.a.intValue(), this.b.intValue(), this.d, this.c);
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = zzb.e;
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb {
        public static final zzb b = new zzb("TINK");
        public static final zzb c = new zzb("CRUNCHY");
        public static final zzb d = new zzb("LEGACY");
        public static final zzb e = new zzb("NO_PREFIX");
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
        return this.c != zzb.e;
    }

    public final int c() {
        zzb zzbVar = zzb.e;
        int i = this.b;
        zzb zzbVar2 = this.c;
        if (zzbVar2 == zzbVar) {
            return i;
        }
        if (zzbVar2 == zzb.b) {
            return i + 5;
        }
        if (zzbVar2 == zzb.c) {
            return i + 5;
        }
        if (zzbVar2 == zzb.d) {
            return i + 5;
        }
        e32.i("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrl)) {
            return false;
        }
        zzrl zzrlVar = (zzrl) obj;
        return zzrlVar.a == this.a && zzrlVar.c() == c() && zzrlVar.c == this.c && zzrlVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzrl.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", ");
        sbR.append(this.b);
        sbR.append("-byte tags, and ");
        sbR.append(this.a);
        sbR.append("-byte key)");
        return sbR.toString();
    }

    public zzrl(int i, int i2, zzb zzbVar, zzc zzcVar) {
        this.a = i;
        this.b = i2;
        this.c = zzbVar;
        this.d = zzcVar;
    }
}
