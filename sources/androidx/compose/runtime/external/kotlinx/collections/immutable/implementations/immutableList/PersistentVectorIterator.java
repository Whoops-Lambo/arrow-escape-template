package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public final Object[] c;
    public final TrieIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentVectorIterator(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        objArr.getClass();
        objArr2.getClass();
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new TrieIterator(i > i4 ? i4 : i, i4, i3, objArr);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            TrieIterator trieIterator = this.d;
            if (trieIterator.hasNext()) {
                this.a++;
                return trieIterator.next();
            }
            int i = this.a;
            this.a = i + 1;
            return this.c[i - trieIterator.b];
        }
        d.v();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.a;
            TrieIterator trieIterator = this.d;
            int i2 = trieIterator.b;
            if (i > i2) {
                int i3 = i - 1;
                this.a = i3;
                return this.c[i3 - i2];
            }
            this.a = i - 1;
            return trieIterator.previous();
        }
        d.v();
        return null;
    }
}
