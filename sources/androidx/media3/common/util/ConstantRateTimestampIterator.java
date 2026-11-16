package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    private long getTimestampUsAfter(int i) {
        long jRound = Math.round(this.framesDurationUs * ((double) i)) + this.startPositionUs;
        Assertions.checkState(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i = this.totalNumberOfFramesToAdd;
        if (i == 0) {
            return -9223372036854775807L;
        }
        return getTimestampUsAfter(i - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    public ConstantRateTimestampIterator(@IntRange long j, @IntRange long j2, @FloatRange float f) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        if (0 <= j && j < j2) {
            z3 = true;
        }
        Assertions.checkArgument(z3);
        this.startPositionUs = j;
        this.endPositionUs = j2;
        this.frameRate = f;
        this.totalNumberOfFramesToAdd = Math.max(Math.round(((j2 - j) / 1000000.0f) * f), 1);
        this.framesDurationUs = 1000000.0f / f;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i = this.framesAdded;
        this.framesAdded = i + 1;
        return getTimestampUsAfter(i);
    }

    public ConstantRateTimestampIterator(@IntRange long j, @FloatRange float f) {
        this(0L, j, f);
    }
}
