package io.p071bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import defpackage.iy;
import io.p071bidmachine.util.log.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements a {
    public static final d b = new d("LifecycleMetric");
    public final List a;

    @Override // io.p071bidmachine.util.viewabilitytracker.metric.a
    public final boolean a(View view) {
        if (!this.a.contains(e.a) || view.hasWindowFocus()) {
            return true;
        }
        b.c(null, new iy(view, 8));
        return false;
    }

    public f(List list) {
        list.getClass();
        this.a = list;
    }
}
