package com.adsurge.adn.p036k1;

import android.graphics.Bitmap;
import android.util.Pair;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.I0.l;
import com.adsurge.adn.J.a;
import com.adsurge.adn.u1.c;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class h {
    public final e a = new e();

    public h a(boolean z) {
        return a("closeVis", z ? 0 : 2);
    }

    public h e(boolean z) {
        return a("closeToastVis", z ? 0 : 2);
    }

    public h f(boolean z) {
        a("vidMut", !z ? 1 : 0);
        a("volume", z ? 1 : 0);
        return this;
    }

    public h g(boolean z) {
        return a("volumeVis", z ? 0 : 2);
    }

    public final h b(c cVar) {
        if (cVar.w() && cVar.k0() != null) {
            Pair pairA = l.a(cVar.k0().a());
            a("pkgSize", (String) pairA.first);
            a("pkgSizeUnit", (String) pairA.second);
        }
        return this;
    }

    public h c(c cVar) {
        return a(cVar).d().b(cVar).b();
    }

    public final h d() {
        int i;
        int i2;
        boolean zJ = a.d().c().j();
        if (zJ) {
            i = 10;
        } else {
            i = 1;
        }
        a("safeArea", i);
        int i3 = 0;
        if (zJ) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        a("pVis", i2);
        if (!zJ) {
            i3 = 2;
        }
        a("lVis", i3);
        return this;
    }

    public h a() {
        return a("endCardClsVis", 0);
    }

    public h e(String str) {
        return a("videoRes", str);
    }

    public final h a(c cVar) {
        return a("adModel", cVar);
    }

    public JSONObject e() {
        return this.a.a();
    }

    public h a(com.adsurge.adn.C1.c cVar) {
        return a("callback", cVar);
    }

    public h a(String str) {
        return a("adViewParentSize", str);
    }

    public h a(Bitmap bitmap) {
        return a("devLogo", bitmap);
    }

    public h a(com.adsurge.adn.E1.l lVar) {
        return a("webListener", lVar);
    }

    public h c() {
        a("frontCardVis", 2);
        a("endCardVis", 0);
        return this;
    }

    public h a(String str, int i) {
        this.a.a(str, i);
        return this;
    }

    public h a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    public h c(boolean z) {
        return a("negativeFeedbackFirstScoreVis", z ? 0 : 2);
    }

    public h a(String str, Object obj) {
        this.a.a(str, obj);
        return this;
    }

    public h c(String str) {
        return a("landingPageUrl", str);
    }

    public h b() {
        a("frontCardVis", 0);
        a("endCardVis", 2);
        return this;
    }

    public h d(boolean z) {
        return a("negativeFeedbackSecondScoreVis", z ? 0 : 2);
    }

    public h b(boolean z) {
        a("negativeFeedbackVis", z ? 0 : 2);
        a("privacyPolicyVis", z ? 2 : 0);
        return this;
    }

    public h d(String str) {
        return a("negativeFeedbackSubmitColor", str);
    }

    public h b(String str, String str2) {
        return a(str, str2);
    }

    public h b(String str) {
        return a("devName", str);
    }
}
