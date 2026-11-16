package com.adsurge.adn.oversea_ad;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Apricot {
    public abstract Apricot a(String... strArr);

    public abstract AlgorithmParameterSpec a();

    public abstract Apricot b(String... strArr);

    public static Apricot a(String str, int i) {
        return new Almond(str, i);
    }
}
