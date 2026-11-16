package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    public int b;
    public int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ScrollEventValues {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2 = this.b;
        if (!(i2 == 1 && this.c == 1) && i == 1) {
            this.b = 1;
            throw null;
        }
        if ((i2 != 1 && i2 != 4) || i != 2) {
            if ((i2 == 1 || i2 == 4) && i == 0) {
                throw null;
            }
            return;
        }
        if ((this.b == 3 && this.c == 0) || this.c == 2) {
            return;
        }
        this.c = 2;
    }
}
