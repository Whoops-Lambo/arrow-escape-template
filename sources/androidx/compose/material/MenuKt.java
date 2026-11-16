package androidx.compose.material;

import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MenuKt {
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:4:0x001b  */
    public static final long a(IntRect intRect, IntRect intRect2) {
        float fMin;
        intRect.getClass();
        int i = intRect.b;
        int i2 = intRect.d;
        int i3 = intRect.a;
        intRect2.getClass();
        int i4 = intRect2.d;
        int i5 = intRect2.c;
        int i6 = intRect2.b;
        int i7 = intRect2.a;
        int i8 = intRect.c;
        float fMin2 = 1.0f;
        if (i7 >= i8) {
            fMin = 0.0f;
        } else if (i5 <= i3) {
            fMin = 1.0f;
        } else if (i5 - i7 == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(i8, i5) + Math.max(i3, i7)) / 2) - i7) / (i5 - i7);
        }
        if (i6 >= i2) {
            fMin2 = 0.0f;
        } else if (i4 > i) {
            if (i4 - i6 == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i2, i4) + Math.max(i, i6)) / 2) - i6) / (i4 - i6);
            }
        }
        return TransformOriginKt.a(fMin, fMin2);
    }
}
