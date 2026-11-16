package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4877n2 {

    @Nullable
    private final R6.a a;

    @NotNull
    private final ArrayList<String> b = new ArrayList<>(new C4841l2().a());

    @NotNull
    private final T6 c = new T6();

    @NotNull
    public final JSONObject a() {
        JSONObject jSONObjectA;
        R6.a aVar = this.a;
        if (aVar == null || (jSONObjectA = this.c.a(this.b, aVar)) == null) {
            jSONObjectA = this.c.a(this.b);
            jSONObjectA.getClass();
        }
        return a(jSONObjectA);
    }

    public C4877n2(@Nullable R6.a aVar) {
        this.a = aVar;
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = U6.b(jSONObject.optJSONObject(R6.u));
        if (jSONObjectB != null) {
            jSONObject.put(R6.u, jSONObjectB);
        }
        return jSONObject;
    }
}
