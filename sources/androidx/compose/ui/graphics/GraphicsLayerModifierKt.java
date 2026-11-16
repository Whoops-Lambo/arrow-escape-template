package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class GraphicsLayerModifierKt {
    public static Modifier b(Modifier modifier, float f, float f2, float f3, float f4, float f5, Shape shape, int i) {
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 16) != 0 ? 0.0f : f4;
        float f10 = (i & 256) != 0 ? 0.0f : f5;
        long j = TransformOrigin.b;
        Shape shape2 = (i & 2048) != 0 ? RectangleShapeKt.a : shape;
        boolean z = (i & 4096) == 0;
        long j2 = GraphicsLayerScopeKt.a;
        modifier.getClass();
        shape2.getClass();
        return modifier.N(new SimpleGraphicsLayerModifier(f6, f7, f8, f9, f10, j, shape2, z, j2, j2, InspectableValueKt.a()));
    }

    public static final Modifier a(Modifier modifier, wr0 wr0Var) {
        modifier.getClass();
        wr0Var.getClass();
        return modifier.N(new BlockGraphicsLayerModifier(wr0Var, InspectableValueKt.a()));
    }
}
