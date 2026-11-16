package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TwoLine$ListItem$1$3 extends rc1 implements zr0 {
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ int j;
    public final /* synthetic */ zr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLine$ListItem$1$3(int i, zr0 zr0Var, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.i = composableLambdaImpl;
        this.j = i;
        this.k = zr0Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            this.i.invoke(composer, Integer.valueOf((this.j >> 6) & 14));
            zr0 zr0Var = this.k;
            zr0Var.getClass();
            zr0Var.invoke(composer, 0);
        }
        return az2.a;
    }
}
