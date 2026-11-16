package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/unit/IntRect;", "invoke-KMgbckE", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class PopupLayout$dismissOnOutsideClick$1 extends rc1 implements zr0 {
    public static final PopupLayout$dismissOnOutsideClick$1 i = new PopupLayout$dismissOnOutsideClick$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Offset offset = (Offset) obj;
        IntRect intRect = (IntRect) obj2;
        intRect.getClass();
        boolean z = false;
        if (offset != null) {
            long j = offset.a;
            if (Offset.c(j) < intRect.a || Offset.c(j) > intRect.c || Offset.d(j) < intRect.b || Offset.d(j) > intRect.d) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
