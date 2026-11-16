package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import defpackage.d31;
import defpackage.fs1;
import defpackage.gq1;
import defpackage.ok;
import defpackage.ss1;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class CuesWithTimingSubtitle implements Subtitle {
    private static final ss1 CUES_BY_START_TIME_ASCENDING = new ok(new a(), gq1.a);
    private static final String TAG = "CuesWithTimingSubtitle";
    private final d31 eventCues;
    private final long[] eventTimesUs;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public d31 getCues(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        if (iBinarySearchFloor != -1) {
            return (d31) this.eventCues.get(iBinarySearchFloor);
        }
        z21 z21Var = d31.b;
        return y32.e;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) fs1.y(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            long j = cuesWithTiming.durationUs;
            d31 d31Var = cuesWithTiming.cues;
            if (j == -9223372036854775807L) {
                this.eventCues = d31.E(d31Var);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                z21 z21Var = d31.b;
                this.eventCues = d31.F(d31Var, y32.e);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + jNormalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        y32 y32VarJ = d31.J(CUES_BY_START_TIME_ASCENDING, list);
        int i = 0;
        for (int i2 = 0; i2 < y32VarJ.d; i2++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) y32VarJ.get(i2);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j2 = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i != 0) {
                int i3 = i - 1;
                long j3 = this.eventTimesUs[i3];
                if (j3 >= jNormalizeUnsetStartTimeToZero2) {
                    if (j3 == jNormalizeUnsetStartTimeToZero2 && ((d31) arrayList.get(i3)).isEmpty()) {
                        arrayList.set(i3, cuesWithTiming2.cues);
                    } else {
                        Log.w(TAG, "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i3] = jNormalizeUnsetStartTimeToZero2;
                        arrayList.set(i3, cuesWithTiming2.cues);
                    }
                } else {
                    this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i++;
                }
            } else {
                this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                arrayList.add(cuesWithTiming2.cues);
                i++;
            }
            if (cuesWithTiming2.durationUs != -9223372036854775807L) {
                this.eventTimesUs[i] = j2;
                arrayList.add(y32.e);
                i++;
            }
        }
        this.eventCues = d31.A(arrayList);
    }

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }
}
