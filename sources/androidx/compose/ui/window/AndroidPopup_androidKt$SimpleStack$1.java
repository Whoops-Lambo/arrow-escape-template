package androidx.compose.ui.window;

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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 a = new AndroidPopup_androidKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        int iMax;
        measureScope.getClass();
        list.getClass();
        int size = list.size();
        hg0 hg0Var = hg0.a;
        int i = 0;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(((Measurable) list.get(i2)).Y(j));
                }
                int size3 = arrayList.size() - 1;
                if (size3 >= 0) {
                    int iMax2 = 0;
                    iMax = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i);
                        iMax2 = Math.max(iMax2, placeable.a);
                        iMax = Math.max(iMax, placeable.b);
                        if (i == size3) {
                            break;
                        }
                        i++;
                    }
                    i = iMax2;
                } else {
                    iMax = 0;
                }
                return measureScope.C(i, iMax, hg0Var, new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList));
            }
            Placeable placeableY = ((Measurable) list.get(0)).Y(j);
            return measureScope.C(placeableY.a, placeableY.b, hg0Var, new AndroidPopup_androidKt$SimpleStack$1$measure$2(placeableY));
        }
        return measureScope.C(0, 0, hg0Var, AndroidPopup_androidKt$SimpleStack$1$measure$1.i);
    }
}
