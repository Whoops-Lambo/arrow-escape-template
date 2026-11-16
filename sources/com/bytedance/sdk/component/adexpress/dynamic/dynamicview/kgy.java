package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy extends ahm {
    private final Bitmap rz;
    private final Rect ahm = new Rect();
    private final Paint uq = new Paint(1);

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ahm
    public void kgy(Canvas canvas) {
        canvas.drawBitmap(this.rz, this.ahm, getBounds(), this.uq);
    }

    public kgy(Bitmap bitmap, ahm ahmVar) {
        this.rz = bitmap;
        if (ahmVar != null) {
            this.kgy = ahmVar.kgy;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.rz.getWidth();
        int height = this.rz.getHeight();
        this.ahm.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.ahm;
                int i = (width - iWidth) / 2;
                rect2.left = i;
                rect2.right = i + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.ahm;
                int i2 = (height - iHeight) / 2;
                rect3.top = i2;
                rect3.bottom = i2 + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = f * 1.0f;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = 1.0f * f5;
        float f7 = width;
        float fMax = Math.max(f4, f6 / f7);
        Rect rect4 = this.ahm;
        if (fMax > f4) {
            int i3 = (int) ((f2 / f5) * f7);
            int i4 = (height - i3) / 2;
            rect4.top = i4;
            rect4.bottom = i4 + i3;
            return;
        }
        int i5 = (int) ((f6 / f) * f3);
        int i6 = (width - i5) / 2;
        rect4.left = i6;
        rect4.right = i6 + i5;
    }
}
