package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Rect a(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect rectC;
        if (textLayoutResult != null) {
            transformedText.getClass();
            rectC = textLayoutResult.c(i);
        } else {
            rectC = Rect.e;
        }
        float f = rectC.a;
        int iMo1roundToPx0680j_4 = density.mo1roundToPx0680j_4(2.0f);
        return new Rect(z ? (i2 - f) - iMo1roundToPx0680j_4 : f, rectC.b, z ? i2 - f : iMo1roundToPx0680j_4 + f, rectC.d);
    }
}
