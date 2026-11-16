package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider;", "", "Block", "Value", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AlignmentLineProvider {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Block extends AlignmentLineProvider {
        public final int hashCode() {
            throw null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Block);
        }

        public final String toString() {
            return "Block(lineProviderBlock=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Value extends AlignmentLineProvider {
        public final int hashCode() {
            throw null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Value);
        }

        public final String toString() {
            return "Value(alignmentLine=null)";
        }
    }
}
