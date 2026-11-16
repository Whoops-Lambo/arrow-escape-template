package androidx.media3.exoplayer.video;

import android.util.Range;
import androidx.annotation.FloatRange;
import androidx.media3.common.util.Assertions;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
class VideoFrameReleaseEarlyTimeForecaster {
    private static final float SMOOTHING_FACTOR = 0.2f;
    private double derivativeOfEarlyTime;
    private Range<Double> derivativeOfEarlyTimeRange;
    private long lastFrameEarlyUs;
    private long lastFramePresentationTimeUs;

    public void setPlaybackSpeed(@FloatRange float f) {
        Assertions.checkArgument(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.derivativeOfEarlyTimeRange = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        reset();
    }

    private double calculateDerivativeFromLastFrame(long j, long j2) {
        long j3 = this.lastFramePresentationTimeUs;
        if (j3 != -9223372036854775807L) {
            long j4 = this.lastFrameEarlyUs;
            if (j4 != -9223372036854775807L && j != j3) {
                return (j2 - j4) / (j - j3);
            }
        }
        return ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
    }

    private void updateDerivativeWithExponentialMovingAverage(double d) {
        this.derivativeOfEarlyTime = (d * 0.20000000298023224d) + (this.derivativeOfEarlyTime * 0.800000011920929d);
    }

    public long predictEarlyUs(long j) {
        long j2 = this.lastFramePresentationTimeUs;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (((j - j2) * this.derivativeOfEarlyTime) + this.lastFrameEarlyUs);
    }

    public void reset() {
        this.derivativeOfEarlyTime = ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    public VideoFrameReleaseEarlyTimeForecaster(@FloatRange float f) {
        boolean z;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        this.derivativeOfEarlyTimeRange = range;
        this.derivativeOfEarlyTime = ((Double) range.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    public void onVideoFrameProcessed(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (j2 != -9223372036854775807L) {
            z2 = true;
        }
        Assertions.checkArgument(z2);
        updateDerivativeWithExponentialMovingAverage(((Double) this.derivativeOfEarlyTimeRange.clamp(Double.valueOf(calculateDerivativeFromLastFrame(j, j2)))).doubleValue());
        this.lastFramePresentationTimeUs = j;
        this.lastFrameEarlyUs = j2;
    }
}
