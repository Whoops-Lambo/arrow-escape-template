package androidx.work.impl.model;

import defpackage.h50;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class WorkGenerationalId {
    public final String a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return s71.b(this.a, workGenerationalId.a) && this.b == workGenerationalId.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return h50.l(sb, this.b, ')');
    }

    public WorkGenerationalId(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }
}
