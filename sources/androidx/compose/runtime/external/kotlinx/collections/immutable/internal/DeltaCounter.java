package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DeltaCounter {
    public int a = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.a == ((DeltaCounter) obj).a;
    }

    public final void a(int i) {
        this.a += i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return h50.l(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
