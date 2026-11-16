package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y30 extends oi1 {
    public final RectF q;

    @Override // defpackage.oi1, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        a40 a40Var = new a40(this);
        a40Var.y = this;
        a40Var.invalidateSelf();
        return a40Var;
    }

    public y30(y30 y30Var) {
        super(y30Var);
        this.q = y30Var.q;
    }

    public y30(rd2 rd2Var, RectF rectF) {
        super(rd2Var);
        this.q = rectF;
    }
}
