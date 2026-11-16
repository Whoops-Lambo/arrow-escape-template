package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    public final ListView r;

    @Override // androidx.core.widget.AutoScrollHelper
    public final boolean a(int i) {
        ListView listView = this.r;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public final void f(int i) {
        this.r.scrollListBy(i);
    }

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.r = listView;
    }
}
