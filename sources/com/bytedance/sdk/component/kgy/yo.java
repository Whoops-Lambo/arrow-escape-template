package com.bytedance.sdk.component.kgy;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class yo {
    private ra kgy;

    private yo(ra raVar) {
        this.kgy = raVar;
    }

    public <T> T kgy(String str, Type type) throws JSONException {
        kgy(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.kgy.kgy(str, type);
        }
        return (T) PangleNetworkBridge.jsonObjectInit(str);
    }

    public static yo kgy(ra raVar) {
        return new yo(raVar);
    }

    public <T> String kgy(T t) {
        String string;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            string = this.kgy.kgy(t);
        } else {
            string = t.toString();
        }
        kgy(string);
        return string;
    }

    private static void kgy(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        fi.kgy(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
