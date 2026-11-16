package androidx.compose.runtime;

import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OpaqueKey {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && this.a.equals(((OpaqueKey) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jc1.q(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }

    public OpaqueKey(String str) {
        this.a = str;
    }
}
