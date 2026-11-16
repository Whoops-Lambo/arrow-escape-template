package com.adsurge.adn.p011c0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public g a;
    public c b = new com.adsurge.adn.p029i0.a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: com.adsurge.adn.c0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0102b {
        c a();

        d.a b();

        g c();

        d d();
    }

    public d.a b() {
        return null;
    }

    public d c() {
        return null;
    }

    public static b e() {
        return a.a;
    }

    public g d() {
        return this.a;
    }

    public void a(InterfaceC0102b interfaceC0102b) {
        interfaceC0102b.b();
        this.a = interfaceC0102b.c();
        interfaceC0102b.d();
        c cVarA = interfaceC0102b.a();
        if (cVarA != null) {
            this.b = cVarA;
        }
    }

    public c a() {
        return this.b;
    }
}
