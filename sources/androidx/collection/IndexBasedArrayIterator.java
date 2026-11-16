package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.d;
import defpackage.e32;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, bc1 {
    public int a;
    public int b;
    public boolean c;

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            e32.i("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }

    public IndexBasedArrayIterator(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object objA = a(this.b);
            this.b++;
            this.c = true;
            return objA;
        }
        d.v();
        return null;
    }
}
