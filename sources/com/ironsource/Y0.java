package com.ironsource;

import defpackage.e80;
import defpackage.hg0;
import defpackage.ix;
import defpackage.l92;
import defpackage.p92;
import defpackage.wr0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y0 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "adUnits";

    @Nullable
    private final JSONObject a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public Y0(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optJSONObject(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull wr0 wr0Var) throws JSONException {
        wr0Var.getClass();
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            l92 l92VarF = p92.F(itKeys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : (ix) l92VarF) {
                JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
                jSONObject2.getClass();
                linkedHashMap.put(obj, wr0Var.invoke(jSONObject2));
            }
            return linkedHashMap;
        }
        return hg0.a;
    }
}
