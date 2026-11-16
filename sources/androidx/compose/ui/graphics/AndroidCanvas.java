package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidCanvas implements Canvas {
    public android.graphics.Canvas a = AndroidCanvas_androidKt.a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();

    @Override // androidx.compose.ui.graphics.Canvas
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void c(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void d(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.a.saveLayer(rect.a, rect.b, rect.c, rect.d, paint.getA(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void e() {
        CanvasUtils.a(this.a, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void g(int i, float f, float f2, float f3, float f4) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void j(float f, long j, Paint paint) {
        this.a.drawCircle(Offset.c(j), Offset.d(j), f, paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void k(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void m(ImageBitmap imageBitmap, long j, Paint paint) {
        this.a.drawBitmap(AndroidImageBitmap_androidKt.a(imageBitmap), Offset.c(j), Offset.d(j), paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void n() {
        this.a.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void o() {
        CanvasUtils.a(this.a, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void q(long j, long j2, Paint paint) {
        this.a.drawLine(Offset.c(j), Offset.d(j), Offset.c(j2), Offset.d(j2), paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void r() {
        this.a.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void s(float[] fArr) {
        fArr.getClass();
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (fArr[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    float f = fArr[2];
                    if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f2 = fArr[6];
                        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[10] == 1.0f && fArr[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f3 = fArr[8];
                            if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[11] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f4 = fArr[0];
                                float f5 = fArr[1];
                                float f6 = fArr[3];
                                float f7 = fArr[4];
                                float f8 = fArr[5];
                                float f9 = fArr[7];
                                float f10 = fArr[12];
                                float f11 = fArr[13];
                                float f12 = fArr[15];
                                fArr[0] = f4;
                                fArr[1] = f7;
                                fArr[2] = f10;
                                fArr[3] = f5;
                                fArr[4] = f8;
                                fArr[5] = f11;
                                fArr[6] = f6;
                                fArr[7] = f9;
                                fArr[8] = f12;
                                matrix.setValues(fArr);
                                fArr[0] = f4;
                                fArr[1] = f5;
                                fArr[2] = f;
                                fArr[3] = f6;
                                fArr[4] = f7;
                                fArr[5] = f8;
                                fArr[6] = f2;
                                fArr[7] = f9;
                                fArr[8] = f3;
                                this.a.concat(matrix);
                                return;
                            }
                        }
                    }
                    d.r("Android does not support arbitrary transforms");
                    return;
                }
                i2++;
            }
            i++;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void u() {
        this.a.rotate(45.0f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void v(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void a(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        imageBitmap.getClass();
        android.graphics.Canvas canvas = this.a;
        Bitmap bitmapA = AndroidImageBitmap_androidKt.a(imageBitmap);
        int i = IntOffset.c;
        int i2 = (int) (j >> 32);
        Rect rect = this.b;
        rect.left = i2;
        int i3 = (int) (j & 4294967295L);
        rect.top = i3;
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = i3 + ((int) (j2 & 4294967295L));
        int i4 = (int) (j3 >> 32);
        Rect rect2 = this.c;
        rect2.left = i4;
        int i5 = (int) (j3 & 4294967295L);
        rect2.top = i5;
        rect2.right = i4 + ((int) (j4 >> 32));
        rect2.bottom = i5 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void f(Path path) {
        path.getClass();
        android.graphics.Canvas canvas = this.a;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).a, Region.Op.INTERSECT);
        } else {
            d.u("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void l(float f, float f2, float f3, float f4, Paint paint) {
        paint.getClass();
        this.a.drawRect(f, f2, f3, f4, paint.getA());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void p(ArrayList arrayList, Paint paint) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((Offset) arrayList.get(i)).a;
            this.a.drawPoint(Offset.c(j), Offset.d(j), paint.getA());
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void t(Path path, Paint paint) {
        path.getClass();
        paint.getClass();
        android.graphics.Canvas canvas = this.a;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).a, paint.getA());
        } else {
            d.u("Unable to obtain android.graphics.Path");
        }
    }
}
