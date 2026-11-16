package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import defpackage.e32;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BeyondBoundsLayoutKt {
    public static final Object a(FocusModifier focusModifier, int i, wr0 wr0Var) {
        focusModifier.getClass();
        BeyondBoundsLayout beyondBoundsLayout = focusModifier.i;
        if (beyondBoundsLayout != null) {
            int i2 = 5;
            if (i != 5) {
                i2 = 6;
                if (i != 6) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i2 = 2;
                            if (i != 1) {
                                if (i == 2) {
                                    i2 = 1;
                                } else {
                                    e32.i("Unsupported direction for beyond bounds layout");
                                }
                            }
                        }
                    }
                }
            }
            return beyondBoundsLayout.b(i2, wr0Var);
        }
        return null;
    }
}
