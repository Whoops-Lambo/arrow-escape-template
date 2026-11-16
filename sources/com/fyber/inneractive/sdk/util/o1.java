package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o1 {
    public static String a(String str) {
        com.fyber.inneractive.sdk.config.q0 q0Var;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        HashMap map = iAConfigManager.a;
        com.fyber.inneractive.sdk.config.v0 v0Var = (map == null || !map.containsKey(str)) ? null : (com.fyber.inneractive.sdk.config.v0) iAConfigManager.a.get(str);
        UnitDisplayType unitDisplayType4 = UnitDisplayType.BANNER;
        if (v0Var == null) {
            return unitDisplayType4.name().toLowerCase(Locale.US);
        }
        for (int i = 0; i < v0Var.a.size(); i++) {
            com.fyber.inneractive.sdk.config.w0 w0Var = (com.fyber.inneractive.sdk.config.w0) v0Var.a.get(i);
            if (w0Var != null && ((q0Var = w0Var.c) != null || w0Var.f != null || w0Var.e != null)) {
                if (q0Var == null || (unitDisplayType3 = q0Var.b) == null || unitDisplayType3.isDeprecated() || UnitDisplayType.DEFAULT == unitDisplayType3) {
                    com.fyber.inneractive.sdk.config.y0 y0Var = w0Var.f;
                    if (y0Var != null && (unitDisplayType2 = y0Var.j) != null && !unitDisplayType2.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType2) {
                        unitDisplayType4 = w0Var.f.j;
                    } else if (w0Var.e != null && (unitDisplayType = UnitDisplayType.NATIVE) != null && !unitDisplayType.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType) {
                        w0Var.e.getClass();
                        unitDisplayType4 = unitDisplayType;
                    }
                } else {
                    unitDisplayType4 = w0Var.c.b;
                }
                if (UnitDisplayType.MRECT == unitDisplayType4) {
                    unitDisplayType4 = UnitDisplayType.BANNER;
                }
                if (UnitDisplayType.REWARDED == unitDisplayType4 || UnitDisplayType.INTERSTITIAL == unitDisplayType4 || UnitDisplayType.BANNER == unitDisplayType4 || UnitDisplayType.NATIVE == unitDisplayType4) {
                    return unitDisplayType4.name().toLowerCase(Locale.US);
                }
            }
        }
        return UnitDisplayType.BANNER.name().toLowerCase(Locale.US);
    }
}
