package com.adsurge.adn.p044n0;

import android.view.View;
import com.adsurge.adn.p035k0.m;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class k {
    public final float[] a;
    public final boolean b;
    public final float c;

    public float b() {
        return this.a[2];
    }

    public float c() {
        return this.a[1];
    }

    public float d() {
        return this.a[0];
    }

    public k(JSONArray jSONArray, boolean z) {
        float f;
        int length;
        this.b = z;
        if (z) {
            f = -1.0f;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.c = f;
        this.a = new float[]{f, f, f, f};
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            int i = length <= 4 ? length : 4;
            for (int i2 = 0; i2 < i; i2++) {
                Object objOpt = jSONArray.opt(i2);
                if (!JSONObject.NULL.equals(objOpt)) {
                    this.a[i2] = m.c(objOpt).f(new JSONObject[0]);
                }
            }
        }
    }

    public void a(View view) {
        float fMin;
        float fMax;
        View view2 = (View) view.getParent();
        int width = view2.getWidth() - view.getRight();
        int height = view2.getHeight() - view.getBottom();
        float fMin2 = -2.1474836E9f;
        if (this.b) {
            fMin = -2.1474836E9f;
        } else {
            fMin = -view.getTop();
        }
        float fMax2 = 2.1474836E9f;
        if (this.b) {
            fMax = 2.1474836E9f;
        } else {
            fMax = height;
        }
        float[] fArr = this.a;
        float f = fArr[0];
        if (f > this.c) {
            fMin = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - view.getTop());
        }
        fArr[0] = fMin;
        float[] fArr2 = this.a;
        float f2 = fArr2[1];
        if (f2 > this.c) {
            fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height - f2);
        }
        fArr2[1] = fMax;
        if (!this.b) {
            fMin2 = -view.getLeft();
        }
        if (!this.b) {
            fMax2 = width;
        }
        float[] fArr3 = this.a;
        float f3 = fArr3[2];
        if (f3 > this.c) {
            fMin2 = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - view.getLeft());
        }
        fArr3[2] = fMin2;
        float[] fArr4 = this.a;
        float f4 = fArr4[3];
        if (f4 > this.c) {
            fMax2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width - f4);
        }
        fArr4[3] = fMax2;
    }

    public float a() {
        return this.a[3];
    }
}
