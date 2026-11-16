package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ComposeUiNode {
    public static final Companion X8 = Companion.a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final sr0 b;
        public static final zr0 c;
        public static final zr0 d;
        public static final zr0 e;
        public static final zr0 f;
        public static final zr0 g;

        static {
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.T;
            b = LayoutNode.U;
            c = ComposeUiNode$Companion$SetModifier$1.i;
            d = ComposeUiNode$Companion$SetDensity$1.i;
            e = ComposeUiNode$Companion$SetMeasurePolicy$1.i;
            f = ComposeUiNode$Companion$SetLayoutDirection$1.i;
            g = ComposeUiNode$Companion$SetViewConfiguration$1.i;
        }
    }

    void c(LayoutDirection layoutDirection);

    void d(MeasurePolicy measurePolicy);

    void e(Modifier modifier);

    void f(Density density);

    void g(ViewConfiguration viewConfiguration);
}
