package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeej implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final JSONObject a = new JSONObject();
    public List b;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                JSONObject jSONObject = this.a;
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
            }
        }
    }

    @VisibleForTesting
    public zzeej() {
    }
}
