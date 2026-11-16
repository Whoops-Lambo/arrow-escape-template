package com.adsurge.adn.X;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.G0.b {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            try {
                if (bVar.b() == 200) {
                    D.a(this.a);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, Exception exc) {
        }
    }

    public static int a(long j) {
        return (int) (((((j + 28800000) / 1000) / 60) / 60) / 24);
    }

    public static void b() {
        int iA;
        if (com.adsurge.adn.K.b.a(6001402) || (iA = a(com.adsurge.adn.N.d.b().a())) == a()) {
            return;
        }
        com.adsurge.adn.R.c.a().a(new com.adsurge.adn.T.c(com.adsurge.adn.p069z.a.j(), com.adsurge.adn.H0.a.EnumC0076a.POST, com.adsurge.adn.p059u.h.i().k().toString().getBytes()), com.adsurge.adn.G0.c.a.High, new a(iA));
    }

    public static void a(int i) {
        x.b("last_report_day", i);
    }

    public static int a() {
        return x.a("last_report_day", -1);
    }
}
