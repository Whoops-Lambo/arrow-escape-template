package com.adsurge.adn.p041m0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements d {
    public Paint f;
    public Paint g;
    public Shader i;
    public int j;
    public int k;
    public int[] l;
    public Object[] a = null;
    public int b = 0;
    public int[] c = null;
    public int d = 0;
    public int e = -16777216;
    public boolean h = false;

    @Override // com.adsurge.adn.p041m0.d
    public void a(Canvas canvas, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int[] iArr = this.c;
        if (iArr != null && this.l == null) {
            com.adsurge.adn.p032j0.a.a(canvas, i, i2, this.d, iArr);
        }
        if (this.l != null) {
            Paint paint = new Paint();
            int[] iArr2 = this.l;
            paint.setShadowLayer(iArr2[2], iArr2[0], iArr2[1], iArr2[3]);
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
            int[] iArr3 = this.c;
            if (iArr3 != null) {
                canvas.drawRoundRect(rectF, iArr3[0], iArr3[1], paint);
            } else {
                canvas.drawRect(rectF, paint);
            }
        }
        if (this.a == null && this.b == 0) {
            return;
        }
        if (this.f == null) {
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
        }
        Object[] objArr = this.a;
        if (objArr != null) {
            if (this.i == null || this.h || this.j != i || this.k != i2) {
                this.i = c.a(objArr, i, i2);
            }
            this.f.setShader(this.i);
            this.h = false;
        } else {
            this.f.setColor(this.b);
        }
        this.j = i;
        this.k = i2;
        com.adsurge.adn.p032j0.a.a(canvas, this.f, i, i2, this.d, this.c);
    }

    @Override // com.adsurge.adn.p041m0.d
    public void b(Canvas canvas, int i, int i2) {
        if (i <= 0 || i2 <= 0 || this.d <= 0) {
            return;
        }
        if (this.g == null) {
            Paint paint = new Paint();
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.g.setAntiAlias(true);
        }
        this.g.setStrokeWidth(this.d);
        this.g.setColor(this.e);
        com.adsurge.adn.p032j0.a.b(canvas, this.g, i, i2, this.d, this.c);
    }

    public boolean c(int i) {
        if (i == this.d) {
            return false;
        }
        this.d = i;
        return true;
    }

    public boolean b(int i) {
        if (i == this.e) {
            return false;
        }
        this.e = i;
        return true;
    }

    public boolean b(int[] iArr) {
        if (this.l == iArr) {
            return false;
        }
        this.l = iArr;
        return true;
    }

    public boolean a(int i) {
        if (i == this.b) {
            return false;
        }
        this.b = i;
        return this.a == null;
    }

    public boolean a(int[] iArr) {
        int[] iArr2;
        if (iArr == null || iArr.length < 4 || iArr == (iArr2 = this.c)) {
            return false;
        }
        if (iArr2 == null) {
            this.c = iArr;
            return true;
        }
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                int[] iArr3 = this.c;
                if (i2 != iArr3[i]) {
                    iArr3[i] = i2;
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean a(Object[] objArr) {
        Object[] objArr2 = this.a;
        if (objArr == objArr2) {
            this.h = false;
            return false;
        }
        if (objArr2 == null || objArr == null) {
            this.h = true;
        } else {
            for (int i = 0; i < 4; i++) {
                Object obj = this.a[i];
                if (obj instanceof int[]) {
                    if (!Arrays.equals((int[]) obj, (int[]) objArr[i])) {
                        this.h = true;
                        break;
                    }
                } else if (obj instanceof float[]) {
                    if (!Arrays.equals((float[]) obj, (float[]) objArr[i])) {
                        this.h = true;
                        break;
                    }
                } else {
                    if (obj != objArr[i]) {
                        this.h = true;
                        break;
                    }
                }
            }
        }
        this.a = objArr;
        return this.h;
    }

    public boolean a() {
        return (this.b == 0 && this.d == 0 && this.c == null && this.a == null && this.l == null) ? false : true;
    }
}
