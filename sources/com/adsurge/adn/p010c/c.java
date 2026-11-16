package com.adsurge.adn.p010c;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.adsurge.adn.I0.i;
import com.adsurge.adn.N.b;
import com.adsurge.adn.X.AbstractC1630c;
import com.adsurge.adn.X.j;
import com.adsurge.adn.X.o;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p007b.d;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c implements d {
    public final Context a;
    public d b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public static float a;
        public static int b;
        public static int c;
        public static int d;
        public static int e;
        public static int f;
        public static int g;
    }

    @Override // com.adsurge.adn.p010c.d
    public com.adsurge.adn.p007b.c a() {
        int i;
        d dVar = this.b;
        com.adsurge.adn.p007b.c cVarA = dVar != null ? dVar.a() : new com.adsurge.adn.p007b.c();
        if (a.b == 0 || (i = a.c) == 0) {
            Pair pairO = o.o();
            if (pairO != null && !o.a.equals(pairO)) {
                cVarA.z = String.valueOf(i.b(this.a, ((Integer) pairO.first).intValue()));
                cVarA.y = String.valueOf(i.b(this.a, ((Integer) pairO.second).intValue()));
                a.c = ((Integer) pairO.first).intValue();
                a.b = ((Integer) pairO.second).intValue();
            } else if (pairO == null) {
                cVarA.z = "-777";
                cVarA.y = "-777";
            }
        } else {
            cVarA.z = String.valueOf(i.b(this.a, i));
            cVarA.y = String.valueOf(i.b(this.a, a.b));
        }
        cVarA.A = d.a(o.d(this.a));
        cVarA.B = b.a(o.P());
        cVarA.C = b.a(o.e(this.a));
        int i2 = a.d;
        if (i2 != 0) {
            cVarA.M = String.valueOf(i2);
        } else if (b.a("cxc", 0, (AdSurgeAdFormat) null, (String) null) > 0) {
            a.d = -999;
        } else {
            boolean zR = o.R();
            cVarA.M = d.a(zR);
            a.d = zR ? 1 : -1;
        }
        Intent intentC = o.c(this.a);
        cVarA.D = d.a(o.a(intentC));
        cVarA.E = d.a(o.b(intentC));
        cVarA.F = d.a(j.d(this.a));
        int i3 = a.e;
        if (i3 != 0) {
            cVarA.G = String.valueOf(i3);
        } else {
            boolean zE = j.e(this.a);
            cVarA.G = d.a(zE);
            a.e = zE ? 1 : -1;
        }
        int i4 = a.f;
        if (i4 != 0) {
            cVarA.N = String.valueOf(i4);
        } else {
            boolean zO = o.O();
            cVarA.N = d.a(zO);
            a.f = zO ? 1 : -1;
        }
        int i5 = a.g;
        if (i5 != 0) {
            cVarA.O = String.valueOf(i5);
        } else {
            Boolean boolM = o.M();
            if (boolM == null) {
                a.g = -999;
            } else {
                cVarA.O = d.a(boolM.booleanValue());
                a.g = boolM.booleanValue() ? 1 : -1;
            }
        }
        cVarA.H = b.a(j.c());
        cVarA.I = AbstractC1630c.a(this.a);
        cVarA.J = String.valueOf(j.a(this.a));
        float f = a.a;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            cVarA.x = String.valueOf(f);
        } else {
            Float fA = com.adsurge.adn.J.a.d().c().a();
            cVarA.x = b.a(fA);
            if (fA != null) {
                a.a = fA.floatValue();
            }
        }
        cVarA.V = String.valueOf(com.adsurge.adn.p007b.a.c());
        cVarA.W = String.valueOf(com.adsurge.adn.p007b.a.b());
        cVarA.Y = com.adsurge.adn.P.a.b().a();
        cVarA.toString();
        return cVarA;
    }

    public c(Context context, d dVar) {
        this.a = context;
        this.b = dVar;
    }
}
