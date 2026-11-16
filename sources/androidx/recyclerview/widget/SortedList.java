package androidx.recyclerview.widget;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SortedList<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BatchedCallback<T2> extends Callback<T2> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
    }
}
