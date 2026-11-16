package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import defpackage.as0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends rc1 implements as0 {
    public final /* synthetic */ TextFieldColors i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ InteractionSource l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, int i2) {
        super(3);
        this.i = textFieldColors;
        this.j = z;
        this.k = z2;
        this.l = interactionSource;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputPhase inputPhase = (InputPhase) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        inputPhase.getClass();
        composer.B(697243846);
        boolean z = inputPhase == InputPhase.b ? false : this.k;
        int i = (this.m >> 27) & 14;
        int i2 = this.n;
        long j = ((Color) this.i.e(this.j, z, this.l, composer, i | ((i2 << 3) & 896) | (i2 & 7168)).getA()).a;
        composer.J();
        return new Color(j);
    }
}
