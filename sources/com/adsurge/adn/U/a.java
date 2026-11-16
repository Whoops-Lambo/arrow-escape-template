package com.adsurge.adn.U;

import com.adsurge.adn.Y0.e;
import com.adsurge.adn.Y0.h;
import com.adsurge.adn.Y0.i;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a implements h {
    public final h.a a = new C0092a();
    public final h.c b = new c();
    public final h.b c = new b();

    /* JADX INFO: renamed from: com.adsurge.adn.U.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0092a implements h.a {
        @Override // com.adsurge.adn.Y0.h.a
        public int d() {
            return 1;
        }

        @Override // com.adsurge.adn.Y0.h.a
        public String a() {
            return "event";
        }

        @Override // com.adsurge.adn.Y0.h.a
        public String b() {
            return "odc_database";
        }

        @Override // com.adsurge.adn.Y0.h.a
        public String c() {
            return "performance";
        }

        @Override // com.adsurge.adn.Y0.h.a
        public String e() {
            return "odc_stat.db";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b implements h.b {
        @Override // com.adsurge.adn.Y0.h.b
        public void a(e eVar) {
        }

        @Override // com.adsurge.adn.Y0.h.b
        public void b(e eVar) {
        }

        @Override // com.adsurge.adn.Y0.h.b
        public void a(i iVar) {
        }

        @Override // com.adsurge.adn.Y0.h.b
        public void b(i iVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c implements h.c {
        @Override // com.adsurge.adn.Y0.h.c
        public com.adsurge.adn.I0.e a() {
            return new com.adsurge.adn.I0.e(com.adsurge.adn.p059u.h.h().k());
        }

        @Override // com.adsurge.adn.Y0.h.c
        public String d() {
            return "";
        }

        @Override // com.adsurge.adn.Y0.h.c
        public String b() {
            return com.adsurge.adn.p069z.a.j();
        }

        @Override // com.adsurge.adn.Y0.h.c
        public boolean c() {
            if (com.adsurge.adn.K.b.f().e() == null) {
                return true;
            }
            return false;
        }

        @Override // com.adsurge.adn.Y0.h.c
        public Object b(JSONArray jSONArray) {
            return jSONArray.toString();
        }

        @Override // com.adsurge.adn.Y0.h.c
        public Object a(JSONArray jSONArray) {
            return jSONArray;
        }

        @Override // com.adsurge.adn.Y0.h.c
        public com.adsurge.adn.H0.a a(String str, String str2) {
            return new com.adsurge.adn.T.c(str, com.adsurge.adn.H0.a.EnumC0076a.POST, str2.getBytes(com.adsurge.adn.B0.a.a));
        }
    }

    @Override // com.adsurge.adn.Y0.h
    public h.c a() {
        return this.b;
    }

    @Override // com.adsurge.adn.Y0.h
    public h.b b() {
        return this.c;
    }

    @Override // com.adsurge.adn.Y0.h
    public h.a c() {
        return this.a;
    }
}
