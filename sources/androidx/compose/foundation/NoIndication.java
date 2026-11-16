package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/NoIndication;", "Landroidx/compose/foundation/Indication;", "NoIndicationInstance", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class NoIndication implements Indication {
    public static final NoIndication a = new NoIndication();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/NoIndication$NoIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class NoIndicationInstance implements IndicationInstance {
        public static final NoIndicationInstance a = new NoIndicationInstance();

        @Override // androidx.compose.foundation.IndicationInstance
        public final void b(LayoutNodeDrawScope layoutNodeDrawScope) {
            layoutNodeDrawScope.W();
        }
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance a(InteractionSource interactionSource, Composer composer) {
        interactionSource.getClass();
        composer.B(285654452);
        composer.J();
        return NoIndicationInstance.a;
    }
}
