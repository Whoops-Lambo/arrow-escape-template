package androidx.compose.ui.window;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.hg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {
    public static final AndroidDialog_androidKt$DialogLayout$1 a = new AndroidDialog_androidKt$DialogLayout$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        Object obj;
        int iJ;
        int i;
        measureScope.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) list.get(i2)).Y(j));
        }
        Object obj2 = null;
        int i3 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((Placeable) obj).a;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((Placeable) obj3).a;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == size2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        if (placeable != null) {
            iJ = placeable.a;
        } else {
            iJ = Constraints.j(j);
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((Placeable) obj2).b;
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Object obj4 = arrayList.get(i3);
                    int i8 = ((Placeable) obj4).b;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i3 == size3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        if (placeable2 != null) {
            i = placeable2.b;
        } else {
            i = Constraints.i(j);
        }
        return measureScope.C(iJ, i, hg0.a, new AndroidDialog_androidKt$DialogLayout$1$measure$1(arrayList));
    }
}
