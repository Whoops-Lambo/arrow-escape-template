package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjp extends zzju {
    public final int a;
    public final zzb b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public Integer a;
        public zzb b;

        public final zzjp a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("Key size is not set");
                return null;
            }
            if (this.b != null) {
                return new zzjp(num.intValue(), this.b);
            }
            e.d("Variant is not set");
            return null;
        }

        public final void b(int i) throws InvalidAlgorithmParameterException {
            if (i != 32 && i != 48 && i != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
        }

        private zza() {
            this.a = null;
            this.b = zzb.d;
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.b != zzb.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjp)) {
            return false;
        }
        zzjp zzjpVar = (zzjp) obj;
        return zzjpVar.a == this.a && zzjpVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzjp.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }

    public zzjp(int i, zzb zzbVar) {
        this.a = i;
        this.b = zzbVar;
    }
}
