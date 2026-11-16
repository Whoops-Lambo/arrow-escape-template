package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/OnGlobalLayoutListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final sr0 b;
    public boolean c;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ((ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1) this.b).invoke();
    }

    public OnGlobalLayoutListener(View view, sr0 sr0Var) {
        view.getClass();
        this.a = view;
        this.b = sr0Var;
        view.addOnAttachStateChangeListener(this);
        if (!this.c && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.c = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        if (!this.c) {
            View view2 = this.a;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.c = true;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        if (!this.c) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.c = false;
    }
}
