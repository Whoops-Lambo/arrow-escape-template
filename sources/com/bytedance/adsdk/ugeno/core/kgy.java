package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    private float ahm;
    private long ct;
    private String kgy;
    private String noq;
    private List<C0190kgy> rz;
    private long uq;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0190kgy {
        private float ahm;
        private String ct;
        private float[] fi;
        private String gf;
        private long kgy;
        private float noq;
        private String ra;
        private String rz;
        private long uq;
        private float yo;

        public static C0190kgy kgy(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
            if (jSONObject == null) {
                return null;
            }
            C0190kgy c0190kgy = new C0190kgy();
            c0190kgy.kgy(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0190kgy.kgy(-1.0f);
            } else {
                try {
                    c0190kgy.kgy(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0190kgy.kgy(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            c0190kgy.kgy(jSONObject.optString("loopMode"));
            c0190kgy.ahm(jSONObject.optString("type"));
            if (TextUtils.equals(c0190kgy.ct(), "ripple")) {
                c0190kgy.rz(jSONObject.optString("rippleColor"));
            }
            View viewNu = rzVar.nu();
            Context context = viewNu != null ? viewNu.getContext() : null;
            if (TextUtils.equals(c0190kgy.ct(), "backgroundColor")) {
                String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("valueTo"), rzVar.at());
                int iKgy = com.bytedance.adsdk.ugeno.fi.kgy.kgy(jSONObject.optString("valueFrom"));
                int iKgy2 = com.bytedance.adsdk.ugeno.fi.kgy.kgy(strKgy);
                c0190kgy.ahm(iKgy);
                c0190kgy.rz(iKgy2);
            } else if ((TextUtils.equals(c0190kgy.ct(), "translateX") || TextUtils.equals(c0190kgy.ct(), "translateY")) && context != null) {
                try {
                    float fKgy = com.bytedance.adsdk.ugeno.fi.fi.kgy(context, (float) jSONObject.optDouble("valueFrom"));
                    float fKgy2 = com.bytedance.adsdk.ugeno.fi.fi.kgy(context, (float) jSONObject.optDouble("valueTo"));
                    c0190kgy.ahm(fKgy);
                    c0190kgy.rz(fKgy2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0190kgy.ahm((float) jSONObject.optDouble("valueFrom"));
                c0190kgy.rz((float) jSONObject.optDouble("valueTo"));
            }
            c0190kgy.uq(jSONObject.optString("interpolator"));
            String strKgy2 = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("startDelay"), rzVar.at());
            Log.d("TAG", "createAnimationModel: ");
            c0190kgy.ahm(com.bytedance.adsdk.ugeno.fi.rz.kgy(strKgy2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0190kgy.ct(), "translateX") || TextUtils.equals(c0190kgy.ct(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.fi.fi.kgy(context, (float) kgy.kgy(jSONArrayOptJSONArray.optString(i), rzVar.at()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) kgy.kgy(jSONArrayOptJSONArray.optString(i), rzVar.at());
                        i++;
                    }
                }
                c0190kgy.kgy(fArr);
            }
            return c0190kgy;
        }

        public float ahm() {
            return this.ahm;
        }

        public String ct() {
            return this.ct;
        }

        public float[] fi() {
            return this.fi;
        }

        public String gf() {
            return this.gf;
        }

        public float noq() {
            return this.noq;
        }

        public String ra() {
            return this.ra;
        }

        public String rz() {
            return this.rz;
        }

        public long uq() {
            return this.uq;
        }

        public float yo() {
            return this.yo;
        }

        public void ahm(long j) {
            this.uq = j;
        }

        public void rz(float f) {
            this.yo = f;
        }

        public void uq(String str) {
            this.gf = str;
        }

        public void ahm(String str) {
            this.ct = str;
        }

        public void rz(String str) {
            this.ra = str;
        }

        public void ahm(float f) {
            this.noq = f;
        }

        public void kgy(long j) {
            this.kgy = j;
        }

        public void kgy(float f) {
            this.ahm = f;
        }

        public void kgy(String str) {
            this.rz = str;
        }

        public void kgy(float[] fArr) {
            this.fi = fArr;
        }

        public long kgy() {
            return this.kgy;
        }
    }

    public static kgy kgy(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (jSONObject == null) {
            return null;
        }
        kgy kgyVar = new kgy();
        kgyVar.kgy(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            kgyVar.kgy(-1.0f);
        } else {
            try {
                kgyVar.kgy(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                kgyVar.kgy(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        kgyVar.kgy(jSONObject.optLong("duration", 0L));
        kgyVar.ahm(com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("startDelay"), rzVar.at()), 0L));
        kgyVar.ahm(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.fi.ahm.kgy(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0190kgy.kgy(jSONObjectOptJSONObject, rzVar));
            }
            kgyVar.kgy(arrayList);
        }
        return kgyVar;
    }

    public float ahm() {
        return this.ahm;
    }

    public long ct() {
        return this.ct;
    }

    public String noq() {
        return this.noq;
    }

    public List<C0190kgy> rz() {
        return this.rz;
    }

    public long uq() {
        return this.uq;
    }

    public void ahm(long j) {
        this.ct = j;
    }

    public void ahm(String str) {
        this.noq = str;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(float f) {
        this.ahm = f;
    }

    public void kgy(List<C0190kgy> list) {
        this.rz = list;
    }

    public void kgy(long j) {
        this.uq = j;
    }

    public static kgy kgy(String str, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kgy(new JSONObject(str), rzVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static kgy kgy(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        return kgy(jSONObject, null, rzVar);
    }

    public String kgy() {
        return this.kgy;
    }

    public static double kgy(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
