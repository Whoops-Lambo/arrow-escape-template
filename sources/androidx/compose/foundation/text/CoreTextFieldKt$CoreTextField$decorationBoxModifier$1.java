package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends rc1 implements wr0 {
    public final /* synthetic */ TextFieldState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.i = textFieldState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        layoutCoordinates.getClass();
        TextLayoutResultProxy textLayoutResultProxyC = this.i.c();
        if (textLayoutResultProxyC != null) {
            textLayoutResultProxyC.c = layoutCoordinates;
        }
        return az2.a;
    }
}
