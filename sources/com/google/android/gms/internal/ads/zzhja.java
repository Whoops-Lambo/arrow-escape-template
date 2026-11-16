package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhja {
    public Integer a = null;
    public zzhjb b = zzhjb.d;

    public final void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final zzhjc b() throws GeneralSecurityException {
        Integer num = this.a;
        if (num != null) {
            return new zzhjc(num.intValue(), this.b);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size is not set");
        return null;
    }

    private zzhja() {
    }

    public /* synthetic */ zzhja(int i) {
    }
}
