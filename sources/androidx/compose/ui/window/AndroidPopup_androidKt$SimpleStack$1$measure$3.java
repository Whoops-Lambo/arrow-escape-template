package androidx.compose.ui.window;

import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class AndroidPopup_androidKt$SimpleStack$1$measure$3 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$SimpleStack$1$measure$3(ArrayList arrayList) {
        super(1);
        this.i = arrayList;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                Placeable.PlacementScope.e(placementScope, (Placeable) arrayList.get(i), 0, 0);
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return az2.a;
    }
}
