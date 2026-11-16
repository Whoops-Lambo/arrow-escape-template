package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.rd1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return false;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        composer.t(1735448596);
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void e(int i, int i2, int i3, int i4, boolean z) {
        super.e(i, i2, i3, i4, z);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.getMeasuredWidth();
        childAt.getMeasuredHeight();
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i, int i2) {
        super.f(View.MeasureSpec.makeMeasureSpec(rd1.p(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rd1.p(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }
}
