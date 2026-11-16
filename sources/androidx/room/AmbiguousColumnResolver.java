package androidx.room;

import androidx.annotation.RestrictTo;
import defpackage.gg0;
import defpackage.s71;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public final class AmbiguousColumnResolver {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Match {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ResultColumn {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResultColumn);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResultColumn(name=null, index=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "Companion", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Solution implements Comparable<Solution> {
        public static final /* synthetic */ int d = 0;
        public final List a;
        public final int b;
        public final int c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
        }

        static {
            new Solution(Integer.MAX_VALUE, Integer.MAX_VALUE, gg0.a);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution solution2 = solution;
            solution2.getClass();
            int iH = s71.h(this.c, solution2.c);
            return iH != 0 ? iH : s71.h(this.b, solution2.b);
        }

        public Solution(int i, int i2, List list) {
            list.getClass();
            this.a = list;
            this.b = i;
            this.c = i2;
        }
    }
}
