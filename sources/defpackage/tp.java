package defpackage;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class tp implements Subtitle {
    public final /* synthetic */ int a;
    public final List b;

    public tp(ArrayList arrayList) {
        this.a = 2;
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        switch (this.a) {
            case 0:
                return j >= 0 ? this.b : Collections.EMPTY_LIST;
            case 1:
                return this.b;
            case 2:
                return j >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i) {
        switch (this.a) {
            case 0:
                Assertions.checkArgument(i == 0);
                break;
            case 2:
                Assertions.checkArgument(i == 0);
                break;
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        switch (this.a) {
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        switch (this.a) {
            case 0:
                return j < 0 ? 0 : -1;
            case 1:
                return -1;
            case 2:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    public /* synthetic */ tp(List list, int i) {
        this.a = i;
        this.b = list;
    }
}
