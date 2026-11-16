package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(boolean z, String str) {
        super(1);
        this.i = z;
        this.j = str;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        if (this.i) {
            KProperty[] kPropertyArr = SemanticsPropertiesKt.a;
            semanticsPropertyReceiver.a(SemanticsProperties.z, this.j);
        }
        return az2.a;
    }
}
