package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhrj {
    public Integer a = null;
    public Integer b = null;
    public zzhrk c = null;
    public zzhrl d = zzhrl.e;

    public final zzhrm c() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("key size is not set");
            return null;
        }
        if (this.b == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("tag size is not set");
            return null;
        }
        if (this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
        }
        Integer num2 = this.b;
        int iIntValue = num2.intValue();
        zzhrk zzhrkVar = this.c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhrkVar == zzhrk.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhrkVar == zzhrk.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhrkVar == zzhrk.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhrkVar == zzhrk.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhrkVar != zzhrk.f) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zzhrm(this.a.intValue(), this.b.intValue(), this.d, this.c);
    }

    private zzhrj() {
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public /* synthetic */ zzhrj(int i) {
    }
}
