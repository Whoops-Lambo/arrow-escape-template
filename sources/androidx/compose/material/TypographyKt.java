package androidx.compose.material;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TypographyKt {
    public static final StaticProvidableCompositionLocal a = new StaticProvidableCompositionLocal(TypographyKt$LocalTypography$1.i);

    public static final TextStyle a(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.a.fontFamily != null ? textStyle : TextStyle.a(textStyle, 0L, 0L, fontFamily, null, 262111);
    }
}
