package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzra extends zzro {
    public final int a;
    public final int b;
    public final zzb c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public Integer a;
        public Integer b;
        public zzb c;

        public final zzra a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("key size not set");
                return null;
            }
            if (this.b == null) {
                e.d("tag size not set");
                return null;
            }
            if (this.c != null) {
                return new zzra(num.intValue(), this.b.intValue(), this.c);
            }
            e.d("variant not set");
            return null;
        }

        public final void b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
            }
            this.a = Integer.valueOf(i);
        }

        public final void c(int i) throws GeneralSecurityException {
            if (i < 10 || 16 < i) {
                throw new GeneralSecurityException(pv1.k(i, "Invalid tag size for AesCmacParameters: "));
            }
            this.b = Integer.valueOf(i);
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = zzb.e;
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.c != zzb.e;
    }

    public final int b() {
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
        if (!(obj instanceof zzra)) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        return zzraVar.a == this.a && zzraVar.b() == b() && zzraVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzra.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return nj.l(this.a, "-byte key)", nj.s("AES-CMAC Parameters (variant: ", this.b, String.valueOf(this.c), ", ", "-byte tags, and "));
    }

    public zzra(int i, int i2, zzb zzbVar) {
        this.a = i;
        this.b = i2;
        this.c = zzbVar;
    }
}
