package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.du;
import defpackage.q4;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public abstract class ConstraintTracker<T> {
    public final WorkManagerTaskExecutor a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public abstract Object a();

    public abstract void d();

    public abstract void e();

    public final void c(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.c.execute(new q4(21, du.z0(this.d), this));
            }
        }
    }

    public ConstraintTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.a = workManagerTaskExecutor;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public final void b(ConstraintController constraintController) {
        constraintController.getClass();
        synchronized (this.c) {
            if (this.d.remove(constraintController) && this.d.isEmpty()) {
                e();
            }
        }
    }
}
