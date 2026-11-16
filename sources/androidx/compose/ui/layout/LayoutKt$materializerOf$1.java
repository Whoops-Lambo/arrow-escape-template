package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Laz2;", "invoke-Deg8D_g", "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class LayoutKt$materializerOf$1 extends rc1 implements as0 {
    public final /* synthetic */ Modifier i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(Modifier modifier) {
        super(3);
        this.i = modifier;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = ((SkippableUpdater) obj).a;
        ((Number) obj3).intValue();
        composer.getClass();
        Modifier modifierC = ComposedModifierKt.c((Composer) obj2, this.i);
        composer.B(509942095);
        ComposeUiNode.X8.getClass();
        Updater.a(ComposeUiNode.Companion.c, composer, modifierC);
        composer.J();
        return az2.a;
    }
}
