package com.adsurge.adn.p070z0;

import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p035k0.o;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p060u0.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends i {
    public boolean E = false;

    /* JADX INFO: renamed from: com.adsurge.adn.z0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0151a implements o.c {
        public C0151a() {
        }

        @Override // com.adsurge.adn.k0.o.c
        public void a(int i) {
            a.this.o(i);
        }
    }

    public abstract void a(CharSequence charSequence);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract boolean c(int[] iArr);

    public abstract void m(int i);

    public abstract void n(int i);

    public abstract void o(int i);

    public abstract void p(int i);

    public abstract void q(int i);

    @Override // com.adsurge.adn.p038l0.i
    public boolean a(String str, h hVar) {
        if (!c(str, hVar) && !super.a(str, hVar)) {
            return false;
        }
        return true;
    }

    public final boolean c(String str, h hVar) {
        str.getClass();
        boolean z = false;
        switch (str) {
            case "14":
                m(o.c(hVar));
                return true;
            case "70":
                if (!this.E) {
                    if ((hVar.e(new JSONObject[0]) & 1) == 1) {
                        z = true;
                    }
                    b(z);
                }
                return true;
            case "71":
                d dVar = this.n;
                if (dVar instanceof com.adsurge.adn.p060u0.a) {
                    ((com.adsurge.adn.p060u0.a) dVar).p();
                }
                a(hVar.toString());
                return true;
            case "72":
                p(hVar.e(new JSONObject[0]));
                return true;
            case "73":
                o.a(hVar, d().e(), new C0151a());
                return true;
            case "74":
                q(hVar.e(new JSONObject[0]));
                return true;
            case "75":
                n(hVar.e(new JSONObject[0]));
                return true;
            case "80":
                this.E = c(o.a(hVar));
                return true;
            case "enableMarquee":
                if (hVar.e(new JSONObject[0]) == 1) {
                    z = true;
                }
                c(z);
                return true;
            default:
                return false;
        }
    }
}
