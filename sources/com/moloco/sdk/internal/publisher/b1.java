package com.moloco.sdk.internal.publisher;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b1 {
    public static final b1 a;
    public static final b1 b;
    public static final b1 c;
    public static final b1 d;
    public static final b1 e;
    public static final b1 f;
    public static final b1 g;
    public static final b1 h;
    public static final /* synthetic */ b1[] i;

    static {
        b1 b1Var = new b1("BANNER", 0);
        a = b1Var;
        b1 b1Var2 = new b1("BANNER_TABLET", 1);
        b = b1Var2;
        b1 b1Var3 = new b1(BrandSafetyUtils.o, 2);
        c = b1Var3;
        b1 b1Var4 = new b1("INLINE_ADAPTIVE_BANNER", 3);
        d = b1Var4;
        b1 b1Var5 = new b1("ANCHORED_ADAPTIVE_BANNER", 4);
        e = b1Var5;
        b1 b1Var6 = new b1("NATIVE_AD_MEDIATION", 5);
        f = b1Var6;
        b1 b1Var7 = new b1("NATIVE_BANNER", 6);
        b1 b1Var8 = new b1(AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL, 7);
        g = b1Var8;
        b1 b1Var9 = new b1("REWARDED", 8);
        h = b1Var9;
        i = new b1[]{b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, b1Var9};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) i.clone();
    }
}
