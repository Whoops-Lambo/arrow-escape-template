package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.dt1;
import defpackage.ek2;
import defpackage.ov1;
import defpackage.qh1;
import defpackage.s71;
import defpackage.tb5;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3890an {
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[LOOP:1: B:57:0x0126->B:59:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    public static C3918bn a() throws JSONException {
        JSONArray jSONArray;
        Oi oi = Jk.a;
        boolean enabled = ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new C3918bn();
        }
        if (c()) {
            return new C3918bn();
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectA = AbstractC4350ra.a();
        Iterator<String> itKeys = jSONObjectA != null ? jSONObjectA.keys() : null;
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", jSONObjectA.get(next));
                    map.put(next, jSONObject);
                } catch (JSONException e) {
                    ek2.s(" Error in looping through publisher provided unif id " + e.getMessage() + "\n                                        " + jSONObjectA.get(next) + "\n                    ");
                }
            }
        }
        JSONObject jSONObjectB = AbstractC4350ra.b();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i < length) {
                        try {
                            String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                            String string2 = jSONArray2.getJSONObject(i).has("envelope") ? jSONArray2.getJSONObject(i).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry")) {
                                z2 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                map.put(string, jSONObject2);
                                z3 = true;
                            }
                            i++;
                            z2 = z2;
                        } catch (JSONException e2) {
                            e = e2;
                            z = z3;
                            e.getMessage();
                            jSONObjectB.toString();
                            if (!map.isEmpty()) {
                                return new C3918bn();
                            }
                            jSONArray = new JSONArray();
                            for (Object obj : map.values()) {
                                obj.getClass();
                                jSONArray.put((JSONObject) obj);
                            }
                            return new C3918bn(jSONArray.toString(), z);
                        }
                    }
                    if (z2) {
                        tb5.t(AbstractC4211ma.d, null, null, new Zm(null), 3);
                    }
                    z = z3;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        if (!map.isEmpty()) {
            return new C3918bn();
        }
        jSONArray = new JSONArray();
        while (r1.hasNext()) {
            obj.getClass();
            jSONArray.put((JSONObject) obj);
        }
        return new C3918bn(jSONArray.toString(), z);
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = AbstractC4350ra.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                jSONObjectB.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z;
        jSONObject.getClass();
        try {
            if (jSONObject.has("ufids")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ufids");
                int length = jSONArray.length();
                z = true;
                for (int i = 0; i < length; i++) {
                    try {
                        z &= System.currentTimeMillis() <= jSONArray.getJSONObject(i).getLong("expiry");
                    } catch (JSONException unused) {
                        jSONObject.toString();
                        return !z;
                    }
                }
            } else {
                z = true;
            }
        } catch (JSONException unused2) {
            z = true;
        }
        return !z;
    }

    public static boolean c() {
        Oi oi = Jk.a;
        if (!((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getLatOptOutCheck()) {
            return false;
        }
        C4533y1 c4533y1 = Lm.a;
        Boolean bool = c4533y1 != null ? c4533y1.c : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return zBooleanValue;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
            return jSONArray == null || jSONArray.length() == 0;
        } catch (JSONException unused) {
        }
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        short s;
        String message = error != null ? error.getMessage() : null;
        if (s71.b(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = s71.b(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            LinkedHashMap linkedHashMapZ = qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
            C4111im c4111im = C4111im.a;
            C4111im.b("FetchCallbackFailure", linkedHashMapZ, EnumC4223mm.SDK);
        }
        AbstractC3889am.a(new ov1(22, inMobiUnifiedIdInterface, jSONObject, error));
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        map.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                map.put(jSONArray3.getJSONObject(i2).getString("src"), jSONArray3.getJSONObject(i2));
            }
        }
        Collection collectionValues = map.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
