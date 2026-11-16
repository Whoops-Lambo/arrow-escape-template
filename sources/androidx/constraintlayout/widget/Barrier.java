package androidx.constraintlayout.widget;

import android.content.Context;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Barrier extends ConstraintHelper {
    public int i;
    public int j;
    public final androidx.constraintlayout.core.widgets.Barrier k;

    public boolean getAllowsGoneWidget() {
        return this.k.u0;
    }

    public int getMargin() {
        return this.k.v0;
    }

    public int getType() {
        return this.i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintWidget constraintWidget, boolean z) {
        int i = this.i;
        this.j = i;
        if (z) {
            if (i == 5) {
                this.j = 1;
            } else if (i == 6) {
                this.j = 0;
            }
        } else if (i == 5) {
            this.j = 0;
        } else if (i == 6) {
            this.j = 1;
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).t0 = this.j;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k.u0 = z;
    }

    public void setMargin(int i) {
        this.k.v0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.g = null;
        this.h = new HashMap();
        this.c = context;
        androidx.constraintlayout.core.widgets.Barrier barrier = new androidx.constraintlayout.core.widgets.Barrier();
        barrier.t0 = 0;
        barrier.u0 = true;
        barrier.v0 = 0;
        barrier.w0 = false;
        this.k = barrier;
        this.d = barrier;
        m();
        super.setVisibility(8);
    }

    public void setDpMargin(int i) {
        this.k.v0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
