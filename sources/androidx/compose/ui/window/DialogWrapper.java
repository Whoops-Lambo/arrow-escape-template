package androidx.compose.ui.window;

import android.app.Dialog;
import android.view.MotionEvent;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroid/app/Dialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DialogWrapper extends Dialog implements ViewRootForInspector {
    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!zOnTouchEvent) {
            return zOnTouchEvent;
        }
        throw null;
    }
}
