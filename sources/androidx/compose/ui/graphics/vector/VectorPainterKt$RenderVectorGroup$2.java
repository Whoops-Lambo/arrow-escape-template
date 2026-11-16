package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class VectorPainterKt$RenderVectorGroup$2 extends rc1 implements zr0 {
    public final /* synthetic */ VectorGroup i;
    public final /* synthetic */ Map j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$2(VectorGroup vectorGroup, Map map, int i, int i2) {
        super(2);
        this.i = vectorGroup;
        this.j = map;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.k | 1;
        int i2 = this.l;
        VectorPainterKt.a(this.i, this.j, (Composer) obj, i, i2);
        return az2.a;
    }
}
