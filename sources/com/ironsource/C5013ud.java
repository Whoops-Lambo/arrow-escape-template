package com.ironsource;

import defpackage.e80;
import defpackage.wr0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5013ud {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "placements";

    @NotNull
    public static final String d = "placementName";

    @Nullable
    private final JSONArray a;

    /* JADX INFO: renamed from: com.ironsource.ud$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public C5013ud(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optJSONArray(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull wr0 wr0Var) throws JSONException {
        wr0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                linkedHashMap.put(jSONObject.optString("placementName"), wr0Var.invoke(jSONObject));
            }
        }
        return linkedHashMap;
    }
}
