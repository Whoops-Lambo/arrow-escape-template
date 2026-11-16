package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e63 extends CoordinatorLayout.Behavior {
    public f63 a;
    public int b = 0;

    public final int s() {
        f63 f63Var = this.a;
        if (f63Var != null) {
            return f63Var.d;
        }
        return 0;
    }

    public e63() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        t(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new f63(view);
        }
        f63 f63Var = this.a;
        View view2 = f63Var.a;
        f63Var.b = view2.getTop();
        f63Var.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.b(i2);
            this.b = 0;
            return true;
        }
        return true;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(i, view);
    }

    public e63(int i) {
    }
}
