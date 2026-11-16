package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a40 extends pi1 {
    public static final /* synthetic */ int z = 0;
    public y30 y;

    @Override // defpackage.pi1
    public final void f(Canvas canvas) {
        if (this.y.q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        y30 y30Var = this.y;
        if (i >= 26) {
            canvas.clipOutRect(y30Var.q);
        } else {
            canvas.clipRect(y30Var.q, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.pi1, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.y = new y30(this.y);
        return this;
    }

    public final void o(float f, float f2, float f3, float f4) {
        RectF rectF = this.y.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
