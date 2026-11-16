package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TrieNodeIterator<E> {
    public Object[] a = TrieNode.d.b;
    public int b;

    public final boolean a() {
        int i = this.b;
        Object[] objArr = this.a;
        return i < objArr.length && !(objArr[i] instanceof TrieNode);
    }
}
