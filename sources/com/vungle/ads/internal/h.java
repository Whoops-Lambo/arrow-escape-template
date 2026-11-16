package com.vungle.ads.internal;

import defpackage.eu;
import defpackage.r91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h {
    public static final e a;
    public static final d b;
    public static final g c;
    public static final f d;
    public static final c e;
    public static final b f;
    public static final a g;
    public static final /* synthetic */ h[] h;

    public final boolean a() {
        return eu.z(f, g).contains(this);
    }

    public abstract boolean a(h hVar);

    static {
        e eVar = new e();
        a = eVar;
        d dVar = new d();
        b = dVar;
        g gVar = new g();
        c = gVar;
        f fVar = new f();
        d = fVar;
        c cVar = new c();
        e = cVar;
        b bVar = new b();
        f = bVar;
        a aVar = new a();
        g = aVar;
        h = new h[]{eVar, dVar, gVar, fVar, cVar, bVar, aVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) h.clone();
    }

    public /* synthetic */ h(String str, int i, int i2) {
        this(str, i);
    }

    public final h b(h hVar) {
        hVar.getClass();
        if (this != hVar && !a(hVar)) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Cannot transition from ");
            sbA.append(name());
            sbA.append(" to ");
            sbA.append(hVar.name());
            String string = sbA.toString();
            r91 r91Var = r.o;
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Illegal state transition", new IllegalStateException(string));
        }
        return hVar;
    }

    public h(String str, int i) {
        super(str, i);
    }
}
