package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class InspectableValueKt {
    public static final wr0 a = null;
    public static boolean b;

    public static final wr0 a() {
        return InspectableValueKt$NoInspectorInfo$1.i;
    }

    public static final Modifier b(Modifier modifier, Modifier modifier2) {
        modifier.getClass();
        modifier2.getClass();
        InspectableModifier inspectableModifier = new InspectableModifier();
        return modifier.N(inspectableModifier).N(modifier2).N(inspectableModifier.b);
    }
}
