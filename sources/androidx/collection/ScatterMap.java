package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import defpackage.bc1;
import defpackage.s71;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "MapWrapper", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScatterMap<K, V> {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\b\u0090\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/ScatterMap$MapWrapper;", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class MapWrapper implements Map<K, V>, bc1 {
        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.Map
        public final int size() {
            throw null;
        }

        public Set a() {
            return new ScatterMap$MapWrapper$entries$1();
        }

        public Set b() {
            return new ScatterMap$MapWrapper$keys$1();
        }

        public Collection c() {
            return new ScatterMap$MapWrapper$values$1();
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object compute(Object obj, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object computeIfAbsent(Object obj, Function function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object computeIfPresent(Object obj, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object putIfAbsent(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object replace(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final void replaceAll(BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ Set entrySet() {
            return a();
        }

        @Override // java.util.Map
        public final /* bridge */ Set keySet() {
            return b();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection values() {
            return c();
        }

        @Override // java.util.Map
        public final boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final boolean replace(Object obj, Object obj2, Object obj3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final Object a(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (s71.b(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    public final boolean equals(Object obj) {
        long[] jArr;
        boolean z;
        Object[] objArr;
        boolean z2;
        long[] jArr2;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        Object[] objArr2;
        int i;
        boolean z5 = true;
        if (obj == this) {
            return true;
        }
        boolean z6 = false;
        if (!(obj instanceof ScatterMap)) {
            return false;
        }
        ScatterMap scatterMap = (ScatterMap) obj;
        Object[] objArr3 = this.b;
        Object[] objArr4 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        loop0: while (true) {
            long j3 = jArr3[i2];
            char c = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (?? r15 = z6; r15 < i4; r15++) {
                    if ((j3 & 255) < 128) {
                        ?? r16 = (i2 << 3) + r15;
                        z3 = z5;
                        Object obj2 = objArr3[r16];
                        z4 = z6;
                        Object obj3 = objArr4[r16];
                        if (obj3 == null) {
                            if (scatterMap.a(obj2) != null) {
                                break loop0;
                            }
                            int iHashCode = (obj2 != null ? obj2.hashCode() : z4) * (-862048943);
                            int i5 = iHashCode ^ (iHashCode << 16);
                            int i6 = i5 & 127;
                            j2 = j4;
                            int i7 = scatterMap.d;
                            int i8 = (i5 >>> 7) & i7;
                            ?? r14 = z4;
                            while (true) {
                                long[] jArr4 = scatterMap.a;
                                int i9 = i8 >> 3;
                                jArr2 = jArr3;
                                int i10 = (i8 & 7) << 3;
                                long j5 = jArr4[i9] >>> i10;
                                long j6 = jArr4[i9 + 1] << (64 - i10);
                                objArr2 = objArr3;
                                int i11 = i8;
                                long j7 = j5 | (j6 & ((-i10) >> 63));
                                j = j3;
                                long j8 = (((long) i6) * 72340172838076673L) ^ j7;
                                for (long j9 = (j8 - 72340172838076673L) & (~j8) & j2; j9 != 0; j9 &= j9 - 1) {
                                    int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j9) >> 3)) & i7;
                                    if (s71.b(scatterMap.b[iNumberOfTrailingZeros], obj2)) {
                                        i = iNumberOfTrailingZeros;
                                        break;
                                    }
                                }
                                if ((j7 & ((~j7) << 6) & j2) != 0) {
                                    i = -1;
                                    break;
                                }
                                int i12 = r14 + 8;
                                i8 = (i11 + i12) & i7;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                j3 = j;
                                r14 = i12;
                            }
                            if (!(i >= 0 ? z3 : z4)) {
                                break loop0;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                            j2 = j4;
                            objArr2 = objArr3;
                            if (!obj3.equals(scatterMap.a(obj2))) {
                                return z4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        z3 = z5;
                        z4 = z6;
                        j = j3;
                        j2 = j4;
                        objArr2 = objArr3;
                    }
                    j3 = j >> i3;
                    c = c;
                    objArr3 = objArr2;
                    z5 = z3;
                    z6 = z4;
                    j4 = j2;
                    jArr3 = jArr2;
                    i3 = i3;
                }
                jArr = jArr3;
                z = z5;
                z2 = z6;
                int i13 = i3;
                objArr = objArr3;
                if (i4 != i13) {
                    return z;
                }
            } else {
                jArr = jArr3;
                z = z5;
                objArr = objArr3;
                z2 = z6;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            objArr3 = objArr;
            z5 = z;
            z6 = z2;
            jArr3 = jArr;
        }
        return z4;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }
}
