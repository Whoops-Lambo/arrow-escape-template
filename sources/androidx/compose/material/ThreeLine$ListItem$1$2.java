package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ThreeLine$ListItem$1$2 extends rc1 implements zr0 {
    public final /* synthetic */ zr0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ ComposableLambdaImpl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(zr0 zr0Var, int i, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2) {
        super(2);
        this.i = zr0Var;
        this.j = i;
        this.k = composableLambdaImpl;
        this.l = composableLambdaImpl2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            composer.B(-755940677);
            int i = this.j;
            zr0 zr0Var = this.i;
            if (zr0Var != null) {
                zr0Var.invoke(composer, Integer.valueOf((i >> 12) & 14));
            }
            composer.J();
            this.k.invoke(composer, Integer.valueOf((i >> 6) & 14));
            this.l.invoke(composer, Integer.valueOf((i >> 9) & 14));
        }
        return az2.a;
    }
}
