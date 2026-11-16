package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ MeasureScope j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(ArrayList arrayList, MeasureScope measureScope, int i, ArrayList arrayList2) {
        super(1);
        this.i = arrayList;
        this.j = measureScope;
        this.k = i;
        this.l = arrayList2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        MeasureScope measureScope;
        ((Placeable.PlacementScope) obj).getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) arrayList.get(i);
            int size2 = list.size();
            int[] iArr = new int[size2];
            int i2 = 0;
            while (true) {
                measureScope = this.j;
                if (i2 >= size2) {
                    break;
                }
                iArr[i2] = ((Placeable) list.get(i2)).a + (i2 < list.size() + (-1) ? measureScope.mo1roundToPx0680j_4(8.0f) : 0);
                i2++;
            }
            int[] iArr2 = new int[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                iArr2[i3] = 0;
            }
            Arrangement.d.c(measureScope, this.k, iArr, iArr2);
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Placeable.PlacementScope.c((Placeable) list.get(i4), iArr2[i4], ((Number) this.l.get(i)).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        return az2.a;
    }
}
