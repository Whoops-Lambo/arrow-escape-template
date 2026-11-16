package com.adsurge.adn.F0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static final b b = new b();
    public volatile com.adsurge.adn.F0.a a = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.F0.a {
        public a() {
        }

        @Override // com.adsurge.adn.F0.a
        public long a() {
            return System.currentTimeMillis();
        }

        @Override // com.adsurge.adn.F0.a
        public String a(String str, String str2) {
            return str2;
        }

        @Override // com.adsurge.adn.F0.a
        public int a(String str, int i) {
            return i;
        }
    }

    public static b b() {
        return b;
    }

    public String a(String str, String str2) {
        return this.a.a(str, str2);
    }

    public void a(com.adsurge.adn.F0.a aVar) {
        this.a = aVar;
    }

    public int a(String str, int i) {
        return this.a.a(str, i);
    }

    public long a() {
        return this.a.a();
    }
}
