package androidx.customview.poolingcontainer;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.at;
import defpackage.eu;
import defpackage.m92;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PoolingContainer {
    public static final void c(RecyclerView recyclerView) {
        Iterator it = new ViewGroupKt$children$1(recyclerView).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            ArrayList arrayList = d((View) viewGroupKt$iterator$1.next()).a;
            for (int iO = eu.o(arrayList); -1 < iO; iO--) {
                ((PoolingContainerListener) arrayList.get(iO)).a();
            }
        }
    }

    public static final void a(AbstractComposeView abstractComposeView, PoolingContainerListener poolingContainerListener) {
        d(abstractComposeView).a.add(poolingContainerListener);
    }

    public static final void b(View view) {
        view.getClass();
        m92 m92VarT = at.t((zr0) ViewKt.a(view).b);
        while (m92VarT.hasNext()) {
            ArrayList arrayList = d((View) m92VarT.next()).a;
            for (int iO = eu.o(arrayList); -1 < iO; iO--) {
                ((PoolingContainerListener) arrayList.get(iO)).a();
            }
        }
    }

    public static final PoolingContainerListenerHolder d(View view) {
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(com.ecffri.arrows.R.id.pooling_container_listener_holder_tag);
        if (poolingContainerListenerHolder == null) {
            PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
            view.setTag(com.ecffri.arrows.R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder2);
            return poolingContainerListenerHolder2;
        }
        return poolingContainerListenerHolder;
    }

    public static final void e(View view, PoolingContainerListener poolingContainerListener) {
        d(view).a.remove(poolingContainerListener);
    }
}
