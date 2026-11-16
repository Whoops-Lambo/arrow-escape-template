package androidx.compose.runtime;

import defpackage.az2;
import defpackage.cs0;
import defpackage.dt1;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"P1", "P2", "P3", "p1", "p2", "p3", "Laz2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class MovableContentKt$movableContentOf$4 extends rc1 implements cs0 {
    @Override // defpackage.cs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        Composer composer = (Composer) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 14) == 0) {
            i = (composer.l(obj) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i |= composer.l(obj2) ? 32 : 16;
        }
        if ((iIntValue & 896) == 0) {
            i |= composer.l(obj3) ? 256 : 128;
        }
        if ((i & 5851) == 1170 && composer.b()) {
            composer.h();
        } else {
            composer.c(new dt1(new dt1(obj, obj2), obj3));
        }
        return az2.a;
    }
}
