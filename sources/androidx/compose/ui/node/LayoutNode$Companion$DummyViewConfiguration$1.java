package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/LayoutNode$Companion$DummyViewConfiguration$1", "Landroidx/compose/ui/platform/ViewConfiguration;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutNode$Companion$DummyViewConfiguration$1 implements ViewConfiguration {
    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float a() {
        return 16.0f;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long b() {
        return 300L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long c() {
        return 400L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long d() {
        int i = DpSize.d;
        return DpSize.b;
    }
}
