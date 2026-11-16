package androidx.compose.ui.text.font;

import androidx.annotation.VisibleForTesting;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@VisibleForTesting
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        genericFontFamily.getClass();
        fontWeight.getClass();
        int i2 = fontWeight.a / 100;
        if (i2 >= 0 && i2 < 2) {
            throw null;
        }
        if ((2 > i2 || i2 >= 4) && i2 != 4 && i2 != 5) {
            if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    public final android.graphics.Typeface b(FontWeight fontWeight, int i) {
        fontWeight.getClass();
        if (i == 0 && s71.b(fontWeight, FontWeight.f)) {
            android.graphics.Typeface typeface = android.graphics.Typeface.DEFAULT;
            typeface.getClass();
            return typeface;
        }
        android.graphics.Typeface typefaceDefaultFromStyle = android.graphics.Typeface.defaultFromStyle(AndroidFontUtils_androidKt.a(fontWeight, i));
        typefaceDefaultFromStyle.getClass();
        return typefaceDefaultFromStyle;
    }
}
