package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import defpackage.rc1;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SaversKt$AnnotationRangeListSaver$1 extends rc1 implements zr0 {
    public static final SaversKt$AnnotationRangeListSaver$1 i = new SaversKt$AnnotationRangeListSaver$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        List list = (List) obj2;
        saverScope.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(SaversKt.a((AnnotatedString.Range) list.get(i2), SaversKt.c, saverScope));
        }
        return arrayList;
    }
}
