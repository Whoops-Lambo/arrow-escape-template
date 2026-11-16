package com.ironsource;

import defpackage.eu;
import defpackage.gg0;
import defpackage.i71;
import defpackage.j71;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Q1 {

    @Nullable
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;

    @NotNull
    private final String f;

    @NotNull
    private final String g;
    private final int h;
    private final int i;
    private final int j;

    @NotNull
    private final List<Integer> k;

    @NotNull
    private final List<Integer> l;

    @NotNull
    private final List<Integer> m;

    @NotNull
    private final List<Integer> n;

    public final int b() {
        return this.h;
    }

    public final boolean c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    @NotNull
    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    @NotNull
    public final List<Integer> h() {
        return this.n;
    }

    @NotNull
    public final List<Integer> i() {
        return this.l;
    }

    @NotNull
    public final List<Integer> j() {
        return this.k;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    @NotNull
    public final String m() {
        return this.f;
    }

    @NotNull
    public final List<Integer> n() {
        return this.m;
    }

    public Q1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        String strOptString = jSONObject.optString("abt");
        strOptString.getClass();
        this.a = strOptString.length() <= 0 ? null : strOptString;
        this.b = jSONObject.optBoolean(S1.a, false);
        this.c = jSONObject.optBoolean(S1.b, false);
        this.d = jSONObject.optBoolean(S1.c, false);
        this.e = jSONObject.optInt(S1.d, -1);
        String strOptString2 = jSONObject.optString(S1.e);
        strOptString2.getClass();
        this.f = strOptString2;
        String strOptString3 = jSONObject.optString(S1.f);
        strOptString3.getClass();
        this.g = strOptString3;
        this.h = jSONObject.optInt(S1.g, -1);
        this.i = jSONObject.optInt(S1.h, -1);
        this.j = jSONObject.optInt(S1.i, 5000);
        this.k = a(jSONObject, S1.j);
        this.l = a(jSONObject, S1.k);
        this.m = a(jSONObject, S1.l);
        this.n = a(jSONObject, S1.m);
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            j71 j71VarD = tb5.D(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(eu.f(j71VarD, 10));
            i71 it = j71VarD.iterator();
            while (it.d) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(it.nextInt())));
            }
            return arrayList;
        }
        return gg0.a;
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
