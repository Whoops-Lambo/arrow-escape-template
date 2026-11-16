package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class nt implements View.OnClickListener {
    public yh0 a;
    public WeakReference b;
    public WeakReference c;
    public View.OnClickListener d;
    public boolean e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set = lz.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                view.getClass();
                View.OnClickListener onClickListener = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.c.get();
                View view3 = (View) this.b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                pt.a(this.a, view2, view3);
                return;
            } catch (Throwable th) {
                lz.a(this, th);
                return;
            }
            lz.a(this, th);
        } catch (Throwable th2) {
            lz.a(this, th2);
        }
    }
}
