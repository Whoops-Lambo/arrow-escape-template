package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.unit.Constraints;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BackdropScaffoldKt$BackdropStack$1$1$placeables$1 extends rc1 implements zr0 {
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1$placeables$1(ComposableLambdaImpl composableLambdaImpl, long j, float f, int i) {
        super(2);
        this.i = composableLambdaImpl;
        this.j = j;
        this.k = f;
        this.l = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            this.i.invoke(new Constraints(this.j), Float.valueOf(this.k), composer, Integer.valueOf((this.l >> 3) & 896));
        }
        return az2.a;
    }
}
