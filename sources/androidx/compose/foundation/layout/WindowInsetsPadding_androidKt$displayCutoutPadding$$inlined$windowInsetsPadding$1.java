package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.h50;
import defpackage.rc1;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "androidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        h50.w((Number) obj3, (Modifier) obj, composer, 359872873);
        WeakHashMap weakHashMap = WindowInsetsHolder.v;
        WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.Companion.c(composer);
        composer.B(1157296644);
        boolean zL = composer.l(windowInsetsHolderC);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new InsetsPaddingModifier(windowInsetsHolderC.b);
            composer.x(objC);
        }
        composer.J();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objC;
        composer.J();
        return insetsPaddingModifier;
    }
}
