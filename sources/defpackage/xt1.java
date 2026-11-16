package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xt1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public xt1(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("name");
        string.getClass();
        this.a = string;
        String strOptString = jSONObject.optString("value");
        strOptString.getClass();
        this.b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        strOptString2.getClass();
        this.d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new gu1(jSONObject2));
            }
        }
        this.c = arrayList;
    }
}
