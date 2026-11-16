package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhii {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public zzhij d = zzhij.d;

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void c() {
        this.c = 16;
    }

    public final zzhik d() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size is not set");
            return null;
        }
        if (this.b == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("IV size is not set");
            return null;
        }
        if (this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.b.intValue();
        this.c.getClass();
        return new zzhik(iIntValue, iIntValue2, this.d);
    }

    private zzhii() {
    }

    public /* synthetic */ zzhii(int i) {
    }
}
