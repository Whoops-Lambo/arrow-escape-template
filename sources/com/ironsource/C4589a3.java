package com.ironsource;

import defpackage.eu;
import defpackage.w01;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4589a3 {

    @NotNull
    private final a a;

    @NotNull
    private final Map<String, a> b;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @Nullable
        private final JSONObject a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;

        @NotNull
        private final List<String> f;

        @NotNull
        public final List<String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }

        public a(@NotNull JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2;
            long jOptLong;
            float fOptInt;
            List<String> listZ;
            jSONObject.getClass();
            if (jSONObject.has(C4681c3.a)) {
                jSONObject2 = jSONObject;
            } else {
                jSONObject2 = null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(C4681c3.a) : null;
            this.a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(C4681c3.b, 25000) : 25000;
            this.b = iOptInt;
            this.c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(C4681c3.d) && !jSONObjectOptJSONObject.isNull(C4681c3.d)) {
                jOptLong = jSONObjectOptJSONObject.optLong(C4681c3.d);
            } else {
                jOptLong = iOptInt;
            }
            this.d = jOptLong;
            if (jSONObject.has(C4681c3.e)) {
                fOptInt = jSONObject.optInt(C4681c3.e) / 100.0f;
            } else {
                fOptInt = 0.15f;
            }
            this.e = fOptInt;
            if (jSONObject.has(C4681c3.f)) {
                listZ = C4921pa.b(jSONObject.getJSONArray(C4681c3.f));
            } else {
                listZ = eu.z("BANNER", com.ironsource.mediationsdk.j.d);
            }
            listZ.getClass();
            this.f = listZ;
        }
    }

    public C4589a3(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = new a(jSONObject);
        this.b = new Y0(jSONObject).a(new w01(24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(JSONObject jSONObject) {
        jSONObject.getClass();
        return new a(jSONObject);
    }

    @NotNull
    public final a b() {
        return this.a;
    }

    @NotNull
    public final Map<String, a> a() {
        return this.b;
    }
}
