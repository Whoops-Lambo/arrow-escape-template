package io.p071bidmachine.util.viewabilitytracker.metric;

import android.graphics.Rect;
import android.view.View;
import defpackage.h50;
import defpackage.iy;
import io.p071bidmachine.util.log.d;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements a {
    public static final d c = new d("VisibilityMetric");
    public final int a;
    public final float b;

    public k(int i, float f) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = f;
    }

    @Override // io.p071bidmachine.util.viewabilitytracker.metric.a
    public final boolean a(View view) {
        int iC = h50.C(this.a);
        d dVar = c;
        if (iC == 0) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                dVar.c(null, new iy(view, 9));
                return false;
            }
            float fHeight = ((rect.height() * rect.width()) / (view.getHeight() * view.getWidth())) * 100.0f;
            if (fHeight < this.b) {
                dVar.c(null, new b(fHeight, this, view, 1));
                return false;
            }
            View viewP = p.p(view);
            if (viewP == null) {
                dVar.c(null, new iy(view, 10));
                return false;
            }
            Rect rect2 = new Rect();
            viewP.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                dVar.c(null, new iy(view, 11));
                return false;
            }
        } else {
            if (iC == 1) {
                dVar.d(null, new j(this, 0));
                return true;
            }
            if (iC == 2) {
                dVar.d(null, new j(this, 1));
                return true;
            }
        }
        return true;
    }
}
