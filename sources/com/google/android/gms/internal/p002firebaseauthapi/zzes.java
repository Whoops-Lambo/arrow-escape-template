package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzes extends zzdo {
    public final int a;
    public final zza b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public static final zza b = new zza("TINK");
        public static final zza c = new zza("CRUNCHY");
        public static final zza d = new zza("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zza(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb {
        public Integer a;
        public zza b;

        public final zzes a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("Key size is not set");
                return null;
            }
            if (this.b != null) {
                return new zzes(num.intValue(), this.b);
            }
            e.d("Variant is not set");
            return null;
        }

        public final void b(int i) throws InvalidAlgorithmParameterException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.a = Integer.valueOf(i);
        }

        private zzb() {
            this.a = null;
            this.b = zza.d;
        }

        public /* synthetic */ zzb(int i) {
            this();
        }
    }

    public static zzb b() {
        return new zzb(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.b != zza.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        return zzesVar.a == this.a && zzesVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzes.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }

    public zzes(int i, zza zzaVar) {
        this.a = i;
        this.b = zzaVar;
    }
}
