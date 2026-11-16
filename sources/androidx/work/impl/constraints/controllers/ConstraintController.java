package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.constraints.trackers.ConstraintTrackerKt;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/work/impl/constraints/ConstraintListener;", "OnConstraintUpdatedCallback", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    public final ConstraintTracker a;
    public final ArrayList b;
    public final ArrayList c;
    public Object d;
    public OnConstraintUpdatedCallback e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnConstraintUpdatedCallback {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList);
    }

    public abstract boolean b(WorkSpec workSpec);

    public abstract boolean c(Object obj);

    @Override // androidx.work.impl.constraints.ConstraintListener
    public final void a(Object obj) {
        this.d = obj;
        e(this.e, obj);
    }

    public final void e(OnConstraintUpdatedCallback onConstraintUpdatedCallback, Object obj) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || onConstraintUpdatedCallback == null) {
            return;
        }
        if (obj == null || c(obj)) {
            onConstraintUpdatedCallback.b(arrayList);
        } else {
            onConstraintUpdatedCallback.a(arrayList);
        }
    }

    public ConstraintController(ConstraintTracker constraintTracker) {
        constraintTracker.getClass();
        this.a = constraintTracker;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void d(Iterable iterable) {
        iterable.getClass();
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (T t : iterable) {
            if (b((WorkSpec) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(((WorkSpec) obj).a);
        }
        boolean zIsEmpty = this.b.isEmpty();
        ConstraintTracker constraintTracker = this.a;
        if (zIsEmpty) {
            constraintTracker.b(this);
        } else {
            constraintTracker.getClass();
            synchronized (constraintTracker.c) {
                try {
                    if (constraintTracker.d.add(this)) {
                        if (constraintTracker.d.size() == 1) {
                            constraintTracker.e = constraintTracker.a();
                            Logger.e().a(ConstraintTrackerKt.a, constraintTracker.getClass().getSimpleName() + ": initial state = " + constraintTracker.e);
                            constraintTracker.d();
                        }
                        a(constraintTracker.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.e, this.d);
    }
}
