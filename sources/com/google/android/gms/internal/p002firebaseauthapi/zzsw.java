package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.jc1;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzsw extends zztb {
    public final int a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return false;
    }

    public static zzsw b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new zzsw(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i << 3)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzsw) && ((zzsw) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzsw.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        return jc1.k(this.a, "AesCmac PRF Parameters (", "-byte key)");
    }

    public zzsw(int i) {
        this.a = i;
    }
}
