package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public int c;
    public Object[] d;
    public boolean e;

    public final void c(int i) {
        int i2 = 0;
        while (UtilsKt.a(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object a() {
        int i = this.a & 31;
        Object obj = this.d[this.c - 1];
        if (obj != null) {
            return ((Object[]) obj)[i];
        }
        d.w("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return null;
    }

    public final void b(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return;
            } else {
                objArr[i2] = ((Object[]) obj)[UtilsKt.a(i, i3)];
                i3 -= 5;
                i2++;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public TrieIterator(int i, int i2, int i3, Object[] objArr) {
        ?? r4;
        super(i, i2);
        objArr.getClass();
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        if (i == i2) {
            r4 = 1;
        } else {
            r4 = 0;
        }
        this.e = r4;
        objArr2[0] = objArr;
        b(i - r4, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object objA = a();
            int i = this.a + 1;
            this.a = i;
            if (i == this.b) {
                this.e = true;
                return objA;
            }
            c(0);
            return objA;
        }
        d.v();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.a--;
            if (this.e) {
                this.e = false;
                return a();
            }
            c(31);
            return a();
        }
        d.v();
        return null;
    }
}
