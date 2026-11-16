package com.adsurge.adn.G0;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        High(1),
        Mid(2),
        Low(3);

        public int a;

        public int b() {
            return this.a;
        }

        a(int i) {
            this.a = i;
        }
    }

    Future a(com.adsurge.adn.H0.a aVar);

    Future a(com.adsurge.adn.H0.a aVar, b bVar);

    Future a(com.adsurge.adn.H0.a aVar, a aVar2);

    Future a(com.adsurge.adn.H0.a aVar, a aVar2, b bVar);
}
