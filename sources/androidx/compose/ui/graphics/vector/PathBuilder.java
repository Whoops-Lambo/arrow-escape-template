package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PathBuilder {
    public final ArrayList a = new ArrayList();

    public final void a(float f, float f2) {
        this.a.add(new PathNode.LineTo(f, f2));
    }
}
