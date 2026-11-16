package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.d;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, bc1 {
    public final TrieNodeBaseIterator[] a;
    public int b;
    public boolean c;

    public final void a() {
        int i = this.b;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        if (trieNodeBaseIterator.c < trieNodeBaseIterator.b) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i];
                int i2 = trieNodeBaseIterator2.c;
                Object[] objArr = trieNodeBaseIterator2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    trieNodeBaseIterator2.c = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i - 1];
                int i3 = trieNodeBaseIterator3.c;
                int length2 = trieNodeBaseIterator3.a.length;
                trieNodeBaseIterator3.c = i3 + 1;
            }
            TrieNodeBaseIterator trieNodeBaseIterator4 = trieNodeBaseIteratorArr[i];
            Object[] objArr2 = TrieNode.e.d;
            trieNodeBaseIterator4.getClass();
            objArr2.getClass();
            trieNodeBaseIterator4.a = objArr2;
            trieNodeBaseIterator4.b = 0;
            trieNodeBaseIterator4.c = 0;
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        int i2 = trieNodeBaseIterator.c;
        if (i2 < trieNodeBaseIterator.b) {
            return i;
        }
        Object[] objArr = trieNodeBaseIterator.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            return 0;
        }
        TrieNode trieNode = (TrieNode) obj;
        if (i == 6) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i + 1];
            Object[] objArr2 = trieNode.d;
            int length2 = objArr2.length;
            trieNodeBaseIterator2.getClass();
            trieNodeBaseIterator2.a = objArr2;
            trieNodeBaseIterator2.b = length2;
            trieNodeBaseIterator2.c = 0;
        } else {
            TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i + 1];
            Object[] objArr3 = trieNode.d;
            int iBitCount = Integer.bitCount(trieNode.a) * 2;
            trieNodeBaseIterator3.getClass();
            objArr3.getClass();
            trieNodeBaseIterator3.a = objArr3;
            trieNodeBaseIterator3.b = iBitCount;
            trieNodeBaseIterator3.c = 0;
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            d.v();
            return null;
        }
        T next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        trieNode.getClass();
        this.a = trieNodeBaseIteratorArr;
        this.c = true;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[0];
        Object[] objArr = trieNode.d;
        int iBitCount = Integer.bitCount(trieNode.a) * 2;
        trieNodeBaseIterator.getClass();
        objArr.getClass();
        trieNodeBaseIterator.a = objArr;
        trieNodeBaseIterator.b = iBitCount;
        trieNodeBaseIterator.c = 0;
        this.b = 0;
        a();
    }
}
