package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "WithAlignmentLine", "WithAlignmentLineBlock", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class SiblingsAlignedModifier extends InspectorValueInfo implements ParentDataModifier {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WithAlignmentLine extends SiblingsAlignedModifier {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithAlignmentLine ? (WithAlignmentLine) obj : null) != null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WithAlignmentLine(line=null)";
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object t0(MeasureScope measureScope, Object obj) {
            measureScope.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WithAlignmentLineBlock extends SiblingsAlignedModifier {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithAlignmentLineBlock ? (WithAlignmentLineBlock) obj : null) != null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WithAlignmentLineBlock(block=null)";
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object t0(MeasureScope measureScope, Object obj) {
            measureScope.getClass();
            throw null;
        }
    }
}
