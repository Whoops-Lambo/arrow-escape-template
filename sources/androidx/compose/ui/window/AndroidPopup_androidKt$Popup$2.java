package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.ecffri.arrows.R;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidPopup_androidKt$Popup$2 extends rc1 implements wr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ sr0 j;
    public final /* synthetic */ PopupProperties k;
    public final /* synthetic */ String l;
    public final /* synthetic */ LayoutDirection m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2(PopupLayout popupLayout, sr0 sr0Var, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.i = popupLayout;
        this.j = sr0Var;
        this.k = popupProperties;
        this.l = str;
        this.m = layoutDirection;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final PopupLayout popupLayout = this.i;
        popupLayout.m.addView(popupLayout, popupLayout.params);
        popupLayout.j(this.j, this.k, this.l, this.m);
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                PopupLayout popupLayout2 = popupLayout;
                popupLayout2.c();
                popupLayout2.setTag(R.id.view_tree_lifecycle_owner, null);
                popupLayout2.m.removeViewImmediate(popupLayout2);
            }
        };
    }
}
