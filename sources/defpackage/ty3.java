package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaw;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ty3 {
    public static final Logger a = new Logger("JSONParser", new String[0]);

    public static ArrayMap a(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayMap.put(next, objA);
        }
        return arrayMap;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objA = jSONArray.get(i);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static Map c(String str) {
        Preconditions.checkNotEmpty(str);
        List listC = zzt.b('.').c(str);
        if (listC.size() < 2) {
            a.e("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        ArrayMap arrayMapD = d(new String(Base64Utils.decodeUrlSafeNoPadding((String) listC.get(1)), StandardCharsets.UTF_8));
        if (arrayMapD == null) {
            return new HashMap();
        }
        return arrayMapD;
    }

    public static ArrayMap d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject != JSONObject.NULL) {
                    return a(jSONObject);
                }
                return null;
            } catch (Exception e) {
                Log.d("JSONParser", "Failed to parse JSONObject into Map.");
                throw new zzaaw(e);
            }
        }
        return null;
    }
}
