package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.bc1;
import defpackage.dr0;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewGroupKt$iterator$1 implements Iterator<View>, bc1 {
    public int a;
    public final /* synthetic */ ViewGroup b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.a;
        this.a = i + 1;
        View childAt = this.b.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        dr0.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a - 1;
        this.a = i;
        this.b.removeViewAt(i);
    }

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.b = viewGroup;
    }
}
