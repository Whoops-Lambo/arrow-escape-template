package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ot implements AdapterView.OnItemClickListener {
    public yh0 a;
    public WeakReference b;
    public WeakReference c;
    public AdapterView.OnItemClickListener d;
    public boolean e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        view.getClass();
        AdapterView.OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        View view2 = (View) this.c.get();
        AdapterView adapterView2 = (AdapterView) this.b.get();
        if (view2 != null && adapterView2 != null) {
            pt.a(this.a, view2, adapterView2);
        }
    }
}
