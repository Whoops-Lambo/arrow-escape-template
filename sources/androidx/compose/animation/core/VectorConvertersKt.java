package androidx.compose.animation.core;

import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VectorConvertersKt {
    public static final TwoWayConverter a = a(VectorConvertersKt$FloatToVector$1.i, VectorConvertersKt$FloatToVector$2.i);
    public static final TwoWayConverter b = a(VectorConvertersKt$IntToVector$1.i, VectorConvertersKt$IntToVector$2.i);
    public static final TwoWayConverter c = a(VectorConvertersKt$DpToVector$1.i, VectorConvertersKt$DpToVector$2.i);
    public static final TwoWayConverter d = a(VectorConvertersKt$DpOffsetToVector$1.i, VectorConvertersKt$DpOffsetToVector$2.i);
    public static final TwoWayConverter e = a(VectorConvertersKt$SizeToVector$1.i, VectorConvertersKt$SizeToVector$2.i);
    public static final TwoWayConverter f = a(VectorConvertersKt$OffsetToVector$1.i, VectorConvertersKt$OffsetToVector$2.i);
    public static final TwoWayConverter g = a(VectorConvertersKt$IntOffsetToVector$1.i, VectorConvertersKt$IntOffsetToVector$2.i);
    public static final TwoWayConverter h = a(VectorConvertersKt$IntSizeToVector$1.i, VectorConvertersKt$IntSizeToVector$2.i);
    public static final TwoWayConverter i = a(VectorConvertersKt$RectToVector$1.i, VectorConvertersKt$RectToVector$2.i);

    public static final TwoWayConverter a(wr0 wr0Var, wr0 wr0Var2) {
        wr0Var.getClass();
        wr0Var2.getClass();
        return new TwoWayConverterImpl(wr0Var, wr0Var2);
    }
}
