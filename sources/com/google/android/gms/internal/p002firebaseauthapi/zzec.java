package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.nj;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzec extends zzdo {
    public final int a;
    public final int b;
    public final int c;
    public final zza d;

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
        public Integer b;
        public Integer c;
        public zza d;

        public final zzec a() throws GeneralSecurityException {
            Integer num = this.a;
            if (num == null) {
                e.d("Key size is not set");
                return null;
            }
            if (this.b == null) {
                e.d("IV size is not set");
                return null;
            }
            if (this.d == null) {
                e.d("Variant is not set");
                return null;
            }
            if (this.c != null) {
                return new zzec(num.intValue(), this.b.intValue(), this.c.intValue(), this.d);
            }
            e.d("Tag size is not set");
            return null;
        }

        public final void b(int i) throws GeneralSecurityException {
            if (i != 12 && i != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
            }
            this.b = Integer.valueOf(i);
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

        private zzb() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = zza.d;
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
        return this.d != zza.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzec)) {
            return false;
        }
        zzec zzecVar = (zzec) obj;
        return zzecVar.a == this.a && zzecVar.b == this.b && zzecVar.c == this.c && zzecVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzec.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sbS = nj.s("AesEax Parameters (variant: ", this.b, String.valueOf(this.d), ", ", "-byte IV, ");
        sbS.append(this.c);
        sbS.append("-byte tag, and ");
        sbS.append(this.a);
        sbS.append("-byte key)");
        return sbS.toString();
    }

    public zzec(int i, int i2, int i3, zza zzaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zzaVar;
    }
}
