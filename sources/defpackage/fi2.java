package defpackage;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fi2 implements Subtitle {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ fi2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        Cue cue;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) obj2, Long.valueOf(j), true, false);
                return iBinarySearchFloor == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) obj).get(iBinarySearchFloor);
            default:
                int iBinarySearchFloor2 = Util.binarySearchFloor((long[]) obj2, j, true, false);
                return (iBinarySearchFloor2 == -1 || (cue = ((Cue[]) obj)[iBinarySearchFloor2]) == Cue.EMPTY) ? Collections.EMPTY_LIST : Collections.singletonList(cue);
        }
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i) {
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Assertions.checkArgument(i >= 0);
                Assertions.checkArgument(i < arrayList.size());
                return ((Long) arrayList.get(i)).longValue();
            default:
                long[] jArr = (long[]) obj;
                Assertions.checkArgument(i >= 0);
                Assertions.checkArgument(i < jArr.length);
                return jArr[i];
        }
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int iBinarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) arrayList, Long.valueOf(j), false, false);
                if (iBinarySearchCeil < arrayList.size()) {
                    return iBinarySearchCeil;
                }
                return -1;
            default:
                long[] jArr = (long[]) obj;
                int iBinarySearchCeil2 = Util.binarySearchCeil(jArr, j, false, false);
                if (iBinarySearchCeil2 < jArr.length) {
                    return iBinarySearchCeil2;
                }
                return -1;
        }
    }
}
