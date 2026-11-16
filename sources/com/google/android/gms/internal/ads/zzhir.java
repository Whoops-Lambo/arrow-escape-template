package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhir {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public zzhis d = zzhis.d;

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b() {
        this.b = 12;
    }

    public final void c() {
        this.c = 16;
    }

    public final zzhit d() throws GeneralSecurityException {
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
        this.b.getClass();
        this.c.getClass();
        return new zzhit(iIntValue, this.d);
    }

    private zzhir() {
    }

    public /* synthetic */ zzhir(int i) {
    }
}
