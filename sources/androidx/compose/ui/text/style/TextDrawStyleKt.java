package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextDrawStyleKt {
    public static final TextDrawStyle a(TextDrawStyle textDrawStyle, TextDrawStyle textDrawStyle2, float f) {
        textDrawStyle.getClass();
        textDrawStyle2.getClass();
        if (!(textDrawStyle instanceof BrushStyle) && !(textDrawStyle2 instanceof BrushStyle)) {
            return TextDrawStyle.Companion.a(ColorKt.e(textDrawStyle.getA(), f, textDrawStyle2.getA()));
        }
        return (TextDrawStyle) SpanStyleKt.a(f, textDrawStyle, textDrawStyle2);
    }
}
