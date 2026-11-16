package defpackage;

import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lv1 extends AbstractConcatenatedTimeline {
    public final int a;
    public final int b;
    public final int[] c;
    public final int[] d;
    public final Timeline[] e;
    public final Object[] f;
    public final HashMap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(ArrayList arrayList, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int windowCount = 0;
        int size = arrayList.size();
        this.c = new int[size];
        this.d = new int[size];
        this.e = new Timeline[size];
        this.f = new Object[size];
        this.g = new HashMap();
        int size2 = arrayList.size();
        int periodCount = 0;
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ok1 ok1Var = (ok1) obj;
            this.e[i] = ok1Var.getTimeline();
            this.d[i] = windowCount;
            this.c[i] = periodCount;
            windowCount += this.e[i].getWindowCount();
            periodCount += this.e[i].getPeriodCount();
            this.f[i] = ok1Var.getUid();
            this.g.put(this.f[i], Integer.valueOf(i));
            i++;
        }
        this.a = windowCount;
        this.b = periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByChildUid(Object obj) {
        Integer num = (Integer) this.g.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByPeriodIndex(int i) {
        return Util.binarySearchFloor(this.c, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByWindowIndex(int i) {
        return Util.binarySearchFloor(this.d, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Object getChildUidByChildIndex(int i) {
        return this.f[i];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstPeriodIndexByChildIndex(int i) {
        return this.c[i];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstWindowIndexByChildIndex(int i) {
        return this.d[i];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getPeriodCount() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Timeline getTimelineByChildIndex(int i) {
        return this.e[i];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getWindowCount() {
        return this.a;
    }
}
