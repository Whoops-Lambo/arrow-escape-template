package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.yandex.mobile.ads.common.YandexAds;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class B1 extends C1 {

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f77 = StringFog.decrypt("alO6GVQT/IZA\n", "MzLUfTFrveI=\n");

    public B1(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1, com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String mo335() {
        return YandexAds.getLibraryVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1, com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class mo336(String str) {
        if (str.hashCode() == 1400209119 && str.equals(f77)) {
            return YandexAds.class;
        }
        return super.mo336(str);
    }
}
