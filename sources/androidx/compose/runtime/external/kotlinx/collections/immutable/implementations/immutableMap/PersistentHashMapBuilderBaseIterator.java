package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d;
import defpackage.os2;
import defpackage.s71;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T> {
    public final PersistentHashMapBuilder d;
    public Object e;
    public boolean f;
    public int g;

    public final void c(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = i2 * 5;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.a;
        if (i3 <= 30) {
            int iD = 1 << TrieNodeKt.d(i, i3);
            if (trieNode.h(iD)) {
                int iF = trieNode.f(iD);
                TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
                Object[] objArr = trieNode.d;
                int iBitCount = Integer.bitCount(trieNode.a) * 2;
                trieNodeBaseIterator.getClass();
                objArr.getClass();
                trieNodeBaseIterator.a = objArr;
                trieNodeBaseIterator.b = iBitCount;
                trieNodeBaseIterator.c = iF;
                this.b = i2;
                return;
            }
            int iT = trieNode.t(iD);
            TrieNode trieNodeS = trieNode.s(iT);
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2];
            Object[] objArr2 = trieNode.d;
            int iBitCount2 = Integer.bitCount(trieNode.a) * 2;
            trieNodeBaseIterator2.getClass();
            objArr2.getClass();
            trieNodeBaseIterator2.a = objArr2;
            trieNodeBaseIterator2.b = iBitCount2;
            trieNodeBaseIterator2.c = iT;
            c(i, trieNodeS, obj, i2 + 1);
            return;
        }
        TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i2];
        Object[] objArr3 = trieNode.d;
        int length = objArr3.length;
        trieNodeBaseIterator3.getClass();
        trieNodeBaseIterator3.a = objArr3;
        trieNodeBaseIterator3.b = length;
        trieNodeBaseIterator3.c = 0;
        while (true) {
            TrieNodeBaseIterator trieNodeBaseIterator4 = trieNodeBaseIteratorArr[i2];
            if (s71.b(trieNodeBaseIterator4.a[trieNodeBaseIterator4.c], obj)) {
                this.b = i2;
                return;
            } else {
                trieNodeBaseIteratorArr[i2].c += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final Object next() {
        if (this.d.e != this.g) {
            d.o();
            return null;
        }
        if (!this.c) {
            d.v();
            return null;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = this.a[this.b];
        this.e = trieNodeBaseIterator.a[trieNodeBaseIterator.c];
        this.f = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            y.b();
            return;
        }
        boolean z = this.c;
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        if (!z) {
            os2.h(persistentHashMapBuilder).remove(this.e);
        } else {
            if (!z) {
                d.v();
                return;
            }
            TrieNodeBaseIterator trieNodeBaseIterator = this.a[this.b];
            Object obj = trieNodeBaseIterator.a[trieNodeBaseIterator.c];
            os2.h(persistentHashMapBuilder).remove(this.e);
            c(obj != null ? obj.hashCode() : 0, persistentHashMapBuilder.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.g = persistentHashMapBuilder.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.c, trieNodeBaseIteratorArr);
        persistentHashMapBuilder.getClass();
        this.d = persistentHashMapBuilder;
        this.g = persistentHashMapBuilder.e;
    }
}
