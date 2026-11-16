package com.google.android.gms.internal.ads;

import defpackage.pv1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqx {
    public Integer a = null;
    public Integer b = null;
    public zzhqy c = zzhqy.e;

    public final void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(pv1.l(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.b = Integer.valueOf(i);
    }

    public final zzhqz c() throws GeneralSecurityException {
        Integer num = this.a;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("key size not set");
            return null;
        }
        if (this.b != null) {
            return new zzhqz(num.intValue(), this.b.intValue(), this.c);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("tag size not set");
        return null;
    }

    private zzhqx() {
    }

    public /* synthetic */ zzhqx(int i) {
    }
}
