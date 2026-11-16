package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.gl0;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhb {
    public static final gl0 a = new gl0(6);

    public static Cipher b() {
        return (Cipher) a.get();
    }

    public static AlgorithmParameterSpec a(int i, int i2, byte[] bArr) {
        Integer numC = zzqu.c();
        if (numC != null && numC.intValue() <= 19) {
            return new IvParameterSpec(bArr, i, i2);
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }
}
