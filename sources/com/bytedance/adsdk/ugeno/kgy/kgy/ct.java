package com.bytedance.adsdk.ugeno.kgy.kgy;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ct extends kgy {
    private Path at;
    private Paint ct;
    private boolean fi;
    private boolean gf;
    private float noq;
    private Path nu;
    private Path ra;
    private float rz;
    private PorterDuffXfermode twf;
    private float uq;
    private String yo;

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(int i, int i2) {
        if (i > 0 && this.fi) {
            this.rz = i;
            this.fi = false;
        }
        if (i2 <= 0 || !this.gf) {
            return;
        }
        this.uq = i2;
        this.gf = false;
    }

    private void rz(Canvas canvas) {
        if (this.ahm.sm() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.ct.setXfermode(this.twf);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rz, this.uq, this.ct);
            return;
        }
        int iSm = (int) (this.ahm.sm() * this.rz);
        int iSm2 = (int) (this.ahm.sm() * this.uq);
        this.ct.setXfermode(this.twf);
        String str = this.yo;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iSm2, this.rz, this.uq, this.ct);
                break;
            case "center":
                this.ra.reset();
                this.nu.reset();
                this.at.reset();
                Path.Direction direction = Path.Direction.CW;
                this.ra.addCircle(this.rz / 2.0f, this.uq / 2.0f, iSm, direction);
                Path path = this.nu;
                float f = this.rz;
                path.addRect(f / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.uq, direction);
                Path path2 = this.nu;
                Path path3 = this.ra;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.at.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rz / 2.0f, this.uq, direction);
                this.at.op(this.ra, op);
                canvas.drawPath(this.nu, this.ct);
                canvas.drawPath(this.at, this.ct);
                break;
            case "top":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rz, this.uq - iSm2, this.ct);
                break;
            case "left":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rz - iSm, this.uq, this.ct);
                break;
            case "right":
                canvas.drawRect(iSm, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.rz, this.uq, this.ct);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm() {
        this.noq = (float) this.kgy.optDouble("start", 0.0d);
        this.yo = this.kgy.optString("direction", "center");
    }

    public ct(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
        super(rzVar, jSONObject);
        this.fi = true;
        this.gf = true;
        Paint paint = new Paint();
        this.ct = paint;
        paint.setAntiAlias(true);
        this.ahm.nu().setLayerType(2, null);
        this.twf = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.ra = new Path();
        this.nu = new Path();
        this.at = new Path();
        this.ct.setXfermode(this.twf);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm(Canvas canvas) {
        rz(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public List<PropertyValuesHolder> rz() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(uq(), this.noq, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
