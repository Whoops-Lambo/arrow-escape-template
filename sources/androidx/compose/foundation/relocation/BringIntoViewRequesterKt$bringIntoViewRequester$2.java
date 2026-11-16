package androidx.compose.foundation.relocation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends rc1 implements as0 {
    public final /* synthetic */ BringIntoViewRequester i;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ BringIntoViewRequester i;
        public final /* synthetic */ BringIntoViewRequesterModifier j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
            super(1);
            this.i = bringIntoViewRequester;
            this.j = bringIntoViewRequesterModifier;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((DisposableEffectScope) obj).getClass();
            final BringIntoViewRequester bringIntoViewRequester = this.i;
            MutableVector mutableVector = ((BringIntoViewRequesterImpl) bringIntoViewRequester).a;
            final BringIntoViewRequesterModifier bringIntoViewRequesterModifier = this.j;
            mutableVector.b(bringIntoViewRequesterModifier);
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    ((BringIntoViewRequesterImpl) bringIntoViewRequester).a.o(bringIntoViewRequesterModifier);
                }
            };
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterKt$bringIntoViewRequester$2(BringIntoViewRequester bringIntoViewRequester) {
        super(3);
        this.i = bringIntoViewRequester;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        ((Modifier) obj).getClass();
        composer.B(-992853993);
        BringIntoViewParent bringIntoViewParentA = BringIntoViewResponder_androidKt.a(composer);
        composer.B(1157296644);
        boolean zL = composer.l(bringIntoViewParentA);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            bringIntoViewParentA.getClass();
            objC = new BringIntoViewRequesterModifier(bringIntoViewParentA);
            composer.x(objC);
        }
        composer.J();
        BringIntoViewRequesterModifier bringIntoViewRequesterModifier = (BringIntoViewRequesterModifier) objC;
        BringIntoViewRequester bringIntoViewRequester = this.i;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            EffectsKt.a(bringIntoViewRequester, new AnonymousClass1(bringIntoViewRequester, bringIntoViewRequesterModifier), composer);
        }
        composer.J();
        return bringIntoViewRequesterModifier;
    }
}
