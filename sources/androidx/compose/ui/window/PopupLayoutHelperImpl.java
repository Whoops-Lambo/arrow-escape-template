package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupLayoutHelperImpl;", "Landroidx/compose/ui/window/PopupLayoutHelper;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
class PopupLayoutHelperImpl implements PopupLayoutHelper {
    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public void a(PopupLayout popupLayout, int i, int i2) {
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public final void b(WindowManager windowManager, PopupLayout popupLayout, WindowManager.LayoutParams layoutParams) {
        windowManager.getClass();
        layoutParams.getClass();
        windowManager.updateViewLayout(popupLayout, layoutParams);
    }

    @Override // androidx.compose.ui.window.PopupLayoutHelper
    public final void c(Rect rect, View view) {
        view.getClass();
        rect.getClass();
        view.getWindowVisibleDisplayFrame(rect);
    }
}
