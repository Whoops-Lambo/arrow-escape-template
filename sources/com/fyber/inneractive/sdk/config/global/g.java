package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    public static JSONArray a(Map map, boolean z) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.i iVar : map.values()) {
                iVar.getClass();
                ArrayList arrayList = new ArrayList(iVar.c.values());
                HashMap map2 = iVar.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    b bVar = (b) obj;
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar != null ? bVar.a : null;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = (k) map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            ArrayList arrayList2 = bVar.d;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            do {
                                if (i2 >= size2) {
                                    dVar = null;
                                    break;
                                }
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                dVar = (d) obj2;
                            } while (!c.class.equals(dVar.getClass()));
                            if (dVar != null && ((c) dVar).b) {
                                HashSet hashSet = ((c) dVar).a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
