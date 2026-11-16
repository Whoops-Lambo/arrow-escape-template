package io.p071bidmachine.util.viewabilitytracker.metric;

import android.content.Context;
import android.view.View;
import defpackage.iy;
import io.p071bidmachine.util.o;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements a {
    public static final io.p071bidmachine.util.log.d e = new io.p071bidmachine.util.log.d("GeometryMetric");
    public final boolean a;
    public final Float b;
    public final Float c;
    public final Float d;

    public d(boolean z, Float f, Float f2, Float f3) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // io.p071bidmachine.util.viewabilitytracker.metric.a
    public final boolean a(View view) {
        boolean zIsShown = view.isShown();
        boolean z = this.a;
        io.p071bidmachine.util.log.d dVar = e;
        if (z && !zIsShown) {
            dVar.c(null, new iy(view, 7));
            return false;
        }
        float alpha = view.getAlpha();
        Float f = this.b;
        if (f != null && alpha < f.floatValue()) {
            dVar.c(null, new b(alpha, this, view, 0));
            return false;
        }
        Context context = view.getContext();
        context.getClass();
        int width = view.getWidth();
        float f2 = p.t(context).density;
        int i = o.a;
        int i2 = (int) ((width / f2) + 0.5f);
        Float f3 = this.c;
        if (f3 != null && i2 < f3.floatValue()) {
            dVar.c(null, new c(i2, this, view, 0));
            return false;
        }
        Context context2 = view.getContext();
        context2.getClass();
        int height = (int) ((view.getHeight() / p.t(context2).density) + 0.5f);
        Float f4 = this.d;
        if (f4 == null || height >= f4.floatValue()) {
            return true;
        }
        dVar.c(null, new c(height, this, view, 1));
        return false;
    }
}
