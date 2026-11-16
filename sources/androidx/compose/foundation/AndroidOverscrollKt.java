package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidOverscrollKt {
    public static final AndroidOverscrollKt$NoOpOverscrollEffect$1 a = new AndroidOverscrollKt$NoOpOverscrollEffect$1();
    public static final Modifier b;

    static {
        int i = Build.VERSION.SDK_INT;
        Modifier modifierA = Modifier.Companion.a;
        if (i >= 31) {
            modifierA = LayoutModifierKt.a(LayoutModifierKt.a(modifierA, AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.i), AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.i);
        }
        b = modifierA;
    }
}
