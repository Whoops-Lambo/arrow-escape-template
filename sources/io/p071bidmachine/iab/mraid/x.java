package io.p071bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x {
    public final float a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;

    public final boolean a(Rect rect, Rect rect2, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && i + i3 == rect.right && i2 + i4 == rect.bottom) {
            return false;
        }
        rect.set(i, i2, i3 + i, i4 + i2);
        p.V(rect2, rect, this.a);
        return true;
    }

    public x(Context context) {
        context.getClass();
        float f = p.t(context).density;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        Rect rect5 = new Rect();
        Rect rect6 = new Rect();
        Rect rect7 = new Rect();
        Rect rect8 = new Rect();
        this.a = f;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = rect4;
        this.f = rect5;
        this.g = rect6;
        this.h = rect7;
        this.i = rect8;
    }
}
