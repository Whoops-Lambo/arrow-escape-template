package androidx.compose.foundation.lazy;

import defpackage.d;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "", "Interval", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListBeyondBoundsInfo {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Interval {
        public final int a;
        public final int b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.a == interval.a && this.b == interval.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.a);
            sb.append(", end=");
            return h50.l(sb, this.b, ')');
        }

        public Interval(int i, int i2) {
            this.a = i;
            this.b = i2;
            if (i >= 0) {
                if (i2 >= i) {
                    return;
                }
                d.r("Failed requirement.");
                throw null;
            }
            d.r("Failed requirement.");
            throw null;
        }
    }

    public final int a() {
        throw null;
    }
}
