package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScatterSetKt {
    static {
        long[] jArr;
        MutableScatterSet mutableScatterSet = new MutableScatterSet();
        mutableScatterSet.a = ScatterMapKt.a;
        mutableScatterSet.b = ContainerHelpersKt.c;
        int iC = ScatterMapKt.c(0);
        int iMax = iC > 0 ? Math.max(7, ScatterMapKt.b(iC)) : 0;
        mutableScatterSet.c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n8.Z(jArr);
        }
        mutableScatterSet.a = jArr;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        ScatterMapKt.a(mutableScatterSet.c);
        mutableScatterSet.b = new Object[iMax];
    }
}
