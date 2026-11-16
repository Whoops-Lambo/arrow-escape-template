package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.h50;
import defpackage.jc1;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "AnchorInfo", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Selection {
    public final AnchorInfo a;
    public final AnchorInfo b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class AnchorInfo {
        public final ResolvedTextDirection a;
        public final int b;
        public final long c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.a == anchorInfo.a && this.b == anchorInfo.b && this.c == anchorInfo.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + jc1.d(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", selectableId=");
            return n30.o(sb, this.c, ')');
        }

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            resolvedTextDirection.getClass();
            this.a = resolvedTextDirection;
            this.b = i;
            this.c = j;
        }
    }

    public static Selection a(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, int i) {
        if ((i & 1) != 0) {
            anchorInfo = selection.a;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.b;
        }
        boolean z = selection.c;
        selection.getClass();
        return new Selection(anchorInfo, anchorInfo2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return this.a.equals(selection.a) && this.b.equals(selection.b) && this.c == selection.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return h50.m(sb, this.c, ')');
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        this.a = anchorInfo;
        this.b = anchorInfo2;
        this.c = z;
    }
}
