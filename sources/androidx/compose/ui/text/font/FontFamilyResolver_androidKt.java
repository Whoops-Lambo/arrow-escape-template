package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FontFamilyResolver_androidKt {
    public static final FontFamilyResolverImpl a(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), new AndroidFontResolveInterceptor(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }
}
