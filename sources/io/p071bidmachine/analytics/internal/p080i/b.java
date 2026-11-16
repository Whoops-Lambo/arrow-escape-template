package io.p071bidmachine.analytics.internal.p080i;

import defpackage.dk2;
import defpackage.e80;
import io.p071bidmachine.analytics.internal.p072a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements io.p071bidmachine.analytics.internal.p080i.a.InterfaceC1582a {
    public static final a f = new a(null);
    private final f a;
    private final f b;
    private final f c;
    private final f d;
    private final Map e;

    private final boolean a(f fVar, f fVar2, f fVar3) {
        return (fVar == null || fVar2 == null || fVar3 == null || fVar.compareTo(fVar2) < 0 || fVar.compareTo(fVar3) > 0) ? false : true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        public final b a(String str) {
            Iterator<String> itKeys;
            try {
                if (!dk2.Z(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("afpath");
                    if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            f fVarA = f.d.a(next);
                            if (fVarA != null) {
                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(next);
                                if (jSONArrayOptJSONArray == null) {
                                    jSONArrayOptJSONArray = new JSONArray();
                                }
                                ArrayList arrayList = new ArrayList();
                                int length = jSONArrayOptJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                                }
                                linkedHashMap.put(fVarA, arrayList);
                            }
                        }
                    }
                    f.a aVar = f.d;
                    return new b(aVar.a(jSONObject.optString("afmin")), aVar.a(jSONObject.optString("afmax")), aVar.a(jSONObject.optString("adjmin")), aVar.a(jSONObject.optString("adjmax")), linkedHashMap);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public final boolean b(f fVar) {
        return a(fVar, this.a, this.b);
    }

    public b(f fVar, f fVar2, f fVar3, f fVar4, Map map) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
        this.d = fVar4;
        this.e = map;
    }

    public final boolean a(f fVar) {
        return a(fVar, this.c, this.d);
    }

    public final Map a() {
        return this.e;
    }
}
