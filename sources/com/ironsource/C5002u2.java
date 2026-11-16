package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.i71;
import defpackage.j52;
import defpackage.j71;
import defpackage.tb5;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5002u2 {

    @NotNull
    public static final b h = new b(null);

    @Nullable
    private final String a;

    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a b;

    @NotNull
    private final C5074y2 c;

    @Nullable
    private final JSONObject d;

    @Nullable
    private final JSONObject e;

    @Nullable
    private final C4895o2 f;

    @Nullable
    private final C5092z2 g;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final String b;

        @Nullable
        private final String c;

        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a d;

        @NotNull
        private final C5074y2 e;

        @Nullable
        private final JSONObject f;

        @Nullable
        private final JSONObject g;

        @Nullable
        private final C4895o2 h;

        @Nullable
        private final C5092z2 i;

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (jSONArrayOptJSONArray != null) {
                j71 j71VarD = tb5.D(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                i71 it = j71VarD.iterator();
                while (it.d) {
                    int iNextInt = it.nextInt();
                    C5074y2 c5074y2 = new C5074y2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c5074y2.n()) {
                        c5074y2 = null;
                    }
                    if (c5074y2 != null) {
                        arrayList2.add(c5074y2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C1376a(arrayList);
        }

        private final C5074y2 c(JSONObject jSONObject) {
            return new C5074y2(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public a(@NotNull JSONObject jSONObject, @NotNull String str) {
            jSONObject.getClass();
            str.getClass();
            this.a = jSONObject;
            this.b = str;
            JSONObject jSONObjectA = a(jSONObject);
            this.c = jSONObject.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(jSONObject, jSONObjectA);
            this.d = aVarA;
            this.e = c(jSONObjectA);
            this.f = d(jSONObjectA);
            this.g = b(jSONObjectA);
            this.h = a(aVarA, str);
            this.i = b(aVarA, str);
        }

        private final C5092z2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C5074y2 c5074y2A = aVar.a(str);
            if (c5074y2A != null) {
                String strK = c5074y2A.k();
                strK.getClass();
                return new C5092z2(strK);
            }
            return null;
        }

        @NotNull
        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        @NotNull
        public final JSONObject b() {
            return this.a;
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        @NotNull
        public final C5002u2 a() {
            return new C5002u2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        private final C4895o2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C5074y2 c5074y2A = aVar.a(str);
            if (c5074y2A == null) {
                return null;
            }
            C4895o2 c4895o2 = new C4895o2();
            c4895o2.a(c5074y2A.b());
            c4895o2.c(c5074y2A.h());
            c4895o2.b(c5074y2A.g());
            return c4895o2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public /* synthetic */ b(e80 e80Var) {
            this();
        }

        private final Object a(C5002u2 c5002u2, String str) {
            String strB = c5002u2.b();
            if (strB != null && strB.length() != 0) {
                if (c5002u2.i()) {
                    return new j52(new C4740f8(C5095z5.a.f()));
                }
                C5074y2 c5074y2A = c5002u2.a(str);
                if (c5074y2A == null) {
                    return new j52(new C4740f8(C5095z5.a.j()));
                }
                String strK = c5074y2A.k();
                if (strK != null && strK.length() != 0) {
                    return c5002u2;
                }
                return new j52(new C4740f8(C5095z5.a.e()));
            }
            return new j52(new C4740f8(C5095z5.a.i()));
        }

        private b() {
        }

        @NotNull
        public final Object a(@NotNull JSONObject jSONObject, @NotNull String str) {
            jSONObject.getClass();
            str.getClass();
            return a(new a(jSONObject, str).a(), str);
        }
    }

    @Nullable
    public final String a() {
        C5092z2 c5092z2 = this.g;
        if (c5092z2 != null) {
            return c5092z2.d();
        }
        return null;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    @Nullable
    public final C4895o2 c() {
        return this.f;
    }

    @Nullable
    public final JSONObject d() {
        return this.e;
    }

    @NotNull
    public final C5074y2 e() {
        return this.c;
    }

    @Nullable
    public final JSONObject f() {
        return this.d;
    }

    @Nullable
    public final C5092z2 g() {
        return this.g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public C5002u2(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a aVar, @NotNull C5074y2 c5074y2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C4895o2 c4895o2, @Nullable C5092z2 c5092z2) {
        aVar.getClass();
        c5074y2.getClass();
        this.a = str;
        this.b = aVar;
        this.c = c5074y2;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c4895o2;
        this.g = c5092z2;
    }

    @Nullable
    public final C5074y2 a(@NotNull String str) {
        str.getClass();
        return a(this.b, str);
    }

    private final C5074y2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
