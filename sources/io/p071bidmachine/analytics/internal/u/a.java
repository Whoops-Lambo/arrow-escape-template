package io.p071bidmachine.analytics.internal.u;

import defpackage.cm2;
import defpackage.du;
import defpackage.e80;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.pv1;
import defpackage.rc1;
import defpackage.s71;
import defpackage.sr0;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private final String a;
    private final C1608a b;
    private final C1608a c;
    private final gd1 d = new cm2(new c());
    private final gd1 e = new cm2(new b());

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.u.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1608a {
        private final List a;
        private final List b;
        private final List c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1608a)) {
                return false;
            }
            C1608a c1608a = (C1608a) obj;
            return s71.b(this.a, c1608a.a) && s71.b(this.b, c1608a.b) && s71.b(this.c, c1608a.c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C1608a(List list, List list2, List list3, int i, e80 e80Var) {
            int i2 = i & 1;
            gg0 gg0Var = gg0.a;
            this(i2 != 0 ? gg0Var : list, (i & 2) != 0 ? gg0Var : list2, (i & 4) != 0 ? gg0Var : list3);
        }

        public static /* synthetic */ C1608a a(C1608a c1608a, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = c1608a.a;
            }
            if ((i & 2) != 0) {
                list2 = c1608a.b;
            }
            if ((i & 4) != 0) {
                list3 = c1608a.c;
            }
            return c1608a.a(list, list2, list3);
        }

        public final List b() {
            return this.c;
        }

        public final List c() {
            return this.b;
        }

        public final boolean d() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
        }

        public int hashCode() {
            return this.c.hashCode() + pv1.e(this.a.hashCode() * 31, 31, this.b);
        }

        public String toString() {
            return super.toString();
        }

        public C1608a(List list, List list2, List list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final C1608a a(List list, List list2, List list3) {
            return new C1608a(list, list2, list3);
        }

        public final List a() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends rc1 implements sr0 {
        public b() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.d().hashCode() + '_' + du.g0(eu.z(Integer.valueOf(a.this.c().a().size()), Integer.valueOf(a.this.c().c().size()), Integer.valueOf(a.this.c().b().size()), Integer.valueOf(a.this.e().a().size()), Integer.valueOf(a.this.e().c().size()), Integer.valueOf(a.this.e().b().size())), "_", null, null, null, 62);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends rc1 implements sr0 {
        public c() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            a aVar = a.this;
            jSONObject.put("ver", aVar.a());
            jSONObject.put("iaa", new JSONArray((Collection) aVar.c().a()));
            jSONObject.put("iah", new JSONArray((Collection) aVar.c().c()));
            jSONObject.put("iad", new JSONArray((Collection) aVar.c().b()));
            jSONObject.put("sua", new JSONArray((Collection) aVar.e().a()));
            jSONObject.put("suh", new JSONArray((Collection) aVar.e().c()));
            jSONObject.put("sud", new JSONArray((Collection) aVar.e().b()));
            return jSONObject.toString();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b) && s71.b(this.c, aVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.d.getValue();
    }

    public final String b() {
        return (String) this.e.getValue();
    }

    public final C1608a c() {
        return this.b;
    }

    public final C1608a e() {
        return this.c;
    }

    public final boolean f() {
        return this.b.d() && this.c.d();
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public a(String str, C1608a c1608a, C1608a c1608a2) {
        this.a = str;
        this.b = c1608a;
        this.c = c1608a2;
    }

    public String toString() {
        return d();
    }

    public final String a() {
        return this.a;
    }
}
