package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class CheckboxKt$CheckboxImpl$2 extends rc1 implements zr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ToggleableState j;
    public final /* synthetic */ Modifier k;
    public final /* synthetic */ CheckboxColors l;
    public final /* synthetic */ int m;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CheckboxKt.a(this.i, this.j, this.k, this.l, (Composer) obj, this.m | 1);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$2(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i) {
        super(2);
        this.i = z;
        this.j = toggleableState;
        this.k = modifier;
        this.l = checkboxColors;
        this.m = i;
    }
}
