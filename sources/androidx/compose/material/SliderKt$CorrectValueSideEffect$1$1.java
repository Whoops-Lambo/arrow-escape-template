package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.vs;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SliderKt$CorrectValueSideEffect$1$1 extends rc1 implements sr0 {
    public final /* synthetic */ vs i;
    public final /* synthetic */ wr0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ vs m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(vs vsVar, wr0 wr0Var, float f, MutableState mutableState, vs vsVar2) {
        super(0);
        this.i = vsVar;
        this.j = wr0Var;
        this.k = f;
        this.l = mutableState;
        this.m = vsVar2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        vs vsVar = this.i;
        float f = (vsVar.b - vsVar.a) / 1000.0f;
        float fFloatValue = ((Number) this.j.invoke(Float.valueOf(this.k))).floatValue();
        MutableState mutableState = this.l;
        if (Math.abs(fFloatValue - ((Number) mutableState.getA()).floatValue()) > f) {
            float fFloatValue2 = ((Number) ((Comparable) mutableState.getA())).floatValue();
            vs vsVar2 = this.m;
            if (fFloatValue2 >= vsVar2.a && fFloatValue2 <= vsVar2.b) {
                mutableState.setValue(Float.valueOf(fFloatValue));
            }
        }
        return az2.a;
    }
}
