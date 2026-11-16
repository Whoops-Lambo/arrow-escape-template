package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.hu;
import defpackage.qj1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    public boolean a;

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void b(long j) {
        this.a = false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void d() {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final long e() {
        throw null;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final Map f() {
        throw null;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void h(long j) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void i(long j) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final Selectable j(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j = multiWidgetSelectionDelegate.a;
        if (j != 0) {
            throw null;
        }
        throw new IllegalArgumentException(("The selectable contains an invalid id: " + j).toString());
    }

    public final ArrayList k(LayoutCoordinates layoutCoordinates) {
        if (!this.a) {
            hu.M(null, new qj1(layoutCoordinates, 1));
            this.a = true;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void a(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment) {
        layoutCoordinates.getClass();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void c(Selectable selectable) {
        selectable.getClass();
        selectable.getA();
        throw null;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final boolean g(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment selectionAdjustment) {
        layoutCoordinates.getClass();
        return true;
    }
}
