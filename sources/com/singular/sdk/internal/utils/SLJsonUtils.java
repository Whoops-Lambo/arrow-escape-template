package com.singular.sdk.internal.utils;

import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SLJsonUtils {
    private static final SingularLog logger = SingularLog.getLogger("SLJsonUtils");

    public static Map<String, Object> jsonToMap(JSONObject jSONObject) {
        return jSONObject != JSONObject.NULL ? toMap(jSONObject) : new HashMap();
    }

    public static List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object map = jSONArray.get(i);
                if (map instanceof JSONArray) {
                    map = toList((JSONArray) map);
                } else if (map instanceof JSONObject) {
                    map = toMap((JSONObject) map);
                }
                arrayList.add(map);
            } catch (Throwable th) {
                logger.debug(Utils.formatException(th));
                return arrayList;
            }
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object map2 = jSONObject.get(next);
                if (map2 instanceof JSONArray) {
                    map2 = toList((JSONArray) map2);
                } else if (map2 instanceof JSONObject) {
                    map2 = toMap((JSONObject) map2);
                }
                map.put(next, map2);
            }
            return map;
        } catch (Throwable th) {
            logger.debug(Utils.formatException(th));
            return map;
        }
    }
}
