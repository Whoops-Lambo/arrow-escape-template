package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.inmobi.media.core.config.models.CrashConfig;
import com.singular.sdk.internal.Constants;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Entity
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public final /* data */ class WorkSpec {
    public static final String u = Logger.g("WorkSpec");
    public final String a;
    public WorkInfo.State b;
    public final String c;
    public String d;
    public Data e;
    public final Data f;
    public long g;
    public final long h;
    public final long i;
    public Constraints j;
    public final int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final OutOfQuotaPolicy r;
    public final int s;
    public final int t;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class IdAndState {
        public String a;
        public WorkInfo.State b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return s71.b(this.a, idAndState.a) && this.b == idAndState.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WorkInfoPojo {
        public final WorkInfo a() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof WorkInfoPojo) && s71.b(null, null) && s71.b(null, null)) {
                throw null;
            }
            return false;
        }

        public final String toString() {
            return "WorkInfoPojo(id=" + ((String) null) + ", state=" + ((Object) null) + ", output=" + ((Object) null) + ", runAttemptCount=0, generation=0, tags=" + ((Object) null) + ", progress=" + ((Object) null) + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, int i4) {
        Data data3;
        Data data4;
        WorkInfo.State state2 = (i3 & 2) != 0 ? WorkInfo.State.a : state;
        String str4 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            Data data5 = Data.c;
            data5.getClass();
            data3 = data5;
        } else {
            data3 = data;
        }
        if ((i3 & 32) != 0) {
            Data data6 = Data.c;
            data6.getClass();
            data4 = data6;
        } else {
            data4 = data2;
        }
        this(str, state2, str2, str4, data3, data4, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? 0L : j3, (i3 & 512) != 0 ? Constraints.i : constraints, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? BackoffPolicy.a : backoffPolicy, (i3 & 4096) != 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? OutOfQuotaPolicy.a : outOfQuotaPolicy, (i3 & Constants.REFERRER_LINK_MAX_RESPONSE_CHARS) != 0 ? 0 : i2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return s71.b(this.a, workSpec.a) && this.b == workSpec.b && s71.b(this.c, workSpec.c) && s71.b(this.d, workSpec.d) && s71.b(this.e, workSpec.e) && s71.b(this.f, workSpec.f) && this.g == workSpec.g && this.h == workSpec.h && this.i == workSpec.i && s71.b(this.j, workSpec.j) && this.k == workSpec.k && this.l == workSpec.l && this.m == workSpec.m && this.n == workSpec.n && this.o == workSpec.o && this.p == workSpec.p && this.q == workSpec.q && this.r == workSpec.r && this.s == workSpec.s && this.t == workSpec.t;
    }

    public final long a() {
        int i;
        if (this.b == WorkInfo.State.a && (i = this.k) > 0) {
            BackoffPolicy backoffPolicy = this.l;
            long j = this.m;
            long jScalb = backoffPolicy == BackoffPolicy.b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            long j2 = this.n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long j3 = this.n;
        int i2 = this.s;
        if (i2 == 0) {
            j3 += this.g;
        }
        long j4 = this.i;
        long j5 = this.h;
        if (j4 != j5) {
            return j3 + j5 + (i2 == 0 ? (-1) * j4 : 0L);
        }
        return j3 + (i2 != 0 ? j5 : 0L);
    }

    public final boolean b() {
        return !s71.b(Constraints.i, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iC = n30.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iD = pv1.d(pv1.d(pv1.d(pv1.d((this.l.hashCode() + jc1.d(this.k, (this.j.hashCode() + pv1.d(pv1.d(pv1.d((this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Integer.hashCode(this.t) + jc1.d(this.s, (this.r.hashCode() + ((iD + r2) * 31)) * 31, 31);
    }

    public final String toString() {
        return jc1.q(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        str.getClass();
        state.getClass();
        str2.getClass();
        data.getClass();
        data2.getClass();
        constraints.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        this.a = str;
        this.b = state;
        this.c = str2;
        this.d = str3;
        this.e = data;
        this.f = data2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = constraints;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
    }
}
