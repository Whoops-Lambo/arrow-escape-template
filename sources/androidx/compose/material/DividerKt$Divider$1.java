package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DividerKt$Divider$1 extends rc1 implements zr0 {
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ int l;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.l | 1;
        DividerKt.a(this.k, i, this.j, (Composer) obj, this.i);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerKt$Divider$1(Modifier modifier, long j, float f, int i) {
        super(2);
        this.i = modifier;
        this.j = j;
        this.k = f;
        this.l = i;
    }
}
