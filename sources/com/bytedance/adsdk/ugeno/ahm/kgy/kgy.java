package com.bytedance.adsdk.ugeno.ahm.kgy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy ahm;
    private com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy ct;
    private int fi;
    private ahm gf;
    private com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy kgy;
    private float noq;
    private int rz;
    private int uq;
    private float yo;

    public void ahm(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gradient", null);
            if (strOptString == null || !com.bytedance.adsdk.ugeno.fi.kgy.rz(strOptString)) {
                return;
            }
            this.ahm = com.bytedance.adsdk.ugeno.fi.kgy.ahm(strOptString);
            this.rz = jSONObject.optInt("duration", 2200);
            this.uq = jSONObject.optInt("playCount", -1);
        } catch (JSONException unused) {
        }
    }

    public void kgy(View view, Drawable drawable, float f, float[] fArr) {
        int[] iArr;
        float[] fArr2;
        int[] iArr2;
        float[] fArr3;
        boolean z = kgy() && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy c0192kgy = this.ct;
        boolean z2 = c0192kgy != null;
        if (!z && !z2) {
            this.gf = null;
            view.setBackground(drawable);
            return;
        }
        if (z) {
            com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy c0192kgy2 = this.ahm;
            if (c0192kgy2 != null) {
                iArr2 = c0192kgy2.ahm;
                fArr3 = c0192kgy2.rz;
            } else {
                com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy c0192kgy3 = this.kgy;
                iArr2 = c0192kgy3.ahm;
                fArr3 = c0192kgy3.rz;
            }
            fArr2 = fArr3;
            iArr = iArr2;
        } else {
            iArr = null;
            fArr2 = null;
        }
        ahm ahmVar = new ahm(drawable, iArr, fArr2, f, fArr, this.ahm != null, this.rz, this.uq, z2, this.noq, this.yo, this.fi, z2 ? c0192kgy.ahm : null, z2 ? c0192kgy.rz : null);
        this.gf = ahmVar;
        view.setBackground(ahmVar);
    }

    public void rz() {
        ahm ahmVar = this.gf;
        if (ahmVar == null || !ahmVar.rz()) {
            return;
        }
        this.gf.kgy();
    }

    public void uq() {
        ahm ahmVar = this.gf;
        if (ahmVar != null) {
            ahmVar.ahm();
        }
    }

    public boolean ahm() {
        return (this.kgy == null && this.ahm == null && this.ct == null) ? false : true;
    }

    public void kgy(String str, Context context) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gradient", null);
            if (strOptString == null || !com.bytedance.adsdk.ugeno.fi.kgy.rz(strOptString)) {
                return;
            }
            this.ct = com.bytedance.adsdk.ugeno.fi.kgy.ahm(strOptString);
            this.noq = fi.kgy(context, (float) jSONObject.optDouble("width", 76.0d));
            this.yo = (float) jSONObject.optDouble("opacity", 0.9d);
            this.fi = jSONObject.optInt("steps", 24);
        } catch (JSONException unused) {
        }
    }

    public boolean kgy() {
        return (this.kgy == null && this.ahm == null) ? false : true;
    }

    public void kgy(String str) {
        if (com.bytedance.adsdk.ugeno.fi.kgy.rz(str)) {
            this.kgy = com.bytedance.adsdk.ugeno.fi.kgy.ahm(str);
        }
    }
}
