package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcz;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lcz;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 6, 0})
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends ul2 implements zr0 {
    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(2, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return Choreographer.getInstance();
    }
}
