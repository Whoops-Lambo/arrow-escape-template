package androidx.compose.runtime;

import defpackage.du;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PrioritySet {
    public final List a = new ArrayList();

    public final void a(int i) {
        List list = this.a;
        if (list.isEmpty() || !(((Number) list.get(0)).intValue() == i || ((Number) pv1.i(1, list)).intValue() == i)) {
            int size = list.size();
            list.add(Integer.valueOf(i));
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) list.get(i2)).intValue();
                if (i <= iIntValue) {
                    break;
                }
                list.set(size, Integer.valueOf(iIntValue));
                size = i2;
            }
            list.set(size, Integer.valueOf(i));
        }
    }

    public final int b() {
        int iIntValue;
        List list = this.a;
        if (list.size() <= 0) {
            ComposerKt.c("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == iIntValue2) {
            list.set(0, du.h0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) list.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = ((Number) list.get(i3)).intValue();
                if (i2 < size && (iIntValue = ((Number) list.get(i2)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i, Integer.valueOf(iIntValue));
                    list.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i, Integer.valueOf(iIntValue4));
                    list.set(i3, Integer.valueOf(iIntValue3));
                    i = i3;
                }
            }
        }
        return iIntValue2;
    }
}
