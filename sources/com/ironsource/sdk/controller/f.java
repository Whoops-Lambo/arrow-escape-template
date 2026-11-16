package com.ironsource.sdk.controller;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final C1382a c = new C1382a(null);

        @NotNull
        private final String a;

        @Nullable
        private final JSONObject b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b);
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1382a {
            public /* synthetic */ C1382a(e80 e80Var) {
                this();
            }

            @NotNull
            public final a a(@NotNull String str) throws JSONException {
                str.getClass();
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                String string = jSONObjectJsonObjectInit.getString(b.b);
                JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
                string.getClass();
                return new a(string, jSONObjectOptJSONObject);
            }

            private C1382a() {
            }
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.b;
            }
            return aVar.a(str, jSONObject);
        }

        @Nullable
        public final JSONObject b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @Nullable
        public final JSONObject d() {
            return this.b;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            JSONObject jSONObject = this.b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.a + ", params=" + this.b + ")";
        }

        public a(@NotNull String str, @Nullable JSONObject jSONObject) {
            str.getClass();
            this.a = str;
            this.b = jSONObject;
        }

        @NotNull
        public final a a(@NotNull String str, @Nullable JSONObject jSONObject) {
            str.getClass();
            return new a(str, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public static final a a(@NotNull String str) throws JSONException {
            return c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @NotNull
        private final JSONObject c;

        @NotNull
        private String d;

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final JSONObject c() {
            return this.c;
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        @NotNull
        public final String e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return s71.b(this.d, cVar.d) && s71.b(this.a, cVar.a) && s71.b(this.b, cVar.b) && s71.b(this.c.toString(), cVar.c.toString());
        }

        @NotNull
        public final String f() {
            return this.d;
        }

        @NotNull
        public final JSONObject g() {
            return this.c;
        }

        @NotNull
        public String toString() {
            String str = this.a;
            String str2 = this.b;
            JSONObject jSONObject = this.c;
            StringBuilder sbR = pv1.r("MessageToController(adId=", str, ", command=", str2, ", params=");
            sbR.append(jSONObject);
            sbR.append(")");
            return sbR.toString();
        }

        public c(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            str2.getClass();
            jSONObject.getClass();
            this.a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = n30.f();
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final String h() {
            String string = IronSourceNetworkBridge.jsonObjectInit().put(b.b, this.d).put("adId", this.a).put("params", this.c).toString();
            string.getClass();
            return string;
        }

        @NotNull
        public final c a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            str.getClass();
            str2.getClass();
            jSONObject.getClass();
            return new c(str, str2, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        public final void a(@NotNull String str) {
            str.getClass();
            this.d = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "msgId";

        @NotNull
        public static final String c = "adId";

        @NotNull
        public static final String d = "params";

        @NotNull
        public static final String e = "success";

        @NotNull
        public static final String f = "reason";

        @NotNull
        public static final String g = "command";

        private b() {
        }
    }
}
