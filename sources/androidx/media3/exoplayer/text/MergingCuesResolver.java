package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import defpackage.d31;
import defpackage.gq1;
import defpackage.gs0;
import defpackage.lw;
import defpackage.n52;
import defpackage.ok;
import defpackage.ss1;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final ss1 CUES_DISPLAY_PRIORITY_COMPARATOR;
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j2 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    static {
        final int i = 0;
        final int i2 = 1;
        CUES_DISPLAY_PRIORITY_COMPARATOR = new lw(new ok(new gs0() { // from class: androidx.media3.exoplayer.text.a
            @Override // defpackage.gs0
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }, gq1.a), new ok(new gs0() { // from class: androidx.media3.exoplayer.text.a
            @Override // defpackage.gs0
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i2) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }, n52.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.startTimeUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.durationUs);
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        Assertions.checkArgument(cuesWithTiming.durationUs != -9223372036854775807L);
        boolean z = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public d31 getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                y32 y32VarJ = d31.J(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                y21 y21VarX = d31.x();
                for (int i2 = 0; i2 < y32VarJ.d; i2++) {
                    y21VarX.d(((CuesWithTiming) y32VarJ.get(i2)).cues);
                }
                return y21VarX.g();
            }
        }
        z21 z21Var = d31.b;
        return y32.e;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        long jMin = -9223372036854775807L;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            long j3 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j2) {
                if (jMin == -9223372036854775807L) {
                    jMin = j2;
                    break;
                }
                jMin = Math.min(jMin, j2);
                break;
            }
            if (j < j3) {
                if (jMin == -9223372036854775807L) {
                    jMin = j3;
                } else {
                    jMin = Math.min(jMin, j3);
                }
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}
