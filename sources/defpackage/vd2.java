package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vd2 extends ae2 {
    public final xd2 c;

    @Override // defpackage.ae2
    public final void a(Matrix matrix, pd2 pd2Var, int i, Canvas canvas) {
        xd2 xd2Var = this.c;
        float f = xd2Var.f;
        float f2 = xd2Var.g;
        RectF rectF = new RectF(xd2Var.b, xd2Var.c, xd2Var.d, xd2Var.e);
        Paint paint = pd2Var.b;
        boolean z = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = pd2Var.g;
        int[] iArr = pd2.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = pd2Var.f;
            iArr[2] = pd2Var.e;
            iArr[3] = pd2Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = pd2Var.d;
            iArr[2] = pd2Var.e;
            iArr[3] = pd2Var.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = pd2.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, pd2Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }

    public vd2(xd2 xd2Var) {
        this.c = xd2Var;
    }
}
