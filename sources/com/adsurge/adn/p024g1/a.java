package com.adsurge.adn.p024g1;

import com.adsurge.adn.I0.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements b {
    public final b a;

    /* JADX INFO: renamed from: com.adsurge.adn.g1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0112a implements Runnable {
        public RunnableC0112a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a.a();
        }
    }

    @Override // com.adsurge.adn.p024g1.b
    public void a() {
        if (this.a != null) {
            g.a(new RunnableC0112a());
        }
    }

    public a(b bVar) {
        this.a = bVar;
    }
}
