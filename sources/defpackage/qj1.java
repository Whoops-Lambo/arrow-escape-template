package defpackage;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qj1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qj1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return MediaCodecUtil.lambda$sortByScore$3((uj1) obj3, obj, obj2);
            case 1:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj3;
                Selectable selectable = (Selectable) obj;
                Selectable selectable2 = (Selectable) obj2;
                selectable.getClass();
                selectable2.getClass();
                LayoutCoordinates layoutCoordinatesA = selectable.a();
                LayoutCoordinates layoutCoordinatesA2 = selectable2.a();
                long jR = layoutCoordinatesA != null ? layoutCoordinates.r(layoutCoordinatesA, Offset.b) : Offset.b;
                long jR2 = layoutCoordinatesA2 != null ? layoutCoordinates.r(layoutCoordinatesA2, Offset.b) : Offset.b;
                return Offset.d(jR) == Offset.d(jR2) ? uu.k(Float.valueOf(Offset.c(jR)), Float.valueOf(Offset.c(jR2))) : uu.k(Float.valueOf(Offset.d(jR)), Float.valueOf(Offset.d(jR2)));
            default:
                return TrackSelectionView.lambda$init$0((Comparator) obj3, (tq2) obj, (tq2) obj2);
        }
    }
}
