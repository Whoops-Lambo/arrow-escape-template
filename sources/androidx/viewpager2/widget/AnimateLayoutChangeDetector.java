package androidx.viewpager2.widget;

import android.view.ViewGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class AnimateLayoutChangeDetector {

    /* JADX INFO: renamed from: androidx.viewpager2.widget.AnimateLayoutChangeDetector$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass1 implements Comparator<int[]> {
        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        new ViewGroup.MarginLayoutParams(-1, -1).setMargins(0, 0, 0, 0);
    }
}
