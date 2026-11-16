package androidx.compose.ui.window;

import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class PopupLayout$canCalculatePosition$2 extends rc1 implements sr0 {
    public final /* synthetic */ PopupLayout i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.i = popupLayout;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        PopupLayout popupLayout = this.i;
        return Boolean.valueOf((popupLayout.getParentLayoutCoordinates() == null || popupLayout.m13getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
