package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u43 {
    public static final u43 a = new u43();
    public static final Set b = n8.q0(new String[]{"fb_content_ids", "fb_content_id"});
    public static boolean c;
    public static volatile t43 d;

    public static final void f(Bundle bundle, String str) {
        t43 t43Var;
        Pattern pattern;
        Matcher matcher;
        String string;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (lz.a.contains(u43.class)) {
            return;
        }
        try {
            str.getClass();
            if (c && bundle != null && !bundle.isEmpty() && (t43Var = d) != null) {
                Set set = t43Var.c;
                if (set == null || set.isEmpty() || set.contains(str)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z = false;
                    for (s43 s43Var : t43Var.a) {
                        int i = s43Var.a;
                        if (i == 1) {
                            Set<String> setKeySet = bundle.keySet();
                            setKeySet.getClass();
                            for (String str2 : du.z0(setKeySet)) {
                                Object obj = bundle.get(str2);
                                if (obj != null && (string = obj.toString()) != null) {
                                    Pattern pattern2 = s43Var.b;
                                    boolean zFind = (pattern2 == null || (matcher4 = pattern2.matcher(str2)) == null) ? true : matcher4.find();
                                    Pattern pattern3 = s43Var.c;
                                    boolean z2 = zFind && !((pattern3 == null || (matcher3 = pattern3.matcher(str2)) == null) ? false : matcher3.find());
                                    Pattern pattern4 = s43Var.d;
                                    boolean zFind2 = (pattern4 == null || (matcher2 = pattern4.matcher(string)) == null) ? true : matcher2.find();
                                    if (z2 && zFind2) {
                                        linkedHashSet.add(str2);
                                        z = true;
                                    }
                                }
                            }
                        } else if (i == 3 && (pattern = s43Var.b) != null && pattern.matcher(str).find()) {
                            Pattern pattern5 = s43Var.c;
                            if (!((pattern5 == null || (matcher = pattern5.matcher(str)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add("1");
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        if (!t43Var.d && !t43Var.b.isEmpty()) {
                            Set<String> setKeySet2 = bundle.keySet();
                            setKeySet2.getClass();
                            for (String str3 : du.z0(setKeySet2)) {
                                if (!t43Var.b.contains(str3)) {
                                    if (b.contains(str3)) {
                                        bundle.putString(str3, "_removed_");
                                    } else {
                                        bundle.remove(str3);
                                    }
                                }
                            }
                            a.g(bundle);
                        }
                        bundle.putString("vvp", "1");
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put("vp_rp", new JSONArray((Collection) du.z0(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put("vp_rp_ev", new JSONArray((Collection) du.z0(linkedHashSet2)));
                        }
                        bundle.putString("vvp_md", jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            lz.a(u43.class, th);
        }
    }

    public final Pattern a(String str, JSONObject jSONObject) {
        if (!lz.a.contains(this)) {
            try {
                if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                    String strOptString = jSONObject.optString(str, "");
                    strOptString.getClass();
                    if (strOptString.length() != 0) {
                        try {
                            return Pattern.compile(strOptString, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final t43 b(String str) {
        if (!lz.a.contains(this)) {
            try {
                str.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optBoolean("enabled", false)) {
                        List listD = d(jSONObject);
                        if (!listD.isEmpty()) {
                            return new t43(listD, e(jSONObject), c(jSONObject), jSONObject.optBoolean("isShadowEnabled", true));
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final HashSet c(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (!lz.a.contains(this)) {
            try {
                if (jSONObject.has("inScopeEventNames") && !jSONObject.isNull("inScopeEventNames") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("inScopeEventNames")) != null) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        strOptString.getClass();
                        if (strOptString.length() > 0) {
                            hashSet.add(strOptString);
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final List d(JSONObject jSONObject) {
        s43 s43Var;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
            if (jSONArrayOptJSONArray == null) {
                return gg0.a;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (lz.a.contains(this)) {
                        s43Var = null;
                    } else {
                        try {
                            int iOptInt = jSONObjectOptJSONObject.optInt("place", -1);
                            if (iOptInt == 1 || iOptInt == 3) {
                                Pattern patternA = a("keyRegex", jSONObjectOptJSONObject);
                                Pattern patternA2 = a("keyNegativeRegex", jSONObjectOptJSONObject);
                                Pattern patternA3 = a("valueRegex", jSONObjectOptJSONObject);
                                if (patternA != null || patternA3 != null) {
                                    s43Var = new s43(iOptInt, patternA, patternA2, patternA3);
                                }
                            }
                        } catch (Throwable th) {
                            lz.a(this, th);
                        }
                        s43Var = null;
                    }
                    if (s43Var != null) {
                        arrayList.add(s43Var);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            lz.a(this, th2);
            return null;
        }
    }

    public final Set e(JSONObject jSONObject) {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("standardParams");
            if (jSONObjectOptJSONObject == null) {
                return kg0.a;
            }
            HashSet hashSet = new HashSet();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final void g(Bundle bundle) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            bundle.getClass();
            String string = bundle.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("id")) {
                        jSONObjectOptJSONObject.put("id", "_removed_");
                        z = true;
                    }
                }
                if (z) {
                    bundle.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }
}
