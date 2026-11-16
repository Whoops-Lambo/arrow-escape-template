package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1 extends rc1 implements zr0 {
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1(ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        super(2);
        this.i = composableLambdaImpl;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            this.i.invoke(Integer.valueOf(this.j), composer, Integer.valueOf((this.k >> 3) & 112));
        }
        return az2.a;
    }
}
