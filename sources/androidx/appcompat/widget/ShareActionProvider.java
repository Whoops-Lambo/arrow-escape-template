package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ShareActionProvider extends ActionProvider {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnShareTargetSelectedListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            throw null;
        }
    }

    @Override // androidx.core.view.ActionProvider
    public final View c() {
        new ActivityChooserView();
        throw null;
    }

    @Override // androidx.core.view.ActionProvider
    public final void f(SubMenuBuilder subMenuBuilder) {
        subMenuBuilder.clear();
        ActivityChooserModel.b();
        throw null;
    }
}
