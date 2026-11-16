package defpackage;

import android.os.Bundle;
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class io {
    public static final HashMap a = qh1.W(new dt1(String.class, new ho(0)), new dt1(String[].class, new ho(1)), new dt1(JSONArray.class, new ho(2)));

    public static final JSONObject a(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        Bundle bundle = cameraEffectArguments.a;
        JSONObject jSONObject = new JSONObject();
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            setKeySet = kg0.a;
        }
        for (String str : setKeySet) {
            Object obj = bundle != null ? bundle.get(str) : null;
            if (obj != null) {
                ho hoVar = (ho) a.get(obj.getClass());
                if (hoVar == null) {
                    d.q(obj.getClass(), "Unsupported type: ");
                    return null;
                }
                int i = hoVar.a;
                str.getClass();
                switch (i) {
                    case 0:
                        jSONObject.put(str, obj);
                        break;
                    case 1:
                        JSONArray jSONArray = new JSONArray();
                        for (String str2 : (String[]) obj) {
                            jSONArray.put(str2);
                        }
                        jSONObject.put(str, jSONArray);
                        break;
                    default:
                        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
                }
            }
        }
        return jSONObject;
    }
}
