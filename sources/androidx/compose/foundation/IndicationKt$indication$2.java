package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.h50;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class IndicationKt$indication$2 extends rc1 implements as0 {
    public final /* synthetic */ Indication i;
    public final /* synthetic */ InteractionSource j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(Indication indication, InteractionSource interactionSource) {
        super(3);
        this.i = indication;
        this.j = interactionSource;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        h50.w((Number) obj3, (Modifier) obj, composer, -353972293);
        Indication indication = this.i;
        if (indication == null) {
            indication = NoIndication.a;
        }
        IndicationInstance indicationInstanceA = indication.a(this.j, composer);
        composer.B(1157296644);
        boolean zL = composer.l(indicationInstanceA);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new IndicationModifier(indicationInstanceA);
            composer.x(objC);
        }
        composer.J();
        IndicationModifier indicationModifier = (IndicationModifier) objC;
        composer.J();
        return indicationModifier;
    }
}
