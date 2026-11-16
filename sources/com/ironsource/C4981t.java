package com.ironsource;

import defpackage.e80;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4981t {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    public static final String e = "capping";

    @NotNull
    public static final String f = "pacing";

    @NotNull
    public static final String g = "delivery";

    @NotNull
    public static final String h = "progressiveLoadingConfig";

    @NotNull
    public static final String i = "expiredDurationInMinutes";

    @NotNull
    public static final String j = "reward";

    @NotNull
    public static final String k = "name";

    @NotNull
    public static final String l = "amount";

    @NotNull
    public static final String m = "virtualItemName";

    @NotNull
    public static final String n = "virtualItemCount";
    public static final long o = 60;

    @NotNull
    private final Map<String, b> a;

    @NotNull
    private final b b;

    @NotNull
    private final Map<String, b> c;

    /* JADX INFO: renamed from: com.ironsource.t$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @Nullable
        private final H3 a;

        @Nullable
        private final C4781hd b;

        @Nullable
        private final Q4 c;

        @Nullable
        private final Long d;

        @Nullable
        private final Ud e;

        @Nullable
        private final Ud f;

        @Nullable
        private final Hd g;

        @Nullable
        public final Ud a() {
            return this.e;
        }

        @Nullable
        public final H3 b() {
            return this.a;
        }

        @Nullable
        public final Q4 c() {
            return this.c;
        }

        @Nullable
        public final Long d() {
            return this.d;
        }

        @Nullable
        public final C4781hd e() {
            return this.b;
        }

        @Nullable
        public final Ud f() {
            return this.f;
        }

        @Nullable
        public final Hd g() {
            return this.g;
        }

        public b(@NotNull JSONObject jSONObject) throws JSONException {
            H3 h3;
            C4781hd c4781hd;
            Q4 q4;
            Long lValueOf;
            Ud ud;
            jSONObject.getClass();
            Hd hd = null;
            if (jSONObject.has(C4981t.e)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(C4981t.e);
                jSONObject2.getClass();
                h3 = new H3(jSONObject2);
            } else {
                h3 = null;
            }
            this.a = h3;
            if (jSONObject.has(C4981t.f)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(C4981t.f);
                jSONObject3.getClass();
                c4781hd = new C4781hd(jSONObject3);
            } else {
                c4781hd = null;
            }
            this.b = c4781hd;
            if (jSONObject.has(C4981t.g)) {
                q4 = new Q4(jSONObject.getBoolean(C4981t.g));
            } else {
                q4 = null;
            }
            this.c = q4;
            if (jSONObject.has(C4981t.i)) {
                lValueOf = Long.valueOf(jSONObject.getLong(C4981t.i));
            } else {
                lValueOf = null;
            }
            this.d = lValueOf;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4981t.j);
            if (jSONObjectOptJSONObject != null) {
                ud = new Ud(jSONObjectOptJSONObject, "name", "amount");
            } else {
                ud = null;
            }
            this.e = ud;
            Ud ud2 = new Ud(jSONObject, C4981t.m, C4981t.n);
            String strB = ud2.b();
            this.f = (strB == null || strB.length() == 0 || ud2.a() == null) ? null : ud2;
            if (jSONObject.has(C4981t.h)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C4981t.h);
                jSONObject4.getClass();
                hd = new Hd(jSONObject4);
            }
            this.g = hd;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public C4981t(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = new C5013ud(jSONObject).a(new com.moloco.sdk.internal.publisher.d(25));
        this.b = new b(jSONObject);
        this.c = new Y0(jSONObject).a(new com.moloco.sdk.internal.publisher.d(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b a(JSONObject jSONObject) {
        jSONObject.getClass();
        return new b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b b(JSONObject jSONObject) {
        jSONObject.getClass();
        return new b(jSONObject);
    }

    @NotNull
    public final Map<String, b> c() {
        return this.a;
    }

    @NotNull
    public final Map<String, b> a() {
        return this.c;
    }

    @NotNull
    public final b b() {
        return this.b;
    }
}
