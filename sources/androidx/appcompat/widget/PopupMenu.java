package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class PopupMenu {

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass1 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass2 implements PopupWindow.OnDismissListener {
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.PopupMenu$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass3 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnDismissListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnMenuItemClickListener {
    }
}
