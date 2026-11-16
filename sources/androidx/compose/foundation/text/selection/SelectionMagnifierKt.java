package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectionMagnifierKt {
    public static final AnimationVector2D a = new AnimationVector2D(Float.NaN, Float.NaN);
    public static final TwoWayConverter b = VectorConvertersKt.a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.i, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.i);
    public static final long c;
    public static final SpringSpec d;

    static {
        long jA = OffsetKt.a(0.01f, 0.01f);
        c = jA;
        d = new SpringSpec((Object) new Offset(jA), 3);
    }
}
