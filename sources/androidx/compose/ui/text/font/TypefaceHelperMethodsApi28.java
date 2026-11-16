package androidx.compose.ui.text.font;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceHelperMethodsApi28;", "", "Landroid/graphics/Typeface;", "typeface", "", "finalFontWeight", "", "finalFontStyle", "a", "(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TypefaceHelperMethodsApi28 {
    @DoNotInline
    @RequiresApi
    @NotNull
    public final android.graphics.Typeface a(@NotNull android.graphics.Typeface typeface, int finalFontWeight, boolean finalFontStyle) {
        typeface.getClass();
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(typeface, finalFontWeight, finalFontStyle);
        typefaceCreate.getClass();
        return typefaceCreate;
    }
}
