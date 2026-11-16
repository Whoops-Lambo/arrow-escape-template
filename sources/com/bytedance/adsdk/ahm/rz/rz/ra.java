package com.bytedance.adsdk.ahm.rz.rz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ra extends uq {
    private Path fi;
    private int gf;
    private int ra;

    private static void kgy(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.uq, com.bytedance.adsdk.ahm.rz.rz.kgy
    public void ahm(Canvas canvas, Matrix matrix, int i) {
        View viewKgy = this.ahm.kgy();
        if (this.gf <= 0 || viewKgy == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        kgy(i);
        float fNoq = noq();
        kgy(viewKgy, this.gf, this.ra);
        viewKgy.setAlpha(fNoq);
        canvas.clipPath(this.fi);
        viewKgy.draw(canvas);
        canvas.restore();
    }

    public ra(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar, Context context) {
        super(gfVar, ctVar);
        this.fi = null;
        this.gf = -1;
        this.ra = -1;
        if (((uq) this).yo != null) {
            float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
            this.gf = (int) (((uq) this).yo.kgy() * fKgy);
            this.ra = (int) (((uq) this).yo.ahm() * fKgy);
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.gf, this.ra);
            Path path = new Path();
            this.fi = path;
            float f = fKgy * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }
}
