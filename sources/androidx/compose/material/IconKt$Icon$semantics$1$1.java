package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class IconKt$Icon$semantics$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$semantics$1$1(String str) {
        super(1);
        this.i = str;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        SemanticsPropertiesKt.g(this.i, semanticsPropertyReceiver);
        SemanticsPropertiesKt.i(semanticsPropertyReceiver, 5);
        return az2.a;
    }
}
