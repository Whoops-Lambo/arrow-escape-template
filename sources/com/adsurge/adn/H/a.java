package com.adsurge.adn.H;

import android.text.TextUtils;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.X.f;
import com.adsurge.adn.lib.dysi.IAdSurgeBridge;
import com.adsurge.adn.u1.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements IAdSurgeBridge {
    public final ConcurrentMap a = new ConcurrentHashMap();

    public void a(c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.h())) {
            return;
        }
        this.a.put(cVar.h(), cVar);
    }

    public void b(c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.h())) {
            return;
        }
        this.a.remove(cVar.h(), cVar);
    }

    @Override // com.adsurge.adn.lib.dysi.IAdSurgeBridge
    public String getActivityContent(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                JSONObject jSONObjectA = f.c().a(str, i);
                if (jSONObjectA == null) {
                    return JsonUtils.EMPTY_JSON;
                }
                e eVar = new e();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String strOptString = jSONArray.optString(i2);
                    eVar.a(strOptString, jSONObjectA.opt(strOptString));
                }
                return eVar.toString();
            } catch (JSONException unused) {
            }
        }
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.adsurge.adn.lib.dysi.IAdSurgeBridge
    public String getAdInfoFields(String str, String str2) {
        c cVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (cVar = (c) this.a.get(str)) == null) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            JSONArray jSONArray = new JSONArray(str2);
            JSONObject jSONObjectR = cVar.R();
            if (jSONObjectR == null) {
                return JsonUtils.EMPTY_JSON;
            }
            e eVar = new e();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                eVar.a(strOptString, jSONObjectR.opt(strOptString));
            }
            return eVar.toString();
        } catch (JSONException unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }
}
