package com.bytedance.adsdk.ugeno.kgy.kgy;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends kgy {
    private static final float dg;
    private static final float kus;
    private static final float vs;
    private static final float xh;
    private boolean at;
    private Path ct;
    private int fi;
    private float gf;
    private com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy noq;
    private int nu;
    private int ra;
    private int rz;
    private Path twf;
    private float um;
    private Paint uq;
    private int yo;

    static {
        float radians = (float) Math.toRadians(30.0d);
        kus = radians;
        vs = (float) Math.tan(radians);
        dg = (float) Math.cos(radians);
        xh = (float) Math.sin(radians);
    }

    private void rz(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.ahm.gg() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = this.ra;
                float f = vs;
                float fGg = ((i * f) + i) * this.ahm.gg();
                this.twf.reset();
                this.twf.moveTo(fGg, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i2 = this.nu;
                float f2 = fGg - (i2 * f);
                this.twf.lineTo(f2, i2);
                this.twf.lineTo(f2 + this.rz, this.nu);
                this.twf.lineTo(this.rz + fGg, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.twf.close();
                float f3 = this.um;
                float f4 = dg * f3;
                float f5 = f3 * xh;
                if (!this.at || this.noq == null) {
                    int i3 = this.fi;
                    linearGradient = new LinearGradient(fGg, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fGg + f4, f5, new int[]{i3, this.yo, i3}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fGg, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fGg + f4, f5, this.noq.ahm, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.uq.setShader(linearGradient);
                Path path = this.ct;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.twf, this.uq);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm() {
        this.rz = (int) fi.kgy(this.ahm.nu().getContext(), this.kgy.optInt("shineWidth", 30));
        String strOptString = this.kgy.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.noq = com.bytedance.adsdk.ugeno.fi.kgy.ahm(str);
        } else {
            int iKgy = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str);
            this.yo = iKgy;
            this.fi = com.bytedance.adsdk.ugeno.fi.kgy.kgy(iKgy, 32);
            this.at = false;
        }
        this.um = dg * this.rz;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(int i, int i2) {
        this.ra = i;
        this.nu = i2;
        try {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
            Path path = this.ct;
            float f = this.gf;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    public uq(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
        super(rzVar, jSONObject);
        this.at = true;
        Paint paint = new Paint();
        this.uq = paint;
        paint.setAntiAlias(true);
        this.ct = new Path();
        this.gf = this.ahm.ioy();
        this.twf = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    @SuppressLint({"DrawAllocation"})
    public void kgy(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public List<PropertyValuesHolder> rz() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(uq(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
