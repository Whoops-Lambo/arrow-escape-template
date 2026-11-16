package com.adsurge.adn.E;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final c d = new c();
    public final Object a = new Object();
    public final j b = new j();
    public volatile a c = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface d {
        void a(C0071c c0071c);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface e {
        void a(a aVar, C0071c c0071c);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public com.adsurge.adn.E.d a = new com.adsurge.adn.E.d();
        public f b = new f();
        public Map c = new HashMap();

        public JSONObject a() {
            return h.b(this);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.E.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0071c {
        public String a;
        public com.adsurge.adn.E.a b = new com.adsurge.adn.E.a();

        public JSONObject a() {
            return i.b(this);
        }
    }

    public void a(String str, e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.a) {
            a aVarA = h.a(this.c);
            C0071c c0071cC = this.b.c(str);
            eVar.a(aVarA, c0071cC);
            this.c = h.a(aVarA);
            this.b.a(str, c0071cC);
        }
    }

    public a b() {
        return h.a(this.c);
    }

    public C0071c c(String str) {
        return this.b.c(str);
    }

    public void b(String str) {
        this.b.b(str);
    }

    public void a(b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.a) {
            a aVarA = h.a(this.c);
            bVar.a(aVarA);
            this.c = h.a(aVarA);
        }
    }

    public void a(String str, d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.a) {
            C0071c c0071cC = this.b.c(str);
            dVar.a(c0071cC);
            this.b.a(str, c0071cC);
        }
    }

    public static c a() {
        return d;
    }

    public void a(String str) {
        this.b.a(str);
    }
}
