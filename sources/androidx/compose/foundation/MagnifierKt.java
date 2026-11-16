package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import defpackage.d;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MagnifierKt {
    public static final SemanticsPropertyKey a = new SemanticsPropertyKey("MagnifierPositionInRoot");

    public static Modifier a(wr0 wr0Var, MagnifierStyle magnifierStyle, wr0 wr0Var2) {
        Modifier modifierA;
        PlatformMagnifierFactory platformMagnifierFactory;
        magnifierStyle.getClass();
        InspectableValueKt.a();
        int i = Build.VERSION.SDK_INT;
        Modifier.Companion companion = Modifier.Companion.a;
        if (i >= 28) {
            if (i >= 28) {
                if (i == 28) {
                    platformMagnifierFactory = PlatformMagnifierFactoryApi28Impl.a;
                } else {
                    platformMagnifierFactory = PlatformMagnifierFactoryApi29Impl.a;
                }
                modifierA = ComposedModifierKt.a(companion, InspectableValueKt.a(), new MagnifierKt$magnifier$4(wr0Var, MagnifierKt$magnifier$1.i, wr0Var2, platformMagnifierFactory, magnifierStyle));
            } else {
                d.u("Magnifier is only supported on API level 28 and higher.");
                return null;
            }
        } else {
            modifierA = companion;
        }
        return InspectableValueKt.b(companion, modifierA);
    }
}
