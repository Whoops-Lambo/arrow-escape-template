package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayoutHelper;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@VisibleForTesting
public interface PopupLayoutHelper {
    void a(PopupLayout popupLayout, int i, int i2);

    void b(WindowManager windowManager, PopupLayout popupLayout, WindowManager.LayoutParams layoutParams);

    void c(Rect rect, View view);
}
