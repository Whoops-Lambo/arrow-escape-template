package androidx.compose.foundation.gestures;

import defpackage.az2;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, k = 3, mv = {1, 6, 0})
final class ScrollExtensionsKt$stopScroll$2 extends ul2 implements zr0 {
    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new ScrollExtensionsKt$stopScroll$2(2, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$stopScroll$2 scrollExtensionsKt$stopScroll$2 = (ScrollExtensionsKt$stopScroll$2) create((ScrollScope) obj, (dy) obj2);
        az2 az2Var = az2.a;
        scrollExtensionsKt$stopScroll$2.invokeSuspend(az2Var);
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return az2.a;
    }
}
