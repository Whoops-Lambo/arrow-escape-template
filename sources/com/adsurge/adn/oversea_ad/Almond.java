package com.adsurge.adn.oversea_ad;

import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Almond extends Apricot {
    public final KeyGenParameterSpec.Builder a;

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final AlgorithmParameterSpec a() {
        return this.a.build();
    }

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final Apricot b(String... strArr) {
        this.a.setSignaturePaddings(strArr);
        return this;
    }

    public Almond(String str, int i) {
        this.a = null;
        this.a = new KeyGenParameterSpec.Builder(str, i);
    }

    @Override // com.adsurge.adn.oversea_ad.Apricot
    public final Apricot a(String... strArr) {
        this.a.setDigests(strArr);
        return this;
    }
}
