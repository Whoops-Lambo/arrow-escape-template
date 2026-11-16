package androidx.compose.material.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.ecffri.arrows.R;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1 extends rc1 implements wr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ String j;
    public final /* synthetic */ LayoutDirection k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1(PopupLayout popupLayout, String str, LayoutDirection layoutDirection) {
        super(1);
        this.i = popupLayout;
        this.j = str;
        this.k = layoutDirection;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final PopupLayout popupLayout = this.i;
        popupLayout.i.addView(popupLayout, popupLayout.j);
        popupLayout.h(this.j, this.k);
        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                PopupLayout popupLayout2 = popupLayout;
                popupLayout2.c();
                popupLayout2.setTag(R.id.view_tree_lifecycle_owner, null);
                popupLayout2.h.getViewTreeObserver().removeOnGlobalLayoutListener(popupLayout2);
                popupLayout2.i.removeViewImmediate(popupLayout2);
            }
        };
    }
}
