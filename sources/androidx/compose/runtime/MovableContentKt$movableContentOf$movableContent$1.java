package androidx.compose.runtime;

import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Laz2;", "it", "invoke", "(Laz2;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class MovableContentKt$movableContentOf$movableContent$1 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((az2) obj).getClass();
        if ((iIntValue & 81) != 16 || !composer.b()) {
            throw null;
        }
        composer.h();
        return az2.a;
    }
}
