package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.az2;
import defpackage.h32;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Laz2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 extends rc1 implements wr0 {
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ h32 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1(MutableState mutableState, h32 h32Var, boolean z) {
        super(1);
        this.i = mutableState;
        this.j = h32Var;
        this.k = z;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        pointerInputChange.getClass();
        float fC = Offset.c(PointerEventKt.g(pointerInputChange, false));
        zr0 zr0Var = (zr0) this.i.getA();
        Boolean boolValueOf = Boolean.valueOf(this.j.a);
        if (this.k) {
            fC = -fC;
        }
        zr0Var.invoke(boolValueOf, Float.valueOf(fC));
        return az2.a;
    }
}
