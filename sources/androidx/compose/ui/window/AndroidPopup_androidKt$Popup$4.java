package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectScope;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidPopup_androidKt$Popup$4 extends rc1 implements wr0 {
    public final /* synthetic */ PopupLayout i;
    public final /* synthetic */ PopupPositionProvider j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$4(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
        super(1);
        this.i = popupLayout;
        this.j = popupPositionProvider;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        PopupPositionProvider popupPositionProvider = this.j;
        PopupLayout popupLayout = this.i;
        popupLayout.setPositionProvider(popupPositionProvider);
        popupLayout.m();
        return new AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1();
    }
}
