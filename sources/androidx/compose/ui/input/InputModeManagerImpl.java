package androidx.compose.ui.input;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InputModeManagerImpl implements InputModeManager {
    public final wr0 a;
    public final ParcelableSnapshotMutableState b;

    @Override // androidx.compose.ui.input.InputModeManager
    public final int a() {
        return ((InputMode) this.b.getA()).a;
    }

    public InputModeManagerImpl(int i, wr0 wr0Var) {
        this.a = wr0Var;
        this.b = SnapshotStateKt.c(new InputMode(i), StructuralEqualityPolicy.a);
    }
}
