package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhhz {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public Integer d = null;
    public zzhia e = null;
    public zzhib f = zzhib.d;

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void d(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final zzhic e() throws GeneralSecurityException {
        if (this.a == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("AES key size is not set");
            return null;
        }
        if (this.b == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("HMAC key size is not set");
            return null;
        }
        if (this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("iv size is not set");
            return null;
        }
        Integer num = this.d;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("tag size is not set");
            return null;
        }
        if (this.e == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("hash type is not set");
            return null;
        }
        int iIntValue = num.intValue();
        zzhia zzhiaVar = this.e;
        if (zzhiaVar == zzhia.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (zzhiaVar == zzhia.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (zzhiaVar == zzhia.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (zzhiaVar == zzhia.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (zzhiaVar != zzhia.f) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new zzhic(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e);
    }

    private zzhhz() {
    }

    public /* synthetic */ zzhhz(int i) {
    }
}
