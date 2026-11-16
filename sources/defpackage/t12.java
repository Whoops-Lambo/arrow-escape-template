package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t12 implements View.OnTouchListener {
    public final yh0 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnTouchListener d;
    public final boolean e = true;

    public t12(yh0 yh0Var, View view, View view2) {
        this.a = yh0Var;
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        this.d = b63.g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        View view2 = (View) this.c.get();
        View view3 = (View) this.b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            pt.a(this.a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.d;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
