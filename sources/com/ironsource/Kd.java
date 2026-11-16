package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.e80;
import defpackage.eu;
import defpackage.gg0;
import defpackage.i71;
import defpackage.j71;
import defpackage.rh1;
import defpackage.s71;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Kd {

    @NotNull
    private final Map<LevelPlay.AdFormat, a> a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final C0358a c = new C0358a(null);

        @NotNull
        private static final String d = "adUnitId";

        @NotNull
        private static final String e = "instances";

        @NotNull
        private final Map<String, b> a;

        @NotNull
        private final List<c> b;

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("instances");
            return new c(strOptString, jSONArrayOptJSONArray != null ? C4921pa.b(jSONArrayOptJSONArray) : null);
        }

        /* JADX INFO: renamed from: com.ironsource.Kd$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C0358a {
            public /* synthetic */ C0358a(e80 e80Var) {
                this();
            }

            private C0358a() {
            }
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("preload");
            if (jSONArrayOptJSONArray == null) {
                return gg0.a;
            }
            j71 j71VarD = tb5.D(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            i71 it = j71VarD.iterator();
            while (it.d) {
                c cVarA = a(jSONArrayOptJSONArray.optJSONObject(it.nextInt()));
                if (cVarA != null) {
                    arrayList.add(cVarA);
                }
            }
            return arrayList;
        }

        public a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.getClass();
            Iterable iterableB = C4921pa.b(jSONObject.names());
            iterableB = iterableB == null ? gg0.a : iterableB;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterableB) {
                if (!s71.b((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            int iU = rh1.U(eu.f(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray((String) obj2);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                linkedHashMap.put(obj2, new b(jSONArrayOptJSONArray));
            }
            this.a = linkedHashMap;
            this.b = b(jSONObject);
        }

        @NotNull
        public final Map<String, b> a() {
            return this.a;
        }

        @NotNull
        public final List<c> b() {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @NotNull
        private final List<String> a;

        @NotNull
        public final List<String> a() {
            return this.a;
        }

        public b(@NotNull JSONArray jSONArray) throws JSONException {
            jSONArray.getClass();
            List<String> listB = C4921pa.b(jSONArray);
            listB.getClass();
            this.a = listB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c {

        @Nullable
        private final String a;

        @Nullable
        private final List<String> b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s71.b(this.a, cVar.a) && s71.b(this.b, cVar.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(str, list);
        }

        @Nullable
        public final List<String> b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @Nullable
        public final List<String> d() {
            return this.b;
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.a + ", instanceIds=" + this.b + ")";
        }

        public c(@Nullable String str, @Nullable List<String> list) {
            this.a = str;
            this.b = list;
        }

        @NotNull
        public final c a(@Nullable String str, @Nullable List<String> list) {
            return new c(str, list);
        }

        @Nullable
        public final String a() {
            return this.a;
        }
    }

    public Kd(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iU = rh1.U(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(If.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceNetworkBridge.jsonObjectInit();
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.a = linkedHashMap;
    }

    @NotNull
    public final List<c> a(@NotNull LevelPlay.AdFormat adFormat) {
        List<c> listB;
        adFormat.getClass();
        a aVar = this.a.get(adFormat);
        if (aVar != null && (listB = aVar.b()) != null) {
            return listB;
        }
        return gg0.a;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.a;
    }
}
