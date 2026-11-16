package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TrieNodeKt {
    public static final Object[] a(int i, Object obj, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 1];
        n8.S(0, i, 6, objArr, objArr2);
        n8.P(i + 1, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        return objArr2;
    }

    public static final Object[] b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        n8.S(0, i, 6, objArr, objArr2);
        n8.P(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }
}
