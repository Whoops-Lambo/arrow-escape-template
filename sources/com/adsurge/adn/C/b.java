package com.adsurge.adn.C;

import com.adsurge.adn.I0.g;
import com.adsurge.adn.X.q;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final Map a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ c a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ com.adsurge.adn.u1.c c;

        public a(c cVar, JSONObject jSONObject, com.adsurge.adn.u1.c cVar2) {
            this.a = cVar;
            this.b = jSONObject;
            this.c = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.C.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class C0067b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void a(JSONArray jSONArray, Map map, com.adsurge.adn.u1.c cVar) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("type");
                c cVar2 = map != null ? (c) map.get(strOptString) : null;
                if (cVar2 == null) {
                    cVar2 = (c) this.a.get(strOptString);
                }
                if (cVar2 != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_PAYLOAD);
                    d dVarA = cVar2.a();
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    }
                    a(dVarA, cVar2, jSONObjectOptJSONObject2, cVar);
                }
            }
        }
    }

    public b() {
        for (com.adsurge.adn.C.a aVar : com.adsurge.adn.C.a.values()) {
            this.a.put(aVar.a, aVar);
        }
    }

    public static void a(d dVar, c cVar, JSONObject jSONObject, com.adsurge.adn.u1.c cVar2) {
        a aVar = new a(cVar, jSONObject, cVar2);
        int i = C0067b.a[dVar.ordinal()];
        if (i == 1) {
            g.c(aVar);
        } else if (i != 2) {
            aVar.run();
        } else {
            q.b.execute(aVar);
        }
    }
}
