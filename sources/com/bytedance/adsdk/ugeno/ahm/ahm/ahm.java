package com.bytedance.adsdk.ugeno.ahm.ahm;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ahm {
    private final List<uq> ahm;
    private final rz kgy;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ahm.ahm.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0188ahm {
        public final boolean ahm;
        public final float kgy;

        public static C0188ahm kgy(Object obj, C0188ahm c0188ahm) {
            if (obj != null) {
                if (obj instanceof Number) {
                    return new C0188ahm(((Number) obj).floatValue(), false);
                }
                String strTrim = obj.toString().trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    try {
                        return strTrim.endsWith("%") ? new C0188ahm(Float.parseFloat(strTrim.substring(0, strTrim.length() - 1)) / 100.0f, true) : new C0188ahm(Float.parseFloat(strTrim), false);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return c0188ahm;
        }

        public C0188ahm(float f, boolean z) {
            this.kgy = f;
            this.ahm = z;
        }

        public float kgy(float f) {
            boolean z = this.ahm;
            float f2 = this.kgy;
            return z ? f * f2 : f2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class rz {
        public final String ahm;
        public final int ct;
        public final C0188ahm fi;
        public final C0188ahm gf;
        public final String kgy;
        public final int noq;
        public final C0188ahm ra;
        public final String rz;
        public final int uq;
        public final C0188ahm yo;

        public static rz kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return kgy();
            }
            String strOptString = jSONObject.optString("emitterShape", "point");
            String strOptString2 = jSONObject.optString("emitterMode", "points");
            String strOptString3 = jSONObject.optString("renderMode", "unordered");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("emitterPosition");
            C0188ahm c0188ahmKgy = C0188ahm.kgy(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("x") : null, new C0188ahm(0.5f, true));
            C0188ahm c0188ahmKgy2 = C0188ahm.kgy(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("y") : null, new C0188ahm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("emitterSize");
            return new rz(strOptString, strOptString2, strOptString3, c0188ahmKgy, c0188ahmKgy2, C0188ahm.kgy(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.opt("w") : null, new C0188ahm(1.0f, true)), C0188ahm.kgy(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.opt(CmcdData.STREAMING_FORMAT_HLS) : null, new C0188ahm(1.0f, true)));
        }

        private rz(String str, String str2, String str3, C0188ahm c0188ahm, C0188ahm c0188ahm2, C0188ahm c0188ahm3, C0188ahm c0188ahm4) {
            this.kgy = str;
            this.ahm = str2;
            this.rz = str3;
            this.uq = ahm.kgy(str);
            this.ct = ahm.ahm(str2);
            this.noq = ahm.uq(str3);
            this.yo = c0188ahm;
            this.fi = c0188ahm2;
            this.gf = c0188ahm3;
            this.ra = c0188ahm4;
        }

        private static rz kgy() {
            return new rz("point", "points", "unordered", new C0188ahm(0.5f, true), new C0188ahm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true), new C0188ahm(1.0f, true), new C0188ahm(1.0f, true));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class uq {
        public final float ahm;
        public final kgy at;
        public final float ct;
        public final float fi;
        public final float gf;
        public final String kgy;
        public final float noq;
        public final float nu;
        public final float ra;
        public final float rz;
        public final float uq;
        public final float yo;

        public static uq kgy(Context context, JSONObject jSONObject) {
            return new uq(jSONObject.optString("name", ""), (float) jSONObject.optDouble("birthRate", 1.0d), (float) jSONObject.optDouble("lifetime", 1.0d), (float) jSONObject.optDouble("lifetimeRange", 0.0d), (float) jSONObject.optDouble("scale", 1.0d), (float) jSONObject.optDouble("scaleRange", 0.0d), (float) jSONObject.optDouble("velocity", 0.0d), (float) jSONObject.optDouble("velocityRange", 0.0d), (float) jSONObject.optDouble("emissionRange", 0.0d), (float) jSONObject.optDouble("alphaRange", 0.0d), (float) jSONObject.optDouble("alphaSpeed", 0.0d), kgy.kgy(context, jSONObject.optJSONObject("content")));
        }

        private uq(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, kgy kgyVar) {
            this.kgy = str;
            this.ahm = f;
            this.rz = f2;
            this.uq = f3;
            this.ct = f4;
            this.noq = f5;
            this.yo = f6;
            this.fi = f7;
            this.gf = f8;
            this.ra = f9;
            this.nu = f10;
            this.at = kgyVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        public final int ahm;
        public final int ct;
        public final String kgy;
        public final float rz;
        public final float uq;

        public static kgy kgy(Context context, JSONObject jSONObject) {
            return jSONObject == null ? new kgy(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, fi.kgy(context, 6.0f), fi.kgy(context, 6.0f), -1) : new kgy(jSONObject.optString("shape", TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE), fi.kgy(context, (float) jSONObject.optDouble("width", 6.0d)), fi.kgy(context, (float) jSONObject.optDouble("height", 6.0d)), com.bytedance.adsdk.ugeno.fi.kgy.kgy(jSONObject.optString("color", "#FFFFFF"), -1));
        }

        private kgy(String str, float f, float f2, int i) {
            this.kgy = str;
            this.ahm = ahm.rz(str);
            this.rz = f;
            this.uq = f2;
            this.ct = i;
        }
    }

    public static int ahm(String str) {
        if ("outline".equals(str)) {
            return 1;
        }
        return "surface".equals(str) ? 2 : 0;
    }

    private static List<uq> kgy(Context context, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(uq.kgy(context, jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static int rz(String str) {
        if ("rect".equals(str)) {
            return 1;
        }
        return "star".equals(str) ? 2 : 0;
    }

    public static int uq(String str) {
        if ("additive".equals(str)) {
            return 1;
        }
        if ("backToFront".equals(str) || "oldestFirst".equals(str)) {
            return 3;
        }
        return "oldestLast".equals(str) ? 4 : 0;
    }

    private ahm(rz rzVar, List<uq> list) {
        this.kgy = rzVar;
        this.ahm = list;
    }

    public List<uq> ahm() {
        return this.ahm;
    }

    public boolean rz() {
        List<uq> list = this.ahm;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public rz kgy() {
        return this.kgy;
    }

    public static ahm kgy(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kgy(context, new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static ahm kgy(Context context, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        rz rzVarKgy = rz.kgy(jSONObject.optJSONObject("layer"));
        List<uq> listKgy = kgy(context, jSONObject.optJSONArray("particles"));
        if (listKgy.isEmpty()) {
            return null;
        }
        return new ahm(rzVarKgy, listKgy);
    }

    public static int kgy(String str) {
        if ("line".equals(str)) {
            return 1;
        }
        if ("rectangle".equals(str)) {
            return 2;
        }
        if (TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE.equals(str)) {
            return 3;
        }
        return "sphere".equals(str) ? 4 : 0;
    }
}
