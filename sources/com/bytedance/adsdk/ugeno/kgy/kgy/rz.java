package com.bytedance.adsdk.ugeno.kgy.kgy;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz extends kgy {
    private float ct;
    private Paint fi;
    private PorterDuffXfermode gf;
    private View noq;
    private Matrix nu;
    private LinearGradient ra;
    private String rz;
    private float uq;
    private Paint yo;

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(int i, int i2) {
        this.uq = i;
        this.ct = i2;
        String str = this.rz;
        str.getClass();
        switch (str) {
            case "bottom":
                this.ra = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.ct, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.ra = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ct, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.ra = new LinearGradient(this.uq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.ra = new LinearGradient(-this.uq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ct, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void rz(Canvas canvas) {
        try {
            if (this.ahm.cc() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.yo.setXfermode(this.gf);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq, this.ct, this.yo);
                return;
            }
            int iCc = (int) (this.uq * this.ahm.cc());
            int iCc2 = (int) (this.ct * this.ahm.cc());
            this.yo.setXfermode(this.gf);
            String str = this.rz;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f = iCc2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.uq, this.ct, this.yo);
                        this.nu.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
                        this.ra.setLocalMatrix(this.nu);
                        this.fi.setShader(this.ra);
                        if (this.ahm.cc() <= 1.0f && this.ahm.cc() > 0.9f) {
                            this.fi.setAlpha((int) (255.0f - (this.ahm.cc() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq, f, this.fi);
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f2 = iCc2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq, this.ct - f2, this.yo);
                        this.nu.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ct - f2);
                        this.ra.setLocalMatrix(this.nu);
                        this.fi.setShader(this.ra);
                        if (this.ahm.cc() <= 1.0f && this.ahm.cc() > 0.9f) {
                            this.fi.setAlpha((int) (255.0f - (this.ahm.cc() * 255.0f)));
                        }
                        float f3 = this.uq;
                        float f4 = this.ct;
                        canvas.drawRect(f3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - f2, this.fi);
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        float f5 = iCc;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq - f5, this.ct, this.yo);
                        this.nu.setTranslate(this.uq - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.ra.setLocalMatrix(this.nu);
                        this.fi.setShader(this.ra);
                        if (this.ahm.cc() <= 1.0f && this.ahm.cc() > 0.9f) {
                            this.fi.setAlpha((int) (255.0f - (this.ahm.cc() * 255.0f)));
                        }
                        float f6 = this.uq;
                        canvas.drawRect(f6, this.ct, f6 - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi);
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        float f7 = iCc;
                        canvas.drawRect(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq, this.ct, this.yo);
                        this.nu.setTranslate(f7, this.ct);
                        this.ra.setLocalMatrix(this.nu);
                        this.fi.setShader(this.ra);
                        if (this.ahm.cc() <= 1.0f && this.ahm.cc() > 0.9f) {
                            this.fi.setAlpha((int) (255.0f - (this.ahm.cc() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, this.ct, this.fi);
                    }
                    break;
                default:
                    break;
            }
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm() {
        this.rz = this.kgy.optString("direction", "left");
    }

    public rz(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
        super(rzVar, jSONObject);
        this.noq = this.ahm.nu();
        Paint paint = new Paint();
        this.yo = paint;
        paint.setAntiAlias(true);
        this.noq.setLayerType(2, null);
        this.gf = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.fi = new Paint();
        this.nu = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public List<PropertyValuesHolder> rz() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.kgy.ct.ALPHA.ahm(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }
}
