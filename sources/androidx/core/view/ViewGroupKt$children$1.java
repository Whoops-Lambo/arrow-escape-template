package androidx.core.view;

import android.view.ViewGroup;
import defpackage.l92;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/core/view/ViewGroupKt$children$1", "Ll92;", "Landroid/view/View;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewGroupKt$children$1 implements l92 {
    public final /* synthetic */ ViewGroup a;

    @Override // defpackage.l92
    public final Iterator iterator() {
        return new ViewGroupKt$iterator$1(this.a);
    }

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.a = viewGroup;
    }
}
