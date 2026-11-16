package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ListItemKt$BaselinesOffsetColumn$2 extends rc1 implements zr0 {
    public final /* synthetic */ List i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ ComposableLambdaImpl k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaselinesOffsetColumn$2(List list, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.i = list;
        this.j = modifier;
        this.k = composableLambdaImpl;
        this.l = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.l | 1;
        ListItemKt.a(this.i, this.j, this.k, (Composer) obj, i);
        return az2.a;
    }
}
