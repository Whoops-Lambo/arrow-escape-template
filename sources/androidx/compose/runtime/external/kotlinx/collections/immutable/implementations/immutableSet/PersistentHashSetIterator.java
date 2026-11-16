package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import defpackage.bc1;
import defpackage.d;
import defpackage.eu;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class PersistentHashSetIterator<E> implements Iterator<E>, bc1 {
    public final ArrayList a;
    public int b;
    public boolean c;

    public final void a() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (((TrieNodeIterator) arrayList.get(i)).a()) {
            return;
        }
        for (int i2 = this.b; -1 < i2; i2--) {
            int iB = b(i2);
            if (iB == -1) {
                TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i2);
                if (trieNodeIterator.b < trieNodeIterator.a.length) {
                    TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i2);
                    int i3 = trieNodeIterator2.b;
                    int length = trieNodeIterator2.a.length;
                    trieNodeIterator2.b = i3 + 1;
                    iB = b(i2);
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i2 > 0) {
                TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i2 - 1);
                int i4 = trieNodeIterator3.b;
                int length2 = trieNodeIterator3.a.length;
                trieNodeIterator3.b = i4 + 1;
            }
            TrieNodeIterator trieNodeIterator4 = (TrieNodeIterator) arrayList.get(i2);
            Object[] objArr = TrieNode.d.b;
            trieNodeIterator4.getClass();
            objArr.getClass();
            trieNodeIterator4.a = objArr;
            trieNodeIterator4.b = 0;
        }
        this.c = false;
    }

    public final int b(int i) {
        ArrayList arrayList = this.a;
        if (((TrieNodeIterator) arrayList.get(i)).a()) {
            return i;
        }
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i);
        int i2 = trieNodeIterator.b;
        Object[] objArr = trieNodeIterator.a;
        if (i2 >= objArr.length || !(objArr[i2] instanceof TrieNode)) {
            return -1;
        }
        TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i);
        int i3 = trieNodeIterator2.b;
        Object[] objArr2 = trieNodeIterator2.a;
        if (i3 < objArr2.length) {
            boolean z = objArr2[i3] instanceof TrieNode;
        }
        Object obj = objArr2[i3];
        if (obj == null) {
            d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
            return 0;
        }
        TrieNode trieNode = (TrieNode) obj;
        int i4 = i + 1;
        if (i4 == arrayList.size()) {
            arrayList.add(new TrieNodeIterator());
        }
        TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i4);
        Object[] objArr3 = trieNode.b;
        trieNodeIterator3.getClass();
        objArr3.getClass();
        trieNodeIterator3.a = objArr3;
        trieNodeIterator3.b = 0;
        return b(i4);
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
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) this.a.get(this.b);
        trieNodeIterator.a();
        Object[] objArr = trieNodeIterator.a;
        int i = trieNodeIterator.b;
        trieNodeIterator.b = i + 1;
        Object obj = objArr[i];
        a();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashSetIterator(TrieNode trieNode) {
        trieNode.getClass();
        ArrayList arrayListC = eu.C(new TrieNodeIterator());
        this.a = arrayListC;
        this.c = true;
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayListC.get(0);
        Object[] objArr = trieNode.b;
        trieNodeIterator.getClass();
        objArr.getClass();
        trieNodeIterator.a = objArr;
        trieNodeIterator.b = 0;
        this.b = 0;
        a();
    }
}
