package com.ironsource;

import defpackage.du;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class N1 {
    private final boolean a;

    @Nullable
    private final HashSet<String> b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public final int a() {
        return this.f;
    }

    @Nullable
    public final HashSet<String> b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }

    public N1(@NotNull JSONObject jSONObject) throws JSONException {
        HashSet<String> hashSetX0;
        jSONObject.getClass();
        this.a = jSONObject.optBoolean("enabled", false);
        List<String> listB = C4921pa.b(jSONObject.optJSONArray(P1.b));
        if (listB != null) {
            hashSetX0 = du.x0(listB);
        } else {
            hashSetX0 = null;
        }
        this.b = hashSetX0;
        String strOptString = jSONObject.optString(P1.c);
        strOptString.getClass();
        this.c = strOptString;
        String strOptString2 = jSONObject.optString(P1.d);
        strOptString2.getClass();
        this.d = strOptString2;
        this.e = jSONObject.optBoolean(P1.e, false);
        this.f = jSONObject.optInt("timeout", 5000);
        this.g = jSONObject.optBoolean(P1.g, false);
    }
}
