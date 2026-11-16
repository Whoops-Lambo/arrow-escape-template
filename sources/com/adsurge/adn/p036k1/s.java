package com.adsurge.adn.p036k1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p035k0.o;
import com.adsurge.adn.p038l0.e;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p050p0.d;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class s extends com.adsurge.adn.p038l0.a {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements i.e {
        @Override // com.adsurge.adn.l0.i.e
        public i a() {
            return new s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends View implements e {
        public final float[] a;
        public final RectF b;
        public final Paint c;
        public final Path d;
        public int e;
        public int f;
        public int g;
        public int h;
        public float i;
        public s j;

        public final void a(Canvas canvas, float f, float f2) {
            this.c.reset();
            this.c.setAntiAlias(true);
            this.c.setDither(true);
            this.c.setColor(this.i >= 1.0f ? this.g : this.f);
            this.c.setStyle(Paint.Style.FILL);
            this.c.setStrokeWidth(1.0f);
            a(this.d, f, f2, this.a[0], true);
            canvas.drawPath(this.d, this.c);
            a(this.d, f, f2, this.a[1], false);
            canvas.drawPath(this.d, this.c);
        }

        public final void b(Canvas canvas) {
            this.c.reset();
            this.c.setAntiAlias(true);
            this.c.setDither(true);
            this.c.setColor(this.g);
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeCap(Paint.Cap.ROUND);
            this.c.setStrokeWidth(this.h);
            float f = this.a[2] * this.i;
            boolean zA = a();
            float[] fArr = this.a;
            canvas.drawArc(this.b, zA ? fArr[0] : fArr[3] - (f / 2.0f), f, false, this.c);
        }

        public void c(int i) {
            this.e = i;
            postInvalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            d dVarX = this.j.x();
            if (dVarX == null) {
                super.onMeasure(i, i2);
                return;
            }
            Pair pairB = dVarX.b(i, i2);
            super.onMeasure(((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
            Pair pairA = dVarX.a(i, i2);
            if (pairA != null) {
                super.onMeasure(((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
            }
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.f = i;
            postInvalidate();
        }

        public b(Context context) {
            super(context);
            this.a = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, 360.0f, 180.0f};
            this.b = new RectF();
            this.c = new Paint();
            this.d = new Path();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.h * 1.5f;
            float fMin = Math.min(getWidth(), getHeight()) - (f * 2.0f);
            float f2 = fMin / 2.0f;
            RectF rectF = this.b;
            rectF.top = f;
            rectF.left = f;
            float f3 = fMin + f;
            rectF.right = f3;
            rectF.bottom = f3;
            a(canvas);
            if (b()) {
                a(canvas, f2, f);
            }
            if (this.i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b(canvas);
            }
        }

        public final boolean b() {
            return this.e == 1;
        }

        public void b(int i) {
            this.h = i;
            postInvalidate();
        }

        public final void a(Canvas canvas) {
            this.c.reset();
            this.c.setAntiAlias(true);
            this.c.setDither(true);
            this.c.setColor(this.f);
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeCap(b() ? Paint.Cap.BUTT : Paint.Cap.ROUND);
            this.c.setStrokeWidth(this.h);
            RectF rectF = this.b;
            float[] fArr = this.a;
            canvas.drawArc(rectF, fArr[0], fArr[2], false, this.c);
        }

        public final void a(Path path, float f, float f2, double d, boolean z) {
            double d2 = (d * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d2);
            float fSin = (float) Math.sin(d2);
            float f3 = f * fCos;
            float f4 = f * fSin;
            float f5 = f + f2;
            float f6 = f5 * fCos;
            float f7 = f5 * fSin;
            float f8 = f - f2;
            float f9 = f8 * fCos;
            float f10 = f8 * fSin;
            float f11 = fSin * f2;
            float f12 = z ? f11 + f3 : f3 - f11;
            float f13 = f2 * fCos;
            float f14 = z ? f4 - f13 : f4 + f13;
            float fCenterX = this.b.centerX();
            float fCenterY = this.b.centerY();
            path.reset();
            path.moveTo(f12 + fCenterX, f14 + fCenterY);
            path.lineTo(f6 + fCenterX, f7 + fCenterY);
            path.lineTo(f9 + fCenterX, f10 + fCenterY);
            path.close();
        }

        public final boolean a() {
            return this.e == 2;
        }

        public void a(float f, float f2) {
            float[] fArr = this.a;
            fArr[0] = f;
            fArr[1] = f2;
            float f3 = f2 - f;
            fArr[2] = f3;
            fArr[3] = (f3 / 2.0f) + f;
            postInvalidate();
        }

        public void a(float f) {
            this.i = f;
            postInvalidate();
        }

        public void a(int i) {
            this.g = i;
            postInvalidate();
        }

        @Override // com.adsurge.adn.p038l0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void setViewNode(s sVar) {
            this.j = sVar;
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b b(com.adsurge.adn.p011c0.a aVar) {
        return new b(aVar.c());
    }

    @Override // com.adsurge.adn.p038l0.i
    public boolean a(String str, h hVar) {
        str.getClass();
        switch (str) {
            case "renderRange":
                if (hVar.d(new JSONObject[0]) instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) hVar.d(new JSONObject[0]);
                    ((b) this.y).a((float) jSONArray.optDouble(0, 0.0d), (float) jSONArray.optDouble(1, 360.0d));
                }
                return true;
            case "progressf":
                ((b) this.y).a(hVar.a(new JSONObject[0]));
                return true;
            case "16":
                ((b) this.y).setBackgroundColor(o.b(hVar));
                return true;
            case "18":
                ((b) this.y).b(hVar.b(new JSONObject[0]).e());
                return true;
            case "19":
                ((b) this.y).a(o.b(hVar));
                return true;
            case "style":
                ((b) this.y).c(hVar.e(new JSONObject[0]));
                return true;
            default:
                return super.a(str, hVar);
        }
    }
}
