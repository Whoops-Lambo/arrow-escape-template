package androidx.compose.material.internal;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 extends rc1 implements sr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ String j;
    public final /* synthetic */ LayoutDirection k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(PopupLayout popupLayout, String str, LayoutDirection layoutDirection) {
        super(0);
        this.i = popupLayout;
        this.j = str;
        this.k = layoutDirection;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.i.h(this.j, this.k);
        return az2.a;
    }
}
