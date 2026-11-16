package com.adsurge.adn.p036k1;

import android.graphics.Color;
import android.text.TextUtils;
import com.adsurge.adn.N.b;
import com.adsurge.adn.u1.c;
import com.adsurge.adn.v1.a;

/* JADX INFO: renamed from: com.adsurge.adn.k1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1637e {
    public static String a(c cVar) {
        return (cVar == null || !b(cVar)) ? "" : a(a.a(cVar.i()));
    }

    public static boolean b(c cVar) {
        return b.a("adms", com.adsurge.adn.p033j1.a.g.intValue(), cVar) == 1;
    }

    public static String a(String str) {
        if (TextUtils.equals("false", str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception unused) {
            return "#66121212";
        }
    }
}
