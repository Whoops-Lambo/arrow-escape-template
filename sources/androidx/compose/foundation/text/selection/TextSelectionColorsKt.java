package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextSelectionColorsKt {
    public static final DynamicProvidableCompositionLocal a = CompositionLocalKt.b(TextSelectionColorsKt$LocalTextSelectionColors$1.i);
    public static final TextSelectionColors b;

    static {
        long jC = ColorKt.c(4282550004L);
        b = new TextSelectionColors(jC, Color.b(jC, 0.4f));
    }
}
