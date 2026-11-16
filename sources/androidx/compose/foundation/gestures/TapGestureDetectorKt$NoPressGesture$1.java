package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.as0;
import defpackage.az2;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, k = 3, mv = {1, 6, 0})
@t50(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
public final class TapGestureDetectorKt$NoPressGesture$1 extends ul2 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).a;
        TapGestureDetectorKt$NoPressGesture$1 tapGestureDetectorKt$NoPressGesture$1 = new TapGestureDetectorKt$NoPressGesture$1(3, (dy) obj3);
        az2 az2Var = az2.a;
        tapGestureDetectorKt$NoPressGesture$1.invokeSuspend(az2Var);
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return az2.a;
    }
}
