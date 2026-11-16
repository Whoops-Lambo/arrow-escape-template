package androidx.compose.ui.platform;

import android.graphics.Matrix;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "rn", "Landroid/graphics/Matrix;", "matrix", "Laz2;", "invoke", "(Landroidx/compose/ui/platform/DeviceRenderNode;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class RenderNodeLayer$Companion$getMatrix$1 extends rc1 implements zr0 {
    public static final RenderNodeLayer$Companion$getMatrix$1 i = new RenderNodeLayer$Companion$getMatrix$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        DeviceRenderNode deviceRenderNode = (DeviceRenderNode) obj;
        Matrix matrix = (Matrix) obj2;
        deviceRenderNode.getClass();
        matrix.getClass();
        deviceRenderNode.r(matrix);
        return az2.a;
    }
}
