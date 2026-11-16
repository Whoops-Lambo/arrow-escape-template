package androidx.collection;

import com.ironsource.C4664b4;
import defpackage.at;
import defpackage.bc1;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import defpackage.wx;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScatterSet<E> {
    public long[] a;
    public Object[] b;
    public int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class SetWrapper implements Set<E>, bc1 {
        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return at.t(new ScatterSet$SetWrapper$iterator$1(2, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            collection.getClass();
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                return true;
            }
            it.next();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return wx.s(this, objArr);
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return wx.r(this);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.ScatterSet$toString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            return obj == ScatterSet.this ? "(this)" : String.valueOf(obj);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        int i;
        long j;
        int iNumberOfTrailingZeros;
        if (obj != this) {
            if (!(obj instanceof ScatterSet)) {
                return false;
            }
            ScatterSet scatterSet = (ScatterSet) obj;
            Object[] objArr = this.b;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                Object obj2 = objArr[(i2 << 3) + i5];
                                int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i6 = iHashCode ^ (iHashCode << 16);
                                int i7 = i6 & 127;
                                int i8 = scatterSet.c;
                                int i9 = (i6 >>> 7) & i8;
                                int i10 = 0;
                                while (true) {
                                    long[] jArr2 = scatterSet.a;
                                    int i11 = i9 >> 3;
                                    j = j3;
                                    int i12 = (i9 & 7) << 3;
                                    long j4 = (jArr2[i11] >>> i12) | ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
                                    i = i3;
                                    long j5 = j4 ^ (((long) i7) * 72340172838076673L);
                                    for (long j6 = (~j5) & (j5 - 72340172838076673L) & j; j6 != 0; j6 &= j6 - 1) {
                                        iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                                        if (s71.b(scatterSet.b[iNumberOfTrailingZeros], obj2)) {
                                            break;
                                        }
                                    }
                                    if ((j4 & ((~j4) << 6) & j) != 0) {
                                        iNumberOfTrailingZeros = -1;
                                        break;
                                    }
                                    i10 += 8;
                                    i9 = (i9 + i10) & i8;
                                    i3 = i;
                                    j3 = j;
                                }
                                if (!(iNumberOfTrailingZeros >= 0)) {
                                    return false;
                                }
                            } else {
                                i = i3;
                                j = j3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                            j3 = j;
                        }
                        z = true;
                        if (i4 != i3) {
                            return true;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 == length) {
                        return z;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[DONT_INVERT, PHI: r7
  0x0065: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0028, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:0: B:5:0x001a->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[SYNTHETIC] */
    public final String toString() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        StringBuilder sb = new StringBuilder(C4664b4.j.d);
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) C4664b4.j.e);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) anonymousClass1.invoke(obj));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) C4664b4.j.e);
                break;
            }
            if (i == length) {
                sb.append((CharSequence) C4664b4.j.e);
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
