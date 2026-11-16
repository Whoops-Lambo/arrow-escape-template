package com.adsurge.adn.oversea_ad;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Apple extends Apricot {
    public final String a;
    public final int b;
    public String[] c;
    public String[] d;

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final Apricot b(String... strArr) {
        if (strArr.length > 0) {
            strArr = (String[]) strArr.clone();
        }
        this.d = strArr;
        return this;
    }

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final AlgorithmParameterSpec a() throws ClassNotFoundException {
        Class<?> cls = Class.forName("android.security.keystore.KeyGenParameterSpec");
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return (AlgorithmParameterSpec) cls.getConstructor(String.class, cls3, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, java.util.Date.class, java.util.Date.class, java.util.Date.class, java.util.Date.class, java.util.Date.class, cls3, String[].class, String[].class, String[].class, String[].class, cls2, cls2, cls3).newInstance(this.a, -1, null, null, null, null, null, null, null, null, Integer.valueOf(this.b), this.c, null, this.d, null, Boolean.TRUE, Boolean.FALSE, -1);
    }

    public Apple(String str, int i) {
        if (str != null) {
            if (!str.isEmpty()) {
                this.a = str;
                this.b = i;
                return;
            } else {
                defpackage.d.r("keystoreAlias must not be empty");
                throw null;
            }
        }
        defpackage.d.w("keystoreAlias == null");
        throw null;
    }

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final Apricot a(String... strArr) {
        if (strArr.length > 0) {
            strArr = (String[]) strArr.clone();
        }
        this.c = strArr;
        return this;
    }
}
