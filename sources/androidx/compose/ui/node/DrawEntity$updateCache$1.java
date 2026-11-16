package androidx.compose.ui.node;

import androidx.compose.ui.draw.DrawCacheModifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class DrawEntity$updateCache$1 extends rc1 implements sr0 {
    public final /* synthetic */ DrawEntity i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawEntity$updateCache$1(DrawEntity drawEntity) {
        super(0);
        this.i = drawEntity;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        DrawEntity drawEntity = this.i;
        DrawCacheModifier drawCacheModifier = drawEntity.e;
        if (drawCacheModifier != null) {
            drawCacheModifier.l0(drawEntity.f);
        }
        drawEntity.g = false;
        return az2.a;
    }
}
