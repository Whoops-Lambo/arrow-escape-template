package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wd2 extends ae2 {
    public final yd2 c;
    public final float d;
    public final float e;

    @Override // defpackage.ae2
    public final void a(Matrix matrix, pd2 pd2Var, int i, Canvas canvas) {
        yd2 yd2Var = this.c;
        float f = yd2Var.c;
        float f2 = this.e;
        float f3 = yd2Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(f - f2, f3 - f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        pd2Var.getClass();
        rectF.bottom += i;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i);
        int i2 = pd2Var.f;
        int[] iArr = pd2.i;
        iArr[0] = i2;
        iArr[1] = pd2Var.e;
        iArr[2] = pd2Var.d;
        Paint paint = pd2Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, pd2.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        yd2 yd2Var = this.c;
        return (float) Math.toDegrees(Math.atan((yd2Var.c - this.e) / (yd2Var.b - this.d)));
    }

    public wd2(yd2 yd2Var, float f, float f2) {
        this.c = yd2Var;
        this.d = f;
        this.e = f2;
    }
}
