package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ListItemKt$OffsetToBaselineOrCenter$2 extends rc1 implements zr0 {
    public final /* synthetic */ float i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ zr0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ListItemKt.b(this.i, this.j, this.k, (Composer) obj, this.l | 1, this.m);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$OffsetToBaselineOrCenter$2(float f, Modifier modifier, zr0 zr0Var, int i, int i2) {
        super(2);
        this.i = f;
        this.j = modifier;
        this.k = zr0Var;
        this.l = i;
        this.m = i2;
    }
}
