package androidx.work;

import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OneTimeWorkRequest extends WorkRequest {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest.Builder c() {
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public final WorkRequest b() {
            if (!this.a || !this.c.j.c) {
                return new OneTimeWorkRequest(this.b, this.c, this.d);
            }
            d.r("Cannot set backoff criteria on an idle mode job");
            return null;
        }

        public Builder(Class cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }
}
