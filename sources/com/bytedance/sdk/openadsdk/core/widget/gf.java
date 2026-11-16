package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf extends View {
    private static final int[] kgy = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final RectF ahm;
    private final Paint ct;
    private int fi;
    private int gf;
    private final Paint noq;
    private final RectF rz;
    private final ArrayList<kgy> uq;
    private int yo;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        public float ahm;
        public Paint kgy;
        float rz;
        float uq;

        public kgy(Paint paint, float f, float f2, float f3) {
            this.kgy = paint;
            this.ahm = f;
            this.rz = f2;
            this.uq = f3;
        }
    }

    private void kgy() {
        if (this.yo <= 0) {
            return;
        }
        this.rz.right = Math.max(this.gf, (int) (((this.fi * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    public void setProgress(int i) {
        int i2 = this.fi;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.fi = i;
        kgy();
    }

    public gf(Context context) {
        super(context);
        this.ahm = new RectF();
        this.rz = new RectF();
        this.uq = new ArrayList<>();
        this.noq = new Paint();
        Paint paint = new Paint();
        this.ct = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.ahm;
        int i = this.yo;
        canvas.drawRoundRect(rectF, i, i, this.ct);
        RectF rectF2 = this.rz;
        int i2 = this.yo;
        canvas.drawRoundRect(rectF2, i2, i2, this.noq);
        int iSave = canvas.save();
        canvas.translate(this.rz.right - this.gf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList<kgy> arrayList = this.uq;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            kgy kgyVar = arrayList.get(i3);
            i3++;
            kgy kgyVar2 = kgyVar;
            canvas.drawCircle(kgyVar2.rz, kgyVar2.uq, kgyVar2.ahm, kgyVar2.kgy);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.yo = i5;
        this.gf = i5 * 5;
        float f = i;
        float f2 = i2;
        this.ahm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        this.rz.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        this.noq.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.uq.clear();
        float f3 = this.yo / 4.0f;
        for (int i6 : kgy) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.uq.add(new kgy(paint, this.yo / 2.0f, f3, f2 / 2.0f));
            f3 += (this.yo / 2.0f) * 3.0f;
        }
        kgy();
    }
}
