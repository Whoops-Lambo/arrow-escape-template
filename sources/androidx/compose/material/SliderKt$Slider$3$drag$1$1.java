package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import defpackage.as0;
import defpackage.az2;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SliderKt$Slider$3$drag$1$1 extends ul2 implements as0 {
    public /* synthetic */ float r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$drag$1$1(MutableState mutableState, dy dyVar) {
        super(3, dyVar);
        this.s = mutableState;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.s, (dy) obj3);
        sliderKt$Slider$3$drag$1$1.r = fFloatValue;
        az2 az2Var = az2.a;
        sliderKt$Slider$3$drag$1$1.invokeSuspend(az2Var);
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        ((wr0) this.s.getA()).invoke(new Float(this.r));
        return az2.a;
    }
}
