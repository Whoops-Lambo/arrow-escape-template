package com.adsurge.adn.G;

import defpackage.h50;
import defpackage.jc1;
import defpackage.nj;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final AtomicInteger f = new AtomicInteger();
    public final f a;
    public final a b;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicBoolean e = new AtomicBoolean();
    public final String c = String.valueOf(f.incrementAndGet());

    public void a(String str, e.c cVar) {
        if (this.e.get()) {
            cVar.a(null, new IllegalStateException("WebView script scope is destroyed"));
            return;
        }
        String str2 = this.c + "::" + this.d.incrementAndGet();
        this.b.a(str2, cVar);
        if (this.e.get()) {
            this.b.a(str2, (Object) null, new IllegalStateException("WebView script scope is destroyed"));
            return;
        }
        try {
            String str3 = "(function(){var result=null,error=null;try{result=JSON.stringify([(0,eval)(" + JSONObject.quote(str + "\n//# sourceURL=wvjs/" + this.c + ".js") + ")]);}catch(e){error=String(e);}(window.tpljsb||window.parent.tpljsb).complete(" + JSONObject.quote(str2) + ",result,error);})();";
            this.a.a(str2, "window.__wvjs__.evalIn(" + JSONObject.quote(this.c) + "," + JSONObject.quote(str3) + ");");
        } catch (Throwable th) {
            this.b.a(str2, (Object) null, th);
        }
    }

    public void b() {
        if (this.e.compareAndSet(false, true)) {
            this.b.d(this.c);
            this.a.b(this.c);
            this.b.b(this.c);
        }
    }

    public d(f fVar, a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    public void a(String str) {
        String strQ = nj.q(h50.q(str, "\n//# sourceURL=wvjs/"), this.c, ".js");
        this.a.a((Object) this.c, "window.__wvjs__&&window.__wvjs__.evalIn(" + JSONObject.quote(this.c) + "," + JSONObject.quote(strQ) + ");");
    }

    public void a(String str, Class cls, Object obj, b bVar) {
        String strO = jc1.o(this.c, "::", new StringBuilder(), str);
        String strA = this.b.a(strO, cls, obj, bVar);
        this.a.a((Object) this.c, "window.__wvjs__&&window.__wvjs__.bind(" + JSONObject.quote(this.c) + "," + JSONObject.quote(strO) + "," + JSONObject.quote(str) + "," + strA + ");");
    }

    public void a() {
        b();
        this.a.a((Object) this.c, "window.__wvjs__&&window.__wvjs__.destroy(" + JSONObject.quote(this.c) + ");");
    }
}
