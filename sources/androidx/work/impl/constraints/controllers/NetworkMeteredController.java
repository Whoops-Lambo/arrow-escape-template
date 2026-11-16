package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkMeteredController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "Landroidx/work/impl/constraints/NetworkState;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetworkMeteredController extends ConstraintController<NetworkState> {
    public static final String f = Logger.g("NetworkMeteredCtrlr");

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkMeteredController$Companion;", "", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        networkState.getClass();
        boolean z = networkState.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && networkState.c) ? false : true;
        }
        Logger.e().a(f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        workSpec.getClass();
        if (workSpec.j.a == NetworkType.e) {
            return true;
        }
        return false;
    }
}
