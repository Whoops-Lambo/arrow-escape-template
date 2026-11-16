package com.adsurge.adn.E1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class B {
    public final com.adsurge.adn.F1.g a;
    public int b = -1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.a();
        }
    }

    public final void a() {
        int i = this.b;
        com.adsurge.adn.F1.g gVar = this.a;
        if (gVar == null) {
            this.b = -1;
            return;
        }
        if (i == 0) {
            gVar.a(new com.adsurge.adn.F1.b("onPageShown", null));
        } else {
            gVar.a(new com.adsurge.adn.F1.b("onPageHidden", null));
        }
        this.b = -1;
    }

    public B(com.adsurge.adn.F1.g gVar) {
        this.a = gVar;
    }

    public void a(int i) {
        if (this.b != -1) {
            this.b = i;
        } else {
            this.b = i;
            com.adsurge.adn.I0.g.a(new a(), 10L);
        }
    }
}
