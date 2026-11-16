package com.google.android.gms.internal.ads;

import defpackage.rl3;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhsv extends zzhsy {
    public final int a;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return false;
    }

    public static zzhsv b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new zzhsv(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhsv) && ((zzhsv) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhsv.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return rl3.k(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }

    public zzhsv(int i) {
        this.a = i;
    }
}
