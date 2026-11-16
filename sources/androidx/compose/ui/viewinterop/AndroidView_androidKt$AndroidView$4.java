package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidView_androidKt$AndroidView$4 extends rc1 implements zr0 {
    public final /* synthetic */ wr0 i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ wr0 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidView_androidKt.a(this.i, this.j, this.k, (Composer) obj, this.l | 1, this.m);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(wr0 wr0Var, Modifier modifier, wr0 wr0Var2, int i, int i2) {
        super(2);
        this.i = wr0Var;
        this.j = modifier;
        this.k = wr0Var2;
        this.l = i;
        this.m = i2;
    }
}
