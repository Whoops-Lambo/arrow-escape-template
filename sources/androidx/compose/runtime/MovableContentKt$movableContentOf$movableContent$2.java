package androidx.compose.runtime;

import defpackage.as0;
import defpackage.az2;
import defpackage.dt1;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P1", "P2", "Ldt1;", "it", "Laz2;", "invoke", "(Ldt1;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class MovableContentKt$movableContentOf$movableContent$2 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dt1 dt1Var = (dt1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dt1Var.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(dt1Var) ? 4 : 2;
        }
        if ((iIntValue & 91) != 18 || !composer.b()) {
            throw null;
        }
        composer.h();
        return az2.a;
    }
}
