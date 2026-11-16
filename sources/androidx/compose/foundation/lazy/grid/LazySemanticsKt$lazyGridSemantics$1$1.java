package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$1 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        KProperty[] kPropertyArr = SemanticsPropertiesKt.a;
        semanticsPropertyReceiver.a(SemanticsProperties.A, null);
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, null);
        SemanticsPropertiesKt.n.a(semanticsPropertyReceiver, SemanticsPropertiesKt.a[13], null);
        return az2.a;
    }
}
