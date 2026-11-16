package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import defpackage.rc1;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SaversKt$OffsetSaver$2 extends rc1 implements wr0 {
    public static final SaversKt$OffsetSaver$2 i = new SaversKt$OffsetSaver$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Float f;
        obj.getClass();
        if (obj.equals(Boolean.FALSE)) {
            return new Offset(Offset.d);
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        f2.getClass();
        return new Offset(OffsetKt.a(fFloatValue, f2.floatValue()));
    }
}
