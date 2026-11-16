package androidx.compose.ui.text.font;

import android.os.Build;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public final PlatformTypefaces a;

    public PlatformFontFamilyTypefaceAdapter() {
        PlatformTypefaces platformTypefacesApi;
        if (Build.VERSION.SDK_INT >= 28) {
            platformTypefacesApi = new PlatformTypefacesApi28();
        } else {
            platformTypefacesApi = new PlatformTypefacesApi();
        }
        this.a = platformTypefacesApi;
    }
}
