package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.nj;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzel extends zzdo {
    public final int a;
    public final int b;
    public final int c;
    public final zzb d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public Integer a;
        public Integer b;
        public Integer c;
        public zzb d;

        public final zzel a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("Key size is not set");
                return null;
            }
            if (this.d == null) {
                e.d("Variant is not set");
                return null;
            }
            if (this.b == null) {
                e.d("IV size is not set");
                return null;
            }
            if (this.c != null) {
                return new zzel(num.intValue(), this.b.intValue(), this.c.intValue(), this.d);
            }
            e.d("Tag size is not set");
            return null;
        }

        public final void b() {
            this.b = 12;
        }

        public final void c(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
        }

        public final void d() {
            this.c = 16;
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = zzb.d;
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

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.d != zzb.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzel)) {
            return false;
        }
        zzel zzelVar = (zzel) obj;
        return zzelVar.a == this.a && zzelVar.b == this.b && zzelVar.c == this.c && zzelVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzel.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sbS = nj.s("AesGcm Parameters (variant: ", this.b, String.valueOf(this.d), ", ", "-byte IV, ");
        sbS.append(this.c);
        sbS.append("-byte tag, and ");
        sbS.append(this.a);
        sbS.append("-byte key)");
        return sbS.toString();
    }

    public zzel(int i, int i2, int i3, zzb zzbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zzbVar;
    }
}
