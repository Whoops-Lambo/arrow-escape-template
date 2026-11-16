package com.adsurge.adn.p010c;

import android.text.TextUtils;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.adsbiz.services.ProbeService;
import com.adsurge.adn.p007b.c;
import com.adsurge.adn.p007b.d;
import com.ironsource.C4788i2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class e implements d {
    public static Boolean b;
    public static Boolean c;
    public static String d;
    public static final boolean e;
    public static final int f;
    public final d a;

    static {
        e = b.a("odcps", 1, (AdSurgeAdFormat) null, (String) null) == 1;
        f = b.a("asicc", 1, (AdSurgeAdFormat) null, (String) null);
    }

    public static String b(int i) {
        return i == 0 ? "1" : C4788i2.f;
    }

    @Override // com.adsurge.adn.p010c.d
    public c a() {
        c cVarA = this.a.a();
        if (!e) {
            return cVarA;
        }
        cVarA.Z = d.a(ProbeService.h());
        cVarA.a0 = String.valueOf(ProbeService.g());
        if (b == null || c == null) {
            int i = f;
            b = Boolean.valueOf(i > 0);
            c = Boolean.valueOf(i == 1);
        }
        if (b.booleanValue()) {
            if (c.booleanValue()) {
                if (TextUtils.isEmpty(d)) {
                    d = b(ProbeService.f());
                }
                cVarA.b0 = d;
            } else {
                cVarA.b0 = b(ProbeService.f());
            }
        }
        cVarA.c0 = a(ProbeService.e());
        cVarA.d0 = ProbeService.b();
        cVarA.e0 = ProbeService.c();
        cVarA.f0 = String.valueOf(ProbeService.d());
        return cVarA;
    }

    public e(d dVar) {
        this.a = dVar;
    }

    public static String a(int i) {
        return i == 0 ? C4788i2.f : "1";
    }
}
