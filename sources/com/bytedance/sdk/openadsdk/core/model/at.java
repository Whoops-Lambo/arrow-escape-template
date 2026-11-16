package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class at {
    private final int[] ahm;
    private final int at;
    private final float ct;
    private final String dg;
    private final long fi;
    private final int gf;
    private final int[] kgy;
    private final int kus;
    private final float noq;
    private final int nu;
    private final int ra;
    private final float rz;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> twf;
    private final float uq;
    private final JSONObject vs;
    private final JSONObject xh;
    private final long yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        int ahm;
        private int at;
        private long ct;
        private int dg;
        private float fi;
        private JSONObject fpp;
        private float gf;
        float kgy;
        private int kus;
        private float noq;
        private int[] nu;
        private int[] ra;
        float rz;
        private JSONObject sx;
        private int twf;
        private int um;
        private long uq;
        private SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> vs;
        private String xh;
        private float yo;

        public at kgy() {
            return new at(this);
        }

        public kgy ahm(JSONObject jSONObject) {
            this.sx = jSONObject;
            return this;
        }

        public kgy ct(float f) {
            this.fi = f;
            return this;
        }

        public kgy noq(float f) {
            this.gf = f;
            return this;
        }

        public kgy rz(int i) {
            this.ahm = i;
            return this;
        }

        public kgy uq(float f) {
            this.yo = f;
            return this;
        }

        public kgy ahm(int i) {
            this.dg = i;
            return this;
        }

        public kgy ct(int i) {
            this.twf = i;
            return this;
        }

        public kgy noq(int i) {
            this.kus = i;
            return this;
        }

        public kgy rz(float f) {
            this.noq = f;
            return this;
        }

        public kgy uq(int i) {
            this.at = i;
            return this;
        }

        public kgy ahm(float f) {
            this.rz = f;
            return this;
        }

        public kgy ahm(long j) {
            this.ct = j;
            return this;
        }

        public kgy ahm(int[] iArr) {
            this.nu = iArr;
            return this;
        }

        public kgy kgy(int i) {
            this.um = i;
            return this;
        }

        public kgy kgy(JSONObject jSONObject) {
            this.fpp = jSONObject;
            return this;
        }

        public kgy kgy(SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> sparseArray) {
            this.vs = sparseArray;
            return this;
        }

        public kgy kgy(float f) {
            this.kgy = f;
            return this;
        }

        public kgy kgy(long j) {
            this.uq = j;
            return this;
        }

        public kgy kgy(int[] iArr) {
            this.ra = iArr;
            return this;
        }

        public kgy kgy(String str) {
            this.xh = str;
            return this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00fb A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x000b, B:15:0x0033, B:17:0x003a, B:19:0x003d, B:20:0x0056, B:22:0x005a, B:24:0x005d, B:25:0x0076, B:27:0x00fb, B:28:0x0104, B:30:0x0108, B:12:0x002c, B:5:0x000f, B:6:0x0013, B:8:0x0019), top: B:34:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0108 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x000b, B:15:0x0033, B:17:0x003a, B:19:0x003d, B:20:0x0056, B:22:0x005a, B:24:0x005d, B:25:0x0076, B:27:0x00fb, B:28:0x0104, B:30:0x0108, B:12:0x002c, B:5:0x000f, B:6:0x0013, B:8:0x0019), top: B:34:0x000b, inners: #1 }] */
    public JSONObject kgy() {
        int[] iArr;
        int[] iArr2;
        int i;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = this.xh;
            if (jSONObject3 != null) {
                try {
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.putOpt(next, this.xh.opt(next));
                    }
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "eOIklgiZf8KOXvpSiBSs", "XvY5hwK/feqPTtJRuB6KO1Tg", 76);
                }
                iArr = this.kgy;
                if (iArr != null && iArr.length == 2) {
                    jSONObject2.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.kgy[1]));
                }
                iArr2 = this.ahm;
                if (iArr2 != null && iArr2.length == 2) {
                    jSONObject2.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.ahm[1]));
                }
                jSONObject2.putOpt("down_x", Float.toString(this.rz)).putOpt("down_y", Float.toString(this.uq)).putOpt("up_x", Float.toString(this.ct)).putOpt("up_y", Float.toString(this.noq)).putOpt("down_time", Long.valueOf(this.yo)).putOpt("up_time", Long.valueOf(this.fi)).putOpt("toolType", Integer.valueOf(this.gf)).putOpt("deviceId", Integer.valueOf(this.ra)).putOpt("source", Integer.valueOf(this.nu)).putOpt("ft", kgy(this.twf, this.at)).putOpt("click_area_type", this.dg);
                i = this.kus;
                if (i > 0) {
                    jSONObject2.putOpt("areaType", Integer.valueOf(i));
                }
                jSONObject = this.vs;
                if (jSONObject != null) {
                    jSONObject2.putOpt("rectInfo", jSONObject);
                }
            } else {
                iArr = this.kgy;
                if (iArr != null) {
                    jSONObject2.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.kgy[1]));
                }
                iArr2 = this.ahm;
                if (iArr2 != null) {
                    jSONObject2.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.ahm[1]));
                }
                jSONObject2.putOpt("down_x", Float.toString(this.rz)).putOpt("down_y", Float.toString(this.uq)).putOpt("up_x", Float.toString(this.ct)).putOpt("up_y", Float.toString(this.noq)).putOpt("down_time", Long.valueOf(this.yo)).putOpt("up_time", Long.valueOf(this.fi)).putOpt("toolType", Integer.valueOf(this.gf)).putOpt("deviceId", Integer.valueOf(this.ra)).putOpt("source", Integer.valueOf(this.nu)).putOpt("ft", kgy(this.twf, this.at)).putOpt("click_area_type", this.dg);
                i = this.kus;
                if (i > 0) {
                    jSONObject2.putOpt("areaType", Integer.valueOf(i));
                }
                jSONObject = this.vs;
                if (jSONObject != null) {
                    jSONObject2.putOpt("rectInfo", jSONObject);
                }
            }
        } catch (Exception e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "eOIklgiZf8KOXvpSiBSs", "XvY5hwK/feqPTtJRuB6KO1Tg", 104);
        }
        return jSONObject2;
    }

    private at(@NonNull kgy kgyVar) {
        this.kgy = kgyVar.ra;
        this.ahm = kgyVar.nu;
        this.rz = kgyVar.gf;
        this.uq = kgyVar.fi;
        this.ct = kgyVar.yo;
        this.noq = kgyVar.noq;
        this.yo = kgyVar.ct;
        this.fi = kgyVar.uq;
        this.gf = kgyVar.at;
        this.ra = kgyVar.twf;
        this.nu = kgyVar.kus;
        this.at = kgyVar.dg;
        this.twf = kgyVar.vs;
        this.dg = kgyVar.xh;
        this.kus = kgyVar.um;
        this.vs = kgyVar.fpp;
        this.xh = kgyVar.sx;
    }

    public static JSONObject kgy(SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.ahm.rz.kgy kgyVarValueAt = sparseArray.valueAt(i2);
                    if (kgyVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(kgyVarValueAt.rz)).putOpt("mr", Double.valueOf(kgyVarValueAt.ahm)).putOpt("phase", Integer.valueOf(kgyVarValueAt.kgy)).putOpt("ts", Long.valueOf(kgyVarValueAt.uq));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "eOIklgiZf8KOXvpSiBSs", "XOs5oQypas+wS8VcgQ==", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            return null;
        }
    }
}
