package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class IconKt$Icon$1 extends rc1 implements zr0 {
    public final /* synthetic */ Painter i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Modifier k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        IconKt.a(this.i, this.j, this.k, this.l, (Composer) obj, this.m | 1);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$1(Painter painter, String str, Modifier modifier, long j, int i) {
        super(2);
        this.i = painter;
        this.j = str;
        this.k = modifier;
        this.l = j;
        this.m = i;
    }
}
