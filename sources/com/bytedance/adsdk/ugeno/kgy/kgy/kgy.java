package com.bytedance.adsdk.ugeno.kgy.kgy;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class kgy {
    protected com.bytedance.adsdk.ugeno.ahm.rz ahm;
    protected JSONObject kgy;
    private String rz;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kgy.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0194kgy {
        public static kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
            if (rzVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new ct(rzVar, jSONObject);
                case "ripple":
                    return new ahm(rzVar, jSONObject);
                case "rub_in":
                    return new rz(rzVar, jSONObject);
                case "shine":
                    return new uq(rzVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public abstract void ahm();

    public abstract void ahm(Canvas canvas);

    public abstract void kgy(int i, int i2);

    public abstract void kgy(Canvas canvas);

    public abstract List<PropertyValuesHolder> rz();

    public void kgy() {
        this.rz = this.kgy.optString("type");
        ahm();
    }

    public String uq() {
        return this.rz;
    }

    public kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
        this.kgy = jSONObject;
        this.ahm = rzVar;
        kgy();
    }
}
