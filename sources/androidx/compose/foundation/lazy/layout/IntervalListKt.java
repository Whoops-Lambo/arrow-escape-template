package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class IntervalListKt {
    public static final int a(int i, MutableVector mutableVector) {
        int i2 = mutableVector.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            ((IntervalList.Interval) mutableVector.a[i4]).getClass();
            if (i != 0) {
                if (i > 0) {
                    i3 = i4 + 1;
                    ((IntervalList.Interval) mutableVector.a[i3]).getClass();
                    if (i < 0) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
