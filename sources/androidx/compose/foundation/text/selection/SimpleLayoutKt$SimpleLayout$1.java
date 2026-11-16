package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.hg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SimpleLayoutKt$SimpleLayout$1 implements MeasurePolicy {
    public static final SimpleLayoutKt$SimpleLayout$1 a = new SimpleLayoutKt$SimpleLayout$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        Integer numValueOf = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).Y(j));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((Placeable) arrayList.get(i2)).a));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Placeable) arrayList.get(i3)).b));
        }
        return measureScope.C(iIntValue, numValueOf.intValue(), hg0.a, new SimpleLayoutKt$SimpleLayout$1$measure$1(arrayList));
    }
}
