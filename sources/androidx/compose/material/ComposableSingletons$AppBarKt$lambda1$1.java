package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "Laz2;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ComposableSingletons$AppBarKt$lambda1$1 extends rc1 implements as0 {
    public static final ComposableSingletons$AppBarKt$lambda1$1 i = new ComposableSingletons$AppBarKt$lambda1$1(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((RowScope) obj).getClass();
        if ((iIntValue & 81) == 16 && composer.b()) {
            composer.h();
        }
        return az2.a;
    }
}
