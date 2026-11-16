package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "spec", "Landroidx/work/impl/model/WorkSpec;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class WorkerUpdater$updateWorkImpl$type$1 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        WorkSpec workSpec = (WorkSpec) obj;
        workSpec.getClass();
        return workSpec.c() ? "Periodic" : "OneTime";
    }
}
