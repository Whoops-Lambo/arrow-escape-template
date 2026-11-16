package io.p071bidmachine.rendering.internal.view;

import android.view.View;
import android.widget.RelativeLayout;
import defpackage.s71;
import io.p071bidmachine.rendering.internal.adform.a;
import io.p071bidmachine.rendering.internal.q;
import io.p071bidmachine.rendering.model.x0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends RelativeLayout.LayoutParams {
    public final int a;
    public final int b;
    public float c;
    public float d;

    public final void a(x0 x0Var, int i, int i2, int i3, int i4, List list) {
        Object next;
        if (x0Var == null) {
            return;
        }
        String str = x0Var.b;
        View viewC = null;
        if (str != null && str.length() != 0) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s71.b(((a) ((q) next)).f.m, str));
            q qVar = (q) next;
            if (qVar != null) {
                viewC = ((a) qVar).C();
            }
        }
        if (viewC == null) {
            addRule(i4);
            return;
        }
        if (x0Var.a != i) {
            i2 = i3;
        }
        addRule(i2, viewC.getId());
    }

    public i(int i, int i2) {
        super(i, i2);
        this.a = i;
        this.b = i2;
        this.c = 1.0f;
        this.d = 1.0f;
    }
}
