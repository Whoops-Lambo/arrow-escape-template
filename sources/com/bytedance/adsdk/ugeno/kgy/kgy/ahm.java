package com.bytedance.adsdk.ugeno.kgy.kgy;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends kgy {
    private int ct;
    private Paint noq;
    private int rz;
    private int uq;

    private void rz(Canvas canvas) {
        try {
            if (this.ahm.jc() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.noq.setColor(this.rz);
                this.noq.setAlpha((int) ((1.0f - this.ahm.jc()) * 255.0f));
                ((ViewGroup) this.ahm.nu().getParent()).setClipChildren(true);
                int i = this.uq;
                int i2 = this.ct;
                canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * this.ahm.jc(), this.noq);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void ahm() {
        this.rz = com.bytedance.adsdk.ugeno.fi.kgy.kgy(this.kgy.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.kgy.kgy
    public void kgy(int i, int i2) {
        this.uq = i / 2;
        this.ct = i2 / 2;
    }

    public ahm(com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject) {
        super(rzVar, jSONObject);
        Paint paint = new Paint();
        this.noq = paint;
        paint.setAntiAlias(true);
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
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(uq(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
