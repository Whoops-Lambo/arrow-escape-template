package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/StorageNotLowController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StorageNotLowController extends ConstraintController<Boolean> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        workSpec.getClass();
        return workSpec.j.e;
    }
}
