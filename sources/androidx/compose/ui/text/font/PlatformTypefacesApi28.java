package androidx.compose.ui.text.font;

import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@VisibleForTesting
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    public static android.graphics.Typeface c(String str, FontWeight fontWeight, int i) {
        if (i == 0 && s71.b(fontWeight, FontWeight.f) && (str == null || str.length() == 0)) {
            android.graphics.Typeface typeface = android.graphics.Typeface.DEFAULT;
            typeface.getClass();
            return typeface;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.a, i == 1);
        typefaceCreate.getClass();
        return typefaceCreate;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        genericFontFamily.getClass();
        fontWeight.getClass();
        return c(null, fontWeight, i);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface b(FontWeight fontWeight, int i) {
        fontWeight.getClass();
        return c(null, fontWeight, i);
    }
}
