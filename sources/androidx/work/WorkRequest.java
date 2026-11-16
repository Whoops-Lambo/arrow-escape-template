package androidx.work;

import androidx.work.impl.model.WorkSpec;
import defpackage.d;
import defpackage.n8;
import defpackage.rh1;
import defpackage.tb5;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/WorkRequest;", "", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class WorkRequest {
    public final UUID a;
    public final WorkSpec b;
    public final Set c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        public boolean a;
        public UUID b;
        public WorkSpec c;
        public final Set d;

        public abstract WorkRequest b();

        public abstract Builder c();

        public Builder(Class cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.b = uuidRandomUUID;
            String string = this.b.toString();
            string.getClass();
            this.c = new WorkSpec(string, null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(rh1.U(1));
            n8.m0(strArr, linkedHashSet);
            this.d = linkedHashSet;
        }

        public final WorkRequest a() {
            WorkRequest workRequestB = b();
            Constraints constraints = this.c.j;
            boolean z = !constraints.h.isEmpty() || constraints.d || constraints.b || constraints.c;
            WorkSpec workSpec = this.c;
            if (workSpec.q) {
                if (z) {
                    d.r("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (workSpec.g > 0) {
                    d.r("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            string.getClass();
            WorkSpec workSpec2 = this.c;
            workSpec2.getClass();
            String str = workSpec2.c;
            WorkInfo.State state = workSpec2.b;
            String str2 = workSpec2.d;
            Data data = new Data(workSpec2.e);
            Data data2 = new Data(workSpec2.f);
            long j = workSpec2.g;
            long j2 = workSpec2.h;
            long j3 = workSpec2.i;
            Constraints constraints2 = workSpec2.j;
            constraints2.getClass();
            this.c = new WorkSpec(string, state, str, str2, data, data2, j, j2, j3, new Constraints(constraints2.a, constraints2.b, constraints2.c, constraints2.d, constraints2.e, constraints2.f, constraints2.g, constraints2.h), workSpec2.k, workSpec2.l, workSpec2.m, workSpec2.n, workSpec2.o, workSpec2.p, workSpec2.q, workSpec2.r, workSpec2.s, 524288, 0);
            return workRequestB;
        }

        public final Builder d(BackoffPolicy backoffPolicy, long j) {
            TimeUnit.MILLISECONDS.getClass();
            this.a = true;
            WorkSpec workSpec = this.c;
            workSpec.l = backoffPolicy;
            String str = WorkSpec.u;
            if (j > 18000000) {
                Logger.e().h(str, "Backoff delay duration exceeds maximum value");
            }
            if (j < 10000) {
                Logger.e().h(str, "Backoff delay duration less than minimum value");
            }
            workSpec.m = tb5.i(j, 10000L, 18000000L);
            return c();
        }

        public final Builder e(Data data) {
            data.getClass();
            this.c.e = data;
            return c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/WorkRequest$Companion;", "", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public WorkRequest(UUID uuid, WorkSpec workSpec, Set set) {
        uuid.getClass();
        workSpec.getClass();
        set.getClass();
        this.a = uuid;
        this.b = workSpec;
        this.c = set;
    }
}
