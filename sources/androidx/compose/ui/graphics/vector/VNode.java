package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class VNode {
    public sr0 a;

    public abstract void a(DrawScope drawScope);

    /* JADX INFO: renamed from: b, reason: from getter */
    public sr0 getH() {
        return this.a;
    }

    public void d(sr0 sr0Var) {
        this.a = sr0Var;
    }

    public final void c() {
        sr0 a = getH();
        if (a != null) {
            a.invoke();
        }
    }
}
