package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidPopup_androidKt$Popup$3 extends rc1 implements sr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ sr0 j;
    public final /* synthetic */ PopupProperties k;
    public final /* synthetic */ String l;
    public final /* synthetic */ LayoutDirection m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3(PopupLayout popupLayout, sr0 sr0Var, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.i = popupLayout;
        this.j = sr0Var;
        this.k = popupProperties;
        this.l = str;
        this.m = layoutDirection;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.i.j(this.j, this.k, this.l, this.m);
        return az2.a;
    }
}
