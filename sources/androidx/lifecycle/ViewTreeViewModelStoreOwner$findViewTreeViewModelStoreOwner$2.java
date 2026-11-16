package androidx.lifecycle;

import android.view.View;
import com.ecffri.arrows.R;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends rc1 implements wr0 {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 i = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
