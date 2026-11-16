package androidx.compose.ui.window;

import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidDialog_androidKt$DialogLayout$1$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$DialogLayout$1$measure$1(ArrayList arrayList) {
        super(1);
        this.i = arrayList;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.e(placementScope, (Placeable) arrayList.get(i), 0, 0);
        }
        return az2.a;
    }
}
