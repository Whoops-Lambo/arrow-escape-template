package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaij {
    public final List a;

    public static zzaij a(JSONArray jSONArray) throws JSONException {
        zzaig zzaigVar;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaij(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzaigVar = new zzaig();
            } else {
                String strEmptyToNull = Strings.emptyToNull(jSONObject.optString("federatedId"));
                String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("displayName"));
                String strEmptyToNull3 = Strings.emptyToNull(jSONObject.optString("photoUrl"));
                String strEmptyToNull4 = Strings.emptyToNull(jSONObject.optString("providerId"));
                String strEmptyToNull5 = Strings.emptyToNull(jSONObject.optString("phoneNumber"));
                String strEmptyToNull6 = Strings.emptyToNull(jSONObject.optString("email"));
                zzaig zzaigVar2 = new zzaig();
                zzaigVar2.a = strEmptyToNull;
                zzaigVar2.b = strEmptyToNull2;
                zzaigVar2.c = strEmptyToNull3;
                zzaigVar2.d = strEmptyToNull4;
                zzaigVar2.e = null;
                zzaigVar2.f = strEmptyToNull5;
                zzaigVar2.g = strEmptyToNull6;
                zzaigVar = zzaigVar2;
            }
            arrayList.add(zzaigVar);
        }
        return new zzaij(arrayList);
    }

    public zzaij(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.a = Collections.unmodifiableList(arrayList);
        } else {
            this.a = Collections.EMPTY_LIST;
        }
    }

    public zzaij() {
        this.a = new ArrayList();
    }
}
