package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "invoke", "(Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends rc1 implements wr0 {
    public final /* synthetic */ FocusModifier i;
    public final /* synthetic */ FocusModifier j;
    public final /* synthetic */ int k;
    public final /* synthetic */ wr0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i, wr0 wr0Var) {
        super(1);
        this.i = focusModifier;
        this.j = focusModifier2;
        this.k = i;
        this.l = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope = (BeyondBoundsLayout.BeyondBoundsScope) obj;
        beyondBoundsScope.getClass();
        boolean zE = OneDimensionalFocusSearchKt.e(this.i, this.j, this.k, this.l);
        Boolean boolValueOf = Boolean.valueOf(zE);
        if (zE || !beyondBoundsScope.a()) {
            return boolValueOf;
        }
        return null;
    }
}
