package androidx.compose.ui.focus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class FocusModifierKt$focusTarget$2 extends rc1 implements as0 {
    public static final FocusModifierKt$focusTarget$2 i = new FocusModifierKt$focusTarget$2(3);

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusModifierKt$focusTarget$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements sr0 {
        public final /* synthetic */ FocusModifier i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusModifier focusModifier) {
            super(0);
            this.i = focusModifier;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            FocusTransactionsKt.h(this.i);
            return az2.a;
        }
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        modifier.getClass();
        composer.B(-326009031);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = new FocusModifier();
            composer.x(objC);
        }
        composer.J();
        FocusModifier focusModifier = (FocusModifier) objC;
        EffectsKt.g(new AnonymousClass1(focusModifier), composer);
        ProvidableModifierLocal providableModifierLocal = FocusModifierKt.a;
        focusModifier.getClass();
        Modifier modifierN = modifier.N(focusModifier).N(FocusModifierKt.b);
        composer.J();
        return modifierN;
    }
}
