package androidx.core.view;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.du;
import defpackage.iu;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/view/TreeIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TreeIterator<T> implements Iterator<T>, bc1 {
    public final wr0 a = ViewGroupKt$descendants$1$1.i;
    public final ArrayList b = new ArrayList();
    public Iterator c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        Iterator it = (Iterator) ViewGroupKt$descendants$1$1.i.invoke(next);
        ArrayList arrayList = this.b;
        if (it != null && it.hasNext()) {
            arrayList.add(this.c);
            this.c = it;
            return next;
        }
        while (!this.c.hasNext() && !arrayList.isEmpty()) {
            this.c = (Iterator) du.h0(arrayList);
            iu.S(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public TreeIterator(Iterator it) {
        this.c = it;
    }
}
