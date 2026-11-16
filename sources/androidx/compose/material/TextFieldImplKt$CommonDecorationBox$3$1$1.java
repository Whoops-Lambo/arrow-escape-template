package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ float i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(MutableState mutableState, float f) {
        super(1);
        this.i = f;
        this.j = mutableState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        long j = ((Size) obj).a;
        float fD = Size.d(j);
        float f = this.i;
        float f2 = fD * f;
        float fB = Size.b(j) * f;
        MutableState mutableState = this.j;
        if (Size.d(((Size) mutableState.getA()).a) != f2 || Size.b(((Size) mutableState.getA()).a) != fB) {
            mutableState.setValue(new Size(SizeKt.a(f2, fB)));
        }
        return az2.a;
    }
}
