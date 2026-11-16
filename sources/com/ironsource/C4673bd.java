package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class C4673bd extends AbstractC4713e {
    private final String i = C4852ld.a;

    @Override // com.ironsource.AbstractC4713e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C5 c5 = arrayList.get(i);
                i++;
                JSONObject jSONObjectA = a(c5);
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.ironsource.AbstractC4713e
    public String c() {
        return "outcome";
    }

    public C4673bd(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4713e
    public String a() {
        return C4852ld.a;
    }
}
