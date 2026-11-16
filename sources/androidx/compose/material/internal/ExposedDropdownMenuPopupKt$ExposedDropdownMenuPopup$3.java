package androidx.compose.material.internal;

import androidx.compose.material.DropdownMenuPositionProvider;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 extends rc1 implements wr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ DropdownMenuPositionProvider j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(PopupLayout popupLayout, DropdownMenuPositionProvider dropdownMenuPositionProvider) {
        super(1);
        this.i = popupLayout;
        this.j = dropdownMenuPositionProvider;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        PopupLayout popupLayout = this.i;
        popupLayout.getClass();
        popupLayout.k = this.j;
        popupLayout.i();
        return new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$invoke$$inlined$onDispose$1();
    }
}
