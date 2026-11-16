package com.ironsource;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4891ng {

    @NotNull
    private final String[] a = C4873mg.a.a();

    @NotNull
    private final T6 b = new T6();

    @NotNull
    public final JSONObject a(@NotNull Context context) {
        context.getClass();
        JSONObject jSONObjectA = this.b.a(context, this.a);
        jSONObjectA.getClass();
        return a(jSONObjectA);
    }

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.b.a(this.a);
        jSONObjectA.getClass();
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = U6.b(jSONObject.optJSONObject(R6.u));
        if (jSONObjectB != null) {
            jSONObject.put(R6.u, jSONObjectB);
        }
        return jSONObject;
    }
}
