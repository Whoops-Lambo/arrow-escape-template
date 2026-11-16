package androidx.compose.material;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TouchTargetKt {
    public static final StaticProvidableCompositionLocal a = new StaticProvidableCompositionLocal(TouchTargetKt$LocalMinimumTouchTargetEnforcement$1.i);

    public static final Modifier a(Modifier modifier) {
        modifier.getClass();
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), TouchTargetKt$minimumTouchTargetSize$2.i);
    }
}
