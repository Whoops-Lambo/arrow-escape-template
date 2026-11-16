package defpackage;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mj1 {
    @DoNotInline
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        nj1.g();
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = ti0.c(i, i2, (int) d);
        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
            if (ti0.d(supportedPerformancePoints.get(i3)).covers(performancePointC)) {
                return 2;
            }
        }
        return 1;
    }
}
