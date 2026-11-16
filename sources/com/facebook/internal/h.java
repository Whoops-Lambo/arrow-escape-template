package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(Boolean.class, new g(0));
        map.put(Integer.class, new g(1));
        map.put(Long.class, new g(2));
        map.put(Double.class, new g(3));
        map.put(String.class, new g(4));
        map.put(String[].class, new g(5));
        map.put(JSONArray.class, new g(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    g gVar = (g) a.get(obj.getClass());
                    if (gVar == null) {
                        defpackage.d.q(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    switch (gVar.a) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                    }
                                    Object obj2 = jSONArray.get(i);
                                    if (!(obj2 instanceof String)) {
                                        defpackage.d.q(obj2.getClass(), "Unexpected type in an array: ");
                                    }
                                    arrayList.add(obj2);
                                    i++;
                                    break;
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }

    public static final JSONObject b(Bundle bundle) throws JSONException {
        bundle.getClass();
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, b((Bundle) obj));
                } else {
                    g gVar = (g) a.get(obj.getClass());
                    if (gVar != null) {
                        str.getClass();
                        switch (gVar.a) {
                            case 0:
                                jSONObject.put(str, obj);
                                break;
                            case 1:
                                jSONObject.put(str, obj);
                                break;
                            case 2:
                                jSONObject.put(str, obj);
                                break;
                            case 3:
                                jSONObject.put(str, obj);
                                break;
                            case 4:
                                jSONObject.put(str, obj);
                                break;
                            case 5:
                                JSONArray jSONArray2 = new JSONArray();
                                for (String str2 : (String[]) obj) {
                                    jSONArray2.put(str2);
                                }
                                jSONObject.put(str, jSONArray2);
                                break;
                            default:
                                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
                        }
                    } else {
                        defpackage.d.q(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                }
            }
        }
        return jSONObject;
    }
}
